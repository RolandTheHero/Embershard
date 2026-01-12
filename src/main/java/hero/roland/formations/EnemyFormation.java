package hero.roland.formations;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

class FormationTest {
    public static void main(String[] args) {
        EnemyFormation formation = EnemyFormation.fromDataString("5=battleship_behemoth");
        BufferedImage img = formation.toImage();
        try {
            ImageIO.write(img, "png", new File("enemy_formation.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class EnemyFormation {
    EnemyBattleMap map = EnemyBattleMap.OUTPOST;
    EnemyUnit grid1, grid2, grid3, grid4, grid5, grid6, grid7, grid8, grid9, grid10, grid11, grid12, grid13;
    static final int X_OFFSET = 30, Y_OFFSET = 40;
    static public EnemyFormation fromDataString(String data) {
        EnemyFormation formation = new EnemyFormation();
        try {
            String[] parts = data.split(",");
            for (String part : parts) {
                String[] keyValue = part.split("=");
                String key = keyValue[0];
                String value = keyValue[1];
                switch (key) {
                    case "map" -> formation.map = EnemyBattleMap.fromId(value);
                    case "1" -> formation.grid1 = EnemyUnit.fromId(value);
                    case "2" -> formation.grid2 = EnemyUnit.fromId(value);
                    case "3" -> formation.grid3 = EnemyUnit.fromId(value);
                    case "4" -> formation.grid4 = EnemyUnit.fromId(value);
                    case "5" -> formation.grid5 = EnemyUnit.fromId(value);
                    case "6" -> formation.grid6 = EnemyUnit.fromId(value);
                    case "7" -> formation.grid7 = EnemyUnit.fromId(value);
                    case "8" -> formation.grid8 = EnemyUnit.fromId(value);
                    case "9" -> formation.grid9 = EnemyUnit.fromId(value);
                    case "10" -> formation.grid10 = EnemyUnit.fromId(value);
                    case "11" -> formation.grid11 = EnemyUnit.fromId(value);
                    case "12" -> formation.grid12 = EnemyUnit.fromId(value);
                    case "13" -> formation.grid13 = EnemyUnit.fromId(value);
                    default -> throw new FormationException("Unknown formation key: `" + key + "`\nIf you need help, use `/formation` with no arguments.");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new FormationException("Your formation data string is malformed. If you need help, use `/formation` with no arguments.");
        }
        return formation;
    }
    public BufferedImage toImage() {
        try {
            BufferedImage image = ImageIO.read(EnemyFormation.class.getResourceAsStream(map.filePathString()));
            int mapX = map.x();
            int mapY = map.y();
            if (grid13 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid13.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid13.x() + 100 + X_OFFSET, mapY - grid13.y() - 150 + Y_OFFSET, null);
            }
            if (grid10 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid10.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid10.x() - 100 + X_OFFSET, mapY - grid10.y() - 150 + Y_OFFSET, null);
            }
            if (grid12 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid12.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid12.x() + 200 + X_OFFSET, mapY - grid12.y() - 100 + Y_OFFSET, null);
            }
            if (grid9 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid9.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid9.x() + X_OFFSET, mapY - grid9.y() - 100 + Y_OFFSET, null);
            }
            if (grid5 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid5.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid5.x() - 200 + X_OFFSET, mapY - grid5.y() - 100 + Y_OFFSET, null);
            }
            if (grid11 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid11.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid11.x() + 300 + X_OFFSET, mapY - grid11.y() - 50 + Y_OFFSET, null);
            }
            if (grid8 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid8.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid8.x() + 100 + X_OFFSET, mapY - grid8.y() - 50 + Y_OFFSET, null);
            }
            if (grid4 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid4.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid4.x() - 100 + X_OFFSET, mapY - grid4.y() - 50 + Y_OFFSET, null);
            }
            if (grid7 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid7.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid7.x() + 200 + X_OFFSET, mapY - grid7.y() + Y_OFFSET, null);
            }
            if (grid3 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid3.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid3.x() + X_OFFSET, mapY - grid3.y() + Y_OFFSET, null);
            }
            if (grid6 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid6.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid6.x() + 300 + X_OFFSET, mapY - grid6.y() + 50 + Y_OFFSET, null);
            }
            if (grid2 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid2.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid2.x() + 100 + X_OFFSET, mapY - grid2.y() + 50 + Y_OFFSET, null);
            }
            if (grid1 != null) {
                BufferedImage unitImage = ImageIO.read(EnemyFormation.class.getResourceAsStream(grid1.filePathString()));
                image.getGraphics().drawImage(unitImage, mapX - grid1.x() + 200 + X_OFFSET, mapY - grid1.y() + 100 + Y_OFFSET, null);
            }
            return image;
        } catch (IOException e) {
            throw new FormationException("An error occurred while generating the formation image. Please try again.");
        } catch (IllegalArgumentException e) { // This happens when an image resource does not exist, thrown by ImageIO.read()
            throw new FormationException("Oops! The image for one or more of the units wasn't found. This is a mistake on <@278366004348977153>'s part. Do let them know!");
        }
    }
}