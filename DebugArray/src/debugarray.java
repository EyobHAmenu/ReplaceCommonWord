import java.util.Arrays;

public class debugarray {
    public static void main(String[] args) {


        ////1.Create an array to hold the numbers 1-10.
        int numList [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(numList));

        for (int i = 0; i < numList.length; i++) {
            System.out.print(numList[i] + ", ");
        }
        System.out.println();


////2.Loop through that array and sum the numbers 1-10, then print that total to the screen.
        int numList2 [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        for (int i = 0; i < numList2.length; i++) {
            total = total + numList2[i];
        }
        System.out.println("The total of the numbers is " + total);
    }
}
