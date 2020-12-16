import java.util.Scanner;
    public class act_7 {
        private static Scanner input;
        public static void main(String[] args) {
            int count, size;
            int newnum = 0;
            int highest = 0;
            int lowest = 0;

            input = new Scanner(System.in);
            System.out.println("Enter size of an array:");
            size = input.nextInt();

            System.out.println("Enter " + size + " integers: ");


            for (count = 0; count < size; count++) {
                newnum = input.nextInt();
                if (highest < newnum)
                    highest = newnum;

                if (lowest == 0)
                    lowest = newnum;

                else if (newnum <= lowest)
                    lowest = newnum;
            }

            System.out.println("The highest element is " + highest);
            System.out.println("The lowest element is " + lowest);
        }
    }