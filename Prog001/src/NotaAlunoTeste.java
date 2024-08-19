public class NotaAlunoTeste {
    public static void main(String[] args) {

        NotaAluno juquinha = new NotaAluno(6,6,4,8);
        System.out.println( " A media do juquinhá " + juquinha.media() );
        NotaAluno mariazinha = new NotaAluno(9,8,10,9);
        System.out.println( " A media da mariazinha é " + mariazinha.media() );
        NotaAluno vitor = new NotaAluno(6,5,7,7);
        System.out.printf(" A nota do vitor é %.1f %.1f %.1f %.1f", vitor.nota1, vitor.nota2, vitor.nota3, vitor.nota4);

        if (juquinha.emExame() ){
            System.out.println( "Juquinha pegou exame");
            float notaExame = 10;
            System.out.println( " Média final do juquinha " + juquinha.mediaFinal(notaExame));
        }
    }
}

