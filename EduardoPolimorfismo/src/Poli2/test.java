package Poli2;

public class test {
    public static void main(String[] args) {
        Buceador b = new Buceador("Paco");
        b.buceo();
        Bucear.buceoEstatico();
        Bucear intBucear = new Buceador("Paco");
        System.out.println(intBucear);
    }
}
