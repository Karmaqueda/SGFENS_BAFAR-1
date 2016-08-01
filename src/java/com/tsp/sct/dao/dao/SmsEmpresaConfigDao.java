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

public interface SmsEmpresaConfigDao
{
	/** 
	 * Inserts a new row in the sms_empresa_config table.
	 */
	public SmsEmpresaConfigPk insert(SmsEmpresaConfig dto) throws SmsEmpresaConfigDaoException;

	/** 
	 * Updates a single row in the sms_empresa_config table.
	 */
	public void update(SmsEmpresaConfigPk pk, SmsEmpresaConfig dto) throws SmsEmpresaConfigDaoException;

	/** 
	 * Deletes a single row in the sms_empresa_config table.
	 */
	public void delete(SmsEmpresaConfigPk pk) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns the rows from the sms_empresa_config table that matches the specified primary-key value.
	 */
	public SmsEmpresaConfig findByPrimaryKey(SmsEmpresaConfigPk pk) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'id_sms_empresa_config = :idSmsEmpresaConfig'.
	 */
	public SmsEmpresaConfig findByPrimaryKey(int idSmsEmpresaConfig) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria ''.
	 */
	public SmsEmpresaConfig[] findAll() throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'id_sms_empresa_config = :idSmsEmpresaConfig'.
	 */
	public SmsEmpresaConfig[] findWhereIdSmsEmpresaConfigEquals(int idSmsEmpresaConfig) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public SmsEmpresaConfig[] findWhereIdEmpresaEquals(int idEmpresa) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'permiso_sms_empleados = :permisoSmsEmpleados'.
	 */
	public SmsEmpresaConfig[] findWherePermisoSmsEmpleadosEquals(int permisoSmsEmpleados) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_venta = :mensajeVenta'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeVentaEquals(int mensajeVenta) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_venta_fijo = :mensajeVentaFijo'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeVentaFijoEquals(int mensajeVentaFijo) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_venta_libre = :mensajeVentaLibre'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeVentaLibreEquals(String mensajeVentaLibre) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_abono = :mensajeAbono'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeAbonoEquals(int mensajeAbono) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_abono_fijo = :mensajeAbonoFijo'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeAbonoFijoEquals(int mensajeAbonoFijo) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_abono_libre = :mensajeAbonoLibre'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeAbonoLibreEquals(String mensajeAbonoLibre) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_factura = :mensajeFactura'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeFacturaEquals(int mensajeFactura) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_factura_fijo = :mensajeFacturaFijo'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeFacturaFijoEquals(int mensajeFacturaFijo) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_factura_libre = :mensajeFacturaLibre'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeFacturaLibreEquals(String mensajeFacturaLibre) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_cancela_fac = :mensajeCancelaFac'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeCancelaFacEquals(int mensajeCancelaFac) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_cancela_fac_fijo = :mensajeCancelaFacFijo'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeCancelaFacFijoEquals(int mensajeCancelaFacFijo) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_cancela_fac_libre = :mensajeCancelaFacLibre'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeCancelaFacLibreEquals(String mensajeCancelaFacLibre) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_callcenter = :mensajeCallcenter'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeCallcenterEquals(int mensajeCallcenter) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_callcenter_fijo = :mensajeCallcenterFijo'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeCallcenterFijoEquals(int mensajeCallcenterFijo) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the criteria 'mensaje_callcenter_libre = :mensajeCallcenterLibre'.
	 */
	public SmsEmpresaConfig[] findWhereMensajeCallcenterLibreEquals(String mensajeCallcenterLibre) throws SmsEmpresaConfigDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the sms_empresa_config table that match the specified arbitrary SQL statement
	 */
	public SmsEmpresaConfig[] findByDynamicSelect(String sql, Object[] sqlParams) throws SmsEmpresaConfigDaoException;

	/** 
	 * Returns all rows from the sms_empresa_config table that match the specified arbitrary SQL statement
	 */
	public SmsEmpresaConfig[] findByDynamicWhere(String sql, Object[] sqlParams) throws SmsEmpresaConfigDaoException;

}
