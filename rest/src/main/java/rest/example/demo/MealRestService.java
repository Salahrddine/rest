package rest.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@CrossOrigin(origins = "*")
public class MealRestService  {

	@Autowired
	private MealRepository mealRepository;
	
	@RequestMapping(value="/meal" , method=RequestMethod.POST)
	public Coin saveMeal(@RequestBody Coin m){
			return mealRepository.save(m);
	}
	
	@RequestMapping(value="/meal" , method=RequestMethod.GET)
	public java.util.List<Coin> findAllMeals(){
		return mealRepository.getAllwithIds();
	}
	
	@RequestMapping(value="/meal/{id}", method=RequestMethod.DELETE)
	public boolean deleteMeal(@PathVariable Long id){
		mealRepository.deleteById(id);
		return true;
	}
	
	@RequestMapping(value="/meal/{id}",method=RequestMethod.PUT)
	public Coin updateMeal(@PathVariable Long id,Coin m){
		m.setId(id);
		return mealRepository.save(m);
	}
	
}

