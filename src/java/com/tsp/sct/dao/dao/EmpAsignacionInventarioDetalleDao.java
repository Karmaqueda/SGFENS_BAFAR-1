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

public interface EmpAsignacionInventarioDetalleDao
{
	/** 
	 * Inserts a new row in the emp_asignacion_inventario_detalle table.
	 */
	public EmpAsignacionInventarioDetallePk insert(EmpAsignacionInventarioDetalle dto) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Updates a single row in the emp_asignacion_inventario_detalle table.
	 */
	public void update(EmpAsignacionInventarioDetallePk pk, EmpAsignacionInventarioDetalle dto) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Deletes a single row in the emp_asignacion_inventario_detalle table.
	 */
	public void delete(EmpAsignacionInventarioDetallePk pk) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Returns the rows from the emp_asignacion_inventario_detalle table that matches the specified primary-key value.
	 */
	public EmpAsignacionInventarioDetalle findByPrimaryKey(EmpAsignacionInventarioDetallePk pk) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Returns all rows from the emp_asignacion_inventario_detalle table that match the criteria 'id_asignacion_inventario_detalle = :idAsignacionInventarioDetalle'.
	 */
	public EmpAsignacionInventarioDetalle findByPrimaryKey(int idAsignacionInventarioDetalle) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Returns all rows from the emp_asignacion_inventario_detalle table that match the criteria ''.
	 */
	public EmpAsignacionInventarioDetalle[] findAll() throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Returns all rows from the emp_asignacion_inventario_detalle table that match the criteria 'id_asignacion_inventario_detalle = :idAsignacionInventarioDetalle'.
	 */
	public EmpAsignacionInventarioDetalle[] findWhereIdAsignacionInventarioDetalleEquals(int idAsignacionInventarioDetalle) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Returns all rows from the emp_asignacion_inventario_detalle table that match the criteria 'id_asignacion_inventario = :idAsignacionInventario'.
	 */
	public EmpAsignacionInventarioDetalle[] findWhereIdAsignacionInventarioEquals(int idAsignacionInventario) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Returns all rows from the emp_asignacion_inventario_detalle table that match the criteria 'id_concepto = :idConcepto'.
	 */
	public EmpAsignacionInventarioDetalle[] findWhereIdConceptoEquals(int idConcepto) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Returns all rows from the emp_asignacion_inventario_detalle table that match the criteria 'cantidad = :cantidad'.
	 */
	public EmpAsignacionInventarioDetalle[] findWhereCantidadEquals(double cantidad) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Returns all rows from the emp_asignacion_inventario_detalle table that match the criteria 'peso = :peso'.
	 */
	public EmpAsignacionInventarioDetalle[] findWherePesoEquals(double peso) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Returns all rows from the emp_asignacion_inventario_detalle table that match the criteria 'existencia_granel = :existenciaGranel'.
	 */
	public EmpAsignacionInventarioDetalle[] findWhereExistenciaGranelEquals(double existenciaGranel) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Returns all rows from the emp_asignacion_inventario_detalle table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public EmpAsignacionInventarioDetalle[] findWhereIdEstatusEquals(int idEstatus) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Returns all rows from the emp_asignacion_inventario_detalle table that match the criteria 'id_almacen = :idAlmacen'.
	 */
	public EmpAsignacionInventarioDetalle[] findWhereIdAlmacenEquals(int idAlmacen) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the emp_asignacion_inventario_detalle table that match the specified arbitrary SQL statement
	 */
	public EmpAsignacionInventarioDetalle[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpAsignacionInventarioDetalleDaoException;

	/** 
	 * Returns all rows from the emp_asignacion_inventario_detalle table that match the specified arbitrary SQL statement
	 */
	public EmpAsignacionInventarioDetalle[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpAsignacionInventarioDetalleDaoException;

}
