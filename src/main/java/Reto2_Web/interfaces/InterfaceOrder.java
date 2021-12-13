/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2_Web.interfaces;

import Reto2_Web.modelo.Order;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author USUARIO
 */
public interface InterfaceOrder extends MongoRepository<Order, Integer> {
   List<Order> findBySalesManZone(String zone);
   
   
}
