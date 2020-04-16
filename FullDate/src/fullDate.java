import java.util.Scanner;

public class fullDate {
    public static void main(String[] args)
    {
        int month;
        int day;
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month(mm). ");
        month = sc.nextInt();
        System.out.print("Enter day(dd). ");
        day = sc.nextInt();
        System.out.print("Enter year(yy). ");
        year = sc.nextInt();

       switch ( month )
        {
            case 1:
                System.out.println("It is January " + day +"," + "20" + year);
                break;

            case 2:
                System.out.println("It is February " + day +"," + "20" + year);
                break;

            case 3:
                System.out.println("It is March " + day +"," + "20" + year);
                break;
            case 4:
                System.out.println("It is April " + day +"," + "20" + year);
                break;
            case 5:
                System.out.println("It is May " + day +"," + "20" + year);
                break;
            case 6:
                System.out.println("It is June " + day +"," + "20" + year);
                break;
            case 7:
                System.out.println("It is July " + day +"," + "20" + year);
                break;
            case 8:
                System.out.println("It is August " + day +"," + "20" + year);
                break;
            case 9:
                System.out.println("It is September " + day +"," + "20" + year);
                break;
            case 10:
                System.out.println("It is October " + day +"," + "20" + year);
                break;
            case 11:
                System.out.println("It is November " + day +"," + "20" + year);
                break;
            case 12:
                System.out.println("It is December " + day +"," + "20" + year);
                break;

            default:
                System.out.println("Sorry Wrong month number try again.");
                break;

        }
    }
}
