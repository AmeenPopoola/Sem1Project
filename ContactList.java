public class ContactList{
    //Ameen Popoola
    //Student ID - 20231717
    
    private Contact[] contactNames;
    private int used;
    public ContactList(){
        this.contactNames = new Contact [150];
        used = 0;
    }

    public ContactList(int capacity){
        if(capacity<5){
            capacity=5;
        }
        this.contactNames=new Contact[capacity];
        used=0;
    }

    public boolean add(Contact aContact){
        if(used<contactNames.length){
            this.contactNames[used]= aContact;

            used++;

            return true;
        } 
        return false;
    }

    public String nameFor(String number){
        int i;
        for(i=0;i<used;i++){
            if(contactNames[i].getPhoneNumber().equals(number)){
                return contactNames[i].getContactName(); 
            }else{
                return "";
            }
        }return contactNames[i].getContactName();
    }

    public String numberFor(String name){
        int i;
        for (i=0;i<used;i++){
            if(contactNames[i].getContactName().equals(name)){
                return contactNames[i].getPhoneNumber();
            }else{
                return "";
            }
        }return contactNames[i].getPhoneNumber();
    }

    public String nameFor(String number, int startPos){
         int i = 0;
        if(startPos >= 0) {
            for(i = startPos; i < used; i++) {
                if(contactNames[i].getPhoneNumber().compareTo(number) == 0) {
                    return contactNames[i].getContactName();
                }
            }
        }
        return "";
    }

    public String numberFor(String name, int startPos){
        int i;
        if(startPos >= 0) {
            for(i = startPos; i < used; i++) {
                if(contactNames[i].getContactName().indexOf(name) != -1) {
                    return contactNames[i].getPhoneNumber();
                }
            }
        }
        return "";
    }

    public void display(){
        if(used == 0) {
            System.out.println("The Contact is empty...");
        } else {
            for(int i=0; i < used; i++) {
                System.out.println(contactNames[i]);
            }
        }  
    }

    public boolean remove(String name){
        int i;
        for(i=0; i<used-1;i++){
            if(this.contactNames[i].getContactName().equals(name)){
                for(i=used; i<used;i--){
                 this.contactNames[i]=contactNames[i-1];
                  
                  return true;
                }
            }else{
                return false;
            }
        }    return true||false;
    }
        
    public boolean remove(int position){
        if(position<0 || position > used){
            return false;
        }else{
            for(int i=used;i<used;i--){
                this.contactNames[i]= contactNames[i--];
                return true;            }
        }   
        return true||false;
    }  
}
    
