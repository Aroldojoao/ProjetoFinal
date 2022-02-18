package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.NameOwner;

@Repository
public interface NameOwnerRepository extends JpaRepository<NameOwner, Long>
{
	

}
