package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {


	void insert(SellerDao obj);

	void update(SellerDao obj);

	void deleteById(Integer id);

	Seller findById(Integer id);

	List<SellerDao> findAll();

}
