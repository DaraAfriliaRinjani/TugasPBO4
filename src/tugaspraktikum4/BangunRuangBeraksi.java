package tugaspraktikum4;

public class BangunRuangBeraksi {
    public static void main(String[] args){
        BangunRuang bgr = new BangunRuang(5);
        BangunRuang bgr1 = new BangunRuang(5,6,7);
        
        System.out.println("volume Kubus : " + bgr.VolumeKubus());
        System.out.println("volume balok : " + bgr.VolumeBalok());
        
        System.out.println(" ");
        
        System.out.println("Luas Permukaan Kubus : " + bgr.LuasPermukaanKubus());
        System.out.println("Luas Permukaan Balok : " + bgr.LuasPermukaanBalok());
    }
    
}
