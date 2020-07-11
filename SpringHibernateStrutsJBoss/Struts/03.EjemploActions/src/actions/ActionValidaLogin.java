/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Almis
 */
public class ActionValidaLogin extends Action {
    @Override
    public ActionForward execute(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response
    ) throws Exception {
        
        String user = "dscifo";
        String psw = "123";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        if ( user.equals(usuario) && psw.equals(password) ) {
            return mapping.findForward("valido");
        } else {
            request.setAttribute("message", "Error en las credenciales!");
            return mapping.findForward("noValido");
        }
    }
}
