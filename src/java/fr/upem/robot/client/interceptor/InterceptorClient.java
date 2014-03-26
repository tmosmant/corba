package fr.upem.robot.client.interceptor;

import org.omg.CORBA.LocalObject;
import org.omg.IOP.ServiceContext;
import org.omg.PortableInterceptor.ClientRequestInfo;
import org.omg.PortableInterceptor.ClientRequestInterceptor;
import org.omg.PortableInterceptor.ForwardRequest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InterceptorClient extends LocalObject implements ClientRequestInterceptor {

    private static final long serialVersionUID = -6011895036882895311L;

    public InterceptorClient() {
    }

    @Override
    public void send_request(ClientRequestInfo ri) throws ForwardRequest {
        String computername = null;
        try {
            computername = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        ServiceContext context = new ServiceContext();
        context.context_data = computername.getBytes();
        context.context_id = 12;
        ri.add_request_service_context(context, false);
    }

    @Override
    public void send_poll(ClientRequestInfo ri) {
        // TODO Auto-generated method stub

    }

    @Override
    public void receive_reply(ClientRequestInfo ri) {
        // TODO Auto-generated method stub

    }

    @Override
    public void receive_exception(ClientRequestInfo ri) throws ForwardRequest {
        // TODO Auto-generated method stub

    }

    @Override
    public void receive_other(ClientRequestInfo ri) throws ForwardRequest {
        // TODO Auto-generated method stub

    }

    @Override
    public String name() {
        return "InterceptorClient";
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
    }

}
