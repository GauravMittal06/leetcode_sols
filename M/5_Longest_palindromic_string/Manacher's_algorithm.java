class Solution {
    public String longestPalindrome(String s) {
        
        //creating a modified string 't'
        String t="$";
        for(int i=0;i<s.length();i++)
        {
            t+="#"+s.charAt(i);
        }
        t+="#&";

        int p[]=new int[t.length()]; //building an array to store the radius size of palindrome at each index
        int c=0,R=0; //initializing 'centre' and 'radius' to the 1st index (0)
        int mirror;

        for(int i=1;i<t.length()-1;i++) //'i' moves from '1' to 'l.length-1' because the 1st and the last index are the sentinals '$' and '&'
        {
            mirror=2*c-i;
            if(i<R) //if the index is inside the range of radius length 
            {
                p[i]=Math.min(p[mirror],R-i);
            }

            while(t.charAt(i+(1+p[i]))==t.charAt(i-(1+p[i])))
            {
                p[i]++;
            }

            if(i+p[i]>R)
            {
                c=i;
                R=i+p[i];
            }
        }
        //finding out the centre with maximum palindromic substring, and its length from start
        int maxLen=0,centreIndex=0;
        for(int i=1;i<p.length-1;i++) //excluding the sentinals 
        {
            if(p[i]>maxLen)
            {
                maxLen=p[i];
                centreIndex=i;
            }
        }

        //finding the original substring by discarding the '#', and sentinals
        int start=(centreIndex-maxLen)/2; //formula to find the starting index
        
        return s.substring(start,start+maxLen);
    }
}
