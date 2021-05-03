package algoprac;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		Stack <Character>stack = new Stack<>();
		for(char c : s.toCharArray()) {
			switch(c) {
				case '(':
					stack.push(c);
					break;
				case'[':
					stack.push(c);
					break;
				case '{':
					stack.push(c);
					break;
				case ')':
					if(stack.isEmpty()==false) {
                        if(stack.peek()=='(')
						    stack.pop();
					}
                    else{
                        stack.push(c);
                    }
					break;
				case']':
					if(stack.isEmpty()==false) {
                        if(stack.peek()=='[')
						    stack.pop();
                        else
                            stack.push(c);
					}
                    else{
                        stack.push(c);
                    }
					break;
				case '}':
					if(stack.isEmpty()==false) {
                        if(stack.peek()=='{')
						    stack.pop();
                        else
                            stack.push(c);
					}
                    else{
                        stack.push(c);
                    }
					break;
				
			}
		}
		return stack.isEmpty();
	}
}
