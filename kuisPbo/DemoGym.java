package kuisPbo;
import java.util.*;

public class DemoGym {
    public static void main(String[] args) {
        MemberBulanan mem1 = new MemberBulanan("farhan", "123", 100000);
        MemberHarian member1 =new MemberHarian("fikri", "222", 10000, 7);

        ArrayList<Object> daftarStruk = new ArrayList<>();
        daftarStruk.add(0,mem1);
        daftarStruk.add(1,member1 );

        for (int i = 0; i < 2; i++) {
            System.out.println(daftarStruk);
        }
    }
}
