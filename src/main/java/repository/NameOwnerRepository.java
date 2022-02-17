package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.NameOwner;

public interface NameOwnerRepository extends JpaRepository<NameOwner, Long>
{

}
