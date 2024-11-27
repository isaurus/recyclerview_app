package com.example.reyclerviewapp.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reyclerviewapp.R;
import com.example.reyclerviewapp.model.Task;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    private List<Task> taskList;
    private Context ctx;

    public TaskAdapter(List<Task> taskList, Context ctx){
        this.ctx = ctx;
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.item_task, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task currentTask = taskList.get(position);
        currentTask.setTaskId(position);

        holder.imgTaskImage.setImageResource(currentTask.getDrawableCategory());
        holder.txtTaskTitle.setText(currentTask.getTaskTitle());
        holder.txtTaskDate.setText(currentTask.getTaskDate());
        holder.txtTaskTime.setText(currentTask.getTaskTime());

        holder.cvTaskItem.setOnClickListener(v -> openTask(position));
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder{
        ImageView imgTaskImage;
        TextView txtTaskTitle;
        TextView txtTaskDate;
        TextView txtTaskTime;

        CardView cvTaskItem;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);

            imgTaskImage = itemView.findViewById(R.id.imgTaskImage);
            txtTaskTitle = itemView.findViewById(R.id.txtTaskTitle);
            txtTaskDate = itemView.findViewById(R.id.txtTaskDate);
            txtTaskTime = itemView.findViewById(R.id.txtTaskTime);

            cvTaskItem = itemView.findViewById(R.id.cvTaskItem);
        }
    }

    public void openTask(int position){
        Intent i = new Intent(ctx, TaskInfo.class);
        i.putExtra("id", position);
        //i.putExtra("id", taskList.get(position).getTaskId());
        ctx.startActivity(i);
    }
}
