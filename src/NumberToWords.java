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
        int count = getDigitCount(number);

        // Extract the last digit of number
        while (count > 0) {
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
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            count--;
        }
    }

    public static int reverse (int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount (int number) {
        //Edge case
        if (number < 0) {
            return -1;
        }

        // Variable Declaration
        int count = 1;

        // iterate through number to get count of digits
        while (number > 9) {
            number /= 10;
            count++;
        }
        return count;
    }
}
