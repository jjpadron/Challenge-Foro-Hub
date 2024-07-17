package foro.alura.api.dominio.topicos;


import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, String fechaCreacion) {
}