public class NumberToWords {

    public static void numberToWords (int number) {
        // Edge Cases
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        // Variable Declaration
        int currentDigit = 0;
        String outPut = "";

        // Extract the last digit of number
        while (number > 0) {
            currentDigit = number % 10;
            number = number / 10;

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
            }
        }
    }
}
