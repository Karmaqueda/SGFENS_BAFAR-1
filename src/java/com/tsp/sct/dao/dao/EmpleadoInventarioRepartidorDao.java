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

public interface EmpleadoInventarioRepartidorDao
{
	/** 
	 * Inserts a new row in the empleado_inventario_repartidor table.
	 */
	public EmpleadoInventarioRepartidorPk insert(EmpleadoInventarioRepartidor dto) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Updates a single row in the empleado_inventario_repartidor table.
	 */
	public void update(EmpleadoInventarioRepartidorPk pk, EmpleadoInventarioRepartidor dto) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Deletes a single row in the empleado_inventario_repartidor table.
	 */
	public void delete(EmpleadoInventarioRepartidorPk pk) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Returns the rows from the empleado_inventario_repartidor table that matches the specified primary-key value.
	 */
	public EmpleadoInventarioRepartidor findByPrimaryKey(EmpleadoInventarioRepartidorPk pk) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Returns all rows from the empleado_inventario_repartidor table that match the criteria 'ID_INVENTARIO = :idInventario'.
	 */
	public EmpleadoInventarioRepartidor findByPrimaryKey(int idInventario) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Returns all rows from the empleado_inventario_repartidor table that match the criteria ''.
	 */
	public EmpleadoInventarioRepartidor[] findAll() throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Returns all rows from the empleado_inventario_repartidor table that match the criteria 'ID_INVENTARIO = :idInventario'.
	 */
	public EmpleadoInventarioRepartidor[] findWhereIdInventarioEquals(int idInventario) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Returns all rows from the empleado_inventario_repartidor table that match the criteria 'ID_EMPLEADO = :idEmpleado'.
	 */
	public EmpleadoInventarioRepartidor[] findWhereIdEmpleadoEquals(int idEmpleado) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Returns all rows from the empleado_inventario_repartidor table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public EmpleadoInventarioRepartidor[] findWhereIdConceptoEquals(int idConcepto) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Returns all rows from the empleado_inventario_repartidor table that match the criteria 'TIPO_PRODUCTO_SERVICIO = :tipoProductoServicio'.
	 */
	public EmpleadoInventarioRepartidor[] findWhereTipoProductoServicioEquals(int tipoProductoServicio) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Returns all rows from the empleado_inventario_repartidor table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public EmpleadoInventarioRepartidor[] findWhereCantidadEquals(double cantidad) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Returns all rows from the empleado_inventario_repartidor table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public EmpleadoInventarioRepartidor[] findWhereIdEstatusEquals(int idEstatus) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Returns all rows from the empleado_inventario_repartidor table that match the criteria 'PESO = :peso'.
	 */
	public EmpleadoInventarioRepartidor[] findWherePesoEquals(double peso) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Returns all rows from the empleado_inventario_repartidor table that match the criteria 'EXISTENCIA_GRANEL = :existenciaGranel'.
	 */
	public EmpleadoInventarioRepartidor[] findWhereExistenciaGranelEquals(double existenciaGranel) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the empleado_inventario_repartidor table that match the specified arbitrary SQL statement
	 */
	public EmpleadoInventarioRepartidor[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpleadoInventarioRepartidorDaoException;

	/** 
	 * Returns all rows from the empleado_inventario_repartidor table that match the specified arbitrary SQL statement
	 */
	public EmpleadoInventarioRepartidor[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpleadoInventarioRepartidorDaoException;

}
