import java.io.File;
import java.lang.reflect.*;
import java.net.URL;
import java.net.URLClassLoader;

public class MainApp {
    public static void main(String[] args) throws Exception {
        Class classCat = Cat.class;
        Method[] methods = classCat.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        Cat cat1 = new Cat(1, 2, 3);
        int i = 0;
        for (Method m : methods) {
            if (methods[i].getModifiers() == 1) {
                methods[i].invoke(cat1);
            } else {
                methods[i].setAccessible(true);
                methods[i].invoke(cat1);
            }
            i++;
        }

        // вызов конструктора
        Cat cat2 = (Cat) classCat.getConstructor(int.class, int.class, int.class)
                .newInstance(20, 30, 40);

        ClassLoader classLoader = new URLClassLoader(new URL[]{new File("C:/temp").toURL()});
        // это должен быть именно файл с расширение .class, собранный в java
        // файл с расширением .java необязательно класть в каталог
        Class humanClass = classLoader.loadClass("Human");
        Object humanObj = humanClass.getConstructor(String.class, int.class)
                .newInstance("Bob", 30);
        Method greetingsMethod = humanClass.getDeclaredMethod("greetings");
        greetingsMethod.invoke(humanObj);

        // вызов полей Field
        Field[] fields = classCat.getFields();
    }
}
