/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.factory;

import java.sql.Connection;
import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.jdbc.*;

public class UsuariosdemoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return UsuariosdemoDao
	 */
	public static UsuariosdemoDao create()
	{
		return new UsuariosdemoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return UsuariosdemoDao
	 */
	public static UsuariosdemoDao create(Connection conn)
	{
		return new UsuariosdemoDaoImpl( conn );
	}

}
