import java.time.LocalDate;
import java.time.LocalTime;


public class Tarea {
    private String nombre;
    private String descripcion;
    private LocalDate fecha;
    private LocalTime limite;
    private boolean completada;

    public Tarea (String nombre, String descripcion, LocalDate fecha, LocalTime limite) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = false;
        this.fecha = fecha;
        this.limite = limite;
    }

    public Tarea (String nombre, String descripcion, LocalDate fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = false;
        this.fecha = fecha;
        this.limite = LocalTime.MAX;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getLimite() {
        return limite;
    }

    public boolean isCompletada() {
        return completada;
    }
}