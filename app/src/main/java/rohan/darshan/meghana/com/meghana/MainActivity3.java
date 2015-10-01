package rohan.darshan.meghana.com.meghana;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.ImageView;


public class MainActivity3 extends ActionBarActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ImageView img;
    int[] images = {R.drawable.image2, R.drawable.image3, R.drawable.image1};
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);



        toolbar = (Toolbar) findViewById(R.id.toolbar);
        img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(images[0]);
        if (toolbar != null) {
            setSupportActionBar(toolbar);

            ActionBar actionBar = getSupportActionBar();
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setDisplayUseLogoEnabled(false);
            actionBar.setHomeButtonEnabled(true);
            toolbar.setTitle("ಗ್ರಾಮೀಣಾಭಿವೃದ್ಧಿ");

            //nav bar
            drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

            ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0);
            drawerLayout.setDrawerListener(actionBarDrawerToggle);


            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            if (navigationView != null) {
                setupDrawerContent(navigationView);
            }

        }

            new CountDownTimer(15000, 3000) {

                @Override
                public void onTick(long millisUntilFinished) {
                    img.setImageResource(images[i]);
                    i++;
                    if (i == 3){
                        i=0;
                    }
                }

                @Override
                public void onFinish() {

                }
            }.start();

    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {

                        menuItem.setChecked(true);
                        drawerLayout.closeDrawers();
                        if (menuItem.getItemId() == R.id.nav_messages) {
                            Intent in = new Intent(MainActivity3.this, MainActivity2.class);
                            startActivity(in);
                        }
                        if (menuItem.getItemId() == R.id.nav_friends) {
                            Intent in = new Intent(MainActivity3.this, MainActivity.class);
                            startActivity(in);
                        }
                        if (menuItem.getItemId() == R.id.nav_discussion) {
                            Intent in = new Intent(MainActivity3.this, MainActivity4.class);
                            startActivity(in);
                        }
                        return true;
                    }
                });
    }
}
