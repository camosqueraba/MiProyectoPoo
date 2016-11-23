package unimagdalena.edu.co.miproyectopoo;

import android.support.annotation.IdRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

                /*if (tabId == R.id.tab_buscar) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                    BuscarFragment f = new BuscarFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer,f).commit();
                } else */
            }
        });
    }
}

/*
 mBottomBar = BottomBar.attach(this,savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu_main,new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if(i==R.id.Bottombaritemone)
                {
                    PeopleFragment f = new PeopleFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else if(i==R.id.Bottombaritemtwo)
                {
                    Cardsfragment f =new Cardsfragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else if(i==R.id.Bottombaritemthree)
                {
                    PhoneFragment f =new PhoneFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else if(i==R.id.Bottombaritemfour)
                {
                    MailsFragment f =new MailsFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else if(i==R.id.Bottombaritemfive)
                {
                    FavoritesFragment f =new FavoritesFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int i) {

            }
        });
 */