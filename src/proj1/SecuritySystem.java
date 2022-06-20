package proj1;

import java.util.ArrayList;


/**
 *
 * @author kmcil
 */
public class SecuritySystem {
    
    ArrayList<String> users;
   ArrayList<SecureMessage>messages;
   public SecuritySystem(){
   this.users = new ArrayList<>();
   this.messages = new ArrayList<>();
}
        public void addUsers(){
        users.add("Max");
        users.add("Ksenia");
        users.add("Sally");
        users.add("Ali");
        users.add("Tyrone");  
}
        public int searchInbox(ArrayList<SecureMessage>messages, String name){
        ArrayList<SecureMessage> filtered = new ArrayList<>();
        for(int i=0; i < messages.size(); i++){
        SecureMessage source = messages.get(i);
        if(source.destName == name){
          filtered.add(source);
                  }
              }
        return filtered.size();
        }
        public ArrayList<SecureMessage> viewFiltInbox(ArrayList<SecureMessage>messages, String name){
        ArrayList<SecureMessage> filtered = new ArrayList<>();
        for(int i=0; i < messages.size(); i++){
        SecureMessage source = messages.get(i);
        if(source.destName == name){
          filtered.add(source);
                  }
              }
        return filtered;
        }
        
   public ArrayList<String> getUsers(){
   return users;
   }
   public  ArrayList <SecureMessage> getMessage(){
   return messages;
   }
   public void addNewMessage(SecureMessage message){
   messages.add(message);
   }
   public void printArray(){
   for (SecureMessage printMessage : messages){
       System.out.println(printMessage);
       }
   }
    
   
        
         
        
    
        
    
}
