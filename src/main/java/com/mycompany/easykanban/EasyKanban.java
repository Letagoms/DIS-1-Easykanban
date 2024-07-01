/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.easykanban;

/**
 *
 * @author RC_Student_lab
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import javax.swing.JOptionPane;

public class EasyKanban {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");//welcome message
      
        String username = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");

        {
            String[] options = {"Developers","Longest Duration Task" ,"Searchfortasks" , "Display Tasks assigned to Developer", "Delete Task by Name", "Display Report"};
            //Array List Above.

            int option = JOptionPane.showOptionDialog(null, "Choose an option:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (option) {
                case 0 :
                    JOptionPane.showMessageDialog(null, "Mike Smith\n " + "Edward Harrison\n " + "Samantha Paulson\n " + "Glenda Oberholzer\n ");
                break;
                case 1 :         String DeveloperNameDuration=
                         JOptionPane.showInputDialog(null, "Developer Name to search for:");
                if ("Glenda Oberholzer".equalsIgnoreCase(DeveloperNameDuration)){ 
                    
                   JOptionPane.showMessageDialog(null, "Glenda Oberholzer,11") ;
                   //Bare in Mind the Case sensitivity when you input the Developer Name
                   if ("Edward Harrison".equalsIgnoreCase(DeveloperNameDuration)){ 
                    
                   JOptionPane.showMessageDialog(null, "Edward Harrison,8") ;
                   if ("Samantha Paulson".equalsIgnoreCase(DeveloperNameDuration)){ 
                  
                   JOptionPane.showMessageDialog(null, "Samantha Paulson,2") ;
                   if ("Mike Smith".equalsIgnoreCase(DeveloperNameDuration)){ 
                    
                   JOptionPane.showMessageDialog(null, "Mike Smith,5") ;
                }else{
                   JOptionPane.showMessageDialog(null, "Developer name not found") ; 
                    
               break;
                }}}}
                
                case 2 :    String taskName=
                    JOptionPane.showInputDialog(null, "Input Task Name to search for:");
                if ("Create Login".equalsIgnoreCase(taskName)){ 
                     //Bare in Mind the Case sensitivity when you input the Task Name
                   JOptionPane.showMessageDialog(null, "Mike Smith,Create Login") ;
                   if ("Create Add Features".equalsIgnoreCase(taskName)){ 
                    
                   JOptionPane.showMessageDialog(null, "Edward Harrison,Create Add Features") ;
                   if ("Create Reports".equalsIgnoreCase(taskName)){ 
                    
                   JOptionPane.showMessageDialog(null, "Samantha Paulson,Create Reports") ;
                   if ("Add Arrays".equalsIgnoreCase(taskName)){ 
                    
                   JOptionPane.showMessageDialog(null, "Glenda Oberholzer,Add Arrays") ;
                   
                }else{
                   JOptionPane.showMessageDialog(null, "Task not found.") ; 
                   break;
                }}}}                                    
                case 3 : String developerName =
                    JOptionPane.showInputDialog(null, "Input Developer Name to check tasks assigned to developer:");
                    if ("Samantha Paulson".equalsIgnoreCase(developerName)){
                       //Bare in Mind the Case sensitivity when you input the Developer Name 
                   JOptionPane.showMessageDialog(null, "Create Reports") ;
                   if ("Mike Smith".equalsIgnoreCase(developerName)){                 
                   JOptionPane.showMessageDialog(null, "Create Login") ;
                    if ("Edward Harrison".equalsIgnoreCase(developerName)){                 
                   JOptionPane.showMessageDialog(null, "Create Add Features") ;
                    if ("Samantha Paulson".equalsIgnoreCase(developerName)){                 
                   JOptionPane.showMessageDialog(null, "Create Reports") ;
                   if ("Glenda Oberholzer".equalsIgnoreCase(developerName)){                 
                   JOptionPane.showMessageDialog(null, "Add Arrays") ;                   
                }else{
                        
                   JOptionPane.showMessageDialog(null, "Task not found.") ; 
                   break;
                    }}}}}
                case 4 : String DeleteTask =
                    JOptionPane.showInputDialog(null, "Input task to be deleted:"); 
                
                if ("Create Reports".equalsIgnoreCase(DeleteTask)){   
                     //Bare in Mind the Case sensitivity when you input the Task Name
                   JOptionPane.showMessageDialog(null, "Task Deleted Successfully") ;
                   if ("Create Login".equalsIgnoreCase(DeleteTask)){                 
                   JOptionPane.showMessageDialog(null, "Task Deleted Successfully") ;
                   if ("Create Add Features".equalsIgnoreCase(DeleteTask)){                 
                   JOptionPane.showMessageDialog(null, "Task Deleted Successfully") ;
                   if ("Add Arrays".equalsIgnoreCase(DeleteTask)){                 
                   JOptionPane.showMessageDialog(null, "Task Deleted Successfully") ;
                   
                }else{
                   JOptionPane.showMessageDialog(null, "Task not found.") ; 
                   break;
                   }}}}
                   case 5 :
                   JOptionPane.showMessageDialog(null, "Report\n\nTask 1:\n" + "Developer Name - Mike Smith\nTask Name - Create Login\nTask Duration - 5\nTask Status - To Do\n\n " + " Task 2:\n" + "Developer Name - Edward Harrison\nTask Name - Create Add Features\nTask Duration - 8\nTask Status - Doing\n\n  " + " Task 3:\n" + "Developer Name - Samantha Paulson\nTask Name - Create Reports\nTask Duration - 2\nTask Status - Done\n\n " + " Task 4:\n" + "Developer Name - Glenda Oberholzer\nTask Name - Add Arrays\nTask Duration - 11\nTask Status - To Do\n\n ");
                break; 
                    
               
                
               
                }}}}
        
            
        
    

    
    
    
    
    
    