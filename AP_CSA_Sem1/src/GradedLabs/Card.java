package GradedLabs;

public class Card {
    private String faceName, suitName;
    private final static int NUM_FACES = 13;
    private final static int NUM_SUITS = 4;

    public final static int ACE = 1;
    public final static int TWO = 2;
    public final static int THREE = 3;
    public final static int FOUR = 4;
    public final static int FIVE = 5;
    public final static int SIX = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE = 9;
    public final static int TEN = 10;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    public final static int CLUBS = 1;
    public final static int HEARTS = 2;
    public final static int DIAMONDS = 3;
    public final static int SPADES = 4;

    int CardFace;
    int CardSuit;

    public Card() {
        CardFace = (int) (Math.random() * 13) + 1;
        setFaceName();

        CardSuit = (int) (Math.random() * 4) + 1;
        setSuitName();
    }

    private void setFaceName() {
        if (CardFace == ACE)
            faceName = "Ace";
        else if (CardFace == TWO)
            faceName = "Two";
        else if (CardFace == THREE)
            faceName = "Three";
        else if (CardFace == FOUR)
            faceName = "Four";
        else if (CardFace == FIVE)
            faceName = "Five";
        else if (CardFace == SIX)
            faceName = "Six";
        else if (CardFace == SEVEN)
            faceName = "Seven";
        else if (CardFace == EIGHT)
            faceName = "Eight";
        else if (CardFace == NINE)
            faceName = "Nine";
        else if (CardFace == TEN)
            faceName = "Ten";
        else if (CardFace == JACK)
            faceName = "Jack";
        else if (CardFace == QUEEN)
            faceName = "Queen";
        else if (CardFace == KING)
            faceName = "King";
    }

    private void setSuitName() {
        if (CardSuit == CLUBS)
            suitName = "Clubs";
        else if (CardSuit == HEARTS)
            suitName = "Hearts";
        else if (CardSuit == DIAMONDS)
            suitName = "Diamonds";
        else if (CardSuit == SPADES)
            suitName = "Spades";
    }

    public String getFaceName() {
        return faceName;
    }

    public String getSuitName() {
        return suitName;
    }

    public String toString() {
        return faceName + " of " + suitName;
    }

    public static void main(String[] args){
        Card[][] Cards = new Card[5][3];
        for(int i = 0; i<Cards.length; i++){
            for(int j = 0; j<Cards[i].length; j++){
                Cards[i][j] = new Card();
            }
        }

        for(int i = 0; i<Cards.length; i++){
            for(int j = 0; j<Cards[i].length; j++){
                System.out.print(Cards[i][j].toString()+" | ");
            }
            System.out.println("");
        }
    }
}
