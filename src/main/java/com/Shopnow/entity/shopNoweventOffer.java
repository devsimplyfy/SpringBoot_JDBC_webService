package com.Shopnow.entity;

/**
 * @author Ajay 
 *
 */
public class shopNoweventOffer {
		//THIS IS GETTER SETTER METHOD FOR COLOR_CODE_MAIN TABLE
	
	 public shopNoweventOffer() {
        
    }
	    private int id;
	    private String offer_name;
	    private int product_id;
	    private String vendor_id;

	   

		public shopNoweventOffer(int id, String offer_name, int product_id,String vendor_id) {
	        this.id = id;
	        this.offer_name = offer_name;
	        this.product_id = product_id;
	        this.vendor_id=vendor_id;
	    }

	   
	    
	    public int getProduct_id() {
			return product_id;
		}

		public void setProduct_id(int product_id) {
			this.product_id = product_id;
		}

		public String getVendor_id() {
			return vendor_id;
		}

		public void setVendor_id(String vendor_id) {
			this.vendor_id = vendor_id;
		}

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getOffer_name() {
	        return offer_name;
	    }

	    public void setOffer_name(String offer_name) {
	        this.offer_name = offer_name;
	    }


    	  
}
