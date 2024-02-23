import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = null;
        FileInputStream fin = null;

        try{
            fout = new FileOutputStream("destination.txt");
            fin = new FileInputStream("source.txt");
            int content;
            while((content = fin.read()) != -1){
                fout.write((byte) content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fin!=null){
                fin.close();
            }
        }
    }
}
