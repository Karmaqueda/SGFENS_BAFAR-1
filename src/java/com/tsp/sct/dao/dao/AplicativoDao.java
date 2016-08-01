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

public interface AplicativoDao
{
	/** 
	 * Inserts a new row in the aplicativo table.
	 */
	public AplicativoPk insert(Aplicativo dto) throws AplicativoDaoException;

	/** 
	 * Updates a single row in the aplicativo table.
	 */
	public void update(AplicativoPk pk, Aplicativo dto) throws AplicativoDaoException;

	/** 
	 * Deletes a single row in the aplicativo table.
	 */
	public void delete(AplicativoPk pk) throws AplicativoDaoException;

	/** 
	 * Returns the rows from the aplicativo table that matches the specified primary-key value.
	 */
	public Aplicativo findByPrimaryKey(AplicativoPk pk) throws AplicativoDaoException;

	/** 
	 * Returns all rows from the aplicativo table that match the criteria 'ID_APLICATIVO = :idAplicativo'.
	 */
	public Aplicativo findByPrimaryKey(int idAplicativo) throws AplicativoDaoException;

	/** 
	 * Returns all rows from the aplicativo table that match the criteria ''.
	 */
	public Aplicativo[] findAll() throws AplicativoDaoException;

	/** 
	 * Returns all rows from the aplicativo table that match the criteria 'ID_APLICATIVO = :idAplicativo'.
	 */
	public Aplicativo[] findWhereIdAplicativoEquals(int idAplicativo) throws AplicativoDaoException;

	/** 
	 * Returns all rows from the aplicativo table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Aplicativo[] findWhereIdEstatusEquals(int idEstatus) throws AplicativoDaoException;

	/** 
	 * Returns all rows from the aplicativo table that match the criteria 'NOMBRE = :nombre'.
	 */
	public Aplicativo[] findWhereNombreEquals(String nombre) throws AplicativoDaoException;

	/** 
	 * Returns all rows from the aplicativo table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public Aplicativo[] findWhereDescripcionEquals(String descripcion) throws AplicativoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the aplicativo table that match the specified arbitrary SQL statement
	 */
	public Aplicativo[] findByDynamicSelect(String sql, Object[] sqlParams) throws AplicativoDaoException;

	/** 
	 * Returns all rows from the aplicativo table that match the specified arbitrary SQL statement
	 */
	public Aplicativo[] findByDynamicWhere(String sql, Object[] sqlParams) throws AplicativoDaoException;

}
