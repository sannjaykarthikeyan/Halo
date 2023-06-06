package com.example.halo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.halo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_learn, R.id.nav_prevent, R.id.nav_report)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


        ImageButton settings = (ImageButton) findViewById(R.id.settings);

        settings.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NIXwhmLcbZ8"));
                startActivity(browserIntent);
            }
        });


        class FragmentHome extends Activity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.fragment_home);

                ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);

                imageButton.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NIXwhmLcbZ8"));
                        startActivity(browserIntent);
                    }
                });

                ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);

                imageButton2.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=KXfibK8tCtk"));
                        startActivity(browserIntent);
                    }
                });


                ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);

                imageButton3.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9te3oDdLZYI"));
                        startActivity(browserIntent);
                    }
                });


                Button button7 = (Button) findViewById(R.id.button7);

                button7.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://traumasexuality.info/traumasexuality-test/"));
                        startActivity(browserIntent);
                    }
                });


            }
        }

    }



}
