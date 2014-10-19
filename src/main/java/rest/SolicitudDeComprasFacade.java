/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.SolicitudDeCompras;

/**
 *
 * @author 0van
 */
@Stateless
public class SolicitudDeComprasFacade extends AbstractFacade<SolicitudDeCompras> {
    @PersistenceContext(unitName = "com.mycompany_prueba_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SolicitudDeComprasFacade() {
        super(SolicitudDeCompras.class);
    }
    
}
