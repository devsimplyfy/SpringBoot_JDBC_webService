package com.Shopnow.entity;

import java.util.Date;

/**
 * @author Ajay 10-04-19
 *
 */
public class shopNoweventaddress {
	private int id;
    private int customerId;
    private String type_billing_shipping;
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String state;
    private String country;
    private String phoneNumber;
    private int isPrimary;
    private Date createdDatetime;
    
    
   
    //THIS CONSTRUTOR FOR ADDRESS THABEL
    
    public shopNoweventaddress(int id,int customerId,String type_billing_shipping,String firstName,String lastName,String address1,String address2,String address3,String city,
			String state,String country,String phoneNumber,int isPrimary,Date createdDatetime)
	 {
		this.id=id;
		this.customerId=customerId;
		this.type_billing_shipping=type_billing_shipping;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address1=address1;
		this.address2=address2;
		this.address3=address3;
		this.city=city;
		this.state=state;
		this.country=country;
		this.phoneNumber=phoneNumber;
		this.isPrimary=isPrimary;
		this.createdDatetime=createdDatetime;

}
	

	public shopNoweventaddress() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getType_billing_shipping() {
		return type_billing_shipping;
	}



	public void setType_billing_shipping(String type_billing_shipping) {
		this.type_billing_shipping = type_billing_shipping;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getAddress1() {
		return address1;
	}



	public void setAddress1(String address1) {
		this.address1 = address1;
	}



	public String getAddress2() {
		return address2;
	}



	public void setAddress2(String address2) {
		this.address2 = address2;
	}



	public String getAddress3() {
		return address3;
	}



	public void setAddress3(String address3) {
		this.address3 = address3;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public int getIsPrimary() {
		return isPrimary;
	}



	public void setIsPrimary(int isPrimary) {
		this.isPrimary = isPrimary;
	}



	public Date getCreatedDatetime() {
		return createdDatetime;
	}



	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}


    
    
  

	
	/*THIS IS GETTER SETTER METHOD FOR COLOR_CODE_MAIN TABLE
	
	
	
	private int color_id;
	private String color_name;
    private String color_code;
    
    
    THIS CONSTRUTOR FOR ADDRESS COLOR_CODE_MAIN TABLE
    
	public shopNowevent(int color_id, String color_name,String color_code) {
        this.color_id = color_id;
        this.color_name = color_name;
        this.color_code=color_code;
    }
	
	 public int getColor_id() {
			return color_id;
		}

		public void setColor_id(int color_id) {
			this.color_id = color_id;
		}


		public String getColor_name() {
			return color_name;
		}



		public void setColor_name(String color_name) {
			this.color_name = color_name;
		}



		public String getColor_code() {
			return color_code;
		}
	
		public void setColor_code(String color_code) {
			this.color_code = color_code;
		}

    
	
	
	// THIS GETER SETTER METHOD FOR PRODUCT_ATTRIBUTE TABLE
	
	    private int Pro_id;
	    private int product_id;
	    private String att_value;
	    private String att_group_name;
	    
	    
	    
	    
		public shopNowevent(int Pro_id,int product_id,String att_value,String att_group_name) {
	        
			
			this.id = Pro_id;
	        this.product_id =product_id;
	        this.att_group_name=att_group_name;
	        this.att_value=att_value;
	        
	    }

		public int getPro_id() {
			return Pro_id;
		}

		public void setPro_id(int pro_id) {
			Pro_id = pro_id;
		}

		public int getProduct_id() {
			return product_id;
		}

		public void setProduct_id(int product_id) {
			this.product_id = product_id;
		}

		public String getAtt_value() {
			return att_value;
		}

		public void setAtt_value(String att_value) {
			this.att_value = att_value;
		}

		public String getAtt_group_name() {
			return att_group_name;
		}

		public void setAtt_group_name(String att_group_name) {
			this.att_group_name = att_group_name;
		}
	
  */
}
