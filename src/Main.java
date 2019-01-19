import java.util.Scanner;

public class Main {

    public int he_so = 10;

    public final static String  mua_xuan = "mua_xuan";

    public enum seasion{mua_xuan,mua_he,mua_thu,mua_dong};

    public static void main(String[] args) {
        //System.out.println("Hello World! 2");

        Main x = new Main();
        //x.he_so = 100;
       // x.he_so_mac_dinh = 20;
        if(x.he_so == 100){
            System.out.println("he so la: "+ x.he_so + " va he so mac dinh: "+ seasion.mua_xuan);
        }else if(x.he_so == 20){
            System.out.println("he so la: "+ x.he_so + " va he so mac dinh: "+ seasion.mua_he);
        }else{
            System.out.println("he so la: "+ x.he_so + " va he so mac dinh: "+ seasion.mua_dong);
        }
        Scanner scanner = new Scanner(System.in);

        switch (x.he_so){
            case 100: System.out.println("he so 100");break;
            default: System.out.println("he so khac");
        }

    }

    public int tinh_gt(){
        return  0;
    }
}
