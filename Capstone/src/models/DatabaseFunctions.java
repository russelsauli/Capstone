package models;

import java.util.ArrayList;


public interface DatabaseFunctions {

	public void save(Object object);

	public ArrayList<Object> loadData();

}
