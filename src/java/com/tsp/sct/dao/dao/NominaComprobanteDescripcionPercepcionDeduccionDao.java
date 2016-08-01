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

public interface NominaComprobanteDescripcionPercepcionDeduccionDao
{
	/** 
	 * Inserts a new row in the nomina_comprobante_descripcion_percepcion_deduccion table.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccionPk insert(NominaComprobanteDescripcionPercepcionDeduccion dto) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Updates a single row in the nomina_comprobante_descripcion_percepcion_deduccion table.
	 */
	public void update(NominaComprobanteDescripcionPercepcionDeduccionPk pk, NominaComprobanteDescripcionPercepcionDeduccion dto) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Deletes a single row in the nomina_comprobante_descripcion_percepcion_deduccion table.
	 */
	public void delete(NominaComprobanteDescripcionPercepcionDeduccionPk pk) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns the rows from the nomina_comprobante_descripcion_percepcion_deduccion table that matches the specified primary-key value.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion findByPrimaryKey(NominaComprobanteDescripcionPercepcionDeduccionPk pk) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the criteria 'ID_NOMINA_COMPROBANTE_DESCRIPCION = :idNominaComprobanteDescripcion'.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion findByPrimaryKey(int idNominaComprobanteDescripcion) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the criteria ''.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion[] findAll() throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the criteria 'ID_NOMINA_COMPROBANTE_DESCRIPCION = :idNominaComprobanteDescripcion'.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion[] findWhereIdNominaComprobanteDescripcionEquals(int idNominaComprobanteDescripcion) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the criteria 'ID_CROMPROBANTE_FISCAL = :idCromprobanteFiscal'.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion[] findWhereIdCromprobanteFiscalEquals(int idCromprobanteFiscal) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the criteria 'ID_PERCEPCION_DEDUCCION = :idPercepcionDeduccion'.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion[] findWhereIdPercepcionDeduccionEquals(int idPercepcionDeduccion) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the criteria 'TIPO_CLAVE = :tipoClave'.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion[] findWhereTipoClaveEquals(String tipoClave) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the criteria 'CLAVE_PATRON = :clavePatron'.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion[] findWhereClavePatronEquals(String clavePatron) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the criteria 'CONCEPTO_DESCRIPCION = :conceptoDescripcion'.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion[] findWhereConceptoDescripcionEquals(String conceptoDescripcion) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the criteria 'IMPORTE_GRAVADO = :importeGravado'.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion[] findWhereImporteGravadoEquals(double importeGravado) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the criteria 'IMPORTE_EXCEPTO = :importeExcepto'.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion[] findWhereImporteExceptoEquals(double importeExcepto) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the criteria 'ID_DE_LA_PERCEPCION_DEDUCCION = :idDeLaPercepcionDeduccion'.
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion[] findWhereIdDeLaPercepcionDeduccionEquals(int idDeLaPercepcionDeduccion) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the specified arbitrary SQL statement
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion[] findByDynamicSelect(String sql, Object[] sqlParams) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

	/** 
	 * Returns all rows from the nomina_comprobante_descripcion_percepcion_deduccion table that match the specified arbitrary SQL statement
	 */
	public NominaComprobanteDescripcionPercepcionDeduccion[] findByDynamicWhere(String sql, Object[] sqlParams) throws NominaComprobanteDescripcionPercepcionDeduccionDaoException;

}
