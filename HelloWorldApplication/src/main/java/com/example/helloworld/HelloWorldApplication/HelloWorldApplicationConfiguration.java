package com.example.helloworld.HelloWorldApplication;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;

public class HelloWorldApplicationConfiguration extends Configuration {
    // TODO: implement service configuration
	
	@NotEmpty
	private String template;
	
	@NotEmpty
	private String defaultName = "Stranger";
	
	@JsonProperty
	public String getTemplate(){
		return template;
	}
	
	@JsonProperty
	public void setTemplate(String template){
		this.template = template;
	}
	
	@JsonProperty
	public String getDefaultName(){
		return defaultName;
	}
	
	@JsonProperty
	public void setDefaultName(String defaultName){
		this.defaultName = defaultName;
	}
	
}
