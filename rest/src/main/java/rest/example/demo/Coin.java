package rest.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Coin implements Serializable{
	@Id
	@GeneratedValue
	private long Id ;
	
	private String Name;
	private String Size;
	private long Price;
	
	public Coin() {
		super();
	}
	
	public Coin(long id , String name, String size, long price) {
		super();
		Id = id ;	
		Name = name;
		Size = size;
		Price = price;
	}

	public long getId() {
		return Id; 
	}	
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}

	public long getPrice() {
		return Price;
	}
	public void setPrice(long price) {
		Price = price;
	}
}
