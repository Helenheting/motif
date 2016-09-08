import java.io.*;                                                               
public class findingamotifindnatest5{
public static void main(String[] args)throws IOException{
FileReader f =new FileReader("/home/administrator/下载/subs.txt");
BufferedReader br =new BufferedReader(f);
int n=0,j=0; 
String str1=br.readLine();
String str2=br.readLine();

n=str1.indexOf(str2);
System.out.print(n+1 + " ");

while(n!=-1){
n=str1.indexOf(str2, n+1);
j=n+1; 
System.out.print(j+" ");}

br.close();
}
}  
