
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String common=str2;
    while(common.length() >0)
    {
    if(str1.replaceAll(common,"").equals("") && str2.replaceAll(common,"").equals(""))
      return common;
    common=common.substring(0,common.length()-1);

    }
       
       return "";
    }
}
