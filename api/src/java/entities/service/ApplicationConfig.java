/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Monsieur_Fall
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(entities.service.AddressFacadeREST.class);
        resources.add(entities.service.BondsFacadeREST.class);
        resources.add(entities.service.BuyFacadeREST.class);
        resources.add(entities.service.CategoriesFacadeREST.class);
        resources.add(entities.service.DeliveryFacadeREST.class);
        resources.add(entities.service.DeliverymanFacadeREST.class);
        resources.add(entities.service.ProductsFacadeREST.class);
        resources.add(entities.service.ProvidersFacadeREST.class);
        resources.add(entities.service.SalesFacadeREST.class);
        resources.add(entities.service.UsersFacadeREST.class);
    }
    
}
