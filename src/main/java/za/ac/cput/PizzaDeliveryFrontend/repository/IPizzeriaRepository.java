package za.ac.cput.PizzaDeliveryFrontend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizzeria;
@Repository
public interface IPizzeriaRepository extends JpaRepository<Pizzeria, String> {
}
