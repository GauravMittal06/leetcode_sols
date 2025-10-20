class Solution {
    public int finalValueAfterOperations(String[] operations) {
        String ch;
        int x=0;
        for(int i=0;i<operations.length;i++)
        {
            ch=operations[i];
            if(ch.charAt(0)=='+' || ch.charAt(1)=='+')
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        return x;
    }
}
