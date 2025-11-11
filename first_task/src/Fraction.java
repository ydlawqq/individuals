public class Fraction {
    private int ch;
    private int zn;

    Fraction(int ch, int zn){
        this.ch = ch;
        this.zn = zn;
    }
    public int getCh(){
        return this.ch;
    }
    public int getZn(){
        return this.zn;
    }
    Fraction Sum(Fraction a){
        int o = this.zn*a.getZn();
        int ch1 = this.ch*a.getZn();
        int ch2 = this.zn*a.getCh();
        return new Fraction(ch1+ch2, o);
        }
    Fraction Diff(Fraction a){
        int o = this.zn*a.getZn();
        int ch1 = this.ch*a.getZn();
        int ch2 = this.zn*a.getCh();
        return new Fraction(ch1-ch2, o);
    }
    Fraction Multiply(Fraction a){
        return new Fraction(this.ch*a.getCh(), this.zn*a.getZn());

    }
    Fraction Division(Fraction a){
        return new Fraction(this.ch*a.getZn(), this.zn*a.getCh());

    }
    String Compare(Fraction a){
        if(this.ch*a.getZn()>a.getCh()*this.zn){
            return "Current Fraction bigger";
        }
        if(this.ch*a.getZn()<a.getCh()*this.zn){
            return "Current Fraction less";
        }
        return "Fractions same";

    }





    }





