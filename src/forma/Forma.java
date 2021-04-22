
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
    cabecera+="\t----\t\t-----\t\-------\n";
    String pronostico="\tDomingo\t25Ct\;";
        System.out.print(cabecera+pronostico);
    }
    
}
