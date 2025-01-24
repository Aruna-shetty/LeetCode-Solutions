class Solution {
    public int maxVowels(String s, int k) {
     int maxVowels=0;
     int vowels=0;
     int i=0;
    
    while(i<s.length()){
        if(isVowel(s.charAt(i)))
           vowels++;
        if(i>=k && isVowel(s.charAt(i-k)))
            vowels--;
         maxVowels= Math.max(maxVowels,vowels)  ;
        if(maxVowels==k)
         return maxVowels;
        i++;  
    }

     
    return maxVowels;
}

public boolean isVowel(char c)
{
    if(c=='a' || c=='e' || c=='i' || c== 'o' || c=='u')
    return true;
   return false; 
}
}

