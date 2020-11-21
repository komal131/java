import java.util.Scanner;
public class PassFail {

 public static void main(String[] args) {
  int num;
  Scanner reader = new Scanner(System.in);
  System.out.println("Enter score: ");
  num = reader.nextInt();
  
  if (num>=40)
  {
   System.out.println("Pass!");
  }
  else
   System.out.println("Fail!");
 }

}
