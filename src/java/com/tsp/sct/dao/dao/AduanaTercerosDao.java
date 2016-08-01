/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dao;

import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;

public interface AduanaTercerosDao
{
	/** 
	 * Inserts a new row in the aduana_terceros table.
	 */
	public void insert(AduanaTerceros dto) throws AduanaTercerosDaoException;

	/** 
	 * Returns all rows from the aduana_terceros table that match the criteria ''.
	 */
	public AduanaTerceros[] findAll() throws AduanaTercerosDaoException;

	/** 
	 * Returns all rows from the aduana_terceros table that match the criteria 'ID_ADUANA_TERCEROS = :idAduanaTerceros'.
	 */
	public AduanaTerceros[] findWhereIdAduanaTercerosEquals(int idAduanaTerceros) throws AduanaTercerosDaoException;

	/** 
	 * Returns all rows from the aduana_terceros table that match the criteria 'ID_ADUANA = :idAduana'.
	 */
	public AduanaTerceros[] findWhereIdAduanaEquals(int idAduana) throws AduanaTercerosDaoException;

	/** 
	 * Returns all rows from the aduana_terceros table that match the criteria 'ID_CUENTA_TERCEROS = :idCuentaTerceros'.
	 */
	public AduanaTerceros[] findWhereIdCuentaTercerosEquals(int idCuentaTerceros) throws AduanaTercerosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the aduana_terceros table that match the specified arbitrary SQL statement
	 */
	public AduanaTerceros[] findByDynamicSelect(String sql, Object[] sqlParams) throws AduanaTercerosDaoException;

	/** 
	 * Returns all rows from the aduana_terceros table that match the specified arbitrary SQL statement
	 */
	public AduanaTerceros[] findByDynamicWhere(String sql, Object[] sqlParams) throws AduanaTercerosDaoException;

}
