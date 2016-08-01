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

public interface CrEstadoSolicitudDao
{
	/** 
	 * Inserts a new row in the cr_estado_solicitud table.
	 */
	public CrEstadoSolicitudPk insert(CrEstadoSolicitud dto) throws CrEstadoSolicitudDaoException;

	/** 
	 * Updates a single row in the cr_estado_solicitud table.
	 */
	public void update(CrEstadoSolicitudPk pk, CrEstadoSolicitud dto) throws CrEstadoSolicitudDaoException;

	/** 
	 * Deletes a single row in the cr_estado_solicitud table.
	 */
	public void delete(CrEstadoSolicitudPk pk) throws CrEstadoSolicitudDaoException;

	/** 
	 * Returns the rows from the cr_estado_solicitud table that matches the specified primary-key value.
	 */
	public CrEstadoSolicitud findByPrimaryKey(CrEstadoSolicitudPk pk) throws CrEstadoSolicitudDaoException;

	/** 
	 * Returns all rows from the cr_estado_solicitud table that match the criteria 'id_estado_solicitud = :idEstadoSolicitud'.
	 */
	public CrEstadoSolicitud findByPrimaryKey(int idEstadoSolicitud) throws CrEstadoSolicitudDaoException;

	/** 
	 * Returns all rows from the cr_estado_solicitud table that match the criteria ''.
	 */
	public CrEstadoSolicitud[] findAll() throws CrEstadoSolicitudDaoException;

	/** 
	 * Returns all rows from the cr_estado_solicitud table that match the criteria 'id_estado_solicitud = :idEstadoSolicitud'.
	 */
	public CrEstadoSolicitud[] findWhereIdEstadoSolicitudEquals(int idEstadoSolicitud) throws CrEstadoSolicitudDaoException;

	/** 
	 * Returns all rows from the cr_estado_solicitud table that match the criteria 'nombre = :nombre'.
	 */
	public CrEstadoSolicitud[] findWhereNombreEquals(String nombre) throws CrEstadoSolicitudDaoException;

	/** 
	 * Returns all rows from the cr_estado_solicitud table that match the criteria 'descripcion = :descripcion'.
	 */
	public CrEstadoSolicitud[] findWhereDescripcionEquals(String descripcion) throws CrEstadoSolicitudDaoException;

	/** 
	 * Returns all rows from the cr_estado_solicitud table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public CrEstadoSolicitud[] findWhereIdEmpresaEquals(int idEmpresa) throws CrEstadoSolicitudDaoException;

	/** 
	 * Returns all rows from the cr_estado_solicitud table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public CrEstadoSolicitud[] findWhereIdEstatusEquals(int idEstatus) throws CrEstadoSolicitudDaoException;

	/** 
	 * Returns all rows from the cr_estado_solicitud table that match the criteria 'is_creado_sistema = :isCreadoSistema'.
	 */
	public CrEstadoSolicitud[] findWhereIsCreadoSistemaEquals(int isCreadoSistema) throws CrEstadoSolicitudDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the cr_estado_solicitud table that match the specified arbitrary SQL statement
	 */
	public CrEstadoSolicitud[] findByDynamicSelect(String sql, Object[] sqlParams) throws CrEstadoSolicitudDaoException;

	/** 
	 * Returns all rows from the cr_estado_solicitud table that match the specified arbitrary SQL statement
	 */
	public CrEstadoSolicitud[] findByDynamicWhere(String sql, Object[] sqlParams) throws CrEstadoSolicitudDaoException;

}
