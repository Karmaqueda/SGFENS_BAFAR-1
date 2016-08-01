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

public interface SgfensPedidoDevolucionCambioDao
{
	/** 
	 * Inserts a new row in the sgfens_pedido_devolucion_cambio table.
	 */
	public SgfensPedidoDevolucionCambioPk insert(SgfensPedidoDevolucionCambio dto) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Updates a single row in the sgfens_pedido_devolucion_cambio table.
	 */
	public void update(SgfensPedidoDevolucionCambioPk pk, SgfensPedidoDevolucionCambio dto) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Deletes a single row in the sgfens_pedido_devolucion_cambio table.
	 */
	public void delete(SgfensPedidoDevolucionCambioPk pk) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns the rows from the sgfens_pedido_devolucion_cambio table that matches the specified primary-key value.
	 */
	public SgfensPedidoDevolucionCambio findByPrimaryKey(SgfensPedidoDevolucionCambioPk pk) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_PEDIDO_DEVOL_CAMBIO = :idPedidoDevolCambio'.
	 */
	public SgfensPedidoDevolucionCambio findByPrimaryKey(int idPedidoDevolCambio) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria ''.
	 */
	public SgfensPedidoDevolucionCambio[] findAll() throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_PEDIDO_DEVOL_CAMBIO = :idPedidoDevolCambio'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdPedidoDevolCambioEquals(int idPedidoDevolCambio) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdEstatusEquals(int idEstatus) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdEmpresaEquals(int idEmpresa) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_EMPLEADO = :idEmpleado'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdEmpleadoEquals(int idEmpleado) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdConceptoEquals(int idConcepto) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_PEDIDO = :idPedido'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdPedidoEquals(int idPedido) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_TIPO = :idTipo'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdTipoEquals(int idTipo) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'APTO_PARA_VENTA = :aptoParaVenta'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereAptoParaVentaEquals(double aptoParaVenta) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'NO_APTO_PARA_VENTA = :noAptoParaVenta'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereNoAptoParaVentaEquals(double noAptoParaVenta) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_CLASIFICACION = :idClasificacion'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdClasificacionEquals(int idClasificacion) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'DESCRIPCION_CLASIFICACION = :descripcionClasificacion'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereDescripcionClasificacionEquals(String descripcionClasificacion) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'ID_CONCEPTO_ENTREGADO = :idConceptoEntregado'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereIdConceptoEntregadoEquals(int idConceptoEntregado) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'MONTO_RESULTANTE = :montoResultante'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereMontoResultanteEquals(double montoResultante) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'DIFERENCIA_FAVOR = :diferenciaFavor'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereDiferenciaFavorEquals(int diferenciaFavor) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'FECHA = :fecha'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereFechaEquals(Date fecha) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'CANTIDAD_DEVUELTA = :cantidadDevuelta'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereCantidadDevueltaEquals(double cantidadDevuelta) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'FOLIO_MOVIL = :folioMovil'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereFolioMovilEquals(String folioMovil) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the criteria 'DEVOLUCION_EFCTIVO = :devolucionEfctivo'.
	 */
	public SgfensPedidoDevolucionCambio[] findWhereDevolucionEfctivoEquals(double devolucionEfctivo) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the specified arbitrary SQL statement
	 */
	public SgfensPedidoDevolucionCambio[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensPedidoDevolucionCambioDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_devolucion_cambio table that match the specified arbitrary SQL statement
	 */
	public SgfensPedidoDevolucionCambio[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensPedidoDevolucionCambioDaoException;

}
