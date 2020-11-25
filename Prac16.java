public class Studentoc{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    Studentoc(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Studentoc(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
   public void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Studentoc s1 = new Studentoc(54,"Kartik");  
    Studentoc s2 = new Studentoc(53,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}
