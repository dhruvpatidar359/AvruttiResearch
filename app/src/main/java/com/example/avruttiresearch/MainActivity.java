package com.example.avruttiresearch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.avruttiresearch.adapters.CourseGVAdapter;
import com.example.avruttiresearch.model.CourseModel;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView coursesGV;
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;

    public NavigationView navigationView;

    public MaterialToolbar materialToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coursesGV = findViewById(R.id.idGVcourses);
        drawerLayout = findViewById(R.id.my_drawer_layout);

        navigationView = findViewById(R.id.navigation_view);

        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("FREE PLAGIARISM\nPERCENT CHECK", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("PLAGIARISM CHEK WITH REPORT", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("PROJECT REPORT\n&\nRESEARCH PAPER", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("FIX GRAMMER & PLAGIARISM", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("IMPLEMENT A PROJECT", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("SAMPLES", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("ASSIGNMENT HELP", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("SCI JOURNAL LIST RESEARCH PAPER", R.drawable.ic_launcher_background));

        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);

        coursesGV.setOnItemClickListener((adapterView, view, i, l) -> {
//
            CourseModel course = (CourseModel) adapterView.getItemAtPosition(i);

            // Launch a new activity to show details about the selected course
            Toast.makeText(MainActivity.this,course.getCourse_name().toString() , Toast.LENGTH_SHORT).show();
        });




    }


}