package com.somethingaboutjava.brandnewproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.somethingaboutjava.brandnewproject.adapter.CategoryAdapter;
import com.somethingaboutjava.brandnewproject.adapter.CourseAdapter;
import com.somethingaboutjava.brandnewproject.model.Category;
import com.somethingaboutjava.brandnewproject.model.Course;
import com.somethingaboutjava.brandnewproject.model.EButtonStyle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;
    CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(R.drawable.question, 120, 120));
        categoryList.add(new Category(R.drawable.heart1, 120, 120));
        categoryList.add(new Category(R.drawable.group_5, 120, 120));
        categoryList.add(new Category(R.drawable.arrow, 120, 120));
        categoryList.add(new Category(R.drawable.gearwheel, 120, 120));

        setCategoryRecycler(categoryList);

        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "Ритмическое дыхание — это мягкая техника,\n направленная на успокоение ума и нервов\n через концентрацию на дыхательном цикле.\n Следуя визуальным инструкциям,\n пользователь плавно вдыхает и выдыхает,\n поддерживая ритм. Это помогает достичь\n состояния расслабления и внутреннего покоя.", "Ритмическое дыхание...", R.drawable.newpliaj, "#9BD7F1", "Test", EButtonStyle.Circle));
        courseList.add(new Course(2, "Квадратное дыхание или метод 5-5-5-5 -\n успокаивающая методика регулирования\n дыхания, создавая устойчивый ритм.\n Это способствует улучшению концентрации\n, снижению уровня стресса и обретению\n внутреннего покоя и расслабления.", "Квадратное дыхание...", R.drawable.group_10, "#91CCEE", "Test", EButtonStyle.Squared));
        courseList.add(new Course(3, "Равномерное дыхание или метод 4-1-4-1 -\n мягкий метод гармонизации дыхания, что\n способствует расслаблению и снижению\n стресса, а также помогает лучше\n сосредоточиться. Эта техника особенно\n полезна для восстановления спокойствия\n в стрессовых ситуациях.", "Равномерное дыхание...", R.drawable.group_12, "#50BFFF", "Test", EButtonStyle.EightAngleCircle));

        setCourseRecycler(courseList);
    }

    private void setCourseRecycler(List<Course> courseList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        courseRecycler = findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }
}
