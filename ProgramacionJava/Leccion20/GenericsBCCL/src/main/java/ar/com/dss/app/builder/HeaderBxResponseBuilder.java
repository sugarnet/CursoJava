package ar.com.dss.app.builder;

import ar.com.dss.app.HeaderBxResponse;

public class HeaderBxResponseBuilder {

    protected HeaderBxResponse response;

    public HeaderBxResponseBuilder() {
        this.response = new HeaderBxResponse();
    }

    public BxDataBuilder ok() {
        return new BxDataBuilder(response);
    }

    public BxErrorBuilder error() {
        return new BxErrorBuilder(response);
    }

    public HeaderBxResponse build() {
        return response;
    }

    public static class Factory {

        public static HeaderBxResponseBuilder newHeaderBxResponseBuilder() {
            return new HeaderBxResponseBuilder();
        }
    }
}
