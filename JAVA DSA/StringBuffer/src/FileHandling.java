// Streams -> Sequence of data it can be byte value and character value (Unicode)
// java perform input and output through these streams. It is an abstraction that java provide
// this stream is linked to physical device by java input output
// java implement these within class hierarchy in java.io package
// Types of streams in java
// Byte Stream                 and        Character Stream
// .

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandling {
    public static void main(String[] args) {
//        try (InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.println("Enter some letters:");
//            int letters = isr.read();
//            while(isr.ready()){
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
////            isr.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }


        try (FileReader fr = new FileReader("note.txt")){
            int letters = fr.read();
            while(fr.ready()){
                System.out.println((char) letters);
                letters = fr.read();
            }
//            fr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

//Byte to char stream and reading char stream
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(("You typed: " + br.readLine()));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))){
            while (br.ready()){
                br.readLine();
            }
            System.out.println(("You typed: " + br.readLine()));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
