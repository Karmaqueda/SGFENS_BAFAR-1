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

public class NominaBancoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return NominaBancoDao
	 */
	public static NominaBancoDao create()
	{
		return new NominaBancoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return NominaBancoDao
	 */
	public static NominaBancoDao create(Connection conn)
	{
		return new NominaBancoDaoImpl( conn );
	}

}
