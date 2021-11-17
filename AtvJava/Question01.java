package atvjava;

import java.io.*;
import java.util.Arrays;

public class Question01 {
	
	public static void main(String args[]) throws IOException {
		
        FileInputStream stream = new FileInputStream("C:\Users\Luana\OneDrive\Área de Trabalho\CEFET\Ap. Moveis\\data.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        
        BufferedReader rd = new BufferedReader(reader);
        String ln = rd.readLine();
        
        String [] input = new String[3];
        
        int a = -1;        
        
        while(ln != null){
        	a = a + 1;
            input[a] = ln;
            ln = rd.readLine();
        }
        
        String[] BreadSz = input[2].split(" ");

        int m, end = 0;
        
        
        for(int b = 0; k < BreadSz.length; b++){
        	m += Integer.parseInt(BreadSz[k]); 
        }
        
        m = m/Integer.parseInt(input[0]);
        
        while(m > 0){
            
        	for(int b=0; b < BreadSz.length; b++){
            	end += Integer.parseInt(BreadSz[b])/m;
        	}
        	
        	if(end == Integer.parseInt(input[0])){
        		System.out.println(m);
        		break;
        		
        	}else{
        		m = m - 1;
        		end = 0;
        	}
        	
        	rd.close();
        };
    }
}

