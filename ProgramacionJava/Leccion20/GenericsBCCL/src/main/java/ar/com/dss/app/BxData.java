package ar.com.dss.app;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BxData implements Response {

    private static final long serialVersionUID = 7236792385724199047L;

}
