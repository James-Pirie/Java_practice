import java.util.Scanner;

public class HouseOfCards {
    public static void main(String[] args){
        Scanner numberOfStoriesSc = new Scanner(System.in);
        String  numberOfStoriesSt = numberOfStoriesSc.next();
        int numberOfStoriesIn = Integer.parseInt(numberOfStoriesSt);
        int[] numberOfCards = new int[numberOfStoriesIn];
        int total_number_of_cards = 0;
        for (int i = numberOfStoriesIn - 1; i > 0; i --){
            numberOfCards[i] = (numberOfStoriesIn * 2) + (numberOfCards[i] += numberOfStoriesIn/2);
            total_number_of_cards += numberOfCards[i];
        }
        System.out.println(total_number_of_cards-numberOfStoriesIn);
    }
}
