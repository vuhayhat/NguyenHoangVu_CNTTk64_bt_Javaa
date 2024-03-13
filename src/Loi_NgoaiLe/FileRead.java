package Loi_NgoaiLe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleFileReader {

    public static String read(String filename) {
        String content = "";
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                content += scanner.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("File không tìm thấy");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void main(String[] args) {
        String content = SimpleFileReader.read("hello.txt");
        System.out.println(content);
    }
}
