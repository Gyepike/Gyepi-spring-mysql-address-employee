package com.anti.Gyepispringmysqladddressemployee.repository;

import com.anti.Gyepispringmysqladddressemployee.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
