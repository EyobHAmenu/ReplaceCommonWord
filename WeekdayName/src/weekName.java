import java.util.Scanner;

public class weekName {
    public static void main(String[] args){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weekday number: ");
        number = sc.nextInt();
        if(number == 1){
            System.out.println("It is Sunday.");
        }
        else if(number == 2){
            System.out.println("It is Monday.");
        }
        else if(number == 3){
            System.out.println("It is Tuesday.");
        }
        else if(number == 4){
            System.out.println("It is Wednesday.");
        }
        else if(number == 5){
            System.out.println("It is Thursday.");
        }
        else if(number == 6){
            System.out.println("It is Friday.");
        }
        else if(number == 7){
            System.out.println("It is Saturday.");
        }
    }
}
