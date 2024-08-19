public class NotaAluno {
    float nota1, nota2, nota3, nota4, exame, mediaFinal;

    // Construtor dos objetos da classe
    public NotaAluno(float nota1, float nota2, float nota3, float nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public float media() {
        return (nota1 + nota2 + nota3 + nota4) / 4; // retorna o calculo da media
    }

    // retorna true se a media for menor que 7
    public boolean emExame () {
        return (media() < 7);

    }
    public float mediaFinal(float exame){
        this.exame = exame;
        return (media() + exame) /2;
    }
}
