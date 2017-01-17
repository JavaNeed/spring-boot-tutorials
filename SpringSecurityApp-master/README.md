# SpringSecurityApp
Spring Security for Spring MVC 4 Application Simple Example using Spring Boot

Step by Step tutorial with demo at http://www.programming-free.com/2015/08/spring-security-for-spring-mvc-4.html


Reference URL: https://dzone.com/articles/spring-security-in-mvc-4-using-spring-boot

```
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/home")
		.permitAll().anyRequest()
		.authenticated().and().formLogin()
		.loginPage("/login").permitAll()
		.and().logout()
		.permitAll();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/css/*");
	}
}
```


```
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/login").setViewName("login");
	}

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
```


App URL: http://localhost:8080/
user/password
