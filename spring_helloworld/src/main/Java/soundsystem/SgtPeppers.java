package soundsystem;
import org.springframework.stereotype.Component;

// @Component注解。这个简单的注解表明该类会作为组件类，并告知Spring要为这个类创建bean。
// 不过，组件扫描默认是不启用的。我们还需要显式配置一下Spring，
// 从而命令它去寻找带有@Component注解的类，并为其创建bean。
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
  
    public void play() {
        System.out.print("Playing " + title + " by " + artist);
    }
  
}
