package unimagdalena.edu.co.miproyectopoo;


public class Tips {
    private String vpositivo;

    private String vnegativo;

    private String autor;

    private String foto;

    private String comentario;

    public Tips(String vpositivo, String vnegativo, String autor, String foto, String comentario) {
        this.vpositivo = vpositivo;
        this.vnegativo = vnegativo;
        this.autor = autor;
        this.foto = foto;
        this.comentario = comentario;
    }

    public String getVpositivo() {
        return vpositivo;
    }

    public void setVpositivo(String vpositivo) {
        this.vpositivo = vpositivo;
    }

    public String getVnegativo() {
        return vnegativo;
    }

    public void setVnegativo(String vnegativo) {
        this.vnegativo = vnegativo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
