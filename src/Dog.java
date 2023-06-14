public class Dog {
    public static void main(String [] args ){
        Human human = new Human();
        human.setName("phạm văn trơn");
        Human human1 = new Human();
        human1.setName("truong day");
        Human human2 = new Human();
        human2.setName("truong khong chan");
        Person person = new Person();
        person.setName("truong");
        System.out.println("tên tôi là  "+human.getName());
        System.out.println("tên tôi là  "+human1.getName());
        System.out.println(" tên tôi là  "+human2.getName());
        System.out.println("tên tôi là "+person.getName());

    }
}
