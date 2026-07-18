import java.util.Scanner;

public class Question2 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(3);//Next means it will just print the next word
                                             //trim cuts the extra space
                                             //charAt is the character at that index
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");}
            else {
                System.out.println("uppercase");
            }
        }


    }

