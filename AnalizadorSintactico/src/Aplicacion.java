import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Aplicacion 
{

	public static void main(String[] args) throws IOException 
	{
		
		File archivo = new File ("C:\\Users\\HP-Laptop\\Documents\\GitHub\\CompiladoresYLenguajes\\codigo.txt");
		FileReader fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);
		String[] linea = new String [10];
		int numeroLinea=0;
		int numTokens=0;
		int contador =0;
		String[][] datos = new String [4][10];
        while((linea[numeroLinea]=br.readLine())!=null)
        {
        	
           StringTokenizer tokens = new StringTokenizer(linea[numeroLinea]," ");
           numTokens=tokens.countTokens();
           contador =0;
           while (contador!=numTokens)
           {
        	   datos[numeroLinea][contador] = tokens.nextToken();
        	   contador++;
           }
           numeroLinea++;
        }
        
    	File archivo2 = new File ("C:\\Users\\HP-Laptop\\Documents\\GitHub\\CompiladoresYLenguajes\\Gramatica.txt");
    	FileReader fr2 = new FileReader (archivo2);
    	BufferedReader br2 = new BufferedReader(fr2);
    	
    	String[] linea2 = new String [10];
    	int numeroLinea2=0;
    	int numTokens2=0;
    	int contador2 =0;
    	String[][] datos2 = new String [4][10];
        while((linea2[numeroLinea2]=br2.readLine())!=null)
        {
        	
           StringTokenizer tokens2 = new StringTokenizer(linea2[numeroLinea2]," ");
           numTokens2=tokens2.countTokens();
           contador2 =0;
           while (contador2!=numTokens2)
           {
        	   datos2[numeroLinea2][contador2] = tokens2.nextToken();
        	   contador2++;
           }
           numeroLinea2++;
        }
        
        String datos3="";
        for(int i=0;i<datos2.length;i++)
        {
        	for(int j=0;j<10;j++)
        	{
        		if (datos[i][j]!=null)
        		{
        			if (datos2[i][j]!=null)
        			{
        				if(datos[i][j].equals(datos2[i][j]))
        					{
        					datos3 += " "+datos[i][j];  
        					}
        			}
        		}
        
        		
        			      			
        		
        	}
        	System.out.printf("Linea "+i+" correcta :"+datos3+"\n");
        	datos3 ="";
        }
   	}
}
	



