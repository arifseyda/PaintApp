
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
  
public class RastgeleKarakter {
    private int rastgele;
    private char kelime;
    private final Character[] charray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
    'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        public char getRandomCharacter(){
            return charray[(int)random()];
        }
        public long random(){
            return  System.nanoTime()% 52;
        }
        public  String getRandomCharacter(int sayi){
            String maxkarakter = "";
            for (int i = 0; i < sayi; i++) {
                try {
                    kelime = charray[(int)random()];
                    Thread.sleep(100);
                    maxkarakter += kelime;
                } catch (InterruptedException ex) {
                    Logger.getLogger(RastgeleKarakter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return  maxkarakter;
        }
        private long zaman(){ //Nanosaniye cinsinden tarihi döndürür. 
            long simdi = System.nanoTime();
            return simdi % 123;
        }
        public char rasgeleOlustur(){ //rastgele karakter ascii den yararlanarak.
            while(true){
                rastgele = (int)zaman();
                if(rastgele>=(int)'a' && rastgele<=(int)'z') break;
                else if (rastgele>=(int)'A' && rastgele<=(int)'Z') break;
            }
            kelime= (char)rastgele;
            return kelime;
        }
        private char kucukRasgeleOlustur(){
            while(true){
                rastgele= (int)((zaman())% 123);
                if(rastgele>=(int)'a' && rastgele<=(int)'z') break;
            }
            kelime= (char)rastgele;
            return kelime;
        }
        private char buyukRasgeleOlustur(){
            while(true){
                rastgele= (int)((zaman())% 123);
                if(rastgele>=(int)'A' && rastgele<=(int)'Z') break;
            }
            kelime= (char)rastgele;
            return kelime;
        }
        public String rasgeleOlustur(int maxSayi) { //bir den fazla karakter olusturma
            String maxharf="";
            for (int i = 0; i < maxSayi; i++) {
              
                try {
                    rastgele =rasgeleOlustur();
                    Thread.sleep(100);
                    kelime =(char)rastgele;
                    maxharf += kelime;
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(RastgeleKarakter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return maxharf;
        }
        public String ücKarakter(){ //üc karakter olusturma
            String ucharf="";
            for (int i = 0; i < 3; i++) {
              rastgele = rasgeleOlustur();
              kelime =(char)rastgele;
              ucharf += kelime;
            }
            String birinci = "",ikinci="",ucuncu="";
            birinci = ucharf.substring(0,1);
            ikinci = ucharf.substring(1,2);
            ucuncu = ucharf.substring(2,3);
            while (true) {                
                if (!birinci.equals(ikinci)&&!ikinci.equals(ucuncu)&&!birinci.equals(ucuncu)) {
                return ucharf;
            }
                else return ücKarakter();
            }
        }
        /*public void ikiKarakterArasında(char ilk,char son){ //iki harflerin sırası arasında bir karakter oluşturma
            while (true){
                rastgele = getRandomCharacter();
                if (rastgele>=(int)ilk&&rastgele<=(int)son){
                    break;
                }
            }
            kelime = (char)rastgele;
            System.out.println("Verilen iki karakter("+ilk+","+son+"): "+kelime);
        }*/
        public void ikiKarakterArasında(Character ilk,Character son){ //iki harflerin sırası arasında bir karakter oluşturma
            int ilkeleman=0;
            int sonEleman=0;

            for (int i = 0; i < charray.length; i++) {
                    if (ilk.equals(charray[i])) 
                    {
                        ilkeleman=i;
                        break;
                    }
            }
            for (int j = 0;j < charray.length; j++) {
                    if (son.equals(charray[j])) 
                    {
                        sonEleman=j;
                        break;
                    }
            }
            while (true){
                rastgele = getRandomCharacter();
                if (rastgele >= (int)charray[ilkeleman] && rastgele <= (int)charray[sonEleman]){
                    break;
                }
            }
            kelime = (char)rastgele;
            System.out.println("Verilen iki karakter("+ilk+","+son+"): "+kelime);
        }
        /*public void ikiKarakterArasında(char ilk,char son,int sayi){ //iki harflerin sırası arasında birden fazla karakter oluşturma
                String karakterdizisi = "";
                for (int i = 0; i < sayi; i++) {
                    while(true){
                        try {
                            rastgele = getRandomCharacter();
                            Thread.sleep(100);
                            if (rastgele>=(int)ilk&&rastgele<=(int)son) {
                                break; 
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(RastgeleKarakter.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                kelime = (char)rastgele;
                karakterdizisi += kelime;
                }
            System.out.println("Verilen iki karakter("+ilk+","+son+"): "+karakterdizisi);
        }*/
        public void ikiKarakterArasında(Character ilk,Character son,int sayi){ //iki harflerin sırası arasında birden fazla karakter oluşturma
                int ilkeleman=0;
                int sonEleman=0;

                for (int i = 0; i < charray.length; i++) {
                    if (ilk.equals(charray[i])) 
                    {
                        ilkeleman=i;
                        break;
                    }
                }
                for (int j = 0;j < charray.length; j++) {
                    if (son.equals(charray[j])) 
                    {
                        sonEleman=j;
                        break;
                    }
                }
                String karakterdizisi = "";
                for (int i = 0; i < sayi; i++) {
                    while(true){
                        try {
                            rastgele = getRandomCharacter();
                            Thread.sleep(100);
                           if (rastgele >= (int)charray[ilkeleman] && rastgele <= (int)charray[sonEleman]){
                                break; 
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(RastgeleKarakter.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                kelime = (char)rastgele;
                karakterdizisi += kelime;
                }
            System.out.println("Verilen iki karakter("+ilk+","+son+"): "+karakterdizisi);
        }
        public void BelirtilenKarakterler(char... karakterler){ //Belirtilen karakterler arasında karakter olusturma
            System.out.print("Belirtilen karakterler(");
            for (int i = 0; i < karakterler.length; i++) {
                System.out.print(karakterler[i]);
                if (i+1 != karakterler.length) {
                    System.out.print(",");
                }
            }
            System.out.print("): ");
            for (int i = 0; i < 1; i++) {
                try {
                    rastgele = rasgeleOlustur();
                    rastgele = rastgele%karakterler.length;
                    Thread.sleep(100);
                    System.out.print(karakterler[rastgele]);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RastgeleKarakter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("");
        }
        public void BelirtilenKarakterler(int sayi , char... karakterler){ //Belirtilen karakterler arasında karakter olusturma
            System.out.print("Belirtilen karakterler(");
            for (int i = 0; i < karakterler.length; i++) {
                System.out.print(karakterler[i]);
                if (i+1 != karakterler.length) {
                    System.out.print(",");
                }
            }
            System.out.print("): ");
            for (int i = 0; i < sayi; i++) {
                try {
                    rastgele = rasgeleOlustur();
                    rastgele = rastgele%karakterler.length;
                    Thread.sleep(100);
                    System.out.print(karakterler[rastgele]);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RastgeleKarakter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("");
        }
        public String cumleKur(int kacKelime,int kacharf){
            String kelimeler="";
            for (int i = 0; i < kacKelime; i++) {
                for (int j = 0; j < kacharf; j++) {
                    if (j==0 && i== 0) rastgele = buyukRasgeleOlustur();
                    else rastgele = kucukRasgeleOlustur();
                        rastgele = (char)kelime;
                        kelimeler += kelime;
                    }
                if (i== kacKelime-1) {
                    kelimeler += ".";
                }
                else  kelimeler += " ";  
                }
                return  kelimeler;
            }
}
