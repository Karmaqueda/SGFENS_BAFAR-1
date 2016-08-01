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

public interface ComprobanteFiscalDao
{
	/** 
	 * Inserts a new row in the comprobante_fiscal table.
	 */
	public ComprobanteFiscalPk insert(ComprobanteFiscal dto) throws ComprobanteFiscalDaoException;

	/** 
	 * Updates a single row in the comprobante_fiscal table.
	 */
	public void update(ComprobanteFiscalPk pk, ComprobanteFiscal dto) throws ComprobanteFiscalDaoException;

	/** 
	 * Deletes a single row in the comprobante_fiscal table.
	 */
	public void delete(ComprobanteFiscalPk pk) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns the rows from the comprobante_fiscal table that matches the specified primary-key value.
	 */
	public ComprobanteFiscal findByPrimaryKey(ComprobanteFiscalPk pk) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ID_COMPROBANTE_FISCAL = :idComprobanteFiscal'.
	 */
	public ComprobanteFiscal findByPrimaryKey(int idComprobanteFiscal) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria ''.
	 */
	public ComprobanteFiscal[] findAll() throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ID_COMPROBANTE_FISCAL = :idComprobanteFiscal'.
	 */
	public ComprobanteFiscal[] findWhereIdComprobanteFiscalEquals(int idComprobanteFiscal) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ID_TIPO_COMPROBANTE = :idTipoComprobante'.
	 */
	public ComprobanteFiscal[] findWhereIdTipoComprobanteEquals(int idTipoComprobante) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public ComprobanteFiscal[] findWhereIdEmpresaEquals(int idEmpresa) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public ComprobanteFiscal[] findWhereIdClienteEquals(int idCliente) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public ComprobanteFiscal[] findWhereIdEstatusEquals(int idEstatus) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ID_FOLIO = :idFolio'.
	 */
	public ComprobanteFiscal[] findWhereIdFolioEquals(int idFolio) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ID_FORMA_PAGO = :idFormaPago'.
	 */
	public ComprobanteFiscal[] findWhereIdFormaPagoEquals(int idFormaPago) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ID_TIPO_PAGO = :idTipoPago'.
	 */
	public ComprobanteFiscal[] findWhereIdTipoPagoEquals(int idTipoPago) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'CONDICIONES_PAGO = :condicionesPago'.
	 */
	public ComprobanteFiscal[] findWhereCondicionesPagoEquals(String condicionesPago) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'FOLIO_GENERADO = :folioGenerado'.
	 */
	public ComprobanteFiscal[] findWhereFolioGeneradoEquals(String folioGenerado) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'FECHA_IMPRESION = :fechaImpresion'.
	 */
	public ComprobanteFiscal[] findWhereFechaImpresionEquals(Date fechaImpresion) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'FECHA_CAPTURA = :fechaCaptura'.
	 */
	public ComprobanteFiscal[] findWhereFechaCapturaEquals(Date fechaCaptura) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'FECHA_PAGO = :fechaPago'.
	 */
	public ComprobanteFiscal[] findWhereFechaPagoEquals(Date fechaPago) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'IMPORTE_SUBTOTAL = :importeSubtotal'.
	 */
	public ComprobanteFiscal[] findWhereImporteSubtotalEquals(float importeSubtotal) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'IMPUESTOS = :impuestos'.
	 */
	public ComprobanteFiscal[] findWhereImpuestosEquals(float impuestos) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'IMPORTE_NETO = :importeNeto'.
	 */
	public ComprobanteFiscal[] findWhereImporteNetoEquals(float importeNeto) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'PARCIALIDAD = :parcialidad'.
	 */
	public ComprobanteFiscal[] findWhereParcialidadEquals(String parcialidad) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'CONCEPTO = :concepto'.
	 */
	public ComprobanteFiscal[] findWhereConceptoEquals(String concepto) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ARCHIVO_CFD = :archivoCfd'.
	 */
	public ComprobanteFiscal[] findWhereArchivoCfdEquals(String archivoCfd) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'CADENA_ORIGINAL = :cadenaOriginal'.
	 */
	public ComprobanteFiscal[] findWhereCadenaOriginalEquals(String cadenaOriginal) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'SELLO_DIGITAL = :selloDigital'.
	 */
	public ComprobanteFiscal[] findWhereSelloDigitalEquals(String selloDigital) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'COMENTARIOS = :comentarios'.
	 */
	public ComprobanteFiscal[] findWhereComentariosEquals(String comentarios) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ID_DIVISAS = :idDivisas'.
	 */
	public ComprobanteFiscal[] findWhereIdDivisasEquals(int idDivisas) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ID_TIPO_MONEDA = :idTipoMoneda'.
	 */
	public ComprobanteFiscal[] findWhereIdTipoMonedaEquals(int idTipoMoneda) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'TIPO_DE_CAMBIO = :tipoDeCambio'.
	 */
	public ComprobanteFiscal[] findWhereTipoDeCambioEquals(float tipoDeCambio) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'UUID = :uuid'.
	 */
	public ComprobanteFiscal[] findWhereUuidEquals(String uuid) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'SELLO_SAT = :selloSat'.
	 */
	public ComprobanteFiscal[] findWhereSelloSatEquals(String selloSat) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ACUSE_CANCELACION = :acuseCancelacion'.
	 */
	public ComprobanteFiscal[] findWhereAcuseCancelacionEquals(String acuseCancelacion) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'DESCUENTO = :descuento'.
	 */
	public ComprobanteFiscal[] findWhereDescuentoEquals(float descuento) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'MOTIVO_DESCUENTO = :motivoDescuento'.
	 */
	public ComprobanteFiscal[] findWhereMotivoDescuentoEquals(String motivoDescuento) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'FECHA_VIGENCIA = :fechaVigencia'.
	 */
	public ComprobanteFiscal[] findWhereFechaVigenciaEquals(String fechaVigencia) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'SECOFI = :secofi'.
	 */
	public ComprobanteFiscal[] findWhereSecofiEquals(String secofi) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'NUMERO_FACTURA = :numeroFactura'.
	 */
	public ComprobanteFiscal[] findWhereNumeroFacturaEquals(String numeroFactura) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'NO_CERTIFICADO_SAT = :noCertificadoSat'.
	 */
	public ComprobanteFiscal[] findWhereNoCertificadoSatEquals(String noCertificadoSat) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'ID_PRODUCTOR = :idProductor'.
	 */
	public ComprobanteFiscal[] findWhereIdProductorEquals(int idProductor) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'UNIDAD = :unidad'.
	 */
	public ComprobanteFiscal[] findWhereUnidadEquals(String unidad) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'FECHA_TIMBRADO = :fechaTimbrado'.
	 */
	public ComprobanteFiscal[] findWhereFechaTimbradoEquals(Date fechaTimbrado) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'CREADO_AUTOMATICAMENTE = :creadoAutomaticamente'.
	 */
	public ComprobanteFiscal[] findWhereCreadoAutomaticamenteEquals(int creadoAutomaticamente) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the criteria 'SALDO_PAGADO = :saldoPagado'.
	 */
	public ComprobanteFiscal[] findWhereSaldoPagadoEquals(double saldoPagado) throws ComprobanteFiscalDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the specified arbitrary SQL statement
	 */
	public ComprobanteFiscal[] findByDynamicSelect(String sql, Object[] sqlParams) throws ComprobanteFiscalDaoException;

	/** 
	 * Returns all rows from the comprobante_fiscal table that match the specified arbitrary SQL statement
	 */
	public ComprobanteFiscal[] findByDynamicWhere(String sql, Object[] sqlParams) throws ComprobanteFiscalDaoException;

}
