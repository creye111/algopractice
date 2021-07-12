package algoprac;

import java.util.HashMap;

public class IsometricStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character, Character> map  = new HashMap<>();
        for(int i=0;i<s.length();i++){
            //if isnt mapped yet, add to the hashmap
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }
            //else char is mapped, check if it matches the existing mapping.
            //if not, return fail
            else{
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
        }
        HashMap <Character,Character> reverseMap = new HashMap<>();

        //Check to see if one-to-one correspondence applies vice-versa as well
        for(int j=0;j<s.length();j++){
            //if isnt mapped yet, add to the hashmap
            if(!reverseMap.containsKey(map.get(s.charAt(j)))){
                reverseMap.put(map.get(s.charAt(j)),s.charAt(j));
            }
            else{
                if(reverseMap.get(t.charAt(j))!=s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
