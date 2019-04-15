package com.Shopnow.entity;

/**
 * @author Ajay 
 *
 */
public class shopNoweventProduct_att {
		// THIS GETER SETTER METHOD FOR PRODUCT_ATTRIBUTE TABLE
	
	    private int Pro_id;
	    private int product_id;
	    private String att_value;
	    private String att_group_name;
	    
	    
	    
	    
	    	public shopNoweventProduct_att() {
	        
			
	        
	    }
	    
	    
	    
		public shopNoweventProduct_att(int Pro_id,int product_id,String att_value,String att_group_name) {
	        
			
			this.Pro_id = Pro_id;
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
	
  
}
