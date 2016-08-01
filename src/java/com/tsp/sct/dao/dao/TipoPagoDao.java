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

public interface TipoPagoDao
{
	/** 
	 * Inserts a new row in the tipo_pago table.
	 */
	public TipoPagoPk insert(TipoPago dto) throws TipoPagoDaoException;

	/** 
	 * Updates a single row in the tipo_pago table.
	 */
	public void update(TipoPagoPk pk, TipoPago dto) throws TipoPagoDaoException;

	/** 
	 * Deletes a single row in the tipo_pago table.
	 */
	public void delete(TipoPagoPk pk) throws TipoPagoDaoException;

	/** 
	 * Returns the rows from the tipo_pago table that matches the specified primary-key value.
	 */
	public TipoPago findByPrimaryKey(TipoPagoPk pk) throws TipoPagoDaoException;

	/** 
	 * Returns all rows from the tipo_pago table that match the criteria 'ID_TIPO_PAGO = :idTipoPago'.
	 */
	public TipoPago findByPrimaryKey(int idTipoPago) throws TipoPagoDaoException;

	/** 
	 * Returns all rows from the tipo_pago table that match the criteria ''.
	 */
	public TipoPago[] findAll() throws TipoPagoDaoException;

	/** 
	 * Returns all rows from the tipo_pago table that match the criteria 'ID_TIPO_PAGO = :idTipoPago'.
	 */
	public TipoPago[] findWhereIdTipoPagoEquals(int idTipoPago) throws TipoPagoDaoException;

	/** 
	 * Returns all rows from the tipo_pago table that match the criteria 'DESC_TIPO_PAGO = :descTipoPago'.
	 */
	public TipoPago[] findWhereDescTipoPagoEquals(String descTipoPago) throws TipoPagoDaoException;

	/** 
	 * Returns all rows from the tipo_pago table that match the criteria 'NUMERO_CUENTA = :numeroCuenta'.
	 */
	public TipoPago[] findWhereNumeroCuentaEquals(String numeroCuenta) throws TipoPagoDaoException;

	/** 
	 * Returns all rows from the tipo_pago table that match the criteria 'CLAVE_METODO_SAT = :claveMetodoSat'.
	 */
	public TipoPago[] findWhereClaveMetodoSatEquals(String claveMetodoSat) throws TipoPagoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the tipo_pago table that match the specified arbitrary SQL statement
	 */
	public TipoPago[] findByDynamicSelect(String sql, Object[] sqlParams) throws TipoPagoDaoException;

	/** 
	 * Returns all rows from the tipo_pago table that match the specified arbitrary SQL statement
	 */
	public TipoPago[] findByDynamicWhere(String sql, Object[] sqlParams) throws TipoPagoDaoException;

}
