package com.oauth.authorizationserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@Configuration
public class MyAuthorizationServer extends AuthorizationServerConfigurerAdapter{
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		
		clients.inMemory()
		 .withClient("satishcapp")
		 .secret("satish123")
		 .redirectUris("http://localhost:5000/callback")
		 .authorizedGrantTypes("authorization_code")
		// .accessTokenValiditySeconds(120)
		 .scopes("read_profile", "read_contacts"); 
	}
}
