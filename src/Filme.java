public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double someDasAvaliacoes;
    int totalDeAvaliacoes;



    void exibeFichaTecnica() {
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        someDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return someDasAvaliacoes / totalDeAvaliacoes;
    }
}
