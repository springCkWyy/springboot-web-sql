package org.eBike;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * Created by sang on 16-12-21.
 */
@Component
public class CustomServletContainer implements EmbeddedServletContainerCustomizer {
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8443);
		container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
		container.setSessionTimeout(10, TimeUnit.MINUTES);
	}
}
