import java.io.BufferedReader;
import java.io.FileReader;

public class ReadData {
  public static void main(String[] args) {
  try {
    FileReader in = new FileReader("student.txt");
    BufferedReader reader = new BufferedReader(in);
    String temp; 
    while ((temp = reader.readLine()) !=null) {
      System.out.println(temp);
    }
    reader.close();
  } catch (Exception e) {
    // TODO: handle exception
    System.out.println("มีข้อผิดพลาด");
  }
  
  
  
  
  }
}
