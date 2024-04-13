package com.example.book_hw_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {
    private TextView tvBookName;

    public BookViewHolder(@NonNull View itemView) {
        super(itemView);
        tvBookName = itemView.findViewById(R.id.tv_book_name);
    }

    public void onBind(String book) {
        tvBookName.setText(book);
    }
}
