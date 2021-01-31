package com.kivitool.owcpremium.UTILS;

import android.content.Context;

import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.kivitool.owcpremium.R;

import pl.droidsonroids.gif.GifImageView;

public class SetupBackgrounds {

    public void setupAnimatedBackground(String backgroundValue, GifImageView gifImageView, Context context){

        if (backgroundValue.equals("01d") || backgroundValue.equals("01n")){

            gifImageView.setBackgroundResource(R.drawable.animated_partly_cloudy);

        }else if (backgroundValue.equals("02d") || backgroundValue.equals("02n")){

            gifImageView.setBackgroundResource(R.drawable.animated_partly_cloudy);

        }else if (backgroundValue.equals("03d") || backgroundValue.equals("03n")
        || backgroundValue.equals("04d") || backgroundValue.equals("04n")){

            gifImageView.setBackgroundResource(R.drawable.animated_partly_cloudy);

        }else if (backgroundValue.equals("09d") || backgroundValue.equals("09n")
                || backgroundValue.equals("10d") || backgroundValue.equals("10n")){

            gifImageView.setBackgroundResource(R.drawable.animated_rain);

        }else if (backgroundValue.equals("11d") || backgroundValue.equals("11n")){

            gifImageView.setBackgroundResource(R.drawable.animated_thunder);

        }else if (backgroundValue.equals("13d") || backgroundValue.equals("13n")){

            gifImageView.setBackgroundResource(R.drawable.animated_snowy);

        }else if (backgroundValue.equals("50d") || backgroundValue.equals("50n")){

            gifImageView.setBackgroundResource(R.drawable.animated_mist);

        }

    }

    public void setupPictureBackground(Context context, String backgroundValue, DrawerLayout drawerLayout){

        if (backgroundValue.equals("01d") || backgroundValue.equals("01n")){

            drawerLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.clean_sky));

        }else if (backgroundValue.equals("02d") || backgroundValue.equals("02n")){

            drawerLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.sunny_and_cloudy));

        }else if (backgroundValue.equals("03d") || backgroundValue.equals("03n")
                || backgroundValue.equals("04d") || backgroundValue.equals("04n")){

            drawerLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.cloudly));

        }else if (backgroundValue.equals("09d") || backgroundValue.equals("09n")
                || backgroundValue.equals("10d") || backgroundValue.equals("10n")){

            drawerLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.rainy));

        }else if (backgroundValue.equals("11d") || backgroundValue.equals("11n")){

            drawerLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.thunderstorm));

        }else if (backgroundValue.equals("13d") || backgroundValue.equals("13n")){

            drawerLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.snowy));

        }else if (backgroundValue.equals("50d") || backgroundValue.equals("50n")){

            drawerLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.mist));

        }

    }

    public void setGradientBlueColor(Context context, DrawerLayout drawerLayout){

        drawerLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.gradient_blue_background));

    }

    public void setGradientRedColor(Context context, DrawerLayout drawerLayout){

        drawerLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.gradient_red_background));

    }

    public void setGradientPurpleColor(Context context, DrawerLayout drawerLayout){

        drawerLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.gradient_purple_background));

    }

    public void setupBackgrounds(PreferenceManager preferenceManager, String backgroundValue, GifImageView gifImageView, DrawerLayout drawerLayout, Context context) {

        if (preferenceManager.getString("background") == null) {

            preferenceManager.putString("background", "animated");

        }

        if (preferenceManager.getString("background").equals("animated")) {

            setupAnimatedBackground(backgroundValue, gifImageView, context);

        } else if (preferenceManager.getString("background").equals("picture")) {

            setupPictureBackground(context, backgroundValue, drawerLayout);

        } else if (preferenceManager.getString("background").equals("blue")) {

            setGradientBlueColor(context, drawerLayout);

        } else if (preferenceManager.getString("background").equals("red")) {

            setGradientRedColor(context, drawerLayout);

        } else if (preferenceManager.getString("background").equals("purple")) {

            setGradientPurpleColor(context, drawerLayout);

        }

    }

}
