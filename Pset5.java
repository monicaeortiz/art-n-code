public class Pset5{
public static void main(String [] args){
    //tests
    System.out.println(removeTag("<b>Strings are immutable</b>"));
    System.out.println(removeTag("<b>This is a bad tag</u>"));
    getInits("Caroline Grace Busler");
    System.out.println(isAnagram("parliament", "partial men"));
    System.out.println(isAnagram("parliament", "party"));
    System.out.println(isAnagram("Parliament", "partial men"));
    vertical("hey now");
}

public static String removeTag(String s){
    String toRet = s;
    int startTag = s.indexOf("<");
    int endTag = s.indexOf(">");
    String tag1 = s.substring(startTag+1, endTag+1);
    int startTag2 = s.indexOf("/");
    int endTag2 = s.indexOf(">", endTag+1);
    String tag2 = s.substring(startTag2+1, endTag2+1);

    if(tag1.equals(tag2)){
        toRet = s.substring(endTag+1, startTag2-1);
    }
    return toRet;
}

public static void getInits(String s){
    String inits = s.substring(0,1);
    for (int i=0; i<s.length(); i++){
        if(s.charAt(i) == ' '){
            inits += s.substring(i+1, i+2);
        }
    }
    System.out.println(inits);
}

public static boolean isAnagram(String a, String b){
    String lettersOfA = "";
    String lettersOfB = "";
    int valueOfA = 0;
    int valueOfB = 0;
    for (int i=0; i<a.length(); i++){
        int unicode = (int) a.charAt(i);
        if(unicode >= 65 && unicode <= 90 || unicode >= 97 && unicode <= 122){
            if (unicode >= 65 && unicode <= 90){
                unicode += 32;
            }
            lettersOfA += a.charAt(i);
            valueOfA += unicode;
        }
    }

    for (int i=0; i<b.length(); i++){
        int unicode = (int) b.charAt(i);
        if(unicode >= 65 && unicode >= 90 || unicode >= 97 && unicode <= 122){
            if (unicode >= 65 && unicode <= 90){
                unicode += 32;
            }
            lettersOfB += b.charAt(i);
            valueOfB += unicode;
        }
    }
    return (valueOfA == valueOfB);
}

public static void vertical(String s){
    for (int i=0; i<s.length(); i++){
        int unicode = (int) s.charAt(i);
        if(unicode >= 65 && unicode >= 90 || unicode >= 97 && unicode <= 122){
           System.out.println(s.charAt(i));
        }
    }
}


}
