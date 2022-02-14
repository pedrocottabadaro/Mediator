public class BurgerKing implements Restaurante{

    private static BurgerKing instancia = new BurgerKing();

    private BurgerKing() {}

    public static BurgerKing getInstancia() {
        return instancia;
    }
    @Override
    public String receberComentario(String mensagem) {
        return "O BK agradece seu feedback: " + mensagem;
    }

    @Override
    public String receberNota(String mensagem) {
        return "O BK agradece por sua nota: " + mensagem;
    }

    @Override
    public String receberElogio(String mensagem) {
        return "O BK agradece seu elogio: " + mensagem;
    }
}
