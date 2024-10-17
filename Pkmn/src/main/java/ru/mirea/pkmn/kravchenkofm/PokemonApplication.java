package ru.mirea.pkmn.kravchenkofm;

import ru.mirea.pkmn.Card;

public class PokemonApplication {
    static String filename = "C:\\Users\\user\\IdeaProjects\\Pkmn\\src\\main\\resources\\my_card.txt";
    public static void main(String[] args) throws Exception {
        CardImport cardimport = new CardImport();
        Card card = new Card();
        card = cardimport.Fill(filename);
        CardExport.Export(card);
        System.out.println(card.toString());

        Card Z = CardImport.SImport("C:\\Users\\user\\IdeaProjects\\Pkmn\\src\\main\\resources\\Blissey.crd");
        System.out.printf(Z.toString());
    }
}
