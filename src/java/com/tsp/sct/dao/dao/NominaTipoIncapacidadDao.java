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

public interface NominaTipoIncapacidadDao
{
	/** 
	 * Inserts a new row in the nomina_tipo_incapacidad table.
	 */
	public NominaTipoIncapacidadPk insert(NominaTipoIncapacidad dto) throws NominaTipoIncapacidadDaoException;

	/** 
	 * Updates a single row in the nomina_tipo_incapacidad table.
	 */
	public void update(NominaTipoIncapacidadPk pk, NominaTipoIncapacidad dto) throws NominaTipoIncapacidadDaoException;

	/** 
	 * Deletes a single row in the nomina_tipo_incapacidad table.
	 */
	public void delete(NominaTipoIncapacidadPk pk) throws NominaTipoIncapacidadDaoException;

	/** 
	 * Returns the rows from the nomina_tipo_incapacidad table that matches the specified primary-key value.
	 */
	public NominaTipoIncapacidad findByPrimaryKey(NominaTipoIncapacidadPk pk) throws NominaTipoIncapacidadDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the criteria 'ID_TIPO_INCAPACIDAD = :idTipoIncapacidad'.
	 */
	public NominaTipoIncapacidad findByPrimaryKey(int idTipoIncapacidad) throws NominaTipoIncapacidadDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the criteria ''.
	 */
	public NominaTipoIncapacidad[] findAll() throws NominaTipoIncapacidadDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the criteria 'ID_TIPO_INCAPACIDAD = :idTipoIncapacidad'.
	 */
	public NominaTipoIncapacidad[] findWhereIdTipoIncapacidadEquals(int idTipoIncapacidad) throws NominaTipoIncapacidadDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public NominaTipoIncapacidad[] findWhereDescripcionEquals(String descripcion) throws NominaTipoIncapacidadDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the criteria 'CLAVE = :clave'.
	 */
	public NominaTipoIncapacidad[] findWhereClaveEquals(int clave) throws NominaTipoIncapacidadDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the specified arbitrary SQL statement
	 */
	public NominaTipoIncapacidad[] findByDynamicSelect(String sql, Object[] sqlParams) throws NominaTipoIncapacidadDaoException;

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the specified arbitrary SQL statement
	 */
	public NominaTipoIncapacidad[] findByDynamicWhere(String sql, Object[] sqlParams) throws NominaTipoIncapacidadDaoException;

}
