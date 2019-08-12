/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author Diego
 */
@Stateless
@WebService(endpointInterface = "beans.SumServiceWS")
public class SumServiceWSImpl implements SumServiceWS {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
    
}
