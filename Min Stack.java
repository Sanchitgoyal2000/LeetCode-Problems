class MinStack {

    /* initialize your data structure here. */
   int min=Integer.MAX_VALUE;
    int size=0,data;
    Stack<Integer>s=new Stack();
    MinStack head=null,last=null,next=null;
    public void push(int x) {
        if(size==0)
            min=Integer.MAX_VALUE;
         if(x<min)
        {
            min=x;
             System.out.println(min);
        }
       if(size==0)
       {
           MinStack t=new MinStack();
           t.data=x;
           t.next=null;
           last=t;
       }
       else
       {
           MinStack t=new MinStack();
           t.data=x;
           t.next=last;
           last=t;
       }
        s.push(min);
          size++;
    }
    
    public void pop() {
         if(size>0)
        {
            s.pop();
            size--;
             if(size!=0)             //very important step
             {
                 min=s.peek();
             }
            if(last!=null)
            {
              last=last.next;
            }
        }
    }
    public int top() {
        if(size>0)
        {
            return last.data;
        }
        return -1;
    }
    
    public int getMin() {
        if(size!=0)
        {
            return s.peek(); 
        }
        return -1;
    }
}