public class Ifood {

    private static Ifood instancia = new Ifood();

    private Ifood() {}

    public static Ifood getInstancia() {
        return instancia;
    }


    public String receberNotaRestaurante(String mensagem) {
        return "Restaurante avaliado.\n"+
                "O Restaurante respondeu sua avaliacao.\n" +
                ">>" + BurgerKing.getInstancia().receberNota(mensagem);
    }

    public String receberComentarioRestaurante(String mensagem) {
        return "Comentário publicado.\n"+
                "O Restaurante respondeu seu comentário.\n" +
                ">>" + BurgerKing.getInstancia().receberComentario(mensagem);
    }

    public String receberElogioRestaurante(String mensagem) {
        return "Elogio publicado.\n"+
                "O Restaurante respondeu ao seu elogio.\n" +
                ">>" + BurgerKing.getInstancia().receberElogio(mensagem);
    }

}
