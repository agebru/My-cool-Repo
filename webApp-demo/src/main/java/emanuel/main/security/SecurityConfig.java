package emanuel.main.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
        .withUser("Emanuel").password("emanuel123").roles("ADMIN")
        .and()
        .withUser("User").password("user123").roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 http
		 .httpBasic()
		 .and()
	        .authorizeRequests() 	       
	        .antMatchers("/employees","/").permitAll()
	        .antMatchers("/employees/delete/{id}").hasRole("ADMIN")
	        .antMatchers("/employees/company/{companyId}","/employees/{empId}").hasRole("USER");
	       
	       
	}

}
