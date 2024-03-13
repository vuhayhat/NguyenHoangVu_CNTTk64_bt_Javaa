package Loi_NgoaiLe;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;


public class FileWriter {
    public static void write(String filename, String s) {
        File file = new File(filename);//xu ly tại cho
        PrintWriter out = null;
        try {
            out = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            System.out.println("File kh tim thay");
//            throw new RuntimeException(e);
        }
        out.println(s);
        out.close();
    }
    public static void main(String[] args) {
        FileWriter.write("hello.txt", "day la bai test");

    }

}
