package GradedLabs;

import java.util.Scanner;
public class VowelCounterAdvanced {
    public static void main(String[] args){
        // DELETE THIS COMMENT BEFORE SHOWING MR. TWIET
        // ONLY USE THIS IF YOU CAN THOROUGHLY EXPLAIN WHAT A SWITCH CASE IS
        // MR TWIET EXPLICITLY STATED THAT HE WILL ASSUME YOU ARE CHEATING IF YOU CANNOT
        Scanner s = new Scanner(System.in);
        System.out.print("Input a string to analyze\n> ");
        String input = s.nextLine();
        int a=0,e=0,i=0,o=0,u=0,space=0,other=0;
        for(int j = 0;j<input.length();j++){
            switch(input.charAt(j)){
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                case ' ':
                    space++;
                    break;
                default:
                    other++;
                    break;
            }
        }
        System.out.println("in string:\nA's: "+a+"\nE's: "+e+"\nI's: "+i+"\nO's: "+o+"\nU's: "+u+"\nSpaces: "+space+"\nOther letters: "+other);
    }
}
