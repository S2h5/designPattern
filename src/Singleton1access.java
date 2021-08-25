public class Singleton1access {
    public static void main(String[] args) {
        
        Singleton1 instance = Singleton1.getInstance();
        System.out.println(instance);
        Singleton1 secondInstance = Singleton1.getInstance();
        System.out.println(secondInstance);
    }
    
}
