class Solution {
    public int strStr(String haystack, String needle) {
        int nsize=needle.length();
        int hsize=haystack.length();
        if(nsize==0)
        {
            return -1;
        }
        for(int i=0;i<=hsize-nsize;i++)
        {
            if (haystack.substring(i, i+nsize).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}
