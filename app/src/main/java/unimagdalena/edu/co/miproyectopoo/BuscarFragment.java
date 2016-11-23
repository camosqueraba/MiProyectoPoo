package unimagdalena.edu.co.miproyectopoo;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;




public class BuscarFragment extends android.support.v4.app.Fragment implements View.OnClickListener {

    Button b_desayuno;
    Button b_almuerzo;
    Button b_cena;
    Button b_cosas;
    Button b_cafeyte;
    Button b_nocturna;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.buscar, container, false);

        b_desayuno = (Button) v.findViewById(R.id.buttonDesayuno);
        b_almuerzo = (Button) v.findViewById(R.id.buttonAlmuerzo);
        b_cena = (Button) v.findViewById(R.id.buttonCena);
        b_cafeyte = (Button) v.findViewById(R.id.buttonCafeyTe);
        b_nocturna = (Button) v.findViewById(R.id.buttonNoturna);
        b_cosas = (Button) v.findViewById(R.id.buttonCosasHacer);

        b_desayuno.setOnClickListener(this);
        b_almuerzo.setOnClickListener(this);
        b_cena.setOnClickListener(this);
        b_cafeyte.setOnClickListener(this);
        b_nocturna.setOnClickListener(this);
        b_cosas.setOnClickListener(this);

        return v;


    }
            public void onClick(View v) {


                switch (v.getId()) {

                    case (R.id.buttonNoturna):
                break;

                    case (R.id.buttonDesayuno):
                break;

                    case (R.id.buttonAlmuerzo):
                break;

                    case (R.id.buttonCena):
                break;

                    case (R.id.buttonCafeyTe):
                break;

                    case (R.id.buttonCosasHacer):
                break;

                    default:

            }

        }



}







/*
 usuario = (EditText) v.findViewById(R.id.entrada_usuario);
        contraseña = (EditText)v.findViewById(R.id.entrada_mail);
        iniciasesion = (Button) v.findViewById(R.id.iniciar_sesion);

        iniciasesion.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
 */