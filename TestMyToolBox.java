public class TestMyToolBox { 
    public static void main(String[]args) {
        int i;
        for(i=1; i<=5; i++){
            System.out.print(MyToolBox.repeat(" ",9)+i);
        }

        System.out.println();
        System.out.println(MyToolBox.repeat("0987654321",8));
        System.out.println(MyToolBox.noTrailingSpaces("Where'sTheLambSauce     ")+"<");
        System.out.println(MyToolBox.expand("Donald Trump",45)+"<");
        System.out.println(MyToolBox.trim("Can I please finish a sentence?",26)+"<");
        System.out.println(MyToolBox.centre("#OleOut",36)+"<");
        System.out.println(MyToolBox.centre("BabaBooey",25)+"<");

        
        
    }
}

