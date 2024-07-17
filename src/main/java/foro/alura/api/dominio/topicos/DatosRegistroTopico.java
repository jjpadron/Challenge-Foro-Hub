package foro.alura.api.dominio.topicos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(

        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String fechacreacion

) {
}