package unimagdalena.edu.co.miproyectopoo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoriaAdapter extends ArrayAdapter {

    ArrayList<Categoria> objects;

    public CategoriaAdapter(Context context, int resource, ArrayList <Categoria> objects) {
        super(context, resource, objects);
        this.objects=objects;
    }

    public View getView(int position, View convertView,
                        ViewGroup parent){


        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = convertView;



        if( null == convertView){
            v = inflater.inflate(R.layout.vista_lista,parent,false);

        }

        ImageView fotoLugar = (ImageView)v.findViewById(R.id.imageView2);
        TextView nombreLugar = (TextView)v.findViewById(R.id.texttitulo);
        TextView valorLugar = (TextView)v.findViewById(R.id.textratinbar);
        TextView direccionLugar = (TextView)v.findViewById(R.id.textdireccion);
        TextView calificacionLugar = (TextView)v.findViewById(R.id.textcalificacion);
        TextView descripcionLugar = (TextView)v.findViewById(R.id.textdescripcion);
        TextView autorLugar = (TextView)v.findViewById(R.id.textautor);



        Categoria item = (Categoria) getItem(position);



        //imgView.setImageResource(R.drawable.myimage);

        //fotoLugar.setText(item.getSitios().get(position).getFoto());
        nombreLugar.setText(item.getNombre());
        valorLugar.setText(item.getSitio().get(position).getValoracion());
        direccionLugar.setText(item.getSitio().get(position).getUbicacion().getDireccion());
        calificacionLugar.setText(item.getSitio().get(position).getCalificacion().getTotal());
        descripcionLugar.setText(item.getSitio().get(position).getDescripcion());
        autorLugar.setText(item.getSitio().get(position).getPropietario());




        return v;
    }

    @Override
    public int getCount(){
        return objects.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
