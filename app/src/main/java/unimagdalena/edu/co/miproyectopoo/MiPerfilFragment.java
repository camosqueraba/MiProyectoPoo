package unimagdalena.edu.co.miproyectopoo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
//import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
/**
 * Created by win8 on 22/11/2016.
 */

public class MiPerfilFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.mi_perfil,container,false);

        Button b_entrada_datos = (Button) v.findViewById(R.id.ingresa_datos);
        b_entrada_datos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

            }

        });
        return v;
    }



}
