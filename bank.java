package bank;

class Account{
    public String name;
    protected String email;
    String mob; //default
    private String password;
    //getters and setters
    public String getpassword(){
        return this.password;
    }
    public void setpassword(String pass){
        this.password = pass;
    }
}
public class Bank{
    public static void main(String args[]){
        Account acc1 = new Account();
        acc1.name ="arvind";
        acc1.email = "arvind@gmail.com";
        acc1.setpass("abcd");
        System.out.println(acc1.getpassword());
    }
}