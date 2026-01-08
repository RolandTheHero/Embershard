package hero.roland.formations;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

class FormationTest {
    public static void main(String[] args) {
        EnemyFormation formation = new EnemyFormation();
        formation.grid1 = EnemyUnit.PUMA;
        formation.grid2 = EnemyUnit.FLAME_TURRET;
        formation.grid3 = EnemyUnit.WARLORD_GANTAS;
        formation.grid4 = EnemyUnit.GUN_TRUCK;
        formation.grid5 = EnemyUnit.RAIDER_BRAWLER;
        formation.grid6 = EnemyUnit.WOLF_DEFENDER;
        formation.grid7 = EnemyUnit.WOLF_BOMBADIER;
        formation.grid8 = EnemyUnit.WOLF_DEVASTATOR;
        formation.grid9 = EnemyUnit.RECON_VEHICLE;
        formation.grid10 = EnemyUnit.RECON_VEHICLE;
        formation.grid11 = EnemyUnit.RECON_VEHICLE;
        formation.grid12 = EnemyUnit.FIREBREATHER;
        formation.grid13 = EnemyUnit.DUST_WALKER;
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
    EnemyUnit grid1;
    EnemyUnit grid2;
    EnemyUnit grid3;
    EnemyUnit grid4;
    EnemyUnit grid5;
    EnemyUnit grid6;
    EnemyUnit grid7;
    EnemyUnit grid8;
    EnemyUnit grid9;
    EnemyUnit grid10;
    EnemyUnit grid11;
    EnemyUnit grid12;
    EnemyUnit grid13;
    static final int X_OFFSET = 30;
    static final int Y_OFFSET = 40;
    static public EnemyFormation fromDataString(String data) {
        EnemyFormation formation = new EnemyFormation();
        String[] parts = data.split(",");
        formation.map = EnemyBattleMap.fromId(parts[0]);
        formation.grid1 = parts[1].equals("null") ? null : EnemyUnit.fromId(parts[1]);
        formation.grid2 = parts[2].equals("null") ? null : EnemyUnit.fromId(parts[2]);
        formation.grid3 = parts[3].equals("null") ? null : EnemyUnit.fromId(parts[3]);
        formation.grid4 = parts[4].equals("null") ? null : EnemyUnit.fromId(parts[4]);
        formation.grid5 = parts[5].equals("null") ? null : EnemyUnit.fromId(parts[5]);
        formation.grid6 = parts[6].equals("null") ? null : EnemyUnit.fromId(parts[6]);
        formation.grid7 = parts[7].equals("null") ? null : EnemyUnit.fromId(parts[7]);
        formation.grid8 = parts[8].equals("null") ? null : EnemyUnit.fromId(parts[8]);
        formation.grid9 = parts[9].equals("null") ? null : EnemyUnit.fromId(parts[9]);
        formation.grid10 = parts[10].equals("null") ? null : EnemyUnit.fromId(parts[10]);
        formation.grid11 = parts[11].equals("null") ? null : EnemyUnit.fromId(parts[11]);
        formation.grid12 = parts[12].equals("null") ? null : EnemyUnit.fromId(parts[12]);
        formation.grid13 = parts[13].equals("null") ? null : EnemyUnit.fromId(parts[13]);
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
            e.printStackTrace();
        }
        return null;
    }
}