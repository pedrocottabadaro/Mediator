import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ConsumidorTest {
    @Test
    void deveAvaliarRestaurante() {
        Consumidor consumidor = new Consumidor();
        assertEquals("Restaurante avaliado.\n" +
                        "O Restaurante respondeu sua avaliacao.\n" +
                        ">>O BK agradece por sua nota: 5",
                consumidor.notaRestaurante("5"));
    }

    @Test
    void deveElogiarRestaurante() {
        Consumidor consumidor = new Consumidor();
        assertEquals("Elogio publicado.\n" +
                        "O Restaurante respondeu ao seu elogio.\n" +
                        ">>O BK agradece seu elogio: Comida bem saborosa",
                consumidor.elogioRestaurante("Comida bem saborosa"));
    }

    @Test
    void deveComentarRestaurante() {
        Consumidor consumidor = new Consumidor();
        assertEquals("Comentário publicado.\n" +
                        "O Restaurante respondeu seu comentário.\n" +
                        ">>O BK agradece seu feedback: Botar mais molho",
                consumidor.comentarioRestaurante("Botar mais molho"));
    }


}