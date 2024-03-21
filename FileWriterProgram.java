import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterProgram {
    
/**
 * @param args
 */
public static void main(String[] args){

    File textfile = new File("main.txt");
    
    try {
        FileWriter writer = new FileWriter(textfile);
        writer.write("Characters I Would Ride");
        writer.close();
        System.out.println("Printed Successfully");


    } catch (Exception e) {

        System.out.println("Nag Error Sya");
        e.printStackTrace();
    }

}
}