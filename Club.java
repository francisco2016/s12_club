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

    /** 
     * Calcula el numero de socios que se dieron de alta en un mes determinado. 
     * El año no nos importa. En caso de que el parametro contenga un valor 
     * no valido se muestra por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @return El numero de socios que se dieron de alta dicho mes
     */
    public int joinedMonth(int month){
        int numSocios = 0;
            for(Membership socio: socios){
                if(socio.getMonth() == month){
                    numSocios ++;
                }
            } 
            System.out.println("En el mes " +month+ " se dieros de alta " +numSocios+ " socios. ");
        return numSocios;        
    } 

}






