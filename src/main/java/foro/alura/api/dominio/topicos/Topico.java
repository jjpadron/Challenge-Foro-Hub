package foro.alura.api.dominio.topicos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String email;
    private String fechacreacion;
    private Boolean activo;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.activo = true;
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.email = datosRegistroTopico.email();
        this.fechacreacion = datosRegistroTopico.fechacreacion();

    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }

        LocalDate fechaActual = LocalDate.now();
        // Formatear la fecha como una cadena
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-YYYY");

        String fechaFormateada = fechaActual.format(formato);

        if (datosActualizarTopico.fechaCreacion() != null) {
            this.fechacreacion = fechaFormateada;
        }
    }


        public void desactivarTopico() {
            this.activo = false;
        }


    public String getFechaCreacion() {
        return fechacreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {

        LocalDate fechaActual = LocalDate.now();
        // Formatear la fecha como una cadena
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String fechaFormateada = fechaActual.format(formato);

        this.fechacreacion = fechaFormateada;
    }


}

