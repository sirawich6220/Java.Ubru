import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class file04 {
  public static void main(String[] args) throws IOException {
    File file = new File("sample.txt");
    FileInputStream buff =  new FileInputStream(file);
    int length = (int) file.length();
    byte[] data = new byte[length];
    buff.read(data);
    for(int i=0;i<data.length;i++)
      System.out.println(data[i] + " ");
    buff.close();
  }
  
}
