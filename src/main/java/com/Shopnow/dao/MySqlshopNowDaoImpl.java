package com.Shopnow.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.Shopnow.entity.shopNoweventaddress;

import com.Shopnow.entity.Productsevent;
import com.Shopnow.entity.shopNoweventColor_main;
import com.Shopnow.entity.shopNoweventOffer;
import com.Shopnow.entity.shopNoweventProduct_att;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Repository("mysql")
public class MySqlshopNowDaoImpl implements shopNowDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
   

    
    //
    
    
    private static class addressRowMapper implements RowMapper<shopNoweventaddress> {

        @Override
        public shopNoweventaddress mapRow(ResultSet resultSet, int i) throws SQLException {
        	shopNoweventaddress emp = new shopNoweventaddress();
           
            
        	emp.setId(resultSet.getInt("id"));
        	emp.setCustomerId(resultSet.getInt("customerId"));
        	emp.setType_billing_shipping(resultSet.getString("type_billing_shipping"));
        	emp.setFirstName(resultSet.getString("firstName"));
        	emp.setLastName(resultSet.getString("lastName"));
        	emp.setAddress1(resultSet.getString("address1"));
        	emp.setAddress2(resultSet.getString("address2"));
        	emp.setAddress3(resultSet.getString("address3"));
        	emp.setCity(resultSet.getString("city"));
        	emp.setState(resultSet.getString("state"));
        	emp.setCountry(resultSet.getString("country"));
        	emp.setPhoneNumber(resultSet.getString("phoneNumber"));
        	emp.setIsPrimary(resultSet.getInt("IsPrimary"));
			emp.setCreatedDatetime(resultSet.getDate("createdDatetime"));
		
           	return emp;
            
        }
    }

    


    @Override
    public Collection<shopNoweventaddress> getAllCustomer_add() throws SQLException {
        
        final String sql = "select * from address LIMIT 100";
        List<shopNoweventaddress> empresult = jdbcTemplate.query(sql, new addressRowMapper());
        return empresult;
    }
 
    @Override
    public Collection<shopNoweventaddress> getCustomer_addById(int customerId) throws SQLException {
       
       
    	final String sql = "select * from address where customerId=?";
        List<shopNoweventaddress> empresult = jdbcTemplate.query(sql, new addressRowMapper(),customerId);
        return empresult;
    }
          
  
    @Override
    public void removeCustomer_addById(int customerId) {
      
        final String sql = "DELETE FROM address WHERE customerId = ?";
        jdbcTemplate.update(sql, customerId);
    }
    
    
    @Override
    public void updateCustomer_addById(shopNoweventaddress c1) {
      
        final String sql = "UPDATE address SET customerId=?,type_billing_shipping=?,firstName=?,lastName=?,address1=?,address2=?,address3=?,city=?,state=?,country=?,phoneNumber=?,isPrimary=?,createdDatetime=? WHERE id=?;";
        
        final int id=c1.getId();
        final int customerId = c1.getCustomerId();
        final String type_billing_shipping=c1.getType_billing_shipping();
        final String lastName=c1.getLastName();
        final String firstName=c1.getFirstName();
        final String address1=c1.getAddress1();
        final String address2=c1.getAddress2();
        final String address3=c1.getAddress3();
        final String city=c1.getCity();
        final String state=c1.getState();
        final String country=c1.getCountry();
        final String phoneNumber=c1.getPhoneNumber();
        final int isPrimary=c1.getIsPrimary();
        final Date createdDatetime=c1.getCreatedDatetime();
        
        jdbcTemplate.update(sql, new Object[]{customerId,type_billing_shipping,firstName,lastName,address1,address2,address3,city,state,country,phoneNumber,isPrimary,createdDatetime,id});
    }
 
    @Override
    public void insertCustomer_addToDb(shopNoweventaddress c1) {
        
        final String sql = "INSERT INTO address (customerId,type_billing_shipping,firstName,lastName,address1,address2,address3,city,state,country,phoneNumber,isPrimary,createdDatetime)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
     
        final int customerId = c1.getCustomerId();
        final String type_billing_shipping=c1.getType_billing_shipping();
        final String lastName=c1.getLastName();
        final String firstName=c1.getFirstName();
        final String address1=c1.getAddress1();
        final String address2=c1.getAddress2();
        final String address3=c1.getAddress3();
        final String city=c1.getCity();
        final String state=c1.getState();
        final String country=c1.getCountry();
        final String phoneNumber=c1.getPhoneNumber();
        final int isPrimary=c1.getIsPrimary();
        final Date createdDatetime=c1.getCreatedDatetime();
        
        
        
        jdbcTemplate.update(sql, new Object[]{customerId,type_billing_shipping,firstName,lastName,address1,address2,address3,city,state,country,phoneNumber,isPrimary,createdDatetime});

    }
    
    

    

   
    
    
    private static class Color_codeRowMapper1 implements RowMapper<shopNoweventColor_main> {

        @Override
        public shopNoweventColor_main mapRow(ResultSet resultSet1, int i) throws SQLException {
        	shopNoweventColor_main emp1 = new shopNoweventColor_main();
           
			emp1.setColor_id(resultSet1.getInt("id"));
			emp1.setColor_code(resultSet1.getString("color_code"));
			emp1.setColor_name(resultSet1.getString("color_name"));
	
           	return emp1;
           
            
       
            
        }
    }
    
    
    

    @Override
    public Collection<shopNoweventColor_main> getAllColor()throws SQLException, ClassNotFoundException {
        // SELECT column_name(s) FROM table_name
    	
        final String sql = "SELECT * FROM color_code_main LIMIT 100";
         List<shopNoweventColor_main> students = jdbcTemplate.query(sql,new Color_codeRowMapper1());
        return students;
        
       
    }
    @Override
    public Collection<shopNoweventColor_main> getColorById(int id) throws SQLException, ClassNotFoundException  {
        // SELECT column_name(s) FROM table_name where column = value
		 String sql="SELECT * FROM color_code_main where id=?";
		 List<shopNoweventColor_main> color_name = jdbcTemplate.query(sql, new Color_codeRowMapper1());
	        
        return color_name;
    }
    
    
  
    
    private static class Product_attRowMapper implements RowMapper<shopNoweventProduct_att> {

        @Override
        public shopNoweventProduct_att mapRow(ResultSet resultSet2, int i) throws SQLException {
        	shopNoweventProduct_att product_att = new shopNoweventProduct_att();
        	
        	
        	product_att.setPro_id(resultSet2.getInt("id"));
        	product_att.setProduct_id(resultSet2.getInt("product_id"));
        	product_att.setAtt_value(resultSet2.getString("att_value"));
        	product_att.setAtt_group_name(resultSet2.getString("att_group_name"));
            
            return product_att;
        }
    
    }

    @Override
    public Collection<shopNoweventProduct_att> getAllProduct_atts() throws SQLException {
        
        final String sql = "SELECT pa.product_id,pa.id,av.att_value,att_group_name FROM product_attributes pa \n" + 
        		"INNER JOIN attributes_value av ON av.id=pa.att_group_val_id\n" + 
        		"INNER JOIN attributes a ON a.id=pa.att_group_id LIMIT 100" ;
        
        List<shopNoweventProduct_att> product_att = jdbcTemplate.query(sql, new Product_attRowMapper());
       
        return product_att;
    }
   
    
    @Override
    public Collection<shopNoweventProduct_att> getProduct_attById(int product_id) throws SQLException {
        
    	final String sql = "SELECT pa.*,av.*,att_group_name FROM product_attributes pa \n" + 
    			"INNER JOIN attributes_value av ON av.id=pa.att_group_val_id\n" + 
    			"INNER JOIN attributes a ON a.id=pa.att_group_id\n" + 
    			"WHERE product_id=?";
    	
        List<shopNoweventProduct_att> product_att = jdbcTemplate.query(sql, new Product_attRowMapper(),product_id);
        
        return product_att;
    }
    
    
    
    
    
    
    

    private static class OfferRowMapper implements RowMapper<shopNoweventOffer> {

        @Override
        public shopNoweventOffer mapRow(ResultSet resultSet, int i) throws SQLException {
        	
        	shopNoweventOffer shopoffer = new shopNoweventOffer();
        	
        	shopoffer.setId(resultSet.getInt("id"));
        	shopoffer.setOffer_name(resultSet.getString("offer_name"));
        	shopoffer.setProduct_id(resultSet.getInt("product_id"));
        	shopoffer.setVendor_id(resultSet.getString("vendor_id"));
           
        	return shopoffer;
        }
    }


    @Override
    public Collection<shopNoweventOffer> getAllOffer() throws SQLException {
        // SELECT column_name(s) FROM table_name
        final String sql = "SELECT * FROM product_offers";
     
        List<shopNoweventOffer> students = jdbcTemplate.query(sql, new OfferRowMapper());
      
        return students;
    }

    @Override
    public Collection<shopNoweventOffer> getOfferById(int product_id) throws SQLException, ClassNotFoundException  {
        // SELECT column_name(s) FROM table_name where column = value
       
		final String sql="SELECT * FROM product_offers where product_id=?";	
		List<shopNoweventOffer> offer = jdbcTemplate.query(sql, new OfferRowMapper(),product_id);
	  
		return offer;
        
    }
    

    

    private static class ProductsRowMapper implements RowMapper<Productsevent> {

        @Override
        public Productsevent mapRow(ResultSet resultSet, int i) throws SQLException {
        	Productsevent pe = new Productsevent();
           
            
        	pe.setId(resultSet.getInt("id"));
        	pe.setName(resultSet.getString("name"));
        	pe.setDescription(resultSet.getString("description"));
        	pe.setRegular_price(resultSet.getFloat("regular_price"));
        	pe.setSale_price(resultSet.getFloat("sale_price"));
        	pe.setStock(resultSet.getString("stock"));
            pe.setImage(resultSet.getString("image"));
        	
        	
           	
           	return pe;
           
            
       
            
        }
    }


    @Override
    public Collection<Productsevent> getAllProducts() throws SQLException {
        
        final String sql = "SELECT * FROM products LIMIT 10";
        List<Productsevent> pe= jdbcTemplate.query(sql, new ProductsRowMapper());
        return pe;
    }

 
    @Override
    public Collection<Productsevent> getProductsById(int id) throws SQLException {
       
       
    	final String sql = "SELECT * FROM products WHERE id=?";
        List<Productsevent> pe = jdbcTemplate.query(sql, new ProductsRowMapper(),id);
        
        return pe;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
}
