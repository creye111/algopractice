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
					if(stack.peek()=='('&&stack.isEmpty()!=false) {
						stack.pop();
					}
                    else{
                        stack.push(c);
                    }
					break;
				case']':
					if(stack.peek()=='['&&stack.isEmpty()!=false) {
						stack.pop();
					}
                    else{
                        stack.push(c);
                    }
					break;
				case '}':
					if(stack.peek()=='{'&&stack.isEmpty()!=false) {
						stack.pop();
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
