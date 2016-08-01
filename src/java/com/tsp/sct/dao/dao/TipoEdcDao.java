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

public interface TipoEdcDao
{
	/** 
	 * Inserts a new row in the tipo_edc table.
	 */
	public TipoEdcPk insert(TipoEdc dto) throws TipoEdcDaoException;

	/** 
	 * Updates a single row in the tipo_edc table.
	 */
	public void update(TipoEdcPk pk, TipoEdc dto) throws TipoEdcDaoException;

	/** 
	 * Deletes a single row in the tipo_edc table.
	 */
	public void delete(TipoEdcPk pk) throws TipoEdcDaoException;

	/** 
	 * Returns the rows from the tipo_edc table that matches the specified primary-key value.
	 */
	public TipoEdc findByPrimaryKey(TipoEdcPk pk) throws TipoEdcDaoException;

	/** 
	 * Returns all rows from the tipo_edc table that match the criteria 'ID_TIPO_EDC = :idTipoEdc'.
	 */
	public TipoEdc findByPrimaryKey(int idTipoEdc) throws TipoEdcDaoException;

	/** 
	 * Returns all rows from the tipo_edc table that match the criteria ''.
	 */
	public TipoEdc[] findAll() throws TipoEdcDaoException;

	/** 
	 * Returns all rows from the tipo_edc table that match the criteria 'ID_TIPO_EDC = :idTipoEdc'.
	 */
	public TipoEdc[] findWhereIdTipoEdcEquals(int idTipoEdc) throws TipoEdcDaoException;

	/** 
	 * Returns all rows from the tipo_edc table that match the criteria 'DESC_TIPO_EDC = :descTipoEdc'.
	 */
	public TipoEdc[] findWhereDescTipoEdcEquals(String descTipoEdc) throws TipoEdcDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the tipo_edc table that match the specified arbitrary SQL statement
	 */
	public TipoEdc[] findByDynamicSelect(String sql, Object[] sqlParams) throws TipoEdcDaoException;

	/** 
	 * Returns all rows from the tipo_edc table that match the specified arbitrary SQL statement
	 */
	public TipoEdc[] findByDynamicWhere(String sql, Object[] sqlParams) throws TipoEdcDaoException;

}
