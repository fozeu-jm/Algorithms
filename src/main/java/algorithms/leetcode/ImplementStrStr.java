package algorithms.leetcode;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        int nl=needle.length(), hl=haystack.length();
        if(nl==0){
            return 0;
        }
        for(int i=0;i<=hl-nl;i++){
            //compare needle with substring from haystack. We move across haystack in windows = to length of needle
            String s= haystack.substring(i,i+nl);
            if(s.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
