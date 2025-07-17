//John Catalana
//7/16/2025
//Recursion and JUnit Assignment

public class Main {
    public static void main(String []args) {

    }

    public static int count8(int number) {
        if (number == 0) return 0;
        if ( number % 10 == 8) {
            if ((number / 10) % 10 == 8) {
                return 2 + count8(number / 10);
            } else {
                return 1 + count8(number / 10);
            }
        }
        return count8(number / 10);
    }

    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }

    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("xhi")) {
            return countHi2(str.substring(3));
        }
        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        return countHi2(str.substring(1));
    }
}
