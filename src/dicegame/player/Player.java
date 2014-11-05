package dicegame.player;

/**
* Abstrakcyjna klasa bazowa dla klas graczy.
* 
* Definiuje abstrakcyjną metodę guess().
*/
public abstract class Player {
    
    /**
     * Konstruktory
     */
    public Player() {
        name = "Anonim";
    }
    
    public Player(String name) {
        this.name = name;
    }    
    
    /**
     * Pole nazwy (imienia) gracza.
     * 
     * Pole jest prywatne, więc dostarczamy setter i getter.
     */
    private String name;
    
    public void setName(String name) {
        //sprawdzamy, czy nazwa nie jest null ani nie jest pusta ("")
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            //jeśli nazwa nie jest poprawna, rzucamy wyjątek IllegalArgumentException z odpowiednim komunikatem
            throw new IllegalArgumentException("Imię nie może być puste!");
        }
    }
    
    public String getName() {
        return name;
    }
        
    /**
     * Metoda zwraca odgadniętą liczbę (strzał).
     * 
     * @return odgadnięta liczba 
     */
    public abstract int guess();
}
