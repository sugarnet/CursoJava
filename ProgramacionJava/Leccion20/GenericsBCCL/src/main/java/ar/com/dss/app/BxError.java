package ar.com.dss.app;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author dscifo
 */
@JsonInclude(Include.NON_NULL)
public class BxError implements Response {

    private static final long serialVersionUID = 7930709198678337103L;

    private int status;
    private LocalDateTime timestamp;
    private String code;
    private String message;
    private String debugMessage = "";

    public BxError() {
        timestamp = LocalDateTime.now();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getDebugMessage() {
        return debugMessage;
    }

    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }

    @Override
    public String toString() {
        return "BxError [status=" + status + ", timestamp=" + timestamp + ", code=" + code + ", message=" + message + ", debugMessage=" + debugMessage
                + "]";
    }

}
