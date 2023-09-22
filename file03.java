import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class file03 {

  public static void main(String[] args) throws IOException {
    File file = new File("sample.txt");
    FileOutputStream buff = new FileOutputStream(file);
    byte [] data = {1,2,3,4,5,6,7,8,9,10};
    buff.write(data);
    buff.write(data[5]);
    buff.write(data[9]);
    
    String title = "Hello World!!!";
    byte[] title_bin = title.getBytes();
    buff.write(title_bin);

    buff.close();

  }
}
