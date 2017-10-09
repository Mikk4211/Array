package MikkelSorensen;

public class AlfabetArray {
    public static void main(String[] args) {
        //Her laves arrayed.
        char[] chars = createArray();

        //Her vises arrayed
        System.out.println("De små bogstaver er: ");
        displayArray(chars);

        //Her tælles hvor mange gange bogstaver går igen
        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("Hyppigheden af bogstaverne er: ");
        displayCounts(counts);






    }
    //Her skabes indholdet af arrayed, der bestemmer mængden af bogstaver.
     private static char[] createArray() {
         char[] chars = new char[100];
         for (int i = 0; i < chars.length; i++)

             chars[i] = RandomCharacter.getRandomLowerCaseLetter();

             return chars;
         }

    private static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.println(chars[i] + " ");
        }
    }

    private static int[] countLetters(char[] chars) {
        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a']++;

        return counts;
    }

    private static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char) (i + 'a'));
            else
                System.out.println(counts[i] + " " + (char) (i + 'a') + " ");

        }
    }
}
