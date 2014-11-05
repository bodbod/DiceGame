package dicegame.player;
import java.util.Random;

/**
 * Klasa reprezentuje komputerowego gracza odgadującego wylosowaną liczbę.
 * 
 * Klasa rozszerza abstrakcyjną klasę Player
 * 
 */
public class PlayerComp extends Player {

    /**
     * Konstruktory
     */
    public PlayerComp() {
    }
    
    public PlayerComp(String name) {
        super(name);    //wywołujemy konstruktor klasy nadrzędnej (Player) z jednym parametrem
    }
    
    /**
     * Metoda odgadująca liczbę.
     * 
     * @return odgadnięta (wylosowana) liczba
     */ 
    @Override
    public int guess() {
        int guess = guesser.nextInt(6) + 1;
        return guess;
    }
    
    //"odgadywacz"
    private Random guesser = new Random();
}