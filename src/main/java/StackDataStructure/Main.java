package StackDataStructure;

public class Main {

    public static void main(String[] args){
        Stack stack = new Stack(3);
//        stack.push(20);
//        stack.push(40);
//        stack.push(60);
//        stack.push(80); Commented out for Char example below

//        while (!stack.isEmpty()){
//            long value = stack.pop();
//            System.out.println(value);
        System.out.println(reverseString("Hello"));
        }


    public static String reverseString(String str){
        int stackSize = str.length(); //get max stack size
        Stack theStack = new Stack(stackSize); //create new stack
        for (int j = 0; j < str.length(); j++){
            char ch = str.charAt(j); //getiing char from input string
            theStack.push(ch);
        }
        String result = "";
        while (!theStack.isEmpty()){
            char ch = theStack.pop();
            result = result + ch; //appending the output
        }
        return result;
    }


}
