package unimagdalena.edu.co.miproyectopoo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;


public class MiPerfilFragment extends Fragment {


    EditText  usuario, contraseña;
    Button iniciasesion;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.mi_perfil,container,false);

        usuario = (EditText) v.findViewById(R.id.entrada_usuario);
        contraseña = (EditText)v.findViewById(R.id.entrada_mail);
        iniciasesion = (Button) v.findViewById(R.id.iniciar_sesion);
        iniciasesion.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Context context = v.getContext();
                Toast toast;
                int duration = Toast.LENGTH_SHORT;
                String texto;
                String texto_usuario;
                String mensaje = "No ingresó usuario";
                texto = "ingresando usuario ";
                texto_usuario = usuario.getText().toString();


                if(texto_usuario.trim().length()==0){
                    toast=Toast.makeText(context,mensaje,duration);
                    toast.show();
                    }
                    else {
                    texto= texto+texto_usuario;
                    toast = Toast.makeText(context, texto, duration);
                    toast.show();
                    }
            }

        });
        return v;
    }



}
