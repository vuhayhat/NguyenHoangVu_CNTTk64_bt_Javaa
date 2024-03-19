package Loi_NgoaiLe;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void read(String fileName){
        try {
            File file = new File(fileName);
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("File ko tim thay");
        }
    }

    public static void main(String[] args) {

        FileRead.read("hello.txt");
    }
}


