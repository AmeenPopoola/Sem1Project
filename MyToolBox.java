public class MyToolBox {

    public static String repeat(String text, int times){
        int i = 0; 

        if (times <= 0){
            return ("");
        } else {
            return text + repeat(text,times-1);
        }
    }

    public static String noTrailingSpaces(String text){
        { if(text==null)
                return null;

            int len=text.length();
            for(;len>0; len=len-1)
            {
                if ( ! Character.isWhitespace(text.charAt(len-1)))
                    break;
            }
            return text.substring(0,len);
        }
    }

    public static String expand(String text, int width){

        int len = text.length();

        for(;len<width;len=len+1){
            text = text + " " ;
        } if(len>=width){
            return text.substring(0,width);

        }  return text + expand(text , len+1);
    } 

    public static String trim(String text, int width){
        int len =text.length();

        for(;len<width;len=len+1){
            text = text + " " ;
        }   if(len>width){
            return text.substring(0,width);
        } else {
            return text;
        } 
    }

    public static String centre(String text, int width){
        int len= text.length();
        int Spaces = width-len;
        int SpacesLeft= Spaces + 1 / 2 ;
        int SpacesRight= Spaces - SpacesLeft;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<SpacesLeft;i=i+1) {
            sb.append(" ");
        } sb.append(text);
        for(int i=0; i<SpacesRight;i=i+1){
            sb.append(" ");
        }return sb.substring(0,width);
    } 
}

