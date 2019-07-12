package com.geowarin.mvc.base.dto;

/**
 * Add comment to the entity
 * it 's mandatory
 * Comment by alassane
 */
public class Customer 
{
   private String firstname;
   private String lastname;
   private String city;
   
   public Customer()
   {
	   
   }

   public String getFirstname()  
   {
	  return firstname;
   }

   public void setFirstname(String firstname) 
   {
	  this.firstname = firstname;
   }

   public String getLastname() 
   {
	  return lastname;
   }

   public void setLastname(String lastname) 
   {
	  this.lastname = lastname;
   }

   public String getCity() 
   {
	  return city;
   }

   public void setCity(String city) 
   {
	  this.city = city;
   }
}
