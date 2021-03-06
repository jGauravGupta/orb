// Tie class generated by rmic, do not edit.
// Contents subject to change without notice.

package org.glassfish.rmic.classes.primitives;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.rmi.CORBA.Tie;
import javax.rmi.CORBA.Util;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.CORBA.ORB;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;
import org.omg.CORBA.portable.UnknownException;
import org.omg.CORBA_2_3.portable.ObjectImpl;


public class _RmiTestRemoteImpl_Tie extends ObjectImpl implements Tie {
    
    volatile private RmiTestRemoteImpl target = null;
    
    private static final String[] _type_ids = {
        "RMI:org.glassfish.rmic.classes.primitives.RmiTestRemote:0000000000000000"
    };
    
    public void setTarget(Remote target) {
        this.target = (RmiTestRemoteImpl) target;
    }
    
    public Remote getTarget() {
        return target;
    }
    
    public org.omg.CORBA.Object thisObject() {
        return this;
    }
    
    public void deactivate() {
        _orb().disconnect(this);
        _set_delegate(null);
        target = null;
    }
    
    public ORB orb() {
        return _orb();
    }
    
    public void orb(ORB orb) {
        orb.connect(this);
    }
    
    public String[] _ids() { 
        return (String[]) _type_ids.clone();
    }
    
    public OutputStream  _invoke(String method, InputStream _in, ResponseHandler reply) throws SystemException {
        try {
            RmiTestRemoteImpl target = this.target;
            if (target == null) {
                throw new java.io.IOException();
            }
            org.omg.CORBA_2_3.portable.InputStream in = 
                (org.omg.CORBA_2_3.portable.InputStream) _in;
            switch (method.length()) {
                case 8: 
                    if (method.equals("test_int")) {
                        int arg0 = in.read_long();
                        int result = target.test_int(arg0);
                        OutputStream out = reply.createReply();
                        out.write_long(result);
                        return out;
                    }
                case 9: 
                    if (method.equals("test_ping")) {
                        target.test_ping();
                        OutputStream out = reply.createReply();
                        return out;
                    }
            }
            throw new BAD_OPERATION();
        } catch (SystemException ex) {
            throw ex;
        } catch (Throwable ex) {
            throw new UnknownException(ex);
        }
    }
}
