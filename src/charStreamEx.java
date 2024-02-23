import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class charStreamEx {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;

        try{
            reader = new FileReader("source.txt");
            writer = new FileWriter("destination.txt");
            int content;
            while((content = reader.read()) != -1){
                writer.append((char) content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if(reader != null){
                reader.close();
            }
            if(writer != null){
                writer.close();
            }
        }
    }
}
