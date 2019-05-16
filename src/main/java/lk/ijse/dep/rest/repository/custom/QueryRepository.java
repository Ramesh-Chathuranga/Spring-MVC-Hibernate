package lk.ijse.dep.rest.repository.custom;

import lk.ijse.dep.rest.entity.CustomEntity;
import lk.ijse.dep.rest.repository.SuperRepository;

import java.util.List;
import java.util.Optional;

public interface QueryRepository extends SuperRepository {

    Optional<List<CustomEntity>> findOrderDetailsWithItemDescriptions(String orderId) throws Exception;

    Optional<List<CustomEntity>> findAllOrdersWithCustomerNameAndTotal() throws Exception;

}
