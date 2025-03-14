import java.util.*;

public class MixedAlphabetCypher implements EncryptionMethods{
    char[] a_z={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
    'u','v','w','x','y','z'};
    ArrayList<Integer> indices=new ArrayList<Integer>();
    char[] A_Z;
    String plainText;
    String encryptedText;

    public ArrayList<Integer> getIndices() {
        for (int i=0;i<26;i++){
            indices.add(i);
        }
        Collections.shuffle(indices);
        return indices;
    }

    public HashMap<Character,Character> mapLetters() {
        //char[] a_z="abcdefghijklmnopqrstuvwxyz".toCharArray();
        ArrayList<Integer> shuffledIndices=getIndices();
        HashMap<Character,Character> letterMapping=new HashMap<>();
        for (int i=0;i<26;i++){
            letterMapping.put(a_z[i],Character.toUpperCase(a_z[shuffledIndices.get(i)]));
        }
        return letterMapping;
    }

    @Override
    public String encrypt() {
        return "";
    }

    @Override
    public String decrypt() {
        return "";
    }
}
