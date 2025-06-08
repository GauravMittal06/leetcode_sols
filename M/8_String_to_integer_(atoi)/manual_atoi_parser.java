class Solution {
    public int myAtoi(String s) {
        long sti=0;
        int flag=0;
        boolean started=false;
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);

            if (!started && ch == ' ') //space will not be considered if before 'started'
            {
                continue;
            }
            if(!started && (ch=='-'||ch=='+')) //checking for '-' and '+'
            {
                started=true;
                flag=(ch=='-') ? 1:0;
                continue;
            }
            else if(ch>=48 && ch<=57) //any digit as char
            {
                started=true;
                sti=sti*10+(ch-'0');

                //checking overflow and returning 
                if (flag == 0 && sti > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (flag == 1 && sti > (long)Integer.MAX_VALUE + 1) return Integer.MIN_VALUE;
            }
            else
            {
                break;
            }
        }
        if(flag!=0)
        {
            return -(int)sti;
        }
        return (int)sti;
    }
}
