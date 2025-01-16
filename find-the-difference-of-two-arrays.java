class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        result.add(getOnlyElementsinFirstArray(nums1,nums2));
        result.add(getOnlyElementsinFirstArray(nums2,nums1));

      return result;


    }

  public List<Integer> getOnlyElementsinFirstArray(int[] nums1, int[] nums2) {
    HashSet<Integer> set2=new HashSet<Integer>();
    HashSet<Integer> result=new HashSet<Integer>();

    for(int i:nums2)
      set2.add(i);

    for(int i:nums1)
       if(!set2.contains(i))
        result.add(i);  

    return new ArrayList<>(result);

  }
    
}

/** Solution 2 **/

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //  List<Integer> first=new ArrayList<Integer>();
        //  List<Integer> second=new ArrayList<Integer>();
         Set<Integer> s1=new HashSet<Integer>();
         Set<Integer> s2=new HashSet<Integer>();
         for(int i:nums1)
           s1.add(i);

         for(int i:nums2)
           s2.add(i);  

          for(int i: nums1){
             if(s2.contains(i)) {
                s1.remove(i);
                s2.remove(i);
             }
           
          }

        List<List<Integer>> result=new ArrayList<List<Integer>>();
        result.add(new ArrayList<>(s1));
        result.add(new ArrayList<>(s2));

      return result;


    }
}
