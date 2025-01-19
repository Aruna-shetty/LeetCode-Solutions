class Solution {
    public boolean isSubsequence(String s, String t) {      

      int lastIndex=0;
        for(int i=0;i<s.length();i++){
             boolean isSubsequence= false;
 
            for(int j=lastIndex;j<t.length();j++)
               {
                if(s.charAt(i)==t.charAt(j)) 
                  {
                    isSubsequence=true;
                    lastIndex=j+1;
                    break;
                  }

               }
               if(!isSubsequence)
                return isSubsequence;
        }
       return true; 
    }
}
