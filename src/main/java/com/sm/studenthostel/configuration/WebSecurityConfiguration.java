package com.sm.studenthostel.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfiguration {

  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    //noinspection Convert2MethodRef
    return http.authorizeHttpRequests(requestMatcherRegistry -> requestMatcherRegistry.anyRequest()
                                                                                      .permitAll())
               .csrf(csrfConfigurer -> csrfConfigurer.disable())
               .build();
  }

}
