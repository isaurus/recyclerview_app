package com.example.reyclerviewapp.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reyclerviewapp.R;
import com.example.reyclerviewapp.controller.TaskController;
import com.example.reyclerviewapp.model.Task;

public class TaskInfo extends AppCompatActivity {

    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_info);

        id = getIntent().getIntExtra("id", -1);
        if(id == -1){
            Log.i("Error", "Id es: " + id);
            finish();
        }
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();

        pairTaskData(id);
    }

    public void pairTaskData(int id){
        TaskController taskController= new TaskController();
        Task currentTask = taskController.getTaskById(id);

        TextView txtTitle = findViewById(R.id.txtInfoTaskTitle);
        TextView txtDescription = findViewById(R.id.txtInfoTaskDescription);
        TextView txtDate = findViewById(R.id.txtInfoTaskDate);
        TextView txtTime = findViewById(R.id.txtInfoTaskTime);
        ImageView imgTaskImage = findViewById(R.id.imgInfoTaskImage);

        txtTitle.setText(currentTask.getTaskTitle());
        txtDescription.setText(currentTask.getTaskDescription());
        txtDate.setText(currentTask.getTaskDate());
        txtTime.setText(currentTask.getTaskTime());
        imgTaskImage.setImageResource(currentTask.getDrawableCategory());
    }
}