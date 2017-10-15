package cn.lbw.matching;

import java.util.Stack;

/**
 * Created by Bowei Liu on 2017/10/15.
 * 括号匹配
 */
public class CharacterMatching {

    public static void main(String[] args) {
        characterMatching("{}[(())]");
    }
    public static void characterMatching(String testStr){
        Stack<Character> stack = new Stack<Character>();
        if(testStr.length() % 2==1){
            System.out.println("字符串长度为奇数，无法匹配");
        }else{
            for (int i = 0 ; i < testStr.length() ; i++){
                System.out.println("第"+i+"个字符:"+testStr.charAt(i)+"\t进行匹配");
                if(stack.isEmpty()){
                    stack.push(testStr.charAt(i));
                    System.out.println("匹配结果：栈为空，进栈");
                }else if((stack.peek() == '[' && testStr.charAt(i)==']') || (stack.peek() == '(' && testStr.charAt(i)==')' || (stack.peek() == '{' && testStr.charAt(i)=='}'))){
                    stack.pop();
                    System.out.println("匹配结果：匹配成功，出栈");
                }else {
                    stack.push(testStr.charAt(i));
                    System.out.println("匹配结果：匹配不成功，进栈");
                }
            }

            if (stack.isEmpty()){
                System.out.println("成功匹配");
            }else {
                System.out.println("无法成功匹配");
            }
        }
    }
}
