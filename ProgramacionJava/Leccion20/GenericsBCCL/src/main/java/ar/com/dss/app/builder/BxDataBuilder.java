package ar.com.dss.app.builder;

import ar.com.dss.app.BxData;
import ar.com.dss.app.HeaderBxResponse;

public class BxDataBuilder extends HeaderBxResponseBuilder {

    public BxDataBuilder(HeaderBxResponse respuesta) {
        this.response = respuesta;
    }

    public BxMessageBuilder conDatos(BxData data) {
        this.response.setData(data);
        return new BxMessageBuilder(response);
    }

    public BxMessageBuilder sinDatos() {
        return new BxMessageBuilder(response);
    }

}
