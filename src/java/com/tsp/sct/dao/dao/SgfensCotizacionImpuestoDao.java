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

public interface SgfensCotizacionImpuestoDao
{
	/** 
	 * Inserts a new row in the SGFENS_COTIZACION_IMPUESTO table.
	 */
	public SgfensCotizacionImpuestoPk insert(SgfensCotizacionImpuesto dto) throws SgfensCotizacionImpuestoDaoException;

	/** 
	 * Updates a single row in the SGFENS_COTIZACION_IMPUESTO table.
	 */
	public void update(SgfensCotizacionImpuestoPk pk, SgfensCotizacionImpuesto dto) throws SgfensCotizacionImpuestoDaoException;

	/** 
	 * Deletes a single row in the SGFENS_COTIZACION_IMPUESTO table.
	 */
	public void delete(SgfensCotizacionImpuestoPk pk) throws SgfensCotizacionImpuestoDaoException;

	/** 
	 * Returns the rows from the SGFENS_COTIZACION_IMPUESTO table that matches the specified primary-key value.
	 */
	public SgfensCotizacionImpuesto findByPrimaryKey(SgfensCotizacionImpuestoPk pk) throws SgfensCotizacionImpuestoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_IMPUESTO table that match the criteria 'ID_COTIZACION = :idCotizacion AND ID_IMPUESTO = :idImpuesto'.
	 */
	public SgfensCotizacionImpuesto findByPrimaryKey(int idCotizacion, int idImpuesto) throws SgfensCotizacionImpuestoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_IMPUESTO table that match the criteria ''.
	 */
	public SgfensCotizacionImpuesto[] findAll() throws SgfensCotizacionImpuestoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_IMPUESTO table that match the criteria 'ID_COTIZACION = :idCotizacion'.
	 */
	public SgfensCotizacionImpuesto[] findWhereIdCotizacionEquals(int idCotizacion) throws SgfensCotizacionImpuestoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_IMPUESTO table that match the criteria 'ID_IMPUESTO = :idImpuesto'.
	 */
	public SgfensCotizacionImpuesto[] findWhereIdImpuestoEquals(int idImpuesto) throws SgfensCotizacionImpuestoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_IMPUESTO table that match the specified arbitrary SQL statement
	 */
	public SgfensCotizacionImpuesto[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensCotizacionImpuestoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_IMPUESTO table that match the specified arbitrary SQL statement
	 */
	public SgfensCotizacionImpuesto[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensCotizacionImpuestoDaoException;

}