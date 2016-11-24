package unimagdalena.edu.co.miproyectopoo;

import android.util.JsonReader;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class GsonCategoriaParser {
    public List<Categoria> leerJson(InputStream in) throws IOException {
        Gson gs = new Gson();
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        List<Categoria> categorias = new ArrayList<Categoria>();
        Categoria h = null;
        reader.beginArray();
        while (reader.hasNext()) {
            h = gs.fromJson(String.valueOf(reader), Categoria.class);
            categorias.add(h);
        }
        reader.endArray();
        reader.close();
        return categorias;

    }}