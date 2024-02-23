package service;

import java.util.List;
import java.util.Optional;

import com.google.protobuf.Option;

import persistence.Item;

public interface ItemService {
	List<Item> getAll();
	
	Optional<Item> get(int id);
	
	Optional<Item> find(int id);
	
	void demoHibernate1stLevelCache();
}
