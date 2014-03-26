package fr.upem.robot.server.interceptor;

import org.omg.CORBA.LocalObject;
import org.omg.IOP.ServiceContext;
import org.omg.PortableInterceptor.ForwardRequest;
import org.omg.PortableInterceptor.ServerRequestInfo;
import org.omg.PortableInterceptor.ServerRequestInterceptor;

public class InterceptorServer extends LocalObject implements ServerRequestInterceptor {

    private static final long serialVersionUID = 5575463695935701789L;

    public InterceptorServer() {
    }

    @Override
    public void receive_request_service_contexts(ServerRequestInfo ri) throws ForwardRequest {
    }

    @Override
    public void receive_request(ServerRequestInfo ri) throws ForwardRequest {
        ServiceContext serviceContext = ri.get_request_service_context(12);
        String message = new String(serviceContext.context_data);
        System.out.println("receive_request: " + message);
    }

    @Override
    public void send_reply(ServerRequestInfo ri) {
    }

    @Override
    public void send_exception(ServerRequestInfo ri) throws ForwardRequest {
    }

    @Override
    public void send_other(ServerRequestInfo ri) throws ForwardRequest {
    }

    @Override
    public String name() {
        return "InterceptorServer";
    }

    @Override
    public void destroy() {
    }

}
