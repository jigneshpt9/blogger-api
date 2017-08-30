package com.cisco.blogger.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.cisco.blogger.rs.BlogOperationsRootResource;
import com.cisco.blogger.rs.UserRootResource;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
    	packages("com.cisco.blogger.rs");
      

    }

  

}
