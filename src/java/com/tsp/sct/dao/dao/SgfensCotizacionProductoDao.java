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

public interface SgfensCotizacionProductoDao
{
	/** 
	 * Inserts a new row in the SGFENS_COTIZACION_PRODUCTO table.
	 */
	public SgfensCotizacionProductoPk insert(SgfensCotizacionProducto dto) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Updates a single row in the SGFENS_COTIZACION_PRODUCTO table.
	 */
	public void update(SgfensCotizacionProductoPk pk, SgfensCotizacionProducto dto) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Deletes a single row in the SGFENS_COTIZACION_PRODUCTO table.
	 */
	public void delete(SgfensCotizacionProductoPk pk) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns the rows from the SGFENS_COTIZACION_PRODUCTO table that matches the specified primary-key value.
	 */
	public SgfensCotizacionProducto findByPrimaryKey(SgfensCotizacionProductoPk pk) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the criteria 'ID_COTIZACION = :idCotizacion AND ID_CONCEPTO = :idConcepto'.
	 */
	public SgfensCotizacionProducto findByPrimaryKey(int idCotizacion, int idConcepto) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the criteria ''.
	 */
	public SgfensCotizacionProducto[] findAll() throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the criteria 'ID_COTIZACION = :idCotizacion'.
	 */
	public SgfensCotizacionProducto[] findWhereIdCotizacionEquals(int idCotizacion) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public SgfensCotizacionProducto[] findWhereIdConceptoEquals(int idConcepto) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public SgfensCotizacionProducto[] findWhereDescripcionEquals(String descripcion) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the criteria 'UNIDAD = :unidad'.
	 */
	public SgfensCotizacionProducto[] findWhereUnidadEquals(String unidad) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the criteria 'IDENTIFICACION = :identificacion'.
	 */
	public SgfensCotizacionProducto[] findWhereIdentificacionEquals(String identificacion) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public SgfensCotizacionProducto[] findWhereCantidadEquals(double cantidad) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the criteria 'PRECIO_UNITARIO = :precioUnitario'.
	 */
	public SgfensCotizacionProducto[] findWherePrecioUnitarioEquals(double precioUnitario) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the criteria 'DESCUENTO_PORCENTAJE = :descuentoPorcentaje'.
	 */
	public SgfensCotizacionProducto[] findWhereDescuentoPorcentajeEquals(double descuentoPorcentaje) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the criteria 'DESCUENTO_MONTO = :descuentoMonto'.
	 */
	public SgfensCotizacionProducto[] findWhereDescuentoMontoEquals(double descuentoMonto) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the criteria 'SUBTOTAL = :subtotal'.
	 */
	public SgfensCotizacionProducto[] findWhereSubtotalEquals(double subtotal) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the specified arbitrary SQL statement
	 */
	public SgfensCotizacionProducto[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensCotizacionProductoDaoException;

	/** 
	 * Returns all rows from the SGFENS_COTIZACION_PRODUCTO table that match the specified arbitrary SQL statement
	 */
	public SgfensCotizacionProducto[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensCotizacionProductoDaoException;

}
