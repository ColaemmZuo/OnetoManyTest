package cn.zuorongtao.pojos;

import java.util.HashSet;
import java.util.Set;

public class Category {

	private long category_ID;
	private String category_Name;
	private String category_Path;
	private Set<Product> products = new HashSet<Product>();
	public void addProduct(Product p){
		products.add(p);
	}
	public Category(long category_ID, String category_Name, String category_Path, Set<Product> products) {
		super();
		this.category_ID = category_ID;
		this.category_Name = category_Name;
		this.category_Path = category_Path;
		this.products = products;
	}
/*
	create table CATEGORY(
		id bigint not null auto_increment primary key,
		name varchar(50),
		path varchar(255)
			);
*/
	public long getCategory_ID() {
		return category_ID;
	}
	public void setCategory_ID(long category_ID) {
		this.category_ID = category_ID;
	}
	public String getCategory_Name() {
		return category_Name;
	}
	public void setCategory_Name(String category_Name) {
		this.category_Name = category_Name;
	}
	public String getCategory_Path() {
		return category_Path;
	}
	public void setCategory_Path(String category_Path) {
		this.category_Path = category_Path;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
