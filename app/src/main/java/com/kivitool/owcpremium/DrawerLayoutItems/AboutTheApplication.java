package com.kivitool.owcpremium.DrawerLayoutItems;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.kivitool.owcpremium.Home.MainActivity;
import com.kivitool.owcpremium.R;
import com.kivitool.owcpremium.UTILS.PreferenceManager;

import java.util.Locale;

public class AboutTheApplication extends AppCompatActivity {

    private ImageView backAbout;
    private TextView about_the_application, about_program, created_location, version;
    private Locale myLocale;
    private PreferenceManager preferenceManager;
    private String language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        preferenceManager = new PreferenceManager(AboutTheApplication.this);

        if (preferenceManager.getBoolean("dark_mode")){

            setTheme(R.style.AppTheme_Base_Night);

        }else {

            setTheme(R.style.AppTheme);

        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_the_application);

        language = preferenceManager.getString("language");

        changeLocale(language);


        backAbout = findViewById(R.id.backArrowForAbout);
        about_the_application = findViewById(R.id.AboutTheApplication);
        about_program = findViewById(R.id.about);
        created_location = findViewById(R.id.created_location);
        version = findViewById(R.id.Version);

        backAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(AboutTheApplication.this, MainActivity.class));
                finish();

            }
        });
    }

    @Override
    protected void onStart() {

        about_the_application.setText(getString(R.string.about_the_application));
        about_program.setText(getString(R.string.about_program));
        created_location.setText(getString(R.string.created_program));
        version.setText(getString(R.string.version));

        super.onStart();
    }

    private void changeLocale(String language){

        myLocale = new Locale(language);
        Locale.setDefault(myLocale);

        Configuration configuration = new Configuration();
        configuration.locale = myLocale;

        getBaseContext().getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());


    }


}