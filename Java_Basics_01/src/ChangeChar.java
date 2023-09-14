import java.util.Scanner;

/**
 * @author Jin
 * @version 1.0
 * @Description
 * @date 9/14/2023 8:31 PM
 */

import java.util.Scanner;

public class ChangeChar {

    // single line comment, main function as the entrance of the program
    public static void main(String[] args){

        /**
        * Here print two lines of information
        *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("input your name");
        String name = scanner.nextLine();
        System.out.print("Input your age:");
        int age = scanner.nextInt();
        System.out.printf("%s, %d\n", name, age);
    }
}

class Var{
    public static void main(String[] args){
        int a = 100;
        long b = 200;
        double score = 99.9;
        String name = "king";
        int[] ns = new int[5];

        ns[0] = 68;
    }
}
