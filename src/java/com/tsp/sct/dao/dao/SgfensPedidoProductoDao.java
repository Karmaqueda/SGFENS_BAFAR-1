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

public interface SgfensPedidoProductoDao
{
	/** 
	 * Inserts a new row in the sgfens_pedido_producto table.
	 */
	public SgfensPedidoProductoPk insert(SgfensPedidoProducto dto) throws SgfensPedidoProductoDaoException;

	/** 
	 * Updates a single row in the sgfens_pedido_producto table.
	 */
	public void update(SgfensPedidoProductoPk pk, SgfensPedidoProducto dto) throws SgfensPedidoProductoDaoException;

	/** 
	 * Deletes a single row in the sgfens_pedido_producto table.
	 */
	public void delete(SgfensPedidoProductoPk pk) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns the rows from the sgfens_pedido_producto table that matches the specified primary-key value.
	 */
	public SgfensPedidoProducto findByPrimaryKey(SgfensPedidoProductoPk pk) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'ID_PEDIDO = :idPedido AND ID_CONCEPTO = :idConcepto'.
	 */
	public SgfensPedidoProducto findByPrimaryKey(int idPedido, int idConcepto) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria ''.
	 */
	public SgfensPedidoProducto[] findAll() throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'ID_PEDIDO = :idPedido'.
	 */
	public SgfensPedidoProducto[] findWhereIdPedidoEquals(int idPedido) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public SgfensPedidoProducto[] findWhereIdConceptoEquals(int idConcepto) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public SgfensPedidoProducto[] findWhereDescripcionEquals(String descripcion) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'UNIDAD = :unidad'.
	 */
	public SgfensPedidoProducto[] findWhereUnidadEquals(String unidad) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'IDENTIFICACION = :identificacion'.
	 */
	public SgfensPedidoProducto[] findWhereIdentificacionEquals(String identificacion) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public SgfensPedidoProducto[] findWhereCantidadEquals(double cantidad) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'PRECIO_UNITARIO = :precioUnitario'.
	 */
	public SgfensPedidoProducto[] findWherePrecioUnitarioEquals(double precioUnitario) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'DESCUENTO_PORCENTAJE = :descuentoPorcentaje'.
	 */
	public SgfensPedidoProducto[] findWhereDescuentoPorcentajeEquals(double descuentoPorcentaje) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'DESCUENTO_MONTO = :descuentoMonto'.
	 */
	public SgfensPedidoProducto[] findWhereDescuentoMontoEquals(double descuentoMonto) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'SUBTOTAL = :subtotal'.
	 */
	public SgfensPedidoProducto[] findWhereSubtotalEquals(double subtotal) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'COSTO_UNITARIO = :costoUnitario'.
	 */
	public SgfensPedidoProducto[] findWhereCostoUnitarioEquals(double costoUnitario) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'PORCENTAJE_COMISION_EMPLEADO = :porcentajeComisionEmpleado'.
	 */
	public SgfensPedidoProducto[] findWherePorcentajeComisionEmpleadoEquals(double porcentajeComisionEmpleado) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'CANTIDAD_ENTREGADA = :cantidadEntregada'.
	 */
	public SgfensPedidoProducto[] findWhereCantidadEntregadaEquals(double cantidadEntregada) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'FECHA_ENTREGA = :fechaEntrega'.
	 */
	public SgfensPedidoProducto[] findWhereFechaEntregaEquals(Date fechaEntrega) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'ESTATUS = :estatus'.
	 */
	public SgfensPedidoProducto[] findWhereEstatusEquals(short estatus) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'id_Almacen_Origen = :idAlmacenOrigen'.
	 */
	public SgfensPedidoProducto[] findWhereIdAlmacenOrigenEquals(int idAlmacenOrigen) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'PESO_UNITARIO = :pesoUnitario'.
	 */
	public SgfensPedidoProducto[] findWherePesoUnitarioEquals(double pesoUnitario) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'CANTIDAD_PESO = :cantidadPeso'.
	 */
	public SgfensPedidoProducto[] findWhereCantidadPesoEquals(double cantidadPeso) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'CANTIDAD_ENTREGADA_PESO = :cantidadEntregadaPeso'.
	 */
	public SgfensPedidoProducto[] findWhereCantidadEntregadaPesoEquals(double cantidadEntregadaPeso) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the criteria 'PRECIO_UNITARIO_GRANEL = :precioUnitarioGranel'.
	 */
	public SgfensPedidoProducto[] findWherePrecioUnitarioGranelEquals(double precioUnitarioGranel) throws SgfensPedidoProductoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the specified arbitrary SQL statement
	 */
	public SgfensPedidoProducto[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensPedidoProductoDaoException;

	/** 
	 * Returns all rows from the sgfens_pedido_producto table that match the specified arbitrary SQL statement
	 */
	public SgfensPedidoProducto[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensPedidoProductoDaoException;

}
