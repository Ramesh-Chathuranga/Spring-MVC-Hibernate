package lk.ijse.dep.rest.repository.custom.impl;

import lk.ijse.dep.rest.entity.Customer;
import lk.ijse.dep.rest.repository.CrudRepositoryImpl;
import lk.ijse.dep.rest.repository.custom.CustomerRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl extends CrudRepositoryImpl<Customer, String> implements CustomerRepository {

}
