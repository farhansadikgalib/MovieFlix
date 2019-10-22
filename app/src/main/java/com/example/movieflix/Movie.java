package com.example.movieflix;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private int image;
    private String name;
    private String category;
    private String year;

    public Movie(int image, String name, String category, String year) {
        this.image = image;
        this.name = name;
        this.category = category;
        this.year = year;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getYear() {
        return year;
    }

    public static List<Movie>generateMovieList(){

        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(R.drawable.blade_runner,"Blade Runner","SiFi","2018"));
        movieList.add(new Movie(R.drawable.ruins,"The Ruins","SiFi","2015"));
        movieList.add(new Movie(R.drawable.terminators,"Terminators","SiFi","2015"));
        movieList.add(new Movie(R.drawable.inception,"Inception","SiFi","2018"));
        movieList.add(new Movie(R.drawable.hardware,"Hardware","SiFi","2012"));
        movieList.add(new Movie(R.drawable.blade_runner,"Blade Runner","SiFi","2018"));
        movieList.add(new Movie(R.drawable.ruins,"The Ruins","SiFi","2015"));
        movieList.add(new Movie(R.drawable.terminators,"Terminators","SiFi","2015"));
        movieList.add(new Movie(R.drawable.inception,"Inception","SiFi","2018"));
        movieList.add(new Movie(R.drawable.hardware,"Hardware","SiFi","2012"));
        movieList.add(new Movie(R.drawable.blade_runner,"Blade Runner","SiFi","2018"));
        movieList.add(new Movie(R.drawable.blade_runner,"Blade Runner","SiFi","2018"));
        movieList.add(new Movie(R.drawable.blade_runner,"Blade Runner","SiFi","2018"));
        movieList.add(new Movie(R.drawable.blade_runner,"Blade Runner","SiFi","2018"));
        movieList.add(new Movie(R.drawable.blade_runner,"Blade Runner","SiFi","2018"));

        return movieList;
    }
}
