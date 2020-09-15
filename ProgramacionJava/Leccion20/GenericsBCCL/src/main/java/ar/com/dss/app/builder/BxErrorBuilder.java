package ar.com.dss.app.builder;

import ar.com.dss.app.BxError;
import ar.com.dss.app.HeaderBxResponse;


public class BxErrorBuilder extends HeaderBxResponseBuilder {

   private BxError error;

   public BxErrorBuilder(HeaderBxResponse respuesta) {
      this.error = new BxError();
      this.response = respuesta;
      this.response.setError(this.error);
   }

   /**
    * Solo asigna el estado (HTTP_STATUS)
    * @param estado
    * @return
    */
   public BxErrorBuilder conEstado(int estado) {
      this.error.setStatus(estado);
      return this;
   }

   /**
    * Solo asigna codigo
    * @param codigo
    * @return
    */
   public BxErrorBuilder conCodigo(String codigo) {
      this.error.setCode(codigo);
      return this;
   }

   /**
    * Solo asigna mensaje
    * @param mensaje
    * @return
    */
   public BxErrorBuilder conMensaje(String mensaje) {
      this.error.setMessage(mensaje);
      return this;
   }

   /**
    * Solo asigna mensaje extra�do de la excepcion
    * @param debugMensaje
    * @return
    */
   public BxErrorBuilder conDebugMensaje(String debugMensaje) {
      this.error.setDebugMessage(debugMensaje);
      return this;
   }



}
