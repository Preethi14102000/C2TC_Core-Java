package com.cg.loops;

public class breakwhileloop {

	public static void main(String[] args) {
		int a=1; 
        while(a<=10){
             if(a==5)// 5==5
                 break; //forceful termination
        System.out.print("Statement : " + a);//1 2 3 4 
            a++;//2
        }
        System.out.print("End of Program.");

	}

}
