package unimagdalena.edu.co.miproyectopoo;

import java.util.ArrayList;



public class Categoria {
    private String nombre;

    private ArrayList<Sitio> sitio;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.sitio = new ArrayList<>();
    }

    public String getNombre ()
    {
        return nombre;
    }

    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }

    public ArrayList<Sitio> getSitio() {
        return sitio;
    }

    public void setSitio(ArrayList<Sitio> sitio) {
        this.sitio = sitio;
    }
}
