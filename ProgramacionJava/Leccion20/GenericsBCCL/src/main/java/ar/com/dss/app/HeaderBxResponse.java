package ar.com.dss.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class HeaderBxResponse<T extends BxData> implements Response {

   private static final long serialVersionUID = 7654434915992416276L;

   protected T data;
   protected BxError error;

   @JsonFormat
   protected List<BxMessage> messages;

   public HeaderBxResponse() {
   }

   public T getData() {
      return data;
   }

   public void setData(T data) {
      this.data = data;
   }

   public BxError getError() {
      return error;
   }

   public void setError(BxError error) {
      this.error = error;
   }

   public void addMessage(BxMessage message) {
      if (Objects.isNull(messages)) {
         messages = new ArrayList<>();
      }

      messages.add(message);
   }

   @Override
   public String toString() {
      return "HeaderBxResponse [data=" + data + ", error=" + error + ", messages=" + messages + "]";
   }

}
