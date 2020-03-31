package cn.zuorongtao.pojos;

import java.util.Locale.Category;

public class Product {

	private long productNo;
	private long categoryID;
	private String productName;
	private float productPrice;
	private String productPath;
	private String productDesc;
	private String productType;
	private float disCount;
	private cn.zuorongtao.pojos.Category category;
	public Product(long productNo, long categoryID, String productName, float productPrice, String productPath,
			String productDesc, String productType, float disCount, cn.zuorongtao.pojos.Category category) {
		super();
		this.productNo = productNo;
		this.categoryID = categoryID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productPath = productPath;
		this.productDesc = productDesc;
		this.productType = productType;
		this.disCount = disCount;
		this.category = category;
	}
/* 
create table PRODUCT(
  number varchar(50) not null primary key,
  id bigint  not null,
  name varchar(50),
  price float, 
  path varchar(255),
  description varchar(255),
  type varchar(10),
  discount float
);
*/
	public long getProductNo() {
		return productNo;
	}
	public void setProductNo(long productNo) {
		this.productNo = productNo;
	}
	public long getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(long categoryID) {
		this.categoryID = categoryID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductPath() {
		return productPath;
	}
	public void setProductPath(String productPath) {
		this.productPath = productPath;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public float getDisCount() {
		return disCount;
	}
	public void setDisCount(float disCount) {
		this.disCount = disCount;
	}
	public cn.zuorongtao.pojos.Category getCategory() {
		return category;
	}
	public void setCategory(cn.zuorongtao.pojos.Category category) {
		this.category = category;
	}
	
}
