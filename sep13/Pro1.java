//multilevel inheritance
class Grand{
    //acces modifier
    private int num1=100;
}

class Parent extends Grand{
    public void dispParent(){
        // System.out.println(num1);
    }
}

class Child extends Parent{

}
class Pro1{
    public static void main(String[] args){
        Child obj=new Child();
        obj.dispParent();
        
    }
}

// remove data from appdata -> code => delete all files
// remvoe data from users -> .vscode -> extions =>delete all files