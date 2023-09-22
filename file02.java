import java.io.BufferedWriter;
import java.io.FileWriter;

public class file02 {
  public static void main(String[] args) {

    try {
      FileWriter out = new FileWriter("contact.txt");
      BufferedWriter Buff = new BufferedWriter(out);
      Buff.write("DVL DEVELOPER ");
      Buff.close();
      
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("มีข้อผิดพลาด");
    }

  }
}
