package ru.aquapark.entertainment;

import ru.aquapark.entertainment.model.Slides;
import ru.aquapark.entertainment.model.SlidesList;

import java.util.ArrayList;

public class EntertainmentApp {
    public static void main(String[] args) {
        SlidesList slidesList = new SlidesList(new ArrayList<>());
        Slides slides = new Slides("yellow", 180, 3, true,15.0);
        Slides slides1 = new Slides("red", 200, 5, true,16.0);
        Slides slides2 = new Slides("blue", 170, 5, false,14.0);
        slidesList.add(slides);
        slidesList.add(slides1);
        slidesList.add(slides2);


    }
}
