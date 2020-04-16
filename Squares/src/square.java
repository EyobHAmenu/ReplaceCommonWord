import java.util.Scanner;
public class square {
    public static void main(String[] args){
        int num;
        int square;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number: ");
        num = sc.nextInt();
        System.out.println("Number = Square");
        for (int x = 1; x<= num; x++)
        {
            square = x * x;
            System.out.println(x + "         " + square);

        }
    }

}
