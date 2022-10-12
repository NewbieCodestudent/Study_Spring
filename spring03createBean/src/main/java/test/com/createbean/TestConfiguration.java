package test.com.createbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {
	
	private static final Logger logger = LoggerFactory.getLogger(testController.class);

	@Bean
	public ArrayList<String> alist() { // 매소드의 이름 == 빈 아이디
		logger.info("alist()...");
		ArrayList<String> list = new ArrayList<String>();
		list.add("kim1");
		list.add("kim2");
		list.add("kim3");
		
		return list;
	}
	
	@Bean
	public ArrayList<String> blist() {
		logger.info("alist()...");
		ArrayList<String> list = new ArrayList<String>();
		list.add("yang1");
		list.add("yang2");
		list.add("yang3");
		
		return list;
	}
	
	// bean에 name을 부여할 수 있다.
	@Bean(name="names")
	public ArrayList<String> clist() {
		logger.info("alist()...");
		ArrayList<String> list = new ArrayList<String>();
		list.add("choi1");
		list.add("choi2");
		list.add("choi3");
		
		return list;
	}
	
	@Bean
	@Qualifier("names2")
	public ArrayList<String> dlist() {
		logger.info("alist()...");
		ArrayList<String> list = new ArrayList<String>();
		list.add("choi1");
		list.add("choi2");
		list.add("choi3");
		
		return list;
	}
	
	// HachSet<Integer> add 4개
	@Bean
	public HashSet<String> aset() {
		HashSet<String> set = new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		return set;
	}
	
	// HashMap<String, String> put 2개
	@Bean
	public HashMap<String, String> map() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		return map;
	}
	
	// car, book
	@Bean
	public Car testcar() {
		Car car = new Car();
		car.model = "test_car";
		car.price = 1234;
		return car;
	}
	
	@Bean
	public Book testbook() {
		Book book = new Book();
		book.title = "test_title";
		book.price = 4321;
		return book;
	}
	
	// Store, Store2
	@Bean(name="mstore")
	public Store mstore() {
		Store store = new Store(new Car(), new Book());
		return store;
	}
	
	@Bean
	public Store2 mstore2() {
		Store2 store = new Store2();
		store.setCar(new Car());
		store.setBook(new Book());
		return store;
	}
	
	@Bean
	public Store tstore(@Qualifier("testcar") Car cc, @Qualifier("testbook") Book bb) {
		logger.info("tstore()...");
		Store st = new Store(cc, bb);
		return st;
	}
	
	@Bean
	public Store tstore2(Car car, Book book) {
		Store store = new Store(car, book);
		return store;
	}
	
	@Bean
	public TestBean4 testbean4() {
		logger.info("TestBean4()...");
		ArrayList<String> list = new ArrayList<String>();
		list.add("lee8");
		list.add("lee9");
		list.add("lee0");
		TestBean4 tb = new TestBean4(list);
		return tb;
	}
	
	@Bean
	public TestBean4 testbean4_list(ArrayList<String> alist) {
		logger.info("TestBean4_list()...");
		TestBean4 tb = new TestBean4(alist);
		return tb;
	}
	
	// TestBean5,6
	public TestBean5 testbean5(Set<String> aset) {
		logger.info("testbean5()...");
		TestBean5 tb = new TestBean5(aset);
		return tb;
	}
	public TestBean6 testbean6(Map<String, String> map) {
		logger.info("testbean6()...");
		TestBean6 tb = new TestBean6(map);
		return tb;
	}
	
	
	
	
	

}
