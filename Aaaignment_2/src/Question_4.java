/* Write a program to swap values of two int variable without using third variable. */
public class Question_4 {
    public static void main(String[]args){
        int a=10,b=20;
        System.out.println("a="+a+" b="+b);
        b=b-a;
        a=b+a;
        System.out.println("a="+a+" b="+b);
    }
}
