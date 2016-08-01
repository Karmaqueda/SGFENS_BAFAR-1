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

public interface SgfensCorreoBandejaEnvioDao
{
	/** 
	 * Inserts a new row in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	public SgfensCorreoBandejaEnvioPk insert(SgfensCorreoBandejaEnvio dto) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Updates a single row in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	public void update(SgfensCorreoBandejaEnvioPk pk, SgfensCorreoBandejaEnvio dto) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Deletes a single row in the SGFENS_CORREO_BANDEJA_ENVIO table.
	 */
	public void delete(SgfensCorreoBandejaEnvioPk pk) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns the rows from the SGFENS_CORREO_BANDEJA_ENVIO table that matches the specified primary-key value.
	 */
	public SgfensCorreoBandejaEnvio findByPrimaryKey(SgfensCorreoBandejaEnvioPk pk) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria 'ID_CORREO = :idCorreo'.
	 */
	public SgfensCorreoBandejaEnvio findByPrimaryKey(int idCorreo) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria ''.
	 */
	public SgfensCorreoBandejaEnvio[] findAll() throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria 'ID_CORREO = :idCorreo'.
	 */
	public SgfensCorreoBandejaEnvio[] findWhereIdCorreoEquals(int idCorreo) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public SgfensCorreoBandejaEnvio[] findWhereIdEmpresaEquals(int idEmpresa) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria 'DESTINATARIO = :destinatario'.
	 */
	public SgfensCorreoBandejaEnvio[] findWhereDestinatarioEquals(String destinatario) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria 'DESTINATARIO_CC = :destinatarioCc'.
	 */
	public SgfensCorreoBandejaEnvio[] findWhereDestinatarioCcEquals(String destinatarioCc) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria 'DESTINATARIO_CCO = :destinatarioCco'.
	 */
	public SgfensCorreoBandejaEnvio[] findWhereDestinatarioCcoEquals(String destinatarioCco) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria 'ASUNTO = :asunto'.
	 */
	public SgfensCorreoBandejaEnvio[] findWhereAsuntoEquals(String asunto) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria 'CONTENIDO = :contenido'.
	 */
	public SgfensCorreoBandejaEnvio[] findWhereContenidoEquals(String contenido) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria 'ARCHIVOS_ADJUNTOS_ID = :archivosAdjuntosId'.
	 */
	public SgfensCorreoBandejaEnvio[] findWhereArchivosAdjuntosIdEquals(String archivosAdjuntosId) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria 'FECHA_ORIGINAL = :fechaOriginal'.
	 */
	public SgfensCorreoBandejaEnvio[] findWhereFechaOriginalEquals(Date fechaOriginal) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria 'IS_ENVIADO = :isEnviado'.
	 */
	public SgfensCorreoBandejaEnvio[] findWhereIsEnviadoEquals(short isEnviado) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the criteria 'FECHA_ENVIO = :fechaEnvio'.
	 */
	public SgfensCorreoBandejaEnvio[] findWhereFechaEnvioEquals(Date fechaEnvio) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the specified arbitrary SQL statement
	 */
	public SgfensCorreoBandejaEnvio[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensCorreoBandejaEnvioDaoException;

	/** 
	 * Returns all rows from the SGFENS_CORREO_BANDEJA_ENVIO table that match the specified arbitrary SQL statement
	 */
	public SgfensCorreoBandejaEnvio[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensCorreoBandejaEnvioDaoException;

}
