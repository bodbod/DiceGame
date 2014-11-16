package dicegame;

import dicegame.player.Player;
import dicegame.player.PlayerComp;
import dicegame.player.PlayerHuman;


/**
 * Gra w odgadywanie wylosowanej liczby.
 * 
 * Zasady:
 * - komputer rzuca kostką (losuje liczby z zakresu 1..6)
 * - gracze (komputer lub człowiek) starają się odgadnąć liczbę
 * - jeżeli odgadnie, gra się kończy
 * - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje kolejną liczbę i gracz stara się ją odgadnąć)
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //tworzymy obiekt gry
        Game game = new Game();
        
        //tworzymy obiekt gracza        
        Player player = new PlayerComp("Waldek");

        //do gry dodajemy pierwszego gracza
        game.addPlayer(player);
        
        //do gry dodajemy drugiego gracza
        game.addPlayer(new PlayerHuman("ja"));
        game.addPlayer(new PlayerHuman("ja"));
        
        //uruchamiamy grę
        game.start();

    }
}