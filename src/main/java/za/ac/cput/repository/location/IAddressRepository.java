package za.ac.cput.repository.location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.location.Address;
import za.ac.cput.repository.IRepository;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/*
IAddressRepository.java
@Author Themba Khanyile
Student Number: 217238173
Date: 11 June 2022
 */
@NoRepositoryBean
@Repository
public interface IAddressRepository extends JpaRepository<Address,String>
{

    //List<Address> findAll();
    //public Set<Address> getAll();
public List<Address> findAll();
public List<Address> getUnitNumber();
    //List<Address> find(String unitNumber);

   //Address save(Address address);

   //List<Address> findById(String unitNumber);

   Optional<Address> findById(String unitNumber);
}
