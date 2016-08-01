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

public interface CrCredClienteDao
{
	/** 
	 * Inserts a new row in the cr_cred_cliente table.
	 */
	public CrCredClientePk insert(CrCredCliente dto) throws CrCredClienteDaoException;

	/** 
	 * Updates a single row in the cr_cred_cliente table.
	 */
	public void update(CrCredClientePk pk, CrCredCliente dto) throws CrCredClienteDaoException;

	/** 
	 * Deletes a single row in the cr_cred_cliente table.
	 */
	public void delete(CrCredClientePk pk) throws CrCredClienteDaoException;

	/** 
	 * Returns the rows from the cr_cred_cliente table that matches the specified primary-key value.
	 */
	public CrCredCliente findByPrimaryKey(CrCredClientePk pk) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'id_cred_cliente = :idCredCliente'.
	 */
	public CrCredCliente findByPrimaryKey(int idCredCliente) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria ''.
	 */
	public CrCredCliente[] findAll() throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'id_cred_cliente = :idCredCliente'.
	 */
	public CrCredCliente[] findWhereIdCredClienteEquals(int idCredCliente) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'id_formulario_evento = :idFormularioEvento'.
	 */
	public CrCredCliente[] findWhereIdFormularioEventoEquals(int idFormularioEvento) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public CrCredCliente[] findWhereIdEstatusEquals(int idEstatus) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public CrCredCliente[] findWhereIdEmpresaEquals(int idEmpresa) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'fecha_hr_creacion = :fechaHrCreacion'.
	 */
	public CrCredCliente[] findWhereFechaHrCreacionEquals(Date fechaHrCreacion) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'fecha_hr_edicion = :fechaHrEdicion'.
	 */
	public CrCredCliente[] findWhereFechaHrEdicionEquals(Date fechaHrEdicion) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'id_usuario_edicion = :idUsuarioEdicion'.
	 */
	public CrCredCliente[] findWhereIdUsuarioEdicionEquals(int idUsuarioEdicion) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'rfc = :rfc'.
	 */
	public CrCredCliente[] findWhereRfcEquals(String rfc) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'nombre_primer = :nombrePrimer'.
	 */
	public CrCredCliente[] findWhereNombrePrimerEquals(String nombrePrimer) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'nombre_segundo = :nombreSegundo'.
	 */
	public CrCredCliente[] findWhereNombreSegundoEquals(String nombreSegundo) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'apellido_paterno = :apellidoPaterno'.
	 */
	public CrCredCliente[] findWhereApellidoPaternoEquals(String apellidoPaterno) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'apellido_materno = :apellidoMaterno'.
	 */
	public CrCredCliente[] findWhereApellidoMaternoEquals(String apellidoMaterno) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'latitud = :latitud'.
	 */
	public CrCredCliente[] findWhereLatitudEquals(double latitud) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'longitud = :longitud'.
	 */
	public CrCredCliente[] findWhereLongitudEquals(double longitud) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'correos_electronicos = :correosElectronicos'.
	 */
	public CrCredCliente[] findWhereCorreosElectronicosEquals(String correosElectronicos) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'id_cliente_s_tercero = :idClienteSTercero'.
	 */
	public CrCredCliente[] findWhereIdClienteSTerceroEquals(String idClienteSTercero) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'id_credito_s_tercero = :idCreditoSTercero'.
	 */
	public CrCredCliente[] findWhereIdCreditoSTerceroEquals(String idCreditoSTercero) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'fecha_inicio_credito = :fechaInicioCredito'.
	 */
	public CrCredCliente[] findWhereFechaInicioCreditoEquals(Date fechaInicioCredito) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'fecha_fin_credito = :fechaFinCredito'.
	 */
	public CrCredCliente[] findWhereFechaFinCreditoEquals(Date fechaFinCredito) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'plazo_meses = :plazoMeses'.
	 */
	public CrCredCliente[] findWherePlazoMesesEquals(int plazoMeses) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'plazo_vencimiento = :plazoVencimiento'.
	 */
	public CrCredCliente[] findWherePlazoVencimientoEquals(int plazoVencimiento) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'vencimiento = :vencimiento'.
	 */
	public CrCredCliente[] findWhereVencimientoEquals(String vencimiento) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'monto_prestado = :montoPrestado'.
	 */
	public CrCredCliente[] findWhereMontoPrestadoEquals(double montoPrestado) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'monto_adeudado = :montoAdeudado'.
	 */
	public CrCredCliente[] findWhereMontoAdeudadoEquals(double montoAdeudado) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'dias_mora = :diasMora'.
	 */
	public CrCredCliente[] findWhereDiasMoraEquals(int diasMora) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'saldo_vencido = :saldoVencido'.
	 */
	public CrCredCliente[] findWhereSaldoVencidoEquals(double saldoVencido) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'importe_pagar_vencimiento = :importePagarVencimiento'.
	 */
	public CrCredCliente[] findWhereImportePagarVencimientoEquals(double importePagarVencimiento) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'fecha_hora_agenda = :fechaHoraAgenda'.
	 */
	public CrCredCliente[] findWhereFechaHoraAgendaEquals(Date fechaHoraAgenda) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'num_pagos_realizados_vencimiento = :numPagosRealizadosVencimiento'.
	 */
	public CrCredCliente[] findWhereNumPagosRealizadosVencimientoEquals(int numPagosRealizadosVencimiento) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'suma_monto_pagado_vencimiento = :sumaMontoPagadoVencimiento'.
	 */
	public CrCredCliente[] findWhereSumaMontoPagadoVencimientoEquals(double sumaMontoPagadoVencimiento) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'cuotas_devengadas = :cuotasDevengadas'.
	 */
	public CrCredCliente[] findWhereCuotasDevengadasEquals(int cuotasDevengadas) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'cuotas_pagadas = :cuotasPagadas'.
	 */
	public CrCredCliente[] findWhereCuotasPagadasEquals(int cuotasPagadas) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the criteria 'cuotas_vencidas = :cuotasVencidas'.
	 */
	public CrCredCliente[] findWhereCuotasVencidasEquals(int cuotasVencidas) throws CrCredClienteDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the specified arbitrary SQL statement
	 */
	public CrCredCliente[] findByDynamicSelect(String sql, Object[] sqlParams) throws CrCredClienteDaoException;

	/** 
	 * Returns all rows from the cr_cred_cliente table that match the specified arbitrary SQL statement
	 */
	public CrCredCliente[] findByDynamicWhere(String sql, Object[] sqlParams) throws CrCredClienteDaoException;

}
