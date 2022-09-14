public class NumberToWords {

    public static void numberToWords (int number) {
        // Edge Cases
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        // Variable Declaration
        int currentDigit = 0;
        String outPut = "";
        int properNumber = reverse(number);

        // Extract the last digit of number
        while (properNumber > 0) {
            currentDigit = properNumber % 10;
            properNumber = properNumber / 10;

            switch (currentDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                case 9:
                    System.out.print("Nine ");
                default:
                    System.out.println("Should not get to here");
            }
        }
    }

    public static int reverse (int number) {
        int reverseNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            reverseNumber = reverseNumber * 10;
            reverseNumber += digit;
        }
        return reverseNumber;
    }
}
