class Solution {
    public int romanToInt(String s) {
         Stack<Integer>ss=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            Integer p=getValue(s.charAt(i));
            if(!ss.isEmpty())
            {
                if(ss.peek()<p)
                {
                    Integer t=p-ss.peek();
                    ss.pop();
                    ss.add(t);
                }
                else
                    ss.add(p);
            }
            else
                ss.add(p);
        }
        int sum=0;
        while(!ss.isEmpty())
        {
            sum=sum+ss.peek();
            ss.pop();
        }
        return sum;
    }
    public int getValue(char c)
    {
        switch(c)
        {
        case 'M':
            return 1000;
        case 'D':
            return 500;
        case 'C':
            return 100;
        case 'L':
            return 50;
        case 'X':
            return 10;
        case 'V':
            return 5;
        case 'I':
            return 1;
        default:
            return 0;
        }
    }
}