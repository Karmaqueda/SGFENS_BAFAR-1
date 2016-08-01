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

public interface DatosUsuarioDao
{
	/** 
	 * Inserts a new row in the datos_usuario table.
	 */
	public DatosUsuarioPk insert(DatosUsuario dto) throws DatosUsuarioDaoException;

	/** 
	 * Updates a single row in the datos_usuario table.
	 */
	public void update(DatosUsuarioPk pk, DatosUsuario dto) throws DatosUsuarioDaoException;

	/** 
	 * Deletes a single row in the datos_usuario table.
	 */
	public void delete(DatosUsuarioPk pk) throws DatosUsuarioDaoException;

	/** 
	 * Returns the rows from the datos_usuario table that matches the specified primary-key value.
	 */
	public DatosUsuario findByPrimaryKey(DatosUsuarioPk pk) throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'ID_DATOS_USUARIO = :idDatosUsuario'.
	 */
	public DatosUsuario findByPrimaryKey(int idDatosUsuario) throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria ''.
	 */
	public DatosUsuario[] findAll() throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'ID_DATOS_USUARIO = :idDatosUsuario'.
	 */
	public DatosUsuario[] findWhereIdDatosUsuarioEquals(int idDatosUsuario) throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'NOMBRE = :nombre'.
	 */
	public DatosUsuario[] findWhereNombreEquals(String nombre) throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'APELLIDO_PAT = :apellidoPat'.
	 */
	public DatosUsuario[] findWhereApellidoPatEquals(String apellidoPat) throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'APELLIDO_MAT = :apellidoMat'.
	 */
	public DatosUsuario[] findWhereApellidoMatEquals(String apellidoMat) throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'DIRECCION = :direccion'.
	 */
	public DatosUsuario[] findWhereDireccionEquals(String direccion) throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'LADA = :lada'.
	 */
	public DatosUsuario[] findWhereLadaEquals(String lada) throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'TELEFONO = :telefono'.
	 */
	public DatosUsuario[] findWhereTelefonoEquals(String telefono) throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'EXTENSION = :extension'.
	 */
	public DatosUsuario[] findWhereExtensionEquals(String extension) throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'CELULAR = :celular'.
	 */
	public DatosUsuario[] findWhereCelularEquals(String celular) throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the criteria 'CORREO = :correo'.
	 */
	public DatosUsuario[] findWhereCorreoEquals(String correo) throws DatosUsuarioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the datos_usuario table that match the specified arbitrary SQL statement
	 */
	public DatosUsuario[] findByDynamicSelect(String sql, Object[] sqlParams) throws DatosUsuarioDaoException;

	/** 
	 * Returns all rows from the datos_usuario table that match the specified arbitrary SQL statement
	 */
	public DatosUsuario[] findByDynamicWhere(String sql, Object[] sqlParams) throws DatosUsuarioDaoException;

}
