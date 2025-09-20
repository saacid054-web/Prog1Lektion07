package opgave02;

public class Opgave02 {
    public static void main(String[] args) {
        char[] characterArray = getCharacterArray();

        //vokalCounter(getCharacterArray());
        leetspeak(getCharacterArray());
    }

    private static char[] getCharacterArray() {
        return ("Der var så dejligt ude på landet; det var sommer, kornet stod gult, havren grøn, " +
                "høet var rejst i stakke nede i de grønne enge, og der gik storken på sine lange, " +
                "røde ben og snakkede ægyptisk, for det sprog havde han lært af sin moder. Rundt om" +
                " ager og eng var der store skove, og midt i skovene dybe søer; jo, der var rigtignok " +
                "dejligt derude på landet! Midt i solskinnet lå der en gammel herregård med dybe kanaler" +
                " rundt om, og fra muren og ned til vandet voksede store skræppeblade, der var så høje," +
                " at små børn kunne stå oprejste under de største; der var lige så vildsomt derinde, som " +
                "i den tykkeste skov, og her lå en and på sin rede; hun skulle ruge sine små ællinger ud, " +
                "men nu var hun næsten ked af det, fordi det varede så længe, og hun sjælden fik visit;" +
                " de andre ænder holdt mere af at svømme om i kanalerne, end at løbe op og sidde under " +
                "et skræppeblad for at snadre med hende." +
                "Endelig knagede det ene æg efter det andet: pip! pip! sagde det, alle æggeblommerne " +
                "var blevet levende og stak hovedet ud." +
                "Rap! rap! sagde hun, og så rappede de sig alt hvad de kunne, og så til alle sider " +
                "under de grønne blade, og moderen lod dem se så meget de ville, for det grønne er godt for " +
                "øjnene. Hvor dog verden er stor! sagde alle ungerne; thi de havde nu rigtignok ganske " +
                "anderledes plads, end da de lå inde i ægget. Tror I, det er hele verden! sagde moderen, " +
                "den strækker sig langt på den anden side haven, lige ind i præstens mark! " +
                "men der har jeg aldrig været! – I er her dog vel alle sammen! – og så rejste hun sig" +
                " op, nej, jeg har ikke alle! det største æg ligger der endnu; hvor længe skal det vare! nu er " +
                "jeg snart ked af det! og så lagde hun sig igen.").toCharArray();
    }

    private static int[] vokalCounter(char[] arr){

        int index = 0;
        int counter = 0;
        char word = 'h';
        int results[] = new int[9];
        while (index < arr.length){

            word = arr[index];

            if(word=='a' ){
                results[0]++;
            }
            if (word == 'e'){
                results[1]++;
            }
            if (word == 'i'){
                results[2]++;
            }
            if (word == 'o'){
                results[3]++;
            }
            if (word == 'u'){
                results[4]++;
            }
            if (word == 'y'){
                results[5]++;
            }
            if (word == 'æ'){
                results[6]++;
            }
            if (word == 'ø'){
                results[7]++;
            }
            if (word == 'å'){
                results[8]++;
            }
            index++;
        }
        printArray(results);
        return results;
    }
    public static void printArray(int[] arr) {
        int index = 0;
        while (index < arr.length){
            System.out.println(arr[index]);
            index++;
        }

    }
    public static void leetspeak(char[] arr){

        int index = 0;


        int results[] = new int[9];
        while (index < arr.length){



            if(arr[index]=='a' ){
                arr[index] = '@';
            }
            if(arr[index]=='b' ) {
                arr[index] = '6';

            }if(arr[index]=='g' ){
                    arr[index] = '9';
                }
            if(arr[index]=='l' ){
                    arr[index] = '1';
            }
            if(arr[index]=='s' ){
                arr[index] = '5';
            }
            if(arr[index]=='t' ) {
                arr[index] = '+';

            }if(arr[index]=='A' ){
                arr[index] = '4';
            }
            if(arr[index]=='B' ){
                arr[index] = '8';
            }
            if(arr[index]=='C' ){
                arr[index] = '[';
            }
            if(arr[index]=='E' ) {
                arr[index] = '3';

            }if(arr[index]=='I' ){
                arr[index] = '|';
            }
            if(arr[index]=='J' ){
                arr[index] = ']';
            }
            if(arr[index]=='O' ){
                arr[index] = '0';
            }
            if(arr[index]=='s' ) {
                arr[index] = '$';

            }if(arr[index]=='T' ){
                arr[index] = '7';
            }
            if(arr[index]=='Z' ){
                arr[index] = '2';
            }
            index++;
        }
        printArray1(arr);

    }
    public static void printArray1(char[] arr) {
        int index = 0;
        while (index < arr.length){
            System.out.print(arr[index]+" " );
            index++;
        }

    }

    }
