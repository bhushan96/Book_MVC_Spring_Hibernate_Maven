package com.cts.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { HibernateConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]{WebMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}

//	public void onStartup(ServletContext container) throws ServletException {
//
//		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//		ctx.register(WebMvcConfig.class);
//		ctx.setServletContext(container);
//
//		ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
//
//		servlet.setLoadOnStartup(1);
//		servlet.addMapping("/");
//	}
	
	

}