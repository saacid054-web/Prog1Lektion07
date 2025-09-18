### Opgave 1

a) Lav en metode der udskriver alle tallene i integerArray. Jeres metode skal tage en
parameter af typen int[] og returnere void.

b) Lav en metode der adderer alle tallen i integerArray. Jeres metode skal tage en
parameter af typen int[] og returnere en int.

c) Lav en metode der finder gennemsnittet af alle tallene i integerArray. Jeres metode
skal tage en parameter af typen int[] og returnere en double.

d) Lav en metode til at udregne tværsummen af alle tal i
integerArray. Jeres metode skal tage en parameter af typen int[] og returnere int[].
I kan gøre brug at metoden crossSum til at udregne tværsummen for et tal.

e) Hvis man tager tværsummen af en tværsum, vil man på et tidspunkt ende med et
enkeltciffer tal.

Eksempel:
Tværsummen af 853 er 8 + 5 + 3 = 16
Tværsummen af 16 er 1 + 6 = 7

For hvert tal i integerArray udregn enkeltciffer tværsummen og returnerer et array der
angiver antallet af tværsum resultater. Dvs. hvor mange gange blev enkeltciffer
tværsummer 1, hvor mange gange 2, osv. optil 9.

### Opgave 2

a) Lav en metode der tager et char[] som parameter, gennemløber det og tæller hvor mange vokaler
der er i det. Metoden skal returnere et int[] hvor index 0 angiver hvor mange a'er der er , index 1 
angiver hvor mange e'er der er og så viderer med vokalerne i, o, u, y, æ, ø, å

b) Lav en metode der løber igennem bogstaverne i et char array ud udskifter bogstaverne, så teksten bliver
omformet til leetspeak. 

Du kan læse mere om leetspeak på [title]https://leetspeak-converter.com/

### Opgave 3 

Reimplementer metoden weekday, men brug et array til at udskrive ugedagene i stedet for if/else sætningen.

### Opgave 4

Lav en metode der afgør om en streng er et pallidrom. "ABBA", "mellem" of "radar" er eksempler pallidromer.

### Opgave 5

Lav en metode der afgør om en liste af heltal har fire ens tal i forlængelse af hinanden. 

7, 4, 3, 3, 3, 5, 5, 5, 5, 1 har fire ens tal i forlængelse af hinanden.

4, 4, 4, 8, 8, 8 har ikke.

### Opgave 6*

Romertal er et additivt talsystem, dvs. et talsystem hvor man finder tallet ved at adderer de
enkle talsymboler. Denne tabel viser talsymbolerne og deres værdi.


| Romertal symbol | Værdi |
|-----------------|-------|
| I               | 1     |
| V               | 5     |
| X               | 10    |
| L               | 50    |
| C               | 100   |
| D               | 500   |
| M               | 1000  |

Når man skriver et romertal, så skriver man altid det romertal med størst værdig først.

Eksempel:

XXVII = 10 + 10 + 5 + 1 + 1 = 27

En undtagelse for reglen om størst værdig først, er at for X (10) og V (5) må man sætte et
enkelt I (1) foran. Hvis man gør dette, trækker man et fra i stedet for at ligge til.

Så i stedet for at skrive 4 som IIII skriver man 4 som IV. 

På samme vis skriver man 9 som IX.

Samme regel gælder for L (50) og C (100), hvor man kan sætte et X foran. Og for D (500) og
M (1000) hvor man kan sætte et C foran.

Eksempel:

CMXLIV = -100 + 1000 – 10 + 50 – 1 + 5 = 944

Lav en metode der kan omregne fra romertal til arabertal. 
