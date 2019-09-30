
package lab5_array;
import java.util.Scanner;
public class Lab5_array {
    
    public static void main(String[] args) {
        int i, j;
	String temp;
	Scanner scan=new Scanner(System.in);
	String nama[]= new String[7];
        System.out.println("Taipkan 7 Nama rakan anda:");
        for(i=0;i<7;i++){
            nama[i]=scan.nextLine();
        }
        for(i=0;i<5;i++){
            for(j=1;j<5;j++){
                for(j=1;j<5;j++){
                    if(nama[j-1].compareTo(nama[j])>0){
                        temp=nama[j-1];
                        nama[j-1]=nama[j];
                        nama[j]=temp;
                    }
                }
            }
            System.out.println("\nSusunan nama mengikut susunan A-Z");
                for(i=0;i<5;i++){
                    System.out.println(nama[i]);
                }
        }
    }
    
}
