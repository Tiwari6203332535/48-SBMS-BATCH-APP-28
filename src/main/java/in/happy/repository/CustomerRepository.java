package in.happy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.happy.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
