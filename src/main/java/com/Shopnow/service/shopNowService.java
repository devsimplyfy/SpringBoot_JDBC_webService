package com.Shopnow.service;


import com.Shopnow.entity.Productsevent;
import com.Shopnow.dao.shopNowDao;
import com.Shopnow.entity.shopNoweventaddress;
import com.Shopnow.entity.shopNoweventColor_main;
import com.Shopnow.entity.shopNoweventOffer;
import com.Shopnow.entity.shopNoweventProduct_att;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collection;

@Service
public class shopNowService {

    @Autowired
    @Qualifier("mysql")
    private shopNowDao shopnowDao;
   
	public Collection<shopNoweventaddress>getAllCustomer_add() throws SQLException {
		// TODO Auto-generated method stub
		 return this.shopnowDao.getAllCustomer_add();
	}
	
	public Collection<shopNoweventaddress> getCustomer_addById(int customer_id)throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return this.shopnowDao.getCustomer_addById(customer_id);
	}

	public void removeCustomer_addById(int customerId) {
		// TODO Auto-generated method stub
		this.shopnowDao.removeCustomer_addById(customerId);
		
	}

	public void insertCustomer(shopNoweventaddress emp) {
		// TODO Auto-generated method stub
		this.shopnowDao.insertCustomer_addToDb(emp);
		
	}

	public void updateCustomer_addById(shopNoweventaddress emp) {
		// TODO Auto-generated method stub
		this.shopnowDao.updateCustomer_addById(emp);
	}


	
	//THIS SERVICE METHOD FOR COLOR_CODE_MAIN TABLE
	
	
	public Collection<shopNoweventColor_main> getAllColor() throws SQLException, ClassNotFoundException{
        return this.shopnowDao.getAllColor();
    }

    public Collection<shopNoweventColor_main> getColorById(int color_id) throws SQLException, ClassNotFoundException{
        return this.shopnowDao.getColorById(color_id);
    }
  


    //THIS SERVICE METHOD FOR PRODUCT_ATT TABLE

 	public Collection<shopNoweventProduct_att> getAllProduct_atts() throws SQLException {
 	
 		 return this.shopnowDao.getAllProduct_atts();
 	}

 	public Collection<shopNoweventProduct_att> getProduct_attById(int product_id)throws SQLException, ClassNotFoundException {
 		
 		return this.shopnowDao.getProduct_attById(product_id);
 	}

 	
 	
 	 //THIS SERVICE METHOD FOR Offer TABLE
 	
	public Collection<shopNoweventOffer> getAllOffer() throws SQLException {
		// TODO Auto-generated method stub
		return this.shopnowDao.getAllOffer();
	}

	public Collection<shopNoweventOffer> getOfferById(int product_id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return this.shopnowDao.getOfferById(product_id);
	}


	

	public Collection<Productsevent>getAllProducts() throws SQLException {
		// TODO Auto-generated method stub
		 return this.shopnowDao.getAllProducts();
	}
	
	public Collection<Productsevent> getProductsById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return this.shopnowDao.getProductsById(id);
	}
	







}
