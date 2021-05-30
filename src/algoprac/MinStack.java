package algoprac;
import java.util.LinkedList;
class MinStack {
    public class MinStackNode{
        public int min;
        public int val;
        MinStackNode(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
    /** initialize your data structure here. */
    LinkedList <MinStackNode> stack;
    public MinStack() {
         stack = new LinkedList();
        
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.add(new MinStackNode(val, val));
        }else{
            int temp =stack.getLast().min;
            if(val<temp){
                stack.add(new MinStackNode(val,val));        
            }
            else{
                stack.add(new MinStackNode(val,temp));
            }
        
        }
    }
    
    public void pop() {
        stack.removeLast();
    }
    
    public int top() {
        return stack.getLast().val;
    }
    
    public int getMin() {
        return stack.getLast().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */