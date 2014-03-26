package fr.upem.robot.server.interceptor;

import org.omg.CORBA.LocalObject;
import org.omg.PortableInterceptor.ORBInitInfo;
import org.omg.PortableInterceptor.ORBInitializer;

public class InterceptorServerInit extends LocalObject implements
		ORBInitializer {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8485417800439486389L;

	@Override
	public void pre_init(ORBInitInfo info) {

	}

	@Override
	public void post_init(ORBInitInfo info) {
		try {
			InterceptorServer interceptor = new InterceptorServer();
			info.add_server_request_interceptor(interceptor);
		} catch (Exception ex) {
		}
	}

}
