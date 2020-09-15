package ar.com.dss.app.builder;

import ar.com.dss.app.BxMessage;
import ar.com.dss.app.HeaderBxResponse;

public class BxMessageBuilder extends HeaderBxResponseBuilder {

    public BxMessageBuilder(HeaderBxResponse respuesta) {
        this.response = respuesta;
    }

    public BxMessageBuilder conMensaje(String codigo, String mensaje) {
        this.response.addMessage(new BxMessage(codigo, mensaje));
        return this;
    }

    @Deprecated
    public BxMessageBuilder conMensaje(String mensaje) {
        this.response.addMessage(new BxMessage("", mensaje));
        return this;
    }

}
