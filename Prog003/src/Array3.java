public class Array3 {
    public static void main(String[] args) {
        // criar um vetor de int pra guardar as horas trabalhadas em cada dia da semana
        // criar o vetor já com valores dentro usando {...}
        //imprimir quanto trabalhou a cada dia e mostrar o total
        // depois outro vetor de strind para nome dos dias
        int[] horaTrabalho = {8, 2, 10, 8, 8, 0, 7};

        String[] diaSemana;
        diaSemana = new String[7];
        diaSemana[0] = " segunda";
        diaSemana[1] = " terça";
        diaSemana[2] = " quarta";
        diaSemana[3] = " quinta";
        diaSemana[4] = " sexta";
        diaSemana[5] = " sábado";
        diaSemana[6] = " domingo";
        int total = 0;
        for (int i = 0; i < 7; i++) {

            System.out.println(" No(a)" + diaSemana[i] + " foi trabalhado " + horaTrabalho[i] + " horas");
            total = total + horaTrabalho[i];

        }
        System.out.println("O total trabalhado na semana foi de " + total);
    }
}
