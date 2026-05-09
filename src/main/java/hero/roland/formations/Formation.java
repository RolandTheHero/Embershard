package hero.roland.formations;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;

import javax.imageio.ImageIO;

class FormationTest {
    public static void main(String[] args) {
        Formation formation = Formation.fromDataString(
            "1=heavy_grenadier,3=l7_sandworm_drill,5=jedrek_the_crusher"
        );
        BufferedImage img = formation.toImage(false);
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

    public void setMap(String mapId) { map = BattleMap.fromId(mapId); }
    public void setUnit(int tileNumber, String unitId) {
        Unit unit = Unit.fromId(unitId);
        switch (tileNumber) {
            case 1 -> grid1 = unit;
            case 2 -> grid2 = unit;
            case 3 -> grid3 = unit;
            case 4 -> grid4 = unit;
            case 5 -> grid5 = unit;
            case 6 -> grid6 = unit;
            case 7 -> grid7 = unit;
            case 8 -> grid8 = unit;
            case 9 -> grid9 = unit;
            case 10 -> grid10 = unit;
            case 11 -> grid11 = unit;
            case 12 -> grid12 = unit;
            case 13 -> grid13 = unit;
            default -> throw new FormationException("Invalid tile number: `" + tileNumber + "`.");
        }
    }

    private void drawUnit(BufferedImage image, Unit unit, int gridX, int gridY, boolean isEnemy) throws IOException {
        if (unit == null) return;
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

    public BufferedImage toImage(boolean isEnemy) {
        try { return isEnemy ? toEnemyImage() : toPlayerImage(); }
        catch (IOException e) { throw new FormationException("An error occurred while generating the formation image. Please try again."); }
        catch (IllegalArgumentException e) { throw new FormationException("Oops! There might be an image missing. Please let <@278366004348977153> know!"); }
    }
    private BufferedImage toEnemyImage() throws IOException {
        BufferedImage image = ImageIO.read(Formation.class.getResourceAsStream(map.enemyFilePath()));
        drawUnit(image, grid13, 100, -150, true);
        drawUnit(image, grid10, -100, -150, true);
        drawUnit(image, grid12, 200, -100, true);
        drawUnit(image, grid9, 0, -100, true);
        drawUnit(image, grid5, -200, -100, true);
        drawUnit(image, grid11, 300, -50, true);
        drawUnit(image, grid8, 100, -50, true);
        drawUnit(image, grid4, -100, -50, true);
        drawUnit(image, grid7, 200, 0, true);
        drawUnit(image, grid3, 0, 0, true);
        drawUnit(image, grid6, 300, 50, true);
        drawUnit(image, grid2, 100, 50, true);
        drawUnit(image, grid1, 200, 100, true);
        return image;
    }
    private BufferedImage toPlayerImage() throws IOException {
        BufferedImage image = ImageIO.read(Formation.class.getResourceAsStream(map.playerFilePath()));
        drawUnit(image, grid1, -100, -150, false);
        drawUnit(image, grid2, 0, -100, false);
        drawUnit(image, grid6, -200, -100, false);
        drawUnit(image, grid3, 100, -50, false);
        drawUnit(image, grid7, -100, -50, false);
        drawUnit(image, grid4, 200, 0, false);
        drawUnit(image, grid8, 0, 0, false);
        drawUnit(image, grid11, -200, 0, false);
        drawUnit(image, grid5, 300, 50, false);
        drawUnit(image, grid9, 100, 50, false);
        drawUnit(image, grid12, -100, 50, false);
        drawUnit(image, grid10, 200, 100, false);
        drawUnit(image, grid13, 0, 100, false);
        return image;
    }
}
