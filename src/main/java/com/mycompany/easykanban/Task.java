/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.easykanban;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    //Mentioned below is the information each task should contain.
    private final String taskStatus;
     private final String developerDetails;
     private final int taskNumber;
    private final String taskName;
    private final String taskDescription;
    private final String taskID;
    private final int hours;
    
    private static int totalHours = 0;
    private static int taskCounter = 0;

    public Task(String taskStatus, String developerDetails, int hours, String taskName,String taskDescription) {
        this.taskStatus = taskStatus;
        this.developerDetails = developerDetails;
        this.taskNumber = taskCounter++;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskID = createTaskID();
        this.hours = hours;
        totalHours += hours;
    }

    Task(String taskName, String taskDescription, String developerDetails, int hours, String taskStatus) {
        this.taskStatus = null;
        this.developerDetails = null;
        this.taskNumber = 0;
        this.taskName = null;
        this.taskDescription = null;
        this.taskID = null;
        this.hours = 0;
         
    }

    Task(String developerDetails, int hours, String taskStatus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    private String createTaskID() {
        String taskNameSegment = taskName.length() >= 2 ? taskName.substring(0, 2).toUpperCase() : taskName.toUpperCase();
        String developerPart = developerDetails.length() >= 3 ? developerDetails.substring(developerDetails.length() - 3).toUpperCase() : developerDetails.toUpperCase();
        return taskNameSegment + ":" + taskNumber + ":" + developerPart;
    }

    public String printTaskDetails() {
        return "Task ID: " + taskID +
               "Task Name: " + taskName +
               "Task Description: " + taskDescription +
               "Developer: " + developerDetails +
               "Hours: " + hours +
               "Status: " + taskStatus;
    }

    public static int returnTotalHours() {
        return totalHours;
    }

    
    public String getTaskDescription() {
        return taskDescription;
    }

    public int getTaskNumber() {
        return taskNumber;
    }
}