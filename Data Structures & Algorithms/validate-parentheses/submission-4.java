class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char br;
        for(int i =0; i<s.length();i++)
        {
            br = s.charAt(i);
            if(br =='(' || br =='{' || br == '[') 
            stack.push(br);

            else {
                if(stack.isEmpty()) return false;
                if ((br==']'&& stack.pop()!='[') || (br==')'&& stack.pop()!='(') || (br=='}'&& stack.pop()!='{'))
            return false;
        }  }
        return stack.isEmpty(); 
    }
}
