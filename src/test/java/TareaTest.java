import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;


public class TareaTest {
    @Test
    public void TareaVacia(){
        LocalDate d = LocalDate.of(2022, 11, 18);
        var t = new Tarea("", "", d);
        Assert.assertEquals("", t.getNombre());
        Assert.assertEquals("", t.getDescripcion());
        Assert.assertEquals(d, t.getFecha());
        Assert.assertEquals(LocalTime.MAX, t.getLimite());
        Assert.assertFalse(t.isCompletada());
    }
    @Test
    public void TareaConDescripcionYNombre(){
        LocalDate d = LocalDate.of(2022, 11, 18);
        var t = new Tarea("Supermercado", "Comprar pan y leche", d);
        Assert.assertEquals("Supermercado", t.getNombre());
        Assert.assertEquals("Comprar pan y leche", t.getDescripcion());
    }

    @Test
    public void TareaConHoraLimite(){
        LocalDate fecha = LocalDate.of(2022, 11, 18);
        LocalTime hora = LocalTime.of(13, 8);
        var t = new Tarea("Supermercado", "Comprar pan y leche", fecha, hora);
        Assert.assertEquals(hora, t.getLimite());
    }





}