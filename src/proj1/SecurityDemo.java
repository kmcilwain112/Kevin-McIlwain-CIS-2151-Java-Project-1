
package proj1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SecurityDemo {
    ArrayList<String> list;
    ArrayList<SecureMessage> addmessage;
    SecuritySystem newSecuritySystem;
    ArrayList<SecureMessage>ds = new ArrayList<>();
     public SecurityDemo(){
    this.newSecuritySystem = new SecuritySystem();
    this.list = newSecuritySystem.users;
    this.addmessage = newSecuritySystem.messages;
//newSecuritySystem.getMessage();
    newSecuritySystem.addUsers();
    
}
public static void main(String[] args) {
   
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.println("Please type one of the following:\n0 - exit program\n1 - send a message\n2 - view inbox\n3 - view users");
        int selection = keyboard.nextInt();
        if (selection == 0){
        System.out.println("Thanks for using the Secure Messaging Program. Goodbye!");
        }
        if (selection == 1){
        new SecurityDemo().sendMessage();
        }
        if (selection == 2){
        new SecurityDemo().viewInbox();
        }
        if (selection == 3){
        new SecurityDemo().viewUsers();
        }
    }
    public void sendMessage(){
      
          System.out.println(" -------------- \n");
       Scanner keyboard;
        keyboard = new Scanner(System.in); 
        
       System.out.println("Send a message to whom? \n" + "0 - " + list.get(0)+"\n"+ "1 - " 
             + list.get(1)+"\n"+ "2 - " + list.get(2)+"\n"+ "3 - " + list.get(3)+"\n"
             + "4 - " + list.get(4)+"\n" );
       
      int destname = keyboard.nextInt();
       
       System.out.println("Send a message From whom? \n" + "0 - " + list.get(0)+"\n"+ "1 - " 
             + list.get(1)+"\n"+ "2 - " + list.get(2)+"\n"+ "3 - " + list.get(3)+"\n"
             + "4 - " + list.get(4)+"\n" );
 
        int sourcename = keyboard.nextInt();
    
       System.out.println("Type your message:");
       String message = keyboard.next();
       
       System.out.println("Now Type your Secret Key:");
       String key = keyboard.next();
       
        SecureMessage newMessage = new SecureMessage(list.get(destname),list.get(sourcename),message,key);
        ds.add(newMessage);
        
       System.out.println("Sent message from "+ newMessage.getSourceName(list.get(sourcename)) +" to " + newMessage.getDestName(list.get(destname))
       + " "+ "\""+ newMessage.getMessage(key)+ "\""  + " : "+  key );
      for (SecureMessage printMessage : ds){
       System.out.println(printMessage);
       }
       
       mainMenu();
    }
        
    public void viewInbox(){
        System.out.println(" -------------- \n");
       
        newSecuritySystem.addUsers();
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.println("View your inbox. Who are you? \n" + "0 - " + list.get(0)+"\n"+ "1 - " 
             + list.get(1)+"\n"+ "2 - " + list.get(2)+"\n"+ "3 - " + list.get(3)+"\n"
             + "4 - " + list.get(4)+"\n" );
        int selection=keyboard.nextInt();
        int filteredMessagesSize = newSecuritySystem.searchInbox(addmessage, list.get(selection));
        
        if (filteredMessagesSize == 0){
         System.out.println(list.get(selection)+" you have "+ filteredMessagesSize +" messages. " );
         mainMenu();
        }
        else {
        
         System.out.println("Hi " + list.get(selection) + ", you have" + newSecuritySystem.searchInbox(addmessage, list.get(selection)) + " messages.");
         System.out.println("Choose which message to read: \n");
         System.out.println(newSecuritySystem.viewFiltInbox(addmessage, list.get(selection)));
         
        }
        
        System.out.println("Correct! Your message is\n"/*+Getmessage+*/);
        // System.out.println("Hello "/* + Get username +*/ " you have " 
        // /* + Get length of array +*/"message waiting for you. Which do you want to read? Type 0 to go back to main menu.\n"
        // + "(Type the number of the message)\n"/*+ Get array+*/);
        System.out.println("Incorrect key");   
    }
    
    public  void viewUsers(){
          System.out.println(" -------------- \n");
        System.out.println(list.size());
        System.out.println(addmessage.size());
        }
    
   
    public static void mainMenu(){
          System.out.println(" -------------- \n");
     Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.println("Please type one of the following:\n0 - exit program\n1 - send a message\n2 - view inbox\n3 - view users");
        int selection = keyboard.nextInt();
        if (selection == 0){
        System.out.println("Thanks for using the Secure Messaging Program. Goodbye!");
        }
        if (selection == 1){
        new SecurityDemo().sendMessage();
        }
        if (selection == 2){
        new SecurityDemo().viewInbox();
        }
        if (selection == 3){
        new SecurityDemo().viewUsers();
            }
        }
    }   
    

   
  
    
