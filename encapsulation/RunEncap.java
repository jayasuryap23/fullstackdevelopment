package encapsulation;

public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap  =  new EncapTest();
        encap.setName("james");
        encap.setAge(20);
        encap.setIdNum("1234ms");
        System.out.println("Name :"+encap.getName()+" Age :"+encap.getAge());
    }
}
