package lk.ijse.dep.rest.repository.custom;

import lk.ijse.dep.rest.entity.Order;
import lk.ijse.dep.rest.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String> {

    int count() throws Exception;

}
