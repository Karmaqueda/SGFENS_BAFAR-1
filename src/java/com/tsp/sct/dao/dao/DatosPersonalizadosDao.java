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

public interface DatosPersonalizadosDao
{
	/** 
	 * Inserts a new row in the datos_personalizados table.
	 */
	public DatosPersonalizadosPk insert(DatosPersonalizados dto) throws DatosPersonalizadosDaoException;

	/** 
	 * Updates a single row in the datos_personalizados table.
	 */
	public void update(DatosPersonalizadosPk pk, DatosPersonalizados dto) throws DatosPersonalizadosDaoException;

	/** 
	 * Deletes a single row in the datos_personalizados table.
	 */
	public void delete(DatosPersonalizadosPk pk) throws DatosPersonalizadosDaoException;

	/** 
	 * Returns the rows from the datos_personalizados table that matches the specified primary-key value.
	 */
	public DatosPersonalizados findByPrimaryKey(DatosPersonalizadosPk pk) throws DatosPersonalizadosDaoException;

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria 'id_datos_personalizados = :idDatosPersonalizados'.
	 */
	public DatosPersonalizados findByPrimaryKey(int idDatosPersonalizados) throws DatosPersonalizadosDaoException;

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria ''.
	 */
	public DatosPersonalizados[] findAll() throws DatosPersonalizadosDaoException;

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria 'id_datos_personalizados = :idDatosPersonalizados'.
	 */
	public DatosPersonalizados[] findWhereIdDatosPersonalizadosEquals(int idDatosPersonalizados) throws DatosPersonalizadosDaoException;

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public DatosPersonalizados[] findWhereIdEmpresaEquals(int idEmpresa) throws DatosPersonalizadosDaoException;

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria 'variable = :variable'.
	 */
	public DatosPersonalizados[] findWhereVariableEquals(String variable) throws DatosPersonalizadosDaoException;

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria 'descripcion = :descripcion'.
	 */
	public DatosPersonalizados[] findWhereDescripcionEquals(String descripcion) throws DatosPersonalizadosDaoException;

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria 'tipo = :tipo'.
	 */
	public DatosPersonalizados[] findWhereTipoEquals(short tipo) throws DatosPersonalizadosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the datos_personalizados table that match the specified arbitrary SQL statement
	 */
	public DatosPersonalizados[] findByDynamicSelect(String sql, Object[] sqlParams) throws DatosPersonalizadosDaoException;

	/** 
	 * Returns all rows from the datos_personalizados table that match the specified arbitrary SQL statement
	 */
	public DatosPersonalizados[] findByDynamicWhere(String sql, Object[] sqlParams) throws DatosPersonalizadosDaoException;

}
