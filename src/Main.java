public class Main extends ClassLoader{
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
