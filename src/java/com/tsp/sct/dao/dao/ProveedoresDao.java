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

public interface ProveedoresDao
{
	/** 
	 * Inserts a new row in the proveedores table.
	 */
	public ProveedoresPk insert(Proveedores dto) throws ProveedoresDaoException;

	/** 
	 * Updates a single row in the proveedores table.
	 */
	public void update(ProveedoresPk pk, Proveedores dto) throws ProveedoresDaoException;

	/** 
	 * Deletes a single row in the proveedores table.
	 */
	public void delete(ProveedoresPk pk) throws ProveedoresDaoException;

	/** 
	 * Returns the rows from the proveedores table that matches the specified primary-key value.
	 */
	public Proveedores findByPrimaryKey(ProveedoresPk pk) throws ProveedoresDaoException;

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'ID_PROVEEDORES = :idProveedores'.
	 */
	public Proveedores findByPrimaryKey(int idProveedores) throws ProveedoresDaoException;

	/** 
	 * Returns all rows from the proveedores table that match the criteria ''.
	 */
	public Proveedores[] findAll() throws ProveedoresDaoException;

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'ID_PROVEEDORES = :idProveedores'.
	 */
	public Proveedores[] findWhereIdProveedoresEquals(int idProveedores) throws ProveedoresDaoException;

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Proveedores[] findWhereIdEmpresaEquals(int idEmpresa) throws ProveedoresDaoException;

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Proveedores[] findWhereIdEstatusEquals(int idEstatus) throws ProveedoresDaoException;

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'NUM_PROVEEDOR = :numProveedor'.
	 */
	public Proveedores[] findWhereNumProveedorEquals(int numProveedor) throws ProveedoresDaoException;

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'NOMBRE = :nombre'.
	 */
	public Proveedores[] findWhereNombreEquals(String nombre) throws ProveedoresDaoException;

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public Proveedores[] findWhereDescripcionEquals(String descripcion) throws ProveedoresDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the proveedores table that match the specified arbitrary SQL statement
	 */
	public Proveedores[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProveedoresDaoException;

	/** 
	 * Returns all rows from the proveedores table that match the specified arbitrary SQL statement
	 */
	public Proveedores[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProveedoresDaoException;

}
