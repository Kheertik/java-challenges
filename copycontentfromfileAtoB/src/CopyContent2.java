import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyContent2 {

    public static void main(String[] args) throws IOException{

        String fileA;
        String fileB;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the location of the file to copy the content from: "); //"C:\\Users\\user\\Desktop\\A.txt", to input the file location
        fileA = input.nextLine();
        FileInputStream reading = new FileInputStream(fileA); //for reading the text file, fileA being the location

        System.out.print("Enter the location of the file to paste the content: "); //"C:\\Users\\user\\Desktop\\B.txt", to input the destination file location
        fileB = input.nextLine();
        FileOutputStream writing = new FileOutputStream(fileB); //For creating a file as well as write on the file

        int index;
         while((index = reading.read()) != -1) //

        {
            writing.write((char)index);
        }
            System.out.println("Contents of File A has been successfully been copied to File B ");

    }

}
