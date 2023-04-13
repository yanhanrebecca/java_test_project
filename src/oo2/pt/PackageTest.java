package oo2.pt;

public class PackageTest {
    private int pri_i = 1;
    protected int pro_i = 2;
    int i = 3;
    public int pub_i = 4;
    public PackageTest(){}
    public void show(){
        System.out.println(pri_i);
        System.out.println(pro_i);
        System.out.println(i);
        System.out.println(pub_i);
    }
    public int getPri_i(){
        return pri_i;
    }
    public void setPri_i(int pri_i){
        if (pri_i >= 0){
            this.pri_i = pri_i;
        }
        else{
            System.out.println("ERROR!!");
        }
    }

}
