interface RBI {
    public void dispData();
    public void roi();
}

interface Govt {
    public void dispData();
    public void kyc();
}

class ICICI implements RBI, Govt {

    @Override
    public void dispData() {
        System.out.println("disp data");
        
    }

    @Override
    public void kyc() {
        System.out.println("Kyc");
    }
    
    @Override
    public void roi() {
        System.out.println("roi");
        
    }
    
}

class Pro4 {
    public static void main(String[] args) {
        ICICI obj=new ICICI();
        obj.dispData();
        obj.kyc();
        obj.roi();
    }

}
