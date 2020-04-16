public class CompArray {
    public static void main(String[] args) {
        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};

        // Declare sum variable, assign it initial value of zero
        int sum = 0;
        for(int x = 0; x < numbers.length; x++){
            sum = sum + numbers[x];
        }
        System.out.println("The total sum of the array is " + sum);
    }
}
