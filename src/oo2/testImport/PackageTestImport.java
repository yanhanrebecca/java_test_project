package oo2.testImport;
import  oo2.pt.PackageTest;
public class PackageTestImport {
    public static void main(String args[]){
        PackageTest p = new PackageTest();
        //p.pri_i = 10;
        p.setPri_i(10);
        //p.pro_i = 20;
        //p.i = 30;
        p.pub_i = 10;
        p.show();
    }
}
