package password_generator;



public class testing {
    public static void main(String[] args) {
        pw t1 = new pw();
        t1.input1();
        t1.input2();
        t1.generatePw();
        System.out.println("Your password is: " + t1.getPw());
    }
}
