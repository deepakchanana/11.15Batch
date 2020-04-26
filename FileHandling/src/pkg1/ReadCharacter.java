package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharacter 
{
  public static void main(String[] args) throws IOException 
  {
	File f=new File("C:\\Users\\Dell\\Desktop\\dummy.txt");
	FileReader fr=new FileReader(f);
	BufferedReader b=new BufferedReader(fr);
	String s;
	int a=0;
	while((s=b.readLine())!=null)
	{
		a=a+1; // in the first line a---1 in the second time--a--2
		if(a==2)
		{
		System.out.println(s);
		break;
		}
	}
	
	
	
  }
	
}
 