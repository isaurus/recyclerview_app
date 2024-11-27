package com.example.reyclerviewapp.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reyclerviewapp.R;
import com.example.reyclerviewapp.controller.TaskController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

    }

    public void initComponents(){
        RecyclerView rv = findViewById(R.id.rvTaskList);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        TaskController taskController = new TaskController();
        TaskAdapter taskAdapter = new TaskAdapter(taskController.getAllTasks(), this);
        rv.setAdapter(taskAdapter);
        rv.setLayoutManager(lm);

        taskController.loadData();

    }
}