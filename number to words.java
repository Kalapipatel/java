
public class rough2 {
    static String digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void num_to_letter(int num) {
        if (num == 0) {
            return;
        }
        int last_digit = num % 10;
        num_to_letter(num / 10);
        System.out.print(digit[last_digit] + " ");
    }

    public static void main(String args[]) {
        int n = 2019;
        int n2 = 1947;
        num_to_letter(n);
        num_to_letter(n2);

    }
}
