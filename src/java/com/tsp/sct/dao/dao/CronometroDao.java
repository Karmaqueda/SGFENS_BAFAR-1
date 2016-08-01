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

public interface CronometroDao
{
	/** 
	 * Inserts a new row in the cronometro table.
	 */
	public CronometroPk insert(Cronometro dto) throws CronometroDaoException;

	/** 
	 * Updates a single row in the cronometro table.
	 */
	public void update(CronometroPk pk, Cronometro dto) throws CronometroDaoException;

	/** 
	 * Deletes a single row in the cronometro table.
	 */
	public void delete(CronometroPk pk) throws CronometroDaoException;

	/** 
	 * Returns the rows from the cronometro table that matches the specified primary-key value.
	 */
	public Cronometro findByPrimaryKey(CronometroPk pk) throws CronometroDaoException;

	/** 
	 * Returns all rows from the cronometro table that match the criteria 'ID_CRONOMETRO = :idCronometro'.
	 */
	public Cronometro findByPrimaryKey(int idCronometro) throws CronometroDaoException;

	/** 
	 * Returns all rows from the cronometro table that match the criteria ''.
	 */
	public Cronometro[] findAll() throws CronometroDaoException;

	/** 
	 * Returns all rows from the cronometro table that match the criteria 'ID_CRONOMETRO = :idCronometro'.
	 */
	public Cronometro[] findWhereIdCronometroEquals(int idCronometro) throws CronometroDaoException;

	/** 
	 * Returns all rows from the cronometro table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Cronometro[] findWhereIdEmpresaEquals(int idEmpresa) throws CronometroDaoException;

	/** 
	 * Returns all rows from the cronometro table that match the criteria 'ID_EMPLEADO = :idEmpleado'.
	 */
	public Cronometro[] findWhereIdEmpleadoEquals(int idEmpleado) throws CronometroDaoException;

	/** 
	 * Returns all rows from the cronometro table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public Cronometro[] findWhereIdClienteEquals(int idCliente) throws CronometroDaoException;

	/** 
	 * Returns all rows from the cronometro table that match the criteria 'FECHA_INICIO = :fechaInicio'.
	 */
	public Cronometro[] findWhereFechaInicioEquals(Date fechaInicio) throws CronometroDaoException;

	/** 
	 * Returns all rows from the cronometro table that match the criteria 'FECHA_FIN = :fechaFin'.
	 */
	public Cronometro[] findWhereFechaFinEquals(Date fechaFin) throws CronometroDaoException;

	/** 
	 * Returns all rows from the cronometro table that match the criteria 'LATITUD = :latitud'.
	 */
	public Cronometro[] findWhereLatitudEquals(double latitud) throws CronometroDaoException;

	/** 
	 * Returns all rows from the cronometro table that match the criteria 'LONGITUD = :longitud'.
	 */
	public Cronometro[] findWhereLongitudEquals(double longitud) throws CronometroDaoException;

	/** 
	 * Returns all rows from the cronometro table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Cronometro[] findWhereIdEstatusEquals(int idEstatus) throws CronometroDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the cronometro table that match the specified arbitrary SQL statement
	 */
	public Cronometro[] findByDynamicSelect(String sql, Object[] sqlParams) throws CronometroDaoException;

	/** 
	 * Returns all rows from the cronometro table that match the specified arbitrary SQL statement
	 */
	public Cronometro[] findByDynamicWhere(String sql, Object[] sqlParams) throws CronometroDaoException;

}
