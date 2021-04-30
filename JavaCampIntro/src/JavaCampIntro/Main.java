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
	}

}
