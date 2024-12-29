package com.somethingaboutjava.brandnewproject.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.somethingaboutjava.brandnewproject.CoursePage;
import com.somethingaboutjava.brandnewproject.R;
import com.somethingaboutjava.brandnewproject.model.Course;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    Context context;
    List<Course> courses;

    public CourseAdapter(Context context, List<Course> courses) {
        this.context = context;
        this.courses = courses;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View CourseItems = LayoutInflater.from(context).inflate(R.layout.course_item, parent, false);
        return new CourseAdapter.CourseViewHolder(CourseItems);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.CourseBg.setBackgroundColor(Color.parseColor(courses.get(position).getColor()));

        int imageID = context.getResources().getIdentifier("ic_" + courses.get(position).getImg(), "drawable", context.getPackageName());
        holder.CourseImage.setImageResource(courses.get(position).getImg());

        holder.CourseInfo.setText(courses.get(position).getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CoursePage.class);

                int buttonImage = courses.get(position).GetButtonImage();
                intent.putExtra("courseBg", Color.parseColor(courses.get(position).getColor()));
                intent.putExtra("courseImage", imageID);
                intent.putExtra("courseTitle", courses.get(position).getTitle());
                intent.putExtra("courseText", courses.get(position).getText());
                intent.putExtra("srcCompat", buttonImage);

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public static final class CourseViewHolder extends RecyclerView.ViewHolder {

        LinearLayout CourseBg;
        ImageView CourseImage;
        TextView CourseInfo;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);

            CourseBg = itemView.findViewById(R.id.CourseBg);
            CourseImage = itemView.findViewById(R.id.CourseImage);
            CourseInfo = itemView.findViewById(R.id.CourseInfo);
        }
    }
}