import java.io.*;

public class FileCRUD {
    public static void main(String[] args) {
        try{
            //create file
            File fo = new File("new-file.txt");
            fo.createNewFile();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        // Write in the file
        try{
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("ਆਖਿਆ ਨੂੰ ਖਵਾਬ ਵਖ ਗਈ ਆ\n" +
                    "ਸਾਹਣੁ ਝੂਠੇ ਲਾਰੇ ਲਾ ਗਈ ਆ\n" +
                    "ਇਸ਼ਕ ਦਾ ਰੋਣਾ ਪਾਕੇ ਤੂੰ ਸਾਡੇ ਦਿਲ ਨੂੰ ਕ੍ਯੂਂ ਟੀ ਠੁਕਰਾ ਗਈ ਆ");
            fw.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        // Read from a file
        try (BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))){
            while (br.ready()){
                System.out.println(br.readLine());
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            //create file
            File fo = new File("Random.txt");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println(fo.getName());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        // Delete the file

    }
}
