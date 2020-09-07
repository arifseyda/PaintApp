import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        RastgeleKarakter r = new RastgeleKarakter();
        System.out.println("Rastegele karakter: "+r.rasgeleOlustur()); 
        System.out.println("Rastegele karakter: "+r.rasgeleOlustur(2)); 
        System.out.println("Rastgele 3 karakter: "+r.rasgeleOlustur(3));
        System.out.println("Rastgele 3 karakter: "+r.rasgeleOlustur(3));
        r.ikiKarakterArasında('a', 'k');
        r.ikiKarakterArasında('a', 'k', 2);
        r.BelirtilenKarakterler('g','y','u','c','n','e');
        r.BelirtilenKarakterler('g','y','u','c','n','e');
        r.BelirtilenKarakterler(2,'g','y','u','c','n','e');
        System.out.println("Cümle: "+ r.cumleKur(4, 5)); 
        System.out.println("Rastgele karakter:  " + r.getRandomCharacter());
        System.out.println("Rastgele karakter:  " + r.getRandomCharacter(2));
        System.out.println("Rastgele 3 karakter: " + r.getRandomCharacter(3));
        System.out.println("Rastgele 3 karakter: " + r.getRandomCharacter(3));
}
}
