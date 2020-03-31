package cn.zuorongtao.demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import cn.zuorongtao.pojos.Category;
import cn.zuorongtao.pojos.Product;

public class Demo {
	public static void main(String[] args) {

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();	
		Session session = factory.getCurrentSession();
		Transaction trans = session.beginTransaction();
		
		Set<Product> set = new HashSet<Product>();
		Category c1 = new Category(0, "Drinks", "./path", set);
		Product cola = new Product(0, 1, "cola", 2.5f, "./path", "A kind of drinks.", "drinks", 0, c1);
		Product sprite = new Product(0, 1, "sprite", 2.5f, "./path", "A kind of drinks.", "drinks", 0, c1);
		c1.getProducts().add(cola);
		c1.getProducts().add(sprite);
		session.save(c1);
		session.save(cola);
		session.save(sprite);
		trans.commit();
		factory.close();
		System.out.println("已完成,该类型下有以下产品：");
		for(Product product:c1.getProducts()){
			System.out.println(product.getProductName());
		}
	}
}
