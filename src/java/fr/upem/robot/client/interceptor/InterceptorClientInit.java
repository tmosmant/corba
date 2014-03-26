package fr.upem.robot.client.interceptor;

import org.omg.CORBA.LocalObject;
import org.omg.PortableInterceptor.ORBInitInfo;
import org.omg.PortableInterceptor.ORBInitializer;

public class InterceptorClientInit extends LocalObject implements
		ORBInitializer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1239250198340145646L;

	@Override
	public void pre_init(ORBInitInfo info) {
		
	}

	@Override
	public void post_init(ORBInitInfo info) {
		System.out.println("Interceptor Client post_init()");
		try {
			InterceptorClient interceptor = new InterceptorClient();
			info.add_client_request_interceptor(interceptor);
		} catch (Exception ex) {
		}
	}

}
