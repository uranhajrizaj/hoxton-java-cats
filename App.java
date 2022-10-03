import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        ArrayList<Cat> cats=new ArrayList<>();
        cats.add(new Cat("Gardif",1,true)) ;
        cats.add(new Cat("Oliver",2,false)) ;
        
        for(Cat cat:cats){
            cat.DisplayInfo();
        }

    }
}