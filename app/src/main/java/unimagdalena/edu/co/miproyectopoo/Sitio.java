package unimagdalena.edu.co.miproyectopoo;

import java.util.ArrayList;


public class Sitio {
    private String nombre;

    private String valoracion;

    private Calificacion calificacion;

    private String tipocomida;

    private String telefono;

    private String descripcion;

    private String propietario;

    private String foto;

    private ArrayList<Tips> tips;

    private Ubicacion ubicacion;

    public Sitio(String nombre, String valoracion, Calificacion calificacion, String tipocomida, String telefono, String descripcion, String propietario, String foto, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.valoracion = valoracion;
        this.calificacion = calificacion;
        this.tipocomida = tipocomida;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.propietario = propietario;
        this.foto = foto;
        this.tips = new ArrayList<>();
        this.ubicacion = ubicacion;
    }

    public String getNombre ()
    {
        return nombre;
    }

    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }

    public String getValoracion ()
    {
        return valoracion;
    }

    public void setValoracion (String valoracion)
    {
        this.valoracion = valoracion;
    }

    public Calificacion getCalificacion ()
    {
        return calificacion;
    }

    public void setCalificacion (Calificacion calificacion)
    {
        this.calificacion = calificacion;
    }

    public String getTipocomida ()
    {
        return tipocomida;
    }

    public void setTipocomida (String tipocomida)
    {
        this.tipocomida = tipocomida;
    }

    public String getTelefono ()
    {
        return telefono;
    }

    public void setTelefono (String telefono)
    {
        this.telefono = telefono;
    }

    public String getDescripcion ()
    {
        return descripcion;
    }

    public void setDescripcion (String descripcion)
    {
        this.descripcion = descripcion;
    }

    public String getPropietario ()
    {
        return propietario;
    }

    public void setPropietario (String propietario)
    {
        this.propietario = propietario;
    }

    public String getFoto ()
    {
        return foto;
    }

    public void setFoto (String foto)
    {
        this.foto = foto;
    }

    public ArrayList<Tips> getTips() {
        return tips;
    }

    public void setTips(ArrayList<Tips> tips) {
        this.tips = tips;
    }

    public Ubicacion getUbicacion ()
    {
        return ubicacion;
    }

    public void setUbicacion (Ubicacion ubicacion)
    {
        this.ubicacion = ubicacion;
    }
}
