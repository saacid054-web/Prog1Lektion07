package opgave01;

public class Opgave01 {
    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();
        //System.out.println(crossSum(9));
        //System.out.println(crossSum(123));
        //printArray(getIntegerArray());
        //sum();
        //mean(integerArray);
        crossSum2(integerArray);
    }

    public static int crossSum(int arr[]) {
        int index = 0;
        int crossSum = 0;
        int number = 0;
        while (index < arr.length){

            number = arr[index];

            while (number > 0) {
                crossSum += number % 10;
                number = number / 10;
            }

        index++;
        }
        System.out.println(crossSum+number);

        return 0;
    }
    private static int[] getIntegerArray() {
        int[] integerArray =  { 1095, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002 };
        return integerArray;
    }

    public static void printArray(int[] arr) {
        int index = 0;
        while (index < arr.length){
            System.out.println(arr[index]);
            index++;
        }

    }

    public static int sum(int[] arr){
        int index = 0;
        int sumOfArray = 0;
        while (index < arr.length){
            sumOfArray += arr[index];
            index++;
        }
        System.out.println(sumOfArray);
        return 0;
    }

    public static int mean(int[] arr){
        int index = 0;
        double meanOfArray = 0;
        int[] array = getIntegerArray();
        while (index < array.length){
            meanOfArray += array[index];
            index++;
        }
        System.out.println(meanOfArray/array.length);
        return 0;
    }

    public static int crossSum2(int arr[]){
        int index = 0;
        int crossSum = 0;
        int number = 0;
        int results[] = new int[10];

        while (index < arr.length){

            number = arr[index];

            //while (number > 10)
            while (number > 0) {
                crossSum += number % 10;
                number = number / 10;
            }

                while (crossSum >= 10) {
                    number = crossSum;
                    crossSum = 0;
                    while (number > 0) {

                        crossSum += number % 10;
                        number = number / 10;
                    }

                }
            results[crossSum]++;
            index++;
            }

        printArray(results);

        return 0;
    }


}
