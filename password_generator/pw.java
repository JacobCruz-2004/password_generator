package password_generator;



import java.util.Scanner;
import java.util.Random;

public class pw {
    private int pwLength;
    private String password = "";

    private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lower = "abcdefghijklmnopqrstuvwxyz";
    private String symbols = "!#$%^&*-=+";
    private String nums = "0123456789";
    private String allChars = upper + lower + nums;

    public pw(){}

    public void input1(){
        while(true){
            try{
                Scanner s1 = new Scanner(System.in);
                System.out.println("Include Symbols?(y/n)");
                String symbolInput = s1.next();
                if(symbolInput.equals("y")==false&&symbolInput.equals("n")==false){
                    System.out.println("Input must be y or n");
                    continue;
                }
                if(symbolInput.equals("y")){allChars = allChars + symbols;}
                break;
            }
            catch(Exception e){
                System.out.println("Error");
                continue;
            }
        }
    }

    public void input2(){
        while(true){
            try{
                Scanner s2 = new Scanner(System.in);
                System.out.println("Enter password length: ");
                pwLength = s2.nextInt();
                break;
            }

            catch(Exception e){
                System.out.println("Error");
                continue;
            }
        }
    }

    public void generatePw(){
        Random r = new Random();
        for(int i = 0; i < pwLength; i++){
            char randomChar = allChars.charAt(r.nextInt(allChars.length()));
            password += randomChar;
        }
    }
    
    public String getPw(){return password;}

    
}
