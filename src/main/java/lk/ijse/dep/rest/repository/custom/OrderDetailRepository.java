package lk.ijse.dep.rest.repository.custom;

import lk.ijse.dep.rest.entity.OrderDetail;
import lk.ijse.dep.rest.entity.OrderDetailPK;
import lk.ijse.dep.rest.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, OrderDetailPK> {

    Optional<List<OrderDetail>> find(String orderId) throws Exception;

}
