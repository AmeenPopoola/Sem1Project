public class ContactList{
    private Contact[] contactNames;
    private int used;
public ContactList(){
    contactNames = new Contact [150];
    used = 0;
}

public ContactList(int capacity){
    if(capacity<5){
        capacity=5;
    }
     contactNames=new Contact[capacity];
     used=0;
    }

public boolean add(Contact aContact){
    if(used<contactNames.length){
       contactNames[used]= aContact;
       
        used++;
        
        return true;
    } 
    return false;
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

