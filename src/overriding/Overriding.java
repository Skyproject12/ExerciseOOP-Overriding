package overriding;



class dataA {
   public void tampil(){
       System.out.println("lonovo A eror");
   } 
}
class dataB extends dataA{
    public void tampil(){
        super.tampil();
        System.out.println("lenovo B eror");
    }
}

public class Overriding {

    public static void main(String[] args) {
        dataB eror= new dataB();
        eror.tampil();
    }
    
}
