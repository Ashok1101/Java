import java.util.*;
// string are immutable in java
public class String{
    public static void main(String[] args){
        String secondName = "Stark";
        String fullName = firstName + " " + secondName;
        System.out.println(fullName.length());
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
        if(name1.equals(name2)) {
           System.out.println("They are the same string");
        } else {
           System.out.println("They are different strings");
        }
        //DO NOT USE == to check for string equality
        //Gives correct answer here
        if(name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
        //Gives incorrect answer here
        if(new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
        System.out.println(name.substring(0, 4));
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str.length());

    }
    //string Builder
    StringBuilder sb = new StringBuilder("Tony");
     //Set Char
     System.out.println(sb.charAt(0));
     //Get Char
     sb.setCharAt(0, 'P');
     System.out.println(sb);
     //Insert char
     sb.insert(0, 'S');
     System.out.println(sb);
     //delete char
     sb.delete(0, 1);
     System.out.println(sb);
    sb.append(" Stark");
     System.out.println(sb);
}