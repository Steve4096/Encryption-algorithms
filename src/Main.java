import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Main {
    static char[] a_z={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
            'u','v','w','x','y','z'};
    static char[] A_Z=new char[26];
    static ArrayList<Integer> integers=new ArrayList<>();
    static String cipherText;

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> getIntegers(int count) {
        HashSet<Integer> uniqueIndices=new HashSet<>();
        Random random=new Random();
        while (uniqueIndices.size()<count){
            int index= random.nextInt(26);
            uniqueIndices.add(index);
        }
        return new ArrayList<>(uniqueIndices);
    }

    public static ArrayList<Integer> getUniqueIndices() {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i=0;i<26;i++){
            arrayList.add(i);
        }
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public ArrayList<Integer> getIndices(){
        int x=0,count=0;
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (arrayList.size()<26){
            x++;
            if (count==26){
                break;
            }
            int rindex=(int) Math.floor(Math.random()*26);
            if (!arrayList.contains(rindex)){
                arrayList.add(rindex);
                count++;
            }
        }
        return arrayList;
    }
}
