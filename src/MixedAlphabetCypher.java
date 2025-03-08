import java.util.*;

public class MixedAlphabetCypher implements EncryptionMethods{
    char[] a_z={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
    'u','v','w','x','y','z'};
    ArrayList<Integer> indices=new ArrayList<Integer>();
    char[] A_Z;
    String plainText;
    String encryptedText;

    public ArrayList<Integer> getIndices(int count){
        int i;
        Random random=new Random();
        for (i=0;i<count;i++){
            indices.add(random.nextInt(26));
            Collections.shuffle(indices);
        }
        return indices;
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
