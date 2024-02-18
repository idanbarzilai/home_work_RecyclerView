package com.example.home_work_recyclerview;

import androidx.annotation.NonNull;

public class CardModel {
    String text;
    int image;

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }

    public CardModel(String text, int image) {
        this.text = text;
        this.image = image;
    }
}
