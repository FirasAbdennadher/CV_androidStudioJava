package iit.tn.mycv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity
implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolBar);

        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView= findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(this, drawerLayout, toolbar
                , R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toogle);
        toogle.syncState();
        if(savedInstanceState ==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new BioFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_bio);


        }

      //  getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
       // getSupportActionBar().hide();

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.left);

    }


    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()){
            case R.id.nav_bio:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new BioFragment()).commit();
                break;
            case R.id.nav_formation:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FormationFragment()).commit();
                break;

            case R.id.nav_competence:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new CompetenceFragment()).commit();
                break;

            case R.id.nav_Langue:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new LangueFragment()).commit();
                break;

            case R.id.nav_Certificat:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new CertificatFragment()).commit();
                break;

            case R.id.nav_STAGES:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new StageFragment()).commit();
                break;

            case R.id.nav_projetDevelopper:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ProjetsFragment()).commit();
                break;

            case R.id.nav_vieAssociative:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new VieFragment()).commit();
                break;
            case R.id.nav_contact:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ProfileFragment()).commit();
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
