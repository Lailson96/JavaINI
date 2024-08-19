public class Main {
    public static void main(String[] args) {
        int ano = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (8.1 + 7.8 + 2.5) / 3;
        String mensagem = """
                Locadora
                Filme: Top Gun
                Ano de lançamento: %d
                Nota: %.2f
                """.formatted(ano, media);
        System.out.println(mensagem);
    }
}