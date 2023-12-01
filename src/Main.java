/* un programma Java che abbia un metodo che prenda il carattere in Unicode in un indice specifico all'interno di una stringa e lo stampi.

       - Il metodo dovrà avere nel costruttore una stringa ed una posizione e dovrà resituire il carattere in unicode o una stringa di errore.

       - Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.*/
public class Main {
    public static void main(String[] args) {
        String testo = "abcdef";

        int numero = 2;
        System.out.println(take(testo,numero));


    }
    public static StringBuilder take(String test,int posizione){
        char carattereScelto;
        StringBuilder stringBuilder = new StringBuilder();
        if(posizione > test.length()){
            System.out.println("Errore");
        }else {
            carattereScelto = test.charAt(posizione);
            stringBuilder.append(carattereScelto);
        }


        return stringBuilder;
    }
}