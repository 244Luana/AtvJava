package atvjava;

import java.io.*;

public class Question03 {

    public static void main(String args[]) throws IOException{
        
        FileInputStream stream = new FileInputStream("C:\Users\Luana\OneDrive\Área de Trabalho\CEFET\Ap. Moveis\\data3.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        
        BufferedReader rd = new BufferedReader(reader);
        String ln = rd.readLine();

        String [] inp01 = new String[2];
        
        int a = -1;       
        
        while(ln != null){
        	a = a + 1;
            inp01[a] = ln;
            ln = rd.readLine();
        }
        
        String[] inp01x = inp01[0].split(" ");
        String[] inp02x = inp01[1].split(" ");
        
        int [] inp01y = new int [inp01x.length];
        int [] inp02y = new int [inp02x.length];
        
        for(int b=0; b<inp01x.length; b++){
        	inp01y[b] = Integer.parseInt(inp01x[b]);
        	inp02y[b] = Integer.parseInt(inp02x[b]);
        }
        
        if(inp02y[0] >= inp01y[0] && inp02y[0] <= inp01y[2] && inp02y[1] >= inp01y[1] && inp02y[1] <= inp01y[3]){
        	System.out.println("saída: 1");   
        	
        }else{
        	if(inp02y[2] >= inp01y[0] && inp02y[2] <= inp01y[2] && inp02y[3] >= inp01y[1] && inp02y[3] <= inp01y[3]){        	
        		System.out.println("1");
        	}else {
        		System.out.println("0");
        	}
        	
            rd.close();
        };
	}
}