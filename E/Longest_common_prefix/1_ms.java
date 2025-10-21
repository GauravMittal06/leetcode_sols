class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index=-1;
        // loop for each character in the strs[0]
        for(int i=0;i<strs[0].length();i++)
        {
            // loop for each word from strs[1]
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || strs[0].charAt(i)!=strs[j].charAt(i))
                {
                    if(index==-1)
                        return "";
                    else
                        return strs[0].substring(0,index+1);
                }
            }
            index++;
        }
        return strs[0].substring(0,index+1);
    }
}
