import java.util.ArrayList;

public class Intro{
public static void main(String[] args) {

    ArrayList<Integer> arrayList=new ArrayList<>();
    ArrayList<String> languages = new ArrayList<>();

languages.add("java");
languages.add("python");
System.out.println(languages);

//access
String str =languages.get(1);
System.out.println(str);
System.err.println(languages.get(0));


//change
String changed = languages.set(1, "c++");
System.out.println(languages);


//remove

System.out.println("remove 2nd element "+ languages.remove(1));


//iteration
for(String lng:languages){
    System.out.println(lng);
}
}    
}