package com.example.reyclerviewapp.model;


import com.example.reyclerviewapp.R;

public class Task {
    private int taskId;
    private String taskTitle;
    private String taskDate;
    private String taskTime;
    private String taskDescription;
    private int taskCategory;

    public Task(){
    }

    public Task(String taskTitle, String taskDate, String taskTime, String taskDescription, int taskCategory) {
        this.taskTitle = taskTitle;
        this.taskDate = taskDate;
        this.taskTime = taskTime;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    public String getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(String taskTime) {
        this.taskTime = taskTime;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getTaskCategory() {
        return taskCategory;
    }

    public int getDrawableCategory(){
        int[] drawables = new int[]{R.drawable.category_01_leasure, R.drawable.category_02_sport,
                                    R.drawable.category_03_work, R.drawable.category_04_study,
                                    R.drawable.category_05_family, R.drawable.category_06_friend};
        return drawables[getTaskCategory()];
    }

    public void setTaskCategory(int taskCategory) {
        this.taskCategory = taskCategory;
    }
}
