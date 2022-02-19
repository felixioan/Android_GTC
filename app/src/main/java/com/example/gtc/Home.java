package com.example.gtc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        MaterialToolbar toolbar = findViewById(R.id.topappbar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navi_view);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            /* here when any item from the navigation is selected this method is used */
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (id) {
                    case R.id.navi_home:
                        Toast.makeText(Home.this, "Home is Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navi_services:
                        Toast.makeText(Home.this, "Services is Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navi_reservations:
                        Toast.makeText(Home.this, "Reservations is Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navi_stream:
                        Toast.makeText(Home.this, "Live Stream is Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navi_contactus:
                        Toast.makeText(Home.this, "Contact Us is Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navi_login:
                        replaceFragment(new LogInFragment());
                        break;
                    Toast.makeText(Home.this, "Log In Clicked", Toast.LENGTH_SHORT).show();
                    case R.id.navi_accsettings:
                        Toast.makeText(Home.this, "Account Settings is Clicked", Toast.LENGTH_SHORT).show();
                        break;
                  /*
Here I need to change the code such as when you are logged in to have the logout option visible, and when you are logout to view the log in option
*/
                    case R.id.navi_logout:
                        Toast.makeText(Home.this, "Logout is Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        return true;
                }
                return true;
            }
        });

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);

        fragmentTransaction.replace(R.id.drawer_layout, fragment);


        fragmentTransaction.commit();


    }

}