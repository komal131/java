public class threading_2 
implements Runnable

 { 

public void run() 

{ 

System.out.println("Thread is running."); 

} 

public static void main(String args[])

 { 

threading_2 obj=new threading_2(); 

Thread t =new Thread(obj); 

t.start(); 

} 

}
