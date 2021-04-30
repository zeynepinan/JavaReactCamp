package JavaCampIntro;

public class Main {

	public static void main(String[] args) {


		//camelCase
		//Don't repeat yourself
        String internetSubeButonu="Ýnternet Þubeye gir";
        double dolarDun=8.15;
        double dolarBugun=9.14;
        int vade=36;
        boolean dustuMu=false;
        
        System.out.println(internetSubeButonu);
        
        if(dolarBugun<dolarDun) {
        	
        	 System.out.println("Dolar düþtü resmi");
             
        }else if(dolarBugun==dolarDun) {
        	 System.out.println("Dolar eþittir resmi ");
             
        }
        else {
        	 System.out.println("Dolar yükseldi resmi");
             
        }
        
    
        String [] krediler= {"Hýzlý Kredi","Mutlu emekli Kredi","Konut Kredi","Çiftçi Kredi","Msb Kredi"};
	
	for(String kredi:krediler) {
		
		System.out.println(kredi);
	}
	
	for(int i=0;i<krediler.length;i++) {
		System.out.println(krediler[i]);
	
	}
	
	//DEÐER TÝP
	int sayi1=10;
	int sayi2=20;
	sayi1=sayi2;
	sayi2=100;
	System.out.println(sayi1);
	
	//REFERANS TÝP
	int[] sayilar1= {1,2,3,4,5};
	int[] sayilar2= {10,20,30,40,50};
	sayilar1=sayilar2;
	sayilar2[0]=100;
	System.out.println(sayilar1[0]);
	
    //DEÐER TÝP
	String sehir1 ="Ankara";
	String sehir2 ="Ýstanbul";
	sehir1=sehir2;
	sehir2="Ýzmir";
	System.out.println(sehir1);
	}}
