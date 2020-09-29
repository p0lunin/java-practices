package k171.polunin;

public class Main {

    public static void main(String[] args) {
        System.out.println(isElementsBiggerThanLast(new int[]{1, 2, 3})); // Выведет true
        System.out.println(isElementsBiggerThanLast(new int[]{1, 4, 3})); // Выведет false

        showFizzBuzz(100);
    }

    static boolean isElementsBiggerThanLast(int[] array) {
        var prev = array[0];
        for (var i = 1; i < array.length; i++) {
            if (array[i] <= prev) {
                return false;
            }
            else {
                 prev = array[i];
            }
        }
        return true;
    }

    static void showFizzBuzz(int to) {
        System.out.println(fizzBuzz(to));
    }

    static String fizzBuzz(int to) {
        var text = new StringBuilder();
        for (var i = 1; i <= to; i++) {
            var isAdded = false;
            if (i % 3 == 0) {
                text.append("Fizz");
                isAdded = true;
            }
            if (i % 5 == 0) {
                text.append("Buzz");
                isAdded = true;
            }
            if (!isAdded) {
                text.append(i);
            }
            text.append("\n");
        }
        return text.toString();
    }
}
