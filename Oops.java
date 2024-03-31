import java.util.*;
import bank;
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }          
    //constructor : non-parameterized,parameterized & copy
    Pen(){
        System.out.println("constructor is called");
    }
}
//inheritance
class Paper extends Pen{
    public void read(){
        System.out.println("reading paper");
    }
}
/*access modifier
1) public - can be access by all
2) default - can only be access to that package
3) protected - access to all in same package and only subclass of another package
4) private - access to same class only
*/
//abstract - means object of that class can't be created 
abstract class Animal{
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
//Interface - pure abstract
interface Bird{
    void fly();
}
class Carnivorous{
    
}
class Crow implements Birds,Carnivorous{
    public void fly(){
        System.out.println("crow flies");
    }
}
public class Main{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();
        pen1.printcolor();
        Paper ppr1 = new Paper();
        ppr1.color = "red";
        ppr1.printcolor();
        //package
        bank.Account acc1 = new Account();
        cc1.name = "customer1";
    }
}