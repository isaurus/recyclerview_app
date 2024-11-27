package com.example.reyclerviewapp.controller;

import com.example.reyclerviewapp.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskController {

    private List<Task> taskList;

    public TaskController(){
        taskList = new ArrayList<>();
    }

    public List<Task> getAllTasks(){
        return taskList;
    }

    public Task getTaskById(long taskId){
        for(Task task : taskList){
            if(task.getTaskId() == taskId){
                return task;
            }
        }
        return null;
    }

    public void createNewTask(Task task){
        taskList.add(task);
    }

    public void updateTask(Task updatedTask){
        for(Task task : taskList){
            if(task.getTaskId() == updatedTask.getTaskId()){
                taskList.set((int) task.getTaskId(), updatedTask);
            }
        }
    }

    public void deleteTask(Integer taskId){
        taskList.remove(getTaskById(taskId));
    }

    public void loadData(){
        String lorenIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer in pulvinar diam. Curabitur convallis egestas elit sed mattis. Fusce id ultricies felis. In ut elit sed lorem sagittis laoreet eget ut odio. Mauris condimentum mollis odio id vehicula. Nunc malesuada risus venenatis dapibus fermentum. Suspendisse mollis nisi id congue ultricies. Donec mattis in lorem vitae rutrum. Sed elementum sapien nisl, at venenatis justo fermentum eget. Nam vel ipsum fringilla, varius erat vel, dapibus tortor. Nunc faucibus ullamcorper quam, sit amet pellentesque metus mattis sit amet. Nunc in sapien odio. Donec mattis metus sapien, id condimentum velit facilisis in.";
        taskList.add(new Task("Lavar el coche", "10/12/2024", "20:00", lorenIpsum, 0));
        taskList.add(new Task("Pasear al perro", "10/12/2024", "20:00", lorenIpsum, 1));
        taskList.add(new Task("Examen PMDM", "10/12/2024", "20:00", lorenIpsum, 2));
        taskList.add(new Task("Comprar comida", "10/12/2024", "20:00", lorenIpsum, 3));
        taskList.add(new Task("Cine", "10/12/2024", "20:00", lorenIpsum, 4));
        taskList.add(new Task("Cervezas con amigos", "10/12/2024", "20:00", lorenIpsum, 5));
    }
}
