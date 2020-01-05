import com.terr.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTset {
    public static void main(String[] args) {
        //获取Spring的上下文对象!
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们对象都在Spring中管理,我们要使用都去Spring中取出来就可以了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
