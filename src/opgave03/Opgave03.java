package opgave03;

public class Opgave03 {
    public static void main(String[] args) {
        System.out.println(weekday(4, 13));
    }

    private static String weekday(int dayOfWeek, int daysInTheFuture) {

            String[] arr =  {"mandag", "tirsdag", "onsdag", "torsdag", "fredag", "lørdag", "søndag"};
            dayOfWeek = (dayOfWeek + daysInTheFuture) % 7;

    return arr[dayOfWeek];

    }
}
