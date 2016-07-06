import java.util.ArrayList;
import java.util.Iterator;
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

    /** 
     * Todos los socios que se han dado de alta un determinado mes de un determinado año se
     * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
     * por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @param year El año en el que estamos interesados
     * @return Una coleccion con los socios que se han dado de baja del club
     */
    public ArrayList<Membership> puge(int month, int year){
        //creo una VL de tipo colección para almacenar a los socios.
        ArrayList<Membership> sociosE = null;
        if (month > 0 && month < 13){
            sociosE = new ArrayList<>();
            Iterator<Membership> it = socios.iterator();
            while(it.hasNext()){
                Membership a = it.next();
                if( (month == a.getMonth()) && (year == a.getYear())  ){
                    sociosE.add(a);
                    it.remove();
                }
            }
        }
        else { //Si el mes pasado como parametro no es valido...
            System.out.println("Error en la cifra del mes, introducir valores entre[1-12]");
        }
        return sociosE;
    }
}






