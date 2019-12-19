package com.example.image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AccuntRepository extends JpaRepository<AccountEntity, Integer> {

}
