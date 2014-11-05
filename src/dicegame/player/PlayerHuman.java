package dicegame.player;
import java.util.Scanner;

/**
 * Klasa reprezentuje gracza-człowieka, ktory wpisuje liczbę w konsoli.
 * 
 * Klasa rozszerza abstrakcyjną klasę Player
 * 
 */
public class PlayerHuman extends Player {
    
    //obiekt obsługujący wejście konsoli
    private Scanner scanner = new Scanner(System.in);
    
    /**
     * Konstruktory
     */
    public PlayerHuman() {
    }
    
    public PlayerHuman(String name) {
        super(name);    //wywołujemy konstruktor klasy nadrzędnej (Player) z jednym parametrem
    }
    
    /**
     * Metoda umożliwia użytkownikowi wpisanie liczby.
     * 
     * Uwaga: nie są wykonywane żadne testy sprawdzające poprawność wprowadzanych danych!
     * 
     * @return odgadnięta (wpisana) liczba
     */
    @Override
    public int guess() {
        System.out.print("Podaj liczbę: ");
        return scanner.nextInt();
    }
}