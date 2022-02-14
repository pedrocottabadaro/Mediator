public class Consumidor {

    public String comentarioRestaurante(String mensagem) {
        return Ifood.getInstancia().receberComentarioRestaurante(mensagem);
    }

    public String notaRestaurante(String mensagem) {
        return Ifood.getInstancia().receberNotaRestaurante(mensagem);
    }

    public String elogioRestaurante(String mensagem) {
        return Ifood.getInstancia().receberElogioRestaurante(mensagem);
    }


}
