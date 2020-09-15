package ar.com.dss.app;

import ar.com.dss.app.builder.HeaderBxResponseBuilder;

public class MensajeService {

    public HeaderBxResponse error() {
        return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(500)
                .conMensaje("Error")
                .build();
    }

    public HeaderBxResponse ok() {
        final MensajeBxData data = new MensajeBxData();
        data.setMessage("some message");
        return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().ok().conDatos(data).build();
    }

    /*
   public HeaderBxResponse guardarMensaje(MensajeBxRequest request) {
      ConsultaMensajeDTO dto = MensajeTransformer.FROM_MENSAJE_BX_REQUEST_TO_CONSULTA_MENSAJE_DTO.apply(request);
      if (!Objects.isNull(dto.getId())) { // editar

         final ConsultaMensajeDTO consultaMensajeDTO = mensajesService.getMensajePorId(dto.getId());
         if (Objects.isNull(consultaMensajeDTO)) { // en caso de que el MensajeModulo que paso NO exista
            LOGGER.error("Mensaje con id {} no encontrado.", dto.getId());
            return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                                  .conMensaje("No existen datos para el Mensaje indicado").build();
         } else { // en caso de que el MensajeModulo que paso exista
            if (!dto.getCodigo().equalsIgnoreCase(consultaMensajeDTO.getCodigo())
                && Objects.nonNull(mensajesService.getMensajePorCodigo(dto.getCodigo()))) { // si paso un codigo diferente
                                                                                                   // valido y esta asignado
               LOGGER.error("Mensaje con codigo {} ya existe.", dto.getCodigo());
               return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                                     .conMensaje("El mensaje con el codigo " + dto.getCodigo() + " a editar ya existe")
                                                     .build();
            }
         }
      } else { // crear
         if (!Objects.isNull(mensajesService.getMensajePorCodigo(dto.getCodigo()))) { // en caso de que el codigo ya este
                                                                                             // asignado
            LOGGER.error("Mensaje con codigo {} ya existe.", dto.getCodigo());
            return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                                  .conMensaje("El mensaje con el codigo " + dto.getCodigo() + " a crear ya existe").build();
         }
      }

      if (Objects.isNull(dto.getMensajeSistemaDTO().getIdMensajeSistema())) {
         LOGGER.error("El campo Sistema para el mensaje esta nulo");
         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                               .conMensaje("El identificador para el campo mensajeSistema no puede ser nulo").build();
      } else {
         final ConsultaMensajeSistemaDTO mensajeSistemaDTO = mensajesService.getMensajeSistemaPorId(dto.getMensajeSistemaDTO().getIdMensajeSistema());
         if (Objects.isNull(mensajeSistemaDTO)) {
            LOGGER.error("Mensaje Sistema con id {} no encontrado.", dto.getMensajeSistemaDTO().getIdMensajeSistema());
            return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                                  .conMensaje("No existen datos para el Mensaje Sistema indicado").build();
         } else {
            dto.setMensajeSistemaDTO(mensajeSistemaDTO);
         }
      }

      dto = mensajesService.guardarMensaje(dto);

      final MensajeBxData data = MensajeTransformer.FROM_CONSULTA_MENSAJE_DTO_TO_MENSAJE_BX_DATA.apply(dto);

      return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().ok().conDatos(data).build();
   }

   public HeaderBxResponse eliminarMensaje(MensajeBxRequest request) {
      ConsultaMensajeDTO dto = MensajeTransformer.FROM_MENSAJE_BX_REQUEST_TO_CONSULTA_MENSAJE_DTO.apply(request);
      if (!Objects.isNull(dto.getId())) {
         dto = mensajesService.getMensajePorId(dto.getId());
      } else {
         LOGGER.error("El id del mensaje no puede ser nulo.");
         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                               .conMensaje("El id no puede ser nulo").build();
      }
      if (Objects.isNull(dto)) {
         LOGGER.error("Mensaje con id {} no encontrado.", request.getId());
         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                               .conMensaje("No existen datos para el Mensaje indicado").build();
      }

      mensajesService.eliminarMensaje(dto);

      final MensajeBxData data = MensajeTransformer.FROM_CONSULTA_MENSAJE_DTO_TO_MENSAJE_BX_DATA.apply(dto);

      return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().ok().conDatos(data).build();
   }

   public HeaderBxResponse getMensajes() {
      MensajesBxData data = MensajeTransformer.FROM_CONSULTA_MENSAJE_DTO_TO_MENSAJES_BX_DATA.apply(mensajesService.getMensajes());
      return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().ok().conDatos(data).build();
   }

   public HeaderBxResponse getMensajePorCodigo(String codigo) {
      if (!Objects.isNull(codigo)) {
         ConsultaMensajeDTO dto = mensajesService.getMensajePorCodigo(codigo);

         if (Objects.isNull(dto)) {
            LOGGER.error("Mensaje con codigo {} no encontrado.", codigo);
            return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                                  .conMensaje("No existen datos para el Mensaje indicado").build();
         }
         final MensajeBxData data = MensajeTransformer.FROM_CONSULTA_MENSAJE_DTO_TO_MENSAJE_BX_DATA.apply(dto);

         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().ok().conDatos(data).build();
      } else {
         LOGGER.error("El codigo del mensaje no puede ser nulo");
         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                               .conMensaje("El codigo no puede ser nulo").build();
      }
   }

   public HeaderBxResponse getMensajePorId(Long id) {
      if (!Objects.isNull(id)) {
         ConsultaMensajeDTO dto = mensajesService.getMensajePorId(id);

         if (Objects.isNull(dto)) {
            LOGGER.error("Mensaje con id {} no encontrado.", id);
            return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                                  .conMensaje("No existen datos para el Mensaje indicado").build();
         }
         final MensajeBxData data = MensajeTransformer.FROM_CONSULTA_MENSAJE_DTO_TO_MENSAJE_BX_DATA.apply(dto);

         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().ok().conDatos(data).build();
      } else {
         LOGGER.error("El id del mensaje no puede ser nulo");
         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                               .conMensaje("El id no puede ser nulo").build();
      }
   }

   public HeaderBxResponse guardarMensajeDeError(MensajeBxRequest request) {
      ConsultaMensajeDTO dto = MensajeTransformer.FROM_MENSAJE_BX_REQUEST_TO_CONSULTA_MENSAJE_DTO.apply(request);
      if (!Objects.isNull(dto.getId())) { // editar

         final ConsultaMensajeDTO consultaMensajeDTO = mensajesService.getMensajeDeErrorPorId(dto.getId());
         if (Objects.isNull(consultaMensajeDTO)) { // en caso de que el MensajeModulo que paso NO exista
            LOGGER.error("Mensaje de error con id {} no encontrado.", dto.getId());
            return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                                  .conMensaje("No existen datos para el Mensaje de error indicado").build();
         } else { // en caso de que el MensajeModulo que paso exista
            if (!dto.getCodigo().equalsIgnoreCase(consultaMensajeDTO.getCodigo())
                && Objects.nonNull(mensajesService.getMensajeDeErrorPorCodigo(dto.getCodigo()))) { // si paso un codigo diferente
                                                                                                   // valido y esta asignado
               LOGGER.error("Mensaje de error con codigo {} ya existe.", dto.getCodigo());
               return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                                     .conMensaje("El mensaje de error con el codigo " + dto.getCodigo() + " a editar ya existe")
                                                     .build();
            }
         }
      } else { // crear
         if (!Objects.isNull(mensajesService.getMensajeDeErrorPorCodigo(dto.getCodigo()))) { // en caso de que el codigo ya este
                                                                                             // asignado
            LOGGER.error("Mensaje de error con codigo {} ya existe.", dto.getCodigo());
            return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                                  .conMensaje("El mensaje de error con el codigo " + dto.getCodigo() + " a crear ya existe").build();
         }
      }

      if (Objects.isNull(dto.getMensajeSistemaDTO().getIdMensajeSistema())) {
         LOGGER.error("El campo Sistema para el mensaje de error esta nulo");
         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                               .conMensaje("El identificador para el campo mensajeSistema no puede ser nulo").build();
      } else {
         final ConsultaMensajeSistemaDTO mensajeSistemaDTO = mensajesService.getMensajeSistemaPorId(dto.getMensajeSistemaDTO().getIdMensajeSistema());
         if (Objects.isNull(mensajeSistemaDTO)) {
            LOGGER.error("Mensaje Sistema con id {} no encontrado.", dto.getMensajeSistemaDTO().getIdMensajeSistema());
            return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                                  .conMensaje("No existen datos para el Mensaje Sistema indicado").build();
         } else {
            dto.setMensajeSistemaDTO(mensajeSistemaDTO);
         }
      }

      dto = mensajesService.guardarMensajeDeError(dto);

      final MensajeBxData data = MensajeTransformer.FROM_CONSULTA_MENSAJE_DTO_TO_MENSAJE_BX_DATA.apply(dto);

      return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().ok().conDatos(data).build();
   }

   public HeaderBxResponse eliminarMensajeDeError(MensajeBxRequest request) {
      ConsultaMensajeDTO dto = MensajeTransformer.FROM_MENSAJE_BX_REQUEST_TO_CONSULTA_MENSAJE_DTO.apply(request);
      if (!Objects.isNull(dto.getId())) {
         dto = mensajesService.getMensajeDeErrorPorId(dto.getId());
      } else {
         LOGGER.error("El id del mensaje de error no puede ser nulo.");
         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                               .conMensaje("El id no puede ser nulo").build();
      }
      if (Objects.isNull(dto)) {
         LOGGER.error("Mensaje de error con id {} no encontrado.", request.getId());
         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                               .conMensaje("No existen datos para el Mensaje de error indicado").build();
      }

      mensajesService.eliminarMensajeDeError(dto);

      final MensajeBxData data = MensajeTransformer.FROM_CONSULTA_MENSAJE_DTO_TO_MENSAJE_BX_DATA.apply(dto);

      return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().ok().conDatos(data).build();
   }

   public HeaderBxResponse getMensajesDeError() {
      MensajesBxData data = MensajeTransformer.FROM_CONSULTA_MENSAJE_DTO_TO_MENSAJES_BX_DATA.apply(mensajesService.getMensajesDeError());
      return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().ok().conDatos(data).build();
   }

   public HeaderBxResponse getMensajeDeErrorPorCodigo(String codigo) {
      if (!Objects.isNull(codigo)) {
         ConsultaMensajeDTO dto = mensajesService.getMensajeDeErrorPorCodigo(codigo);

         if (Objects.isNull(dto)) {
            LOGGER.error("Mensaje de error con codigo {} no encontrado.", codigo);
            return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                                  .conMensaje("No existen datos para el Mensaje indicado").build();
         }
         final MensajeBxData data = MensajeTransformer.FROM_CONSULTA_MENSAJE_DTO_TO_MENSAJE_BX_DATA.apply(dto);

         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().ok().conDatos(data).build();
      } else {
         LOGGER.error("El codigo del mensaje de error no puede ser nulo");
         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                               .conMensaje("El codigo no puede ser nulo").build();
      }
   }

   public HeaderBxResponse getMensajeDeErrorPorId(Long id) {
      if (!Objects.isNull(id)) {
         ConsultaMensajeDTO dto = mensajesService.getMensajeDeErrorPorId(id);

         if (Objects.isNull(dto)) {
            LOGGER.error("Mensaje de error con id {} no encontrado.", id);
            return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                                  .conMensaje("No existen datos para el Mensaje indicado").build();
         }
         final MensajeBxData data = MensajeTransformer.FROM_CONSULTA_MENSAJE_DTO_TO_MENSAJE_BX_DATA.apply(dto);

         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().ok().conDatos(data).build();
      } else {
         LOGGER.error("El id del mensaje de error no puede ser nulo.");
         return HeaderBxResponseBuilder.Factory.newHeaderBxResponseBuilder().error().conEstado(HttpStatus.BAD_REQUEST.value())
                                               .conMensaje("El id no puede ser nulo").build();
      }
   }
     */
}
