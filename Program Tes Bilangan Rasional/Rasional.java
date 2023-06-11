public class Rasional{
    private int pembilang, penyebut;
    private int pem1,pen1;
    public Rasional(){
        pembilang=0;
        penyebut=0;
    }
    public Rasional(int pbl, int pyb){
        pembilang=pbl;
        penyebut=pyb;
     }
     //mengecek suatu bilangan adalah rasional atau bukan
     public boolean isRasional(){
     return (penyebut!= 0);
     }
     //menyederhanakan bilangan rasional
     public void Sederhana(){
     int temp, A, B;
     if (penyebut ==0){
     return;
     }
     A = (pembilang<penyebut) ? penyebut:pembilang;
     B = (pembilang<penyebut) ? pembilang:penyebut;
    
    for (temp = 0; B !=0; temp = A%B, A = B, B = temp){

    }

    pembilang /=A;
    penyebut /=A;
    pem1=pembilang;
    pen1=penyebut;
    }


    public double Cast(){
    return (penyebut==0.0) ? 0.0 : (double)pembilang /
    (double)penyebut;
    }

    //operator >
    public boolean moreThan (Rasional A){
    return (pembilang * A.penyebut > penyebut * A.pembilang
    );
    }

    //operator Unary- ---> A = -A
    public void negasi(){
        pembilang = - pembilang;
    }

    //oprator <
    public boolean lessThan (Rasional A){
    return (pembilang * A.penyebut < penyebut * A.pembilang
    );
    }

    //oprator >=
    public boolean moreOrEqual (Rasional A){
    return (pembilang * A.penyebut >= penyebut * A.pembilang
    );
    }    

    //oprator <=
    public boolean lessOrEqual (Rasional A){
    return (pembilang * A.penyebut <= penyebut * A.pembilang
    );
    }    

    //oprator -
    public void unaryMin (Rasional A){
        pembilang = penyebut * A.pembilang-pembilang * A.penyebut;
        penyebut *=A.penyebut;
        } 

    //Operator *
    public void multiple(Rasional A){
        pembilang = pembilang*A.pembilang;
        penyebut = pen1*A.penyebut;
        }

    //Operator /
    public void divide(Rasional A){
        pembilang = pem1*A.penyebut;
        penyebut = pen1*A.pembilang;
        }


    //operator unary += \
    public void unaryPlus(Rasional A){
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *=A.penyebut;
    }
    public void cetak(){
    System.out.println(pembilang + "/" + penyebut);
    }
    }
