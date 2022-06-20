package proj1;

 public class SecureMessage {
    
     String message;
       String sourceName;
       String destName;
       String key;

    public SecureMessage(String destName, String sourceName, String message,  String key){
        this.message = message;
        this.sourceName = sourceName;
        this.destName = destName;
        this.key = key;
    }
    
    public String getMessage (String key){
       
         return message;
         
    }
    public String getSourceName (String sourceName){
        return sourceName;
    }
    public String getDestName (String destName){
        return destName;
    }
    
     @Override
    public String toString(){
    return "[" + this.destName + " "+ this.sourceName + " "+this.message+ " : "+ this.key + "]";
    }
}
