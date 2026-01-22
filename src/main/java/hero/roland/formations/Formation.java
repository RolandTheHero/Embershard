package hero.roland.formations;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;

import javax.imageio.ImageIO;

class FormationTest {
    public static void main(String[] args) {
        Formation formation = Formation.fromDataString(
            "1=general_ashe,2=zoey"
        );
        BufferedImage img = formation.toImage(true);
        try {
            ImageIO.write(img, "png", new File("formation.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Formation {
    static final int X_OFFSET = 30, Y_OFFSET = 40;

    BattleMap map = BattleMap.OUTPOST;
    Unit grid1, grid2, grid3, grid4, grid5, grid6, grid7, grid8, grid9, grid10, grid11, grid12, grid13;

    static public Formation fromDataString(String data) {
        Formation formation = new Formation();
        if (data.isEmpty()) return formation;
        try {
            String[] parts = data.split(",");
            for (String part : parts) {
                String[] keyValue = part.split("=");
                String key = keyValue[0];
                String value = keyValue[1];
                switch (key) {
                    case "map" -> formation.map = BattleMap.fromId(value);
                    case "1" -> formation.grid1 = Unit.fromId(value);
                    case "2" -> formation.grid2 = Unit.fromId(value);
                    case "3" -> formation.grid3 = Unit.fromId(value);
                    case "4" -> formation.grid4 = Unit.fromId(value);
                    case "5" -> formation.grid5 = Unit.fromId(value);
                    case "6" -> formation.grid6 = Unit.fromId(value);
                    case "7" -> formation.grid7 = Unit.fromId(value);
                    case "8" -> formation.grid8 = Unit.fromId(value);
                    case "9" -> formation.grid9 = Unit.fromId(value);
                    case "10" -> formation.grid10 = Unit.fromId(value);
                    case "11" -> formation.grid11 = Unit.fromId(value);
                    case "12" -> formation.grid12 = Unit.fromId(value);
                    case "13" -> formation.grid13 = Unit.fromId(value);
                    default -> throw new FormationException("Unknown formation key: `" + key + "`\nValid keys are `map` and grid numbers `1` through `13`. If you need further help, use `/formation` with no arguments.");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new FormationException("Your formation data string is malformed. If you need help, use `/formation` with no arguments.");
        }
        return formation;
    }

    private void drawUnit(BufferedImage image, Unit unit, int gridX, int gridY, boolean isEnemy) throws IOException {
        InputStream resource = isEnemy ? 
            Formation.class.getResourceAsStream(unit.frontFilePath()) : 
            Formation.class.getResourceAsStream(unit.backFilePath());
        int unitX, unitY;
        if (resource == null) {
            // Use the missing unit image and positioning
            resource = Formation.class.getResourceAsStream("/units/missing.png");
            unitX = 45;
            unitY = 96;
        } else {
            unitX = isEnemy ? unit.frontX() : unit.backX();
            unitY = isEnemy ? unit.frontY() : unit.backY();
        }
        image.getGraphics().drawImage(ImageIO.read(resource), map.x() + gridX - unitX + X_OFFSET, map.y() + gridY - unitY + Y_OFFSET, null);
    }

    public BufferedImage toImage(boolean isEnemy) { return isEnemy ? toEnemyImage() : toPlayerImage(); }
    private BufferedImage toEnemyImage() {
        try {
            BufferedImage image = ImageIO.read(Formation.class.getResourceAsStream(map.enemyFilePath()));
            if (grid13 != null) drawUnit(image, grid13, 100, -150, true);
            if (grid10 != null) drawUnit(image, grid10, -100, -150, true);
            if (grid12 != null) drawUnit(image, grid12, 200, -100, true);
            if (grid9 != null) drawUnit(image, grid9, 0, -100, true);
            if (grid5 != null) drawUnit(image, grid5, -200, -100, true);
            if (grid11 != null) drawUnit(image, grid11, 300, -50, true);
            if (grid8 != null) drawUnit(image, grid8, 100, -50, true);
            if (grid4 != null) drawUnit(image, grid4, -100, -50, true);
            if (grid7 != null) drawUnit(image, grid7, 200, 0, true);
            if (grid3 != null) drawUnit(image, grid3, 0, 0, true);
            if (grid6 != null) drawUnit(image, grid6, 300, 50, true);
            if (grid2 != null) drawUnit(image, grid2, 100, 50, true);
            if (grid1 != null) drawUnit(image, grid1, 200, 100, true);
            return image;
        } catch (IOException e) {
            throw new FormationException("An error occurred while generating the formation image. Please try again.");
        } catch (IllegalArgumentException e) { // This happens when an image resource does not exist, thrown by ImageIO.read()
            throw new FormationException("Oops! The image for one or more of the units wasn't found. This is a mistake on <@278366004348977153>'s part. Do let them know!");
        }
    }
    private BufferedImage toPlayerImage() {
        try {
            BufferedImage image = ImageIO.read(Formation.class.getResourceAsStream(map.playerFilePath()));
            if (grid1 != null) drawUnit(image, grid1, -100, -150, false);
            if (grid2 != null) drawUnit(image, grid2, 0, -100, false);
            if (grid6 != null) drawUnit(image, grid6, -200, -100, false);
            if (grid3 != null) drawUnit(image, grid3, 100, -50, false);
            if (grid7 != null) drawUnit(image, grid7, -100, -50, false);
            if (grid4 != null) drawUnit(image, grid4, 200, 0, false);
            if (grid8 != null) drawUnit(image, grid8, 0, 0, false);
            if (grid11 != null) drawUnit(image, grid11, -200, 0, false);
            if (grid5 != null) drawUnit(image, grid5, 300, 50, false);
            if (grid9 != null) drawUnit(image, grid9, 100, 50, false);
            if (grid12 != null) drawUnit(image, grid12, -100, 50, false);
            if (grid10 != null) drawUnit(image, grid10, 200, 100, false);
            if (grid13 != null) drawUnit(image, grid13, 0, 100, false);
            return image;
        } catch (IOException e) {
            throw new FormationException("An error occurred while generating the formation image. Please try again.");
        } catch (IllegalArgumentException e) { // This happens when an image resource does not exist, thrown by ImageIO.read()
            throw new FormationException("Oops! The image for one or more of the units wasn't found. It could be that some units don't have back sprites. If you believe this is a mistake, message <@278366004348977153>.");
        }
    }
}
