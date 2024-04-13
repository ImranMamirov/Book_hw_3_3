package com.example.book_hw_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private RecyclerView rvBook;

    private ArrayList<String> bookList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvBook = requireActivity().findViewById(R.id.rv_books);
        loadData();
        BookAdapter bookAdapter = new BookAdapter(bookList);
        rvBook.setAdapter(bookAdapter);
    }

    public void loadData() {
        bookList.add("Великий Гэтсби");
        bookList.add("Мастер и Маргарита");
        bookList.add("Атлант расправил плечи");
        bookList.add("Убить пересмешника");
        bookList.add("Властелин колец");
        bookList.add("Маленький принц");
        bookList.add("Гарри Поттер и узник Азкабана");
        bookList.add("Преступление и наказание");
        bookList.add("Большая жизнь");
        bookList.add("Три товарища");
        bookList.add("Гордость и предубеждение");
        bookList.add("Парфюмер");
        bookList.add("Искусство программирования");
        bookList.add("Алхимик");
        bookList.add("Автостопом по галактике");
    }
}