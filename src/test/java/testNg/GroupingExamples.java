package testNg;

import org.testng.annotations.Test;

public class GroupingExamples {
    @Test(groups = {"apple"})
    public void apple() {
        System.out.println("apple");
    }
    @Test(groups = {"apple"})
    public void apple2() {
        System.out.println("apple2");
    }
    @Test(groups = {"moto"})
    public void moto1() {
        System.out.println("moto1");
    }
    @Test(groups = {"moto"})
    public void moto2() {
        System.out.println("moto2");
    }
    @Test(groups = {"vivo"})
    public void vivo1() {
        System.out.println("vivo1");
    }
    @Test(groups = {"vivo"})
    public void vivo2() {
        System.out.println("vivo2");
    }
    @Test(groups = {"samsung"})
    public void samsung1() {
        System.out.println("samsung1");
    }
    @Test(groups = {"samsung"})
    public void samsung2() {
        System.out.println("samsung2");
    }
    @Test(groups = {"oneplus"})
    public void oneplus1() {
        System.out.println("oneplus1");
    }
    @Test(groups = {"oneplus"})
    public void oneplus2() {
        System.out.println("oneplus2");
    }





}
