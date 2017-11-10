package lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Input_Output {
        public static void main(String args[]) throws IOException {	 
            String arr[]={"A","B"};
            List a=new ArrayList();
           // Queue a=new BlockingQueue();
           
            System.out.print("Length is--->"+lengthAraay(arr));
            System.out.print("Length is--->");
            
        }
        
        
       static int lengthAraay(String arr[]){
        	return arr.length;
        }
    }