
package forma;

/**
 *
 * @author linom
 */
public class Forma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String cabecera = "\n\t PRONOSTICO DE CLIMA: \n";
    cabecera+="\n\tDia\t\tMAÑANA\tNOCHE\tCondicones\n";
    cabecera+="\t---\t\t-----\t-----\t----\n";
   String pronostico ="\tLunes\t18C\t19c\t\tNublado\n";
   pronostico+="\tLunes\t18c\t\t19c\t\tNublado\n";
   pronostico+="\tMartes\t40c\t\t29c\t\tcaluroso\n";
        System.out.print(cabecera+pronostico);
    }
    
}
