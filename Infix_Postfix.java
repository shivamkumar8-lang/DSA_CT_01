import java.util.Stack;
import java.util.*;
public class Infix_Postfix {

    static int precedence(Character ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static String ItoPst(String a){
       Stack<Character> st = new Stack<>();
       StringBuilder sb = new StringBuilder();

       for(int i = 0; i < a.length(); i++){
           char c = a.charAt(i);

           if(c == ' '){
               continue;
           }
           else if(Character.isLetterOrDigit(c)){
               sb.append(c);
           }
           else if(c == '('){
               st.push(c);
           }
           else if(c == ')'){
               while(!st.isEmpty() && st.peek() != '('){
                   sb.append(st.pop());
               }
              if(!st.isEmpty() && st.peek() != '('){
                st.pop();
              }
           }
           // Checking for precedence
           else {
               while (!st.isEmpty() && precedence(c) <= st.peek()) {
                   sb.append(st.pop());
               }
               st.push(c);
           }
       }

       while(!st.isEmpty()){
           sb.append(st.pop());
       }

       return sb.toString();
    }
    public static void main(String[] args) {
        String infix = "a*c+b-c";
        String postfix = ItoPst(infix);

        System.out.println(postfix);
    }
}
