class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder str=new StringBuilder();
        int maxSize=0,index;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            index=str.indexOf(String.valueOf(ch)); //'ch' cannot be directly passed into StringBuilder, we need to pass the value of 'char'
            if(index==-1) 
            {
                str.append(ch);
            }
            else
            {
                str.delete(0,index+1);
                str.append(ch);
            }
            maxSize=Math.max(maxSize,str.length());
        }
        return maxSize;
    }
}
