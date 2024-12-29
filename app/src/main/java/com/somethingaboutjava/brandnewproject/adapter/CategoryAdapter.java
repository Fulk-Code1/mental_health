package com.somethingaboutjava.brandnewproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.somethingaboutjava.brandnewproject.R;
import com.somethingaboutjava.brandnewproject.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    Context context;
    List<Category> categories;

    public CategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View categoryItems = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false);
        return new CategoryViewHolder(categoryItems);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.CategoryViewHolder holder, int position) {
        Category category = categories.get(position);

        holder.CategoryItem.setImageResource(category.getImageResId());

        ViewGroup.LayoutParams layoutParams = holder.CategoryItem.getLayoutParams();
        layoutParams.width = category.getImageWidth();
        layoutParams.height = category.getImageHeight();
        holder.CategoryItem.setLayoutParams(layoutParams);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static final class CategoryViewHolder extends RecyclerView.ViewHolder {

        ImageView CategoryItem;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            CategoryItem = itemView.findViewById(R.id.CategoryItem);
        }
    }
}
