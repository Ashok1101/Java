
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    /*multiline
	    */
		System.out.println("Hello World");  // println
		System.out.print("arind");   // print
		// Primitive data types
		//byte -1byte
		//short - 2
		//int -4
		//long -8
		//float -4
		//double -8
		//char -2
		//boolean -1
// 		variable
		 String name = "aman";
		 int age =20;
		 name = name + "sharma"; //concatenate
		 byte a1 =20;
		 int phone = 12345;
		 long phone2 = 1245L;
		 float pi = 3.14F;
		 char letter = '@';
		 boolean isAdult = true;
		 //Non-primitive data type
		 String name1 = new String("arvind");
		 System.out.println(name.length()); // length
		 System.out.println(name1.charAt(1));  // charAt
		 name = name.replace('a','p');  // replace
		 System.out.println(name);
		 String s ="arvind patel";
		 System.out.println(s.substring(0,6));
		 int[] marks = new int[3];
		 marks[0]=97;
		 marks[1]=90;
		 marks[2]=89;
		 //empty int array stores '0' and boolean array stores false
		 System.out.println(marks.length); // array length --note: without '()'
		 Arrays.sort(marks); // sort array --here: Arrays is class name and to use this we have to import package -"import java.util.Arrays;"
        System.out.println(marks[0]);
        //2D Arrays
        int[][] finalmarks ={{1,2,3},{4,5,6}};
        System.out.println(finalmarks[0][0]);
        //casting
        double price =100.00;
        double price1 = price + 10;
        System.out.println(price1);
        int p =100;
        int fp= p + (int)18.0;
        System.out.println(fp);
        // constants
        final float PI = 3.14F;
        //operators
        int a=1;
        int b=2;
        int sum =a+b;   //  -,*,/,%,
        System.out.println(sum);
        sum++; //unary operators
        ++sum;
        // Math class
        System.out.println(Math.min(2,5)); // min
        System.out.println(Math.max(2,5)); // max
        System.out.println(Math.random()); // random-bydefault long value and less than 1
        System.out.println((int)(Math.random()*100));
        // input
        Scanner sc = new Scanner(System.in); // import Scanner 
        System.out.println("Input ur age: ");
        //next() takes only tokens means only single word
        //nextLine() takes complete sentence
        int age1 = sc.nextInt(); //nextInt() to take integer input likewise for float nextFloat(),nextchar()
        System.out.println(age1);
        //string input
        Scanner sc1 = new Scanner(System.in);
        System.out.println("input ur name: ");
        String n = sc.next();
        System.out.println(n);
        //comparison operators
        //a==b
        //a!=b
        //a>=b
        if(age > age1){
            System.out.println("age > age1");
        }
        else{
            System.out.println("age < age1");
        }
        int day=1;
        switch(day){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                    break;
            default:
                System.out.println("0");
        }
        //loops
        for(int i=0;i<3;i++){
            System.out.print(i);
        }
        System.out.println("");
        int i=2;
        while(i>1){
            System.out.println(i);
            i--;
        }
        do{
            System.out.println(i);
            i++;
            continue;
        }while(i<3);
        // Try-Catch in Exception handling
        int[] mark={99,89,78};
        try{
            System.out.println(mark[5]);
        }
        catch(Exception exception){
            System.out.println(exception);
        }
        System.out.println("Exception handled succesfully");
        
        //function 
        public static void printjava(){
            System.out.println("hello function");
        }
        printjava();
	}
}
