package rest.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MealRepository extends JpaRepository<Coin, Long> {

	@Query("select m.Name from Coin m where m.Price=:x")
	public Coin findMealByPrice(@Param("x")long p);
	
	
	@Query("select m from Coin m")	
	public List<Coin> getAllwithIds();
}
