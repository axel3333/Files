package Files.Saving;

import java.io.File;

import static Files.Saving.GameProgress.*;

public class Main {
    public static void main(String[] args) {
        final String PATH = "C:/Java/Games/";

        GameProgress gp1 = new GameProgress(100, 3, 2, 140.5);
        GameProgress gp2 = new GameProgress(75, 4, 6, 428.68);
        GameProgress gp3 = new GameProgress(89, 8, 32, 2865.91);
        File save1 = new File(PATH + "savegames/save1.dat");
        File save2 = new File(PATH + "savegames/save2.dat");
        File save3 = new File(PATH + "savegames/save3.dat");

        gp1.saveGame(PATH + "savegames/save1.dat", gp1);
        gp2.saveGame(PATH + "savegames/save2.dat", gp2);
        gp3.saveGame(PATH + "savegames/save3.dat", gp3);

        String path = PATH + "savegames/zip.zip";

        File folder = new File(PATH + "savegames");
        File[] files = folder.listFiles();
        String[] names = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            names[i] = files[i].getName();
            System.out.println(names[i]);
        }

        zipFiles(path, files);
        save1.delete();
        save2.delete();
        save3.delete();

        openZip(path, PATH + "temp/");
        openProgress(PATH + "temp/save1.dat");
        openProgress(PATH + "temp/save2.dat");
        openProgress(PATH + "temp/save3.dat");
    }
}