package GradedLabs;

import java.util.Scanner;
public class VowelCounter {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input a string to analyze\n> ");
        String input = s.nextLine();
        int a=0,e=0,i=0,o=0,u=0,space=0,other=0;
        for(int j = 0;j<input.length();j++){
            char c = input.charAt(j);
            if(c=='a'){
                a++;
            }
            else if(c=='e'){
                e++;
            }
            else if(c=='i'){
                i++;
            }
            else if(c=='o'){
                o++;
            }
            else if(c=='u'){
                u++;
            }
            else if(c==' '){
                space++;
            }
            else{
                other++;
            }
            }
        System.out.println("in string:\nA's: "+a+"\nE's: "+e+"\nI's: "+i+"\nO's: "+o+"\nU's: "+u+"\nSpaces: "+space+"\nOther letters: "+other);
    }
}
