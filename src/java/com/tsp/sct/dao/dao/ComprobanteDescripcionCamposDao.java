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

public interface ComprobanteDescripcionCamposDao
{
	/** 
	 * Inserts a new row in the comprobante_descripcion_campos table.
	 */
	public void insert(ComprobanteDescripcionCampos dto) throws ComprobanteDescripcionCamposDaoException;

	/** 
	 * Returns all rows from the comprobante_descripcion_campos table that match the criteria ''.
	 */
	public ComprobanteDescripcionCampos[] findAll() throws ComprobanteDescripcionCamposDaoException;

	/** 
	 * Returns all rows from the comprobante_descripcion_campos table that match the criteria 'ID_COMPROBANTE_DESCRIPCION = :idComprobanteDescripcion'.
	 */
	public ComprobanteDescripcionCampos[] findWhereIdComprobanteDescripcionEquals(int idComprobanteDescripcion) throws ComprobanteDescripcionCamposDaoException;

	/** 
	 * Returns all rows from the comprobante_descripcion_campos table that match the criteria 'ID_CAMPO = :idCampo'.
	 */
	public ComprobanteDescripcionCampos[] findWhereIdCampoEquals(int idCampo) throws ComprobanteDescripcionCamposDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the comprobante_descripcion_campos table that match the specified arbitrary SQL statement
	 */
	public ComprobanteDescripcionCampos[] findByDynamicSelect(String sql, Object[] sqlParams) throws ComprobanteDescripcionCamposDaoException;

	/** 
	 * Returns all rows from the comprobante_descripcion_campos table that match the specified arbitrary SQL statement
	 */
	public ComprobanteDescripcionCampos[] findByDynamicWhere(String sql, Object[] sqlParams) throws ComprobanteDescripcionCamposDaoException;

}
