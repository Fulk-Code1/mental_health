package com.somethingaboutjava.brandnewproject.model;

import android.media.Image;

import com.somethingaboutjava.brandnewproject.R;

public class Course {
    private int id;
    private String title;
    private String description;
    private int img;
    private String color;
    private String text;
    private EButtonStyle buttonStyle;

    public Course(int id,
                  String title,
                  String description,
                  int img,
                  String color,
                  String text,
                  EButtonStyle buttonStyle) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.img = img;
        this.color = color;
        this.text = text;
        this.buttonStyle = buttonStyle;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImg() {
        return img;
    }

    public String getColor() {
        return color;
    }

    public int GetButtonImage()
    {
        int image = -1;
        switch (buttonStyle)
        {
            case Circle:
                image = R.drawable.test111;
                break;
            case Squared:
                image = R.drawable.kvadrat;
                break;
            case EightAngleCircle:
                image = R.drawable.octagon;
                break;
        }

        return image;
    }
}
