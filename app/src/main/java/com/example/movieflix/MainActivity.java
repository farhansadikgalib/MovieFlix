package com.example.movieflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction  fragmentTransaction= fragmentManager.beginTransaction();
        MovieListFragment movieListFragment = new MovieListFragment();
        fragmentTransaction.add(R.id.fragment_container,movieListFragment);
        fragmentTransaction.commit();

    }
}
