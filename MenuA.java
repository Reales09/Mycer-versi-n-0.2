package com.example.reales.mycer_concesionario;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class MenuA extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,FragmentoAdministrador.OnFragmentInteractionListener,AcercaDeMycer.OnFragmentInteractionListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        Fragment fragment = new AcercaDeMycer();
        getSupportFragmentManager().beginTransaction().add(R.id.content_main,fragment).commit();


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    public boolean onCreateOptionsMenu(MenuA menu) {

        getMenuInflater().inflate(R.menu.menu, (android.view.Menu) menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment myFragment = null;
        boolean fragmnenteseleccionado = false;

        if (id == R.id.concesionario) {
            // Handle the camera action
            myFragment = new AcercaDeMycer();
            fragmnenteseleccionado = true;

            Animation myANIM = AnimationUtils.loadAnimation(this,R.anim.nuevo1);


        } else if (id == R.id.administrador) {
            myFragment = new FragmentoAdministrador();
            fragmnenteseleccionado = true;


        } else if (id == R.id.vendedor) {

        } else if (id == R.id.mecanico) {

        } else if (id == R.id.jefetaller) {

        } else if (id == R.id.recepcion) {

        }else if (id == R.id.IB) {

        }
        else if (id == R.id.nav_send) {

        }else if (id == R.id.nav_send) {

        }else if (id == R.id.salir) {
            Intent salir = new Intent(this, MainActivity.class);
            startActivity(salir);
        }

        if (fragmnenteseleccionado == true){

            getSupportFragmentManager().beginTransaction().replace(R.id.content_main,myFragment).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
