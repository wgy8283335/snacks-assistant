package com.coconason.snacksassistantconsumer.filter;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*", filterName = "SnacksAssistantConsumerFiler")
public class SnacksAssistantConsumerFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
						 FilterChain chain) throws IOException, ServletException {
		HystrixRequestContext ctx = HystrixRequestContext.initializeContext();
		try {
			System.out.println("####################################################"+ctx);
			chain.doFilter(request, response);
		} catch (Exception e) {
			
		} finally {
			ctx.shutdown();
		}
	}

	public void destroy() {
		
	}

}
