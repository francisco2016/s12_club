import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * ------------- clase Club, representa un club deportivo que tiene una colección de socios--------------------------------------
 */
public class Club
{
    public ArrayList<Membership> socios;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
       socios = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        socios.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return socios.size();
    }
}
