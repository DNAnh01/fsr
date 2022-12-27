package dao;

import java.util.List;

import persistence.ItemGroup;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao {

	private static final String Q_SELECT_ALL_ITEM_GROUPS = "SELECT * FROM LoaiHang";
	
	public List<ItemGroup> getAll() {
		// Auto Mapping
		// Require: ItemGroup is an Entity and mapping with correct LoaiHang's columns table
		return openSession()
				.createNativeQuery(Q_SELECT_ALL_ITEM_GROUPS, ItemGroup.class)
				.getResultList();
	}
}
