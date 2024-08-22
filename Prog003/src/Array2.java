/** jeito de criar array
*/
public class Array2 {
    public static void main(String[] args) {
        //jeito de declarar array
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //outro jeito de declarar array
        String[] mes;
        mes = new String[12]; //cria um vetor de 12 strings em mes
        mes[0] = " janeiro ";
        mes[1] = " fevereiro ";
        mes[2] = " março ";
        mes[3] = " abril ";
        mes[4] = " maio ";
        mes[5] = " junho ";
        mes[6] = " julho ";
        mes[7] = " agosto ";
        mes[8] = " setembro ";
        mes[9] = " outubro ";
        mes[10] = " novembro ";
        mes[11] = " dezembro ";
        for (int i = 0; i < 12; i++){
            System.out.println(" O mês de " + mes[i] + "tem " + diasMes[i] + " dias");

            System.out.printf(" * O mês de %stem %d dias \n" , mes[i], diasMes[i]);
            System.out.println();
        }
    }
}
