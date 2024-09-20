package tugaspraktikum4;

public class BangunRuang {
    double s, p, l, t;
    
    public BangunRuang (double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
}
    public BangunRuang (double s){
        this.s = s;
    }
    public double VolumeKubus(){
        return s * s * s;
    }
    public double VolumeBalok(){
        return p * l * t;
    }
    public double LuasPermukaanKubus(){
        return 6 * s;
    }
    public double LuasPermukaanBalok(){
        return 2*(p * t) + (1 * t);
    }
    
}
