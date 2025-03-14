/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author hp
 */
import java.util.List;

public interface iiservice<T> {
	boolean create(T obj);

	T read(int id);

	boolean update(T obj);

	boolean delete(int id);

	List<T> getAll();
}