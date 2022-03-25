package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Installation {

    public static File createFolder(String path, String name, StringBuilder message) {
        File file = new File(path + name);
        if (file.mkdir()){
            message.append("Каталог " + file + " создан \n");
        } else {
            message.append("Создать каталог " + file + " не удалось \n");
        }
        return file;
    }

    public static File createFile(String path, String folder, String name, StringBuilder message) {
       File file = new File(path + folder, name);
        try {
            if (file.createNewFile())
                message.append("Файл " + name + " создан \n ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return file;
    }

    public static void main(String[] args) {
        StringBuilder message = new StringBuilder();
        final String PATH = "C://Java/Games/";
        File src = createFolder(PATH, "src", message);
        File res = createFolder(PATH, "res", message);
        File savegames = createFolder(PATH, "savegames", message);
        File temp = createFolder(PATH, "temp", message);
        File main = createFolder(PATH, "src/main", message);
        File test = createFolder(PATH, "src/test", message);
        File drawables = createFolder(PATH, "res/drawables", message);
        File vectors = createFolder(PATH, "res/vectors", message);
        File icons = createFolder(PATH, "res/icons", message);
        File file1 = createFile(PATH, "src/main", "Main.java", message);
        File file2 = createFile(PATH, "src/main", "Utils.java", message);
        File file3 = createFile(PATH, "temp", "temp.java", message);
//        File src = new File("C://Java/Games/src");
//        File res = new File("C://Java/Games/res");
//        File savegames = new File("C://Java/Games/savegames");
//        File temp = new File("C://Java/Games/temp");
//        File main = new File("C://Java/Games/src/main");
//        File test = new File("C://Java/Games/src/test");
//        File file1 = new File(main, "Main.java");
//        File file2 = new File(main, "Utils.java");
//        File drawables = new File("C://Java/Games/res/drawables");
//        File vectors = new File("C://Java/Games/res/vectors");
//        File icons = new File("C://Java/Games/res/icons");
//        File file3 = new File(temp, "temp.txt");
//
//        if (src.mkdir())
//            message.insert(0," Каталог src создан; ");
//        if (res.mkdir())
//            message.insert(1, " Каталог res создан; ");
//        if (savegames.mkdir())
//            message.insert(2, " Каталог savegames создан; ");
//        if (temp.mkdir())
//            message.insert(3, " Каталог temp создан; ");
//        if (main.mkdir())
//            message.insert(4, " Каталог main создан; ");
//        if (test.mkdir())
//            message.insert(5, " Каталог test создан; ");
//        if (drawables.mkdir())
//            message.insert(6, " Каталог drawables создан; ");
//        if (vectors.mkdir())
//            message.insert(7, " Каталог vectors создан; ");
//        if (icons.mkdir())
//            message.insert(8," Каталог icons создан; ");
//        try {
//            if (file1.createNewFile())
//                message.append(" Файл Main.java создан; ");
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//        try {
//            if (file2.createNewFile())
//                message.append(" Файл Utils.java создан; ");
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//        try {
//            if (file3.createNewFile())
//                message.append(" Файл temp.txt создан; ");
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
        try (FileWriter writer = new FileWriter(file3)) {
            for (int i = 0; i < message.length(); i++) {
                writer.write(message.charAt(i));
                writer.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
