class Solution {
    public String convert(String s, int numRows) 
    {
        if (numRows == 1 || s.length() <= numRows) 
        {
            return s;
        }

        StringBuilder[] str = new StringBuilder[numRows]; //declaration of an array of 'stringBuilder'
        for (int i = 0; i < numRows; i++) //initializing index of each stringBuilder (for each row)
        {
            str[i] = new StringBuilder();
        }

        int c = 0;
        while (c < s.length()) 
        {
            // Going down
            for (int i = 0; i < numRows && c < s.length(); i++) 
            {
                str[i].append(s.charAt(c++));
            }

            // Going up diagonally
            for (int i = numRows - 2; i >= 1 && c < s.length(); i--) 
            {
                str[i].append(s.charAt(c++));
            }
        }

        //CONCATENATING THE STRINGBUILDERS (of different rows) INTO A SINGLE (one liner)
        StringBuilder result = new StringBuilder(); //a new string builder to concatinate all the results of each stringBuilder (of each row)
        for (int i = 0; i < str.length; i++) 
        {
            result.append(str[i]);
        }

        return result.toString(); //returning a stringBuilder after converting into string
    }
}
