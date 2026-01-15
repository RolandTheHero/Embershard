package hero.roland.formations;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;

import javax.imageio.ImageIO;

class FormationTest {
    public static void main(String[] args) {
        Formation formation = Formation.fromDataString("1=megaArtillery,enemy=true");
        BufferedImage img = formation.toImage();
        try {
            ImageIO.write(img, "png", new File("formation.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Formation {
    static final int X_OFFSET = 30, Y_OFFSET = 40;

    boolean isEnemyFormation = false;
    BattleMap map = BattleMap.OUTPOST;
    Unit grid1, grid2, grid3, grid4, grid5, grid6, grid7, grid8, grid9, grid10, grid11, grid12, grid13;

    static public Formation fromDataString(String data) {
        Formation formation = new Formation();
        try {
            String[] parts = data.split(",");
            for (String part : parts) {
                String[] keyValue = part.split("=");
                String key = keyValue[0];
                String value = keyValue[1];
                switch (key) {
                    case "enemy" -> formation.isEnemyFormation = Boolean.parseBoolean(value);
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
                    default -> throw new FormationException("Unknown formation key: `" + key + "`\nIf you need help, use `/formation` with no arguments.");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new FormationException("Your formation data string is malformed. If you need help, use `/formation` with no arguments.");
        }
        return formation;
    }

    public BufferedImage toImage() {
        if (isEnemyFormation) return toEnemyImage();
        else return toPlayerImage();
    }
    private BufferedImage toEnemyImage() {
        try {
            BufferedImage image = ImageIO.read(Formation.class.getResourceAsStream(map.enemyFilePath()));
            int mapX = map.x();
            int mapY = map.y();
            if (grid13 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid13.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid13.frontX() + 100 + X_OFFSET, mapY - grid13.frontY() - 150 + Y_OFFSET, null);
            }
            if (grid10 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid10.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid10.frontX() - 100 + X_OFFSET, mapY - grid10.frontY() - 150 + Y_OFFSET, null);
            }
            if (grid12 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid12.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid12.frontX() + 200 + X_OFFSET, mapY - grid12.frontY() - 100 + Y_OFFSET, null);
            }
            if (grid9 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid9.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid9.frontX() + X_OFFSET, mapY - grid9.frontY() - 100 + Y_OFFSET, null);
            }
            if (grid5 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid5.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid5.frontX() - 200 + X_OFFSET, mapY - grid5.frontY() - 100 + Y_OFFSET, null);
            }
            if (grid11 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid11.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid11.frontX() + 300 + X_OFFSET, mapY - grid11.frontY() - 50 + Y_OFFSET, null);
            }
            if (grid8 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid8.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid8.frontX() + 100 + X_OFFSET, mapY - grid8.frontY() - 50 + Y_OFFSET, null);
            }
            if (grid4 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid4.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid4.frontX() - 100 + X_OFFSET, mapY - grid4.frontY() - 50 + Y_OFFSET, null);
            }
            if (grid7 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid7.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid7.frontX() + 200 + X_OFFSET, mapY - grid7.frontY() + Y_OFFSET, null);
            }
            if (grid3 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid3.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid3.frontX() + X_OFFSET, mapY - grid3.frontY() + Y_OFFSET, null);
            }
            if (grid6 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid6.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid6.frontX() + 300 + X_OFFSET, mapY - grid6.frontY() + 50 + Y_OFFSET, null);
            }
            if (grid2 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid2.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid2.frontX() + 100 + X_OFFSET, mapY - grid2.frontY() + 50 + Y_OFFSET, null);
            }
            if (grid1 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid1.frontFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid1.frontX() + 200 + X_OFFSET, mapY - grid1.frontY() + 100 + Y_OFFSET, null);
            }
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
            int mapX = map.x();
            int mapY = map.y();
            if (grid1 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid1.backFilePath()));
                //image.getGraphics().drawImage(unitImage, mapX - grid1.backX() + 200 + X_OFFSET, mapY - grid1.backY() + 100 + Y_OFFSET, null);
                image.getGraphics().drawImage(unitImage, mapX - grid1.backX() - 100 + X_OFFSET, mapY - grid1.backY() - 150 + Y_OFFSET, null);
            }
            if (grid2 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid2.backFilePath()));
                //image.getGraphics().drawImage(unitImage, mapX - grid2.backX() + 100 + X_OFFSET, mapY - grid2.backY() + 50 + Y_OFFSET, null);
                image.getGraphics().drawImage(unitImage, mapX - grid2.backX() + X_OFFSET, mapY - grid2.backY() - 100 + Y_OFFSET, null);
            }
            if (grid6 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid6.backFilePath()));
                //image.getGraphics().drawImage(unitImage, mapX - grid6.backX() + 300 + X_OFFSET, mapY - grid6.backY() + 50 + Y_OFFSET, null);
                image.getGraphics().drawImage(unitImage, mapX - grid6.backX() - 200 + X_OFFSET, mapY - grid6.backY() - 100 + Y_OFFSET, null);
            }
            if (grid3 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid3.backFilePath()));
                //image.getGraphics().drawImage(unitImage, mapX - grid3.backX() + X_OFFSET, mapY - grid3.backY() + Y_OFFSET, null);
                image.getGraphics().drawImage(unitImage, mapX - grid3.backX() + 100 + X_OFFSET, mapY - grid3.backY() - 50 + Y_OFFSET, null);
            }
            if (grid7 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid7.backFilePath()));
                //image.getGraphics().drawImage(unitImage, mapX - grid7.backX() + 200 + X_OFFSET, mapY - grid7.backY() + Y_OFFSET, null);
                image.getGraphics().drawImage(unitImage, mapX - grid7.backX() - 100 + X_OFFSET, mapY - grid7.backY() - 50 + Y_OFFSET, null);
            }
            if (grid4 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid4.backFilePath()));
                //image.getGraphics().drawImage(unitImage, mapX - grid4.backX() - 100 + X_OFFSET, mapY - grid4.backY() - 50 + Y_OFFSET, null);
                image.getGraphics().drawImage(unitImage, mapX - grid4.backX() + 200 + X_OFFSET, mapY - grid4.backY() + Y_OFFSET, null);
            }
            if (grid8 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid8.backFilePath()));
                //image.getGraphics().drawImage(unitImage, mapX - grid8.backX() + 100 + X_OFFSET, mapY - grid8.backY() - 50 + Y_OFFSET, null);
                image.getGraphics().drawImage(unitImage, mapX - grid8.backX() + X_OFFSET, mapY - grid8.backY() + Y_OFFSET, null);
            }
            if (grid11 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid11.backFilePath()));
                //image.getGraphics().drawImage(unitImage, mapX - grid11.backX() + 300 + X_OFFSET, mapY - grid11.backY() - 50 + Y_OFFSET, null);
                image.getGraphics().drawImage(unitImage, mapX - grid11.backX() - 200 + X_OFFSET, mapY - grid11.backY() + Y_OFFSET, null);
            }
            if (grid5 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid5.backFilePath()));
                //image.getGraphics().drawImage(unitImage, mapX - grid5.backX() - 200 + X_OFFSET, mapY - grid5.backY() - 100 + Y_OFFSET, null);
                image.getGraphics().drawImage(unitImage, mapX - grid5.backX() + 300 + X_OFFSET, mapY - grid5.backY() + 50 + Y_OFFSET, null);
            }
            if (grid9 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid9.backFilePath()));
                //image.getGraphics().drawImage(unitImage, mapX - grid9.backX() + X_OFFSET, mapY - grid9.backY() - 100 + Y_OFFSET, null);
                image.getGraphics().drawImage(unitImage, mapX - grid9.backX() + 100 + X_OFFSET, mapY - grid9.backY() + 50 + Y_OFFSET, null);
            }
            if (grid12 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid12.backFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid12.backX() - 100 + X_OFFSET, mapY - grid12.backY() + 50 + Y_OFFSET, null);
            }
            if (grid10 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid10.backFilePath()));
                //image.getGraphics().drawImage(unitImage, mapX - grid10.backX() - 100 + X_OFFSET, mapY - grid10.backY() - 150 + Y_OFFSET, null);
                image.getGraphics().drawImage(unitImage, mapX - grid10.backX() + 200 + X_OFFSET, mapY - grid10.backY() + 100 + Y_OFFSET, null);
            }
            if (grid13 != null) {
                BufferedImage unitImage = ImageIO.read(Formation.class.getResourceAsStream(grid13.backFilePath()));
                image.getGraphics().drawImage(unitImage, mapX - grid13.backX() + X_OFFSET, mapY - grid13.backY() + 100 + Y_OFFSET, null);
            }
            return image;
        } catch (IOException e) {
            throw new FormationException("An error occurred while generating the formation image. Please try again.");
        } catch (IllegalArgumentException e) { // This happens when an image resource does not exist, thrown by ImageIO.read()
            throw new FormationException("Oops! The image for one or more of the units wasn't found. This is a mistake on <@278366004348977153>'s part. Do let them know!");
        }
    }
}
