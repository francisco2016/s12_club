
/**
 * Provide a demonstration of the Club and Membership
 * classes.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClubDemo
{
    // instance variables - replace the example below with your own
    private Club club;

    /**
     * Constructor for objects of class ClubDemo
     */
    public ClubDemo()
    {
        club = new Club();
    }

    /**
     * Add some members to the club, and then ----Añadir algunos miembros del club, y luego
     * show how many there are.-------------------Muestran cuántos hay.
     * Further example calls could be added if more functionality--Ejemplo Pide, además, se podrían añadir más funcionalidad si
     * is added to the Club class.----- Se añade a la clase Club.

     */
    public void demo()
    {
        club.join(new Membership("David", 2, 2004));
        club.join(new Membership("Michael", 1, 2004));
        System.out.println("The club has " +
                           club.numberOfMembers() +
                           " members.");
    }
}
