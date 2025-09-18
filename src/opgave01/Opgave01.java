package opgave01;

public class Opgave01 {
    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();
        System.out.println(crossSum(9));
        System.out.println(crossSum(123));
    }

    public static int crossSum(int number) {
        int crossSum = 0;
        while (number > 9) {
            crossSum += number % 10;
            number = number / 10;
        }
        return crossSum + number;
    }
    private static int[] getIntegerArray() {
        int[] integerArray =  { 1095, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002 };
        return integerArray;
    }
}
