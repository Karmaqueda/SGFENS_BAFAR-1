/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dao;

import java.util.Date;
import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;

public interface SgfensCotizacionDao
{
	/** 
	 * Inserts a new row in the sgfens_cotizacion table.
	 */
	public SgfensCotizacionPk insert(SgfensCotizacion dto) throws SgfensCotizacionDaoException;

	/** 
	 * Updates a single row in the sgfens_cotizacion table.
	 */
	public void update(SgfensCotizacionPk pk, SgfensCotizacion dto) throws SgfensCotizacionDaoException;

	/** 
	 * Deletes a single row in the sgfens_cotizacion table.
	 */
	public void delete(SgfensCotizacionPk pk) throws SgfensCotizacionDaoException;

	/** 
	 * Returns the rows from the sgfens_cotizacion table that matches the specified primary-key value.
	 */
	public SgfensCotizacion findByPrimaryKey(SgfensCotizacionPk pk) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'ID_COTIZACION = :idCotizacion'.
	 */
	public SgfensCotizacion findByPrimaryKey(int idCotizacion) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria ''.
	 */
	public SgfensCotizacion[] findAll() throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'ID_COTIZACION = :idCotizacion'.
	 */
	public SgfensCotizacion[] findWhereIdCotizacionEquals(int idCotizacion) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'ID_USUARIO_VENDEDOR = :idUsuarioVendedor'.
	 */
	public SgfensCotizacion[] findWhereIdUsuarioVendedorEquals(int idUsuarioVendedor) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public SgfensCotizacion[] findWhereIdEmpresaEquals(int idEmpresa) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public SgfensCotizacion[] findWhereIdClienteEquals(int idCliente) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'ID_PROSPECTO = :idProspecto'.
	 */
	public SgfensCotizacion[] findWhereIdProspectoEquals(int idProspecto) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'CONSECUTIVO_COTIZACION = :consecutivoCotizacion'.
	 */
	public SgfensCotizacion[] findWhereConsecutivoCotizacionEquals(int consecutivoCotizacion) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'FOLIO_COTIZACION = :folioCotizacion'.
	 */
	public SgfensCotizacion[] findWhereFolioCotizacionEquals(String folioCotizacion) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'FECHA_COTIZACION = :fechaCotizacion'.
	 */
	public SgfensCotizacion[] findWhereFechaCotizacionEquals(Date fechaCotizacion) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'TIPO_MONEDA = :tipoMoneda'.
	 */
	public SgfensCotizacion[] findWhereTipoMonedaEquals(String tipoMoneda) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'TIEMPO_ENTREGA_DIAS = :tiempoEntregaDias'.
	 */
	public SgfensCotizacion[] findWhereTiempoEntregaDiasEquals(int tiempoEntregaDias) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'COMENTARIOS = :comentarios'.
	 */
	public SgfensCotizacion[] findWhereComentariosEquals(String comentarios) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'DESCUENTO_TASA = :descuentoTasa'.
	 */
	public SgfensCotizacion[] findWhereDescuentoTasaEquals(double descuentoTasa) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'DESCUENTO_MONTO = :descuentoMonto'.
	 */
	public SgfensCotizacion[] findWhereDescuentoMontoEquals(double descuentoMonto) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'SUBTOTAL = :subtotal'.
	 */
	public SgfensCotizacion[] findWhereSubtotalEquals(double subtotal) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'TOTAL = :total'.
	 */
	public SgfensCotizacion[] findWhereTotalEquals(double total) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'DESCUENTO_MOTIVO = :descuentoMotivo'.
	 */
	public SgfensCotizacion[] findWhereDescuentoMotivoEquals(String descuentoMotivo) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'ID_ESTATUS_COTIZACION = :idEstatusCotizacion'.
	 */
	public SgfensCotizacion[] findWhereIdEstatusCotizacionEquals(short idEstatusCotizacion) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'FOLIO_COTIZACION_MOVIL = :folioCotizacionMovil'.
	 */
	public SgfensCotizacion[] findWhereFolioCotizacionMovilEquals(String folioCotizacionMovil) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'IS_MODIFICADO_CONSOLA = :isModificadoConsola'.
	 */
	public SgfensCotizacion[] findWhereIsModificadoConsolaEquals(short isModificadoConsola) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'LATITUD = :latitud'.
	 */
	public SgfensCotizacion[] findWhereLatitudEquals(double latitud) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the criteria 'LONGITUD = :longitud'.
	 */
	public SgfensCotizacion[] findWhereLongitudEquals(double longitud) throws SgfensCotizacionDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the specified arbitrary SQL statement
	 */
	public SgfensCotizacion[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensCotizacionDaoException;

	/** 
	 * Returns all rows from the sgfens_cotizacion table that match the specified arbitrary SQL statement
	 */
	public SgfensCotizacion[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensCotizacionDaoException;

}
