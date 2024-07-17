package foro.alura.api.dominio.topicos;

public record DatosListadoTopicos(Long id, String titulo, String mensaje, String email, String fechaCreacion) {

    public DatosListadoTopicos(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getEmail() ,topico.getFechaCreacion());
    }
}