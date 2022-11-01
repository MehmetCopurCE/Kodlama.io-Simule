package core.dataAccess.abstracts;

import java.util.List;
import java.util.function.Predicate;

import core.entities.Entity;

public interface BaseEntityDao <T extends Entity>{

	void add(T entity);
	void remove(T entity);
	void update(T entity);
	T get(Predicate<? super T> filter);
	List<T> getAll();
	List<T> getAll(Predicate <? super T> filter);
}
