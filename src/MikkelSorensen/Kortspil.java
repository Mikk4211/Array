package MikkelSorensen;

public class Kortspil {
    public static void main(String[] args) {
        //Hele kortspillet med 52 kort, 4 klasser og 13 kort.
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
        "Queen", "King"};

        //Initialisere kortene
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        //Her blandes kortene ved brug af Math.random, så kortene er tilfædige.
        //Deck[i] bliver til den tilfældige variabel, som der bruges til at vise det tilfældige kort.
        for (int i = 0; i < deck.length; i++) {
            int index =(int)(Math.random()*deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;

        }
        //Her bliver der tilfældigt trukket 4 kort, og der vises de 4 kort i en println. 
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + " is: " + rank + " of " + suit);
            
        }


    }
}
