package opgave05;

public class Opgave05 {
    public static void main(String[] args) {
        System.out.println(fourNumbersInaRow());
    }

    public static int fourNumbersInaRow() {
        int[] arr = {1,3, 3, 3, 4, 4, 4, 5, 5, 5, 5,3,4,5,4,3,};
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                counter++;
                if (counter == 3) {
                    System.out.println("der er 4 af det samme tal");
                }
            }if(arr[i] != arr[i - 1]) {
                    counter = 0;
                }
            }



        return 0;
    }
}
