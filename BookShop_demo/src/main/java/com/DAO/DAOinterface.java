package com.DAO;

import java.util.ArrayList;

public interface DAOinterface<T> {
	public int Insert(T t);
	public int Update(T t);
	public int Delete(T t);
	public ArrayList<T> SelectAll();
	public T selectByID(T t);
	public ArrayList<T> SelectbyCondition(String condition);
}
