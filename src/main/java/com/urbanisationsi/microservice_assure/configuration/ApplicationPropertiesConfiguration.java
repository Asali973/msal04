/**
 * 
 */
package com.urbanisationsi.microservice_assure.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author Stagiaite
 *
 */
@Component
@ConfigurationProperties("urbanisation-si.clairprev")
public class ApplicationPropertiesConfiguration {
	
	private int limiteNombreAssure;

	public int getLimiteNombreAssure() {
		return limiteNombreAssure;
	}

	public void setLimiteNombreAssure(int limiteNombreAssure) {
		this.limiteNombreAssure = limiteNombreAssure;
	}
	
	

}
