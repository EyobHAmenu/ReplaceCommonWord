import java.util.Arrays;

public class creatArray {
    public static void main(String[] args){
        /*
        5 numbers
        7 Strings
        5 characters
        2 booleans
         */
        int numbers [] = {1, 21, 63, 4, 51};
        String days [] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        char voles [] = {'a','e','i','o','u'};
        boolean boo [] = {true, false};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(days));
        System.out.println(Arrays.toString(voles));
        System.out.println(Arrays.toString(boo));
    }
}
