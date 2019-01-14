package activity.pkg1;
public class Activity1 {

    public static void main(String[] args) {
        
        sayHelloWorld();
        hello("Warren");
       
    }
    
    static void sayHelloWorld(){
        System.out.println("HELLO WORLD!");
    }  
    
    static void hello(String x){
        System.out.println("Hello " + x);
    }
    
}
    
