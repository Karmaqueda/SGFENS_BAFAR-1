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

public interface SmsEnvioErrorDao
{
	/** 
	 * Inserts a new row in the sms_envio_error table.
	 */
	public SmsEnvioErrorPk insert(SmsEnvioError dto) throws SmsEnvioErrorDaoException;

	/** 
	 * Updates a single row in the sms_envio_error table.
	 */
	public void update(SmsEnvioErrorPk pk, SmsEnvioError dto) throws SmsEnvioErrorDaoException;

	/** 
	 * Deletes a single row in the sms_envio_error table.
	 */
	public void delete(SmsEnvioErrorPk pk) throws SmsEnvioErrorDaoException;

	/** 
	 * Returns the rows from the sms_envio_error table that matches the specified primary-key value.
	 */
	public SmsEnvioError findByPrimaryKey(SmsEnvioErrorPk pk) throws SmsEnvioErrorDaoException;

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'id_sms_envio_error = :idSmsEnvioError'.
	 */
	public SmsEnvioError findByPrimaryKey(int idSmsEnvioError) throws SmsEnvioErrorDaoException;

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria ''.
	 */
	public SmsEnvioError[] findAll() throws SmsEnvioErrorDaoException;

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'id_sms_envio_error = :idSmsEnvioError'.
	 */
	public SmsEnvioError[] findWhereIdSmsEnvioErrorEquals(int idSmsEnvioError) throws SmsEnvioErrorDaoException;

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'id_sms_envio_detalle = :idSmsEnvioDetalle'.
	 */
	public SmsEnvioError[] findWhereIdSmsEnvioDetalleEquals(int idSmsEnvioDetalle) throws SmsEnvioErrorDaoException;

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'desc_error = :descError'.
	 */
	public SmsEnvioError[] findWhereDescErrorEquals(String descError) throws SmsEnvioErrorDaoException;

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'fecha_hr_error = :fechaHrError'.
	 */
	public SmsEnvioError[] findWhereFechaHrErrorEquals(Date fechaHrError) throws SmsEnvioErrorDaoException;

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'id_sms_dispositivo = :idSmsDispositivo'.
	 */
	public SmsEnvioError[] findWhereIdSmsDispositivoEquals(int idSmsDispositivo) throws SmsEnvioErrorDaoException;

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public SmsEnvioError[] findWhereIdEmpresaEquals(int idEmpresa) throws SmsEnvioErrorDaoException;

	/** 
	 * Returns all rows from the sms_envio_error table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public SmsEnvioError[] findWhereIdEstatusEquals(int idEstatus) throws SmsEnvioErrorDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the sms_envio_error table that match the specified arbitrary SQL statement
	 */
	public SmsEnvioError[] findByDynamicSelect(String sql, Object[] sqlParams) throws SmsEnvioErrorDaoException;

	/** 
	 * Returns all rows from the sms_envio_error table that match the specified arbitrary SQL statement
	 */
	public SmsEnvioError[] findByDynamicWhere(String sql, Object[] sqlParams) throws SmsEnvioErrorDaoException;

}
