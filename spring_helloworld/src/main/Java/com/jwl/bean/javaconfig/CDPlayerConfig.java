package com.jwl.bean.javaconfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {


	// @Bean 注解会告诉Spring这个方法将会返回一个对象，该对象要注册为Spring应用上下文中的 bean 。
	// 方法体中包含了最终产生 bean 实例的逻辑。
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

	/**     以下的3个方法选择一个，然后注释掉其余的2个去执行，不要全留下来      **/

	// 声明 CDPlayer bean，它依赖于 CompactDisc
	// 在 JavaConfig 中装配bean的最简单方式就是引用创建 bean 的方法
	@Bean
	public CDPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}

	// 通过spring生成的bean默认都是单例的，spring会进行拦截
	// anothercdPlayer 和 cdPlayer 方法在进行调用时，返回的是同一个实例
	@Bean
	public CDPlayer anothercdPlayer() {
		return new CDPlayer(sgtPeppers());
	}

	// spring通过这种方法也可以将 CompactDisc 注入到 CompactDisc 的构造器中去
	// 而且不用明确引用 CompactDisc 的bean方法
	// 通过这种方式引用其他的bean通常是最佳的选择，因为它不会要求
	// 将CompactDisc声明到同一个配置类之中
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}

}
