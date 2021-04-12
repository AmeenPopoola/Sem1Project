public class TestContactList{
    public static void main(String[]args) {
         //Ameen Popoola
        //StudentID-20231717
        
        Contact Ameen = new Contact("Ameen Popoola","0831859760","","","","");
        Contact Alexander = new Contact("Alexander Hamilton" ,"1-212-736-5000","FoundingFather@elitemail.com","","","");
        Contact Lebron = new Contact("Lebron James","","","","","");
        Contact Ole = new Contact("Ole Gunnar Solskjaer","0300 200 3300","TacticallyInCapable@notactics.com","Ole Gunnar","Fraudulent Activity","@OleOut");
        Contact George= new Contact("George Russell","+44 713 8365 7213","MercedesNeedGeorge@ByeByeValtteri.com","Big George","gRussell63","@GeorgeRussell");
        
        ContactList WhatsApp = new ContactList(5);
        
        WhatsApp.add(new Contact("Ameen Popoola","0831859760","","","",""));
        WhatsApp.add(new Contact("Lebron James","","","","",""));
        WhatsApp.add(new Contact("Alexander Hamilton" ,"1-212-736-5000","FoundingFather@elitemail.com"));
        WhatsApp.add(new Contact("Ole Gunnar Solskjaer","0300 200 3300","TacticallyInCapable@notactics.com","Ole Gunnar","Fraudulent Activity","@OleOut"));
        WhatsApp.add(new Contact("George Russell","+44 713 8365 7213","MercedesNeedGeorge@ByeByeValtteri.com","Big George","gRussell63","@GeorgeRussell"));
        
        WhatsApp.display();
       
        System.out.println(WhatsApp.nameFor("0831859760"));
        System.out.println(WhatsApp.nameFor("+44 713 8365 7213",1));
        
        System.out.println(WhatsApp.numberFor("Mattio Binotto"));
        System.out.println(WhatsApp.numberFor("Alexander Hamilton",1));
        
        System.out.println(WhatsApp.remove("Janet"));
        System.out.println(WhatsApp.remove("Ameen Popoola"));
        
        System.out.println(WhatsApp.remove(3));
        System.out.println(WhatsApp.remove(99));
    }
}
