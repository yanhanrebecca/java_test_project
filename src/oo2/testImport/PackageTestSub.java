package oo2.testImport;
import  oo2.pt.PackageTest;
public class PackageTestSub extends PackageTest{
    public static void main(String [] args){
        PackageTestSub p = new PackageTestSub();
        //p.pri_i = 10;
        p.pro_i = 20;
        //p.i = 30;
        p.pub_i = 40;
        p.show();
    }
}
