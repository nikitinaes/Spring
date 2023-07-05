import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        boolean helloComparison = bean == bean1;
        System.out.println(helloComparison);
        Cat cat1 = (Cat) applicationContext.getBean(Cat.class);
        Cat cat2 = (Cat) applicationContext.getBean(Cat.class);
        boolean catComparison = cat1 == cat2;
        System.out.println(catComparison);

    }
}