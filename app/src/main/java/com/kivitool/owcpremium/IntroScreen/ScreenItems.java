package com.kivitool.owcpremium.IntroScreen;

public class ScreenItems {

    String description;
    String title;
    int image;

    public ScreenItems(String description, String title, int image) {
        this.description = description;
        this.title = title;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

