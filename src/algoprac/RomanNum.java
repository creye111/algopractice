package algoprac;

public class RomanNum {
	public int romanToInt(String s) {
		int value = 0;
		for(int i=0;i<s.length();i++) {
			switch(s.charAt(i)){
				case 'M':
					value+=1000;
					break;
				case 'D':
					value += 500;
					break;
				case 'C':
					if(i+1<s.length()) {
						if(s.charAt(i+1)=='M'||s.charAt(i+1)=='D') {
							value-=100;
						}
						else {
							value+=100;
						}
					}
					else {
						value+=100;
					}
					break;
				case 'L':
					value += 50;
					break;
				case 'X':
					if(i+1<s.length()) {
						if(s.charAt(i+1)=='L'||s.charAt(i+1)=='C') {
							value-=10;
						}
						else {
							value+=10;
						}
					}
					else {
						value+=10;
					}
					break;
				case 'V':
					value+=5;
					break;
				case 'I':
					if(i+1<s.length()) {
						if(s.charAt(i+1)=='V'||s.charAt(i+1)=='X') {
							value-=1;
						}
						else {
							value+=1;
						}
					}
					else {
						value+=1;
					}
					break;
				
			}
		}
		
		return value;
	}
	public static void main (String []args) {
		
	}
}
