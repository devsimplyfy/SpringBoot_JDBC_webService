package com.Shopnow.dao;

import java.sql.SQLException;
import java.util.Collection;

import com.Shopnow.entity.shopNoweventaddress;
import com.Shopnow.entity.Productsevent;
import com.Shopnow.entity.shopNoweventColor_main;
import com.Shopnow.entity.shopNoweventOffer;
import com.Shopnow.entity.shopNoweventProduct_att;


public interface shopNowDao {
   
	//THIS INTERFACE METHOD OF ADDRESS CLASS

	Collection<shopNoweventaddress> getAllCustomer_add()throws SQLException;

	Collection<shopNoweventaddress> getCustomer_addById(int product_id)throws SQLException, ClassNotFoundException;

	void removeCustomer_addById(int customerId);

	void insertCustomer_addToDb(shopNoweventaddress c1);

	void updateCustomer_addById(shopNoweventaddress c1);
	
	
	
	
	//THIS INTERFACE METHOD OF PRODUCT_ATT CLASS

	

	Collection<shopNoweventProduct_att> getAllProduct_atts()throws SQLException;

	Collection<shopNoweventProduct_att> getProduct_attById(int id)throws SQLException, ClassNotFoundException;
	
	
	
	//THIS INTERFACE METHOD OF COLOR_CODE_MAIN CLASS

	
	
	Collection<shopNoweventColor_main> getAllColor() throws SQLException, ClassNotFoundException;

	Collection<shopNoweventColor_main> getColorById(int id) throws SQLException, ClassNotFoundException;

	
	
	
	//THIS INTERFACE METHOD OF Product_Offer CLASS
	
	
	Collection<shopNoweventOffer> getAllOffer() throws SQLException;

	Collection<shopNoweventOffer> getOfferById(int product_id) throws SQLException, ClassNotFoundException;

	//THIS INTERFACE METHOD OF Products CLASS
	
	Collection<Productsevent> getAllProducts()throws SQLException;

	Collection<Productsevent> getProductsById(int id) throws SQLException;

	


}
