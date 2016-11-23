package unimagdalena.edu.co.miproyectopoo;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.tab_buscar:
                        BuscarFragment buscarFragment = new BuscarFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer,buscarFragment).commit();
                        break;

                    case R.id.tab_lista:
                        ListaFragment listaFragment = new ListaFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer,listaFragment).commit();
                        break;

                    case R.id.tab_mapa:
                        MapaFragment mapaFragment = new MapaFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer,mapaFragment).commit();
                        break;

                    case R.id.tab_miperfil:
                        MiPerfilFragment f = new MiPerfilFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer,f).commit();
                        break;

                    default:
                        break;

                }


            }
        });
    }
}

