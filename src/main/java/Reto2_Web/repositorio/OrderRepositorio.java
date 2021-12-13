/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.InterfaceOrder;
import Reto2_Web.modelo.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class OrderRepositorio {
    @Autowired
    private InterfaceOrder interfaceOrder;
    
    public List<Order> getAll(){
        return interfaceOrder.findAll();
    }
    
      public Optional<Order> getOrder(Integer id){
        return interfaceOrder.findById(id);
    }
           
    public Order create(Order order) {
        return interfaceOrder.save(order);
    }

    public void update(Order order) {
        interfaceOrder.save(order);
    }
    
    public void delete(Order order) {
        interfaceOrder.delete(order);
    }
    
   
    public List<Order> getOrderByZone(String zone){
        return interfaceOrder.findBySalesManZone(zone);
    }
 
}
