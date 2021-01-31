package com.kivitool.owcpremium.DrawerLayoutItems;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.kivitool.owcpremium.Home.MainActivity;
import com.kivitool.owcpremium.R;
import com.kivitool.owcpremium.UTILS.PreferenceManager;

public class Backgrounds extends AppCompatActivity {

    private PreferenceManager preferenceManager;
    private Context context;
    private Button selectAnimated, selectPicture, selectBlue, selectRed, selectPurple;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        preferenceManager = new PreferenceManager(Backgrounds.this);

        if (preferenceManager.getBoolean("dark_mode")){

            setTheme(R.style.AppTheme_Base_Night);

        }else{

            setTheme(R.style.AppTheme);

        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backgrounds);
        context = this;

        setupWidgets();

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        clickedSelectButton();


    }

    private void setupWidgets(){

        selectAnimated = findViewById(R.id.select_animated_button);
        selectPicture = findViewById(R.id.select_picture_button);
        selectBlue = findViewById(R.id.select_blue_button);
        selectRed = findViewById(R.id.select_red_button);
        selectPurple = findViewById(R.id.select_purple_button);
        backButton = findViewById(R.id.backArrowForBackground);

    }

    private void clickedSelectButton(){

        if (preferenceManager.getString("background").equals("animated")){

            selectAnimated.setText(getString(R.string.selected));
            selectPicture.setText(getString(R.string.select));
            selectBlue.setText(getString(R.string.select));
            selectRed.setText(getString(R.string.select));
            selectPurple.setText(getString(R.string.select));

        }else if(preferenceManager.getString("background").equals("picture")){

            selectAnimated.setText(getString(R.string.select));
            selectPicture.setText(getString(R.string.selected));
            selectBlue.setText(getString(R.string.select));
            selectRed.setText(getString(R.string.select));
            selectPurple.setText(getString(R.string.select));


        }else if(preferenceManager.getString("background").equals("blue")){

            selectAnimated.setText(getString(R.string.select));
            selectPicture.setText(getString(R.string.select));
            selectBlue.setText(getString(R.string.selected));
            selectRed.setText(getString(R.string.select));
            selectPurple.setText(getString(R.string.select));


        }else if(preferenceManager.getString("background").equals("red")){

            selectAnimated.setText(getString(R.string.select));
            selectPicture.setText(getString(R.string.select));
            selectBlue.setText(getString(R.string.select));
            selectRed.setText(getString(R.string.selected));
            selectPurple.setText(getString(R.string.select));


        }else if(preferenceManager.getString("background").equals("purple")){

            selectAnimated.setText(getString(R.string.select));
            selectPicture.setText(getString(R.string.select));
            selectBlue.setText(getString(R.string.select));
            selectRed.setText(getString(R.string.select));
            selectPurple.setText(getString(R.string.selected));

        }

        selectAnimated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectAnimated.setText(getString(R.string.selected));
                selectPicture.setText(getString(R.string.select));
                selectBlue.setText(getString(R.string.select));
                selectRed.setText(getString(R.string.select));
                selectPurple.setText(getString(R.string.select));

                preferenceManager.putString("background", "animated");

            }
        });

        selectPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectAnimated.setText(getString(R.string.select));
                selectPicture.setText(getString(R.string.selected));
                selectBlue.setText(getString(R.string.select));
                selectRed.setText(getString(R.string.select));
                selectPurple.setText(getString(R.string.select));

                preferenceManager.putString("background", "picture");

            }
        });

        selectBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectAnimated.setText(getString(R.string.select));
                selectPicture.setText(getString(R.string.select));
                selectBlue.setText(getString(R.string.selected));
                selectRed.setText(getString(R.string.select));
                selectPurple.setText(getString(R.string.select));

                preferenceManager.putString("background", "blue");


            }
        });

        selectRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectAnimated.setText(getString(R.string.select));
                selectPicture.setText(getString(R.string.select));
                selectBlue.setText(getString(R.string.select));
                selectRed.setText(getString(R.string.selected));
                selectPurple.setText(getString(R.string.select));

                preferenceManager.putString("background", "red");


            }
        });

        selectPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectAnimated.setText(getString(R.string.select));
                selectPicture.setText(getString(R.string.select));
                selectBlue.setText(getString(R.string.select));
                selectRed.setText(getString(R.string.select));
                selectPurple.setText(getString(R.string.selected));

                preferenceManager.putString("background", "purple");


            }
        });


    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

        super.onBackPressed();

    }
}