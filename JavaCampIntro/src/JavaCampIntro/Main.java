package JavaCampIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        
	}

}
