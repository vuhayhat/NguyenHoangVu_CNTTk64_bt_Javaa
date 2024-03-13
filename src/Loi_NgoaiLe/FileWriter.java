package Loi_NgoaiLe;
import java.io.PrintWriter;
import java.io.File;

public class Test {
    public static void write(String filename, String s) {
        File file = new File(filename);
        PrintWriter out = new PrintWriter(file);
        out.println(s);
        out.close();
    }




}
