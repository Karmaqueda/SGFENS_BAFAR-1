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

public interface CrFormularioValidacionDao
{
	/** 
	 * Inserts a new row in the cr_formulario_validacion table.
	 */
	public CrFormularioValidacionPk insert(CrFormularioValidacion dto) throws CrFormularioValidacionDaoException;

	/** 
	 * Updates a single row in the cr_formulario_validacion table.
	 */
	public void update(CrFormularioValidacionPk pk, CrFormularioValidacion dto) throws CrFormularioValidacionDaoException;

	/** 
	 * Deletes a single row in the cr_formulario_validacion table.
	 */
	public void delete(CrFormularioValidacionPk pk) throws CrFormularioValidacionDaoException;

	/** 
	 * Returns the rows from the cr_formulario_validacion table that matches the specified primary-key value.
	 */
	public CrFormularioValidacion findByPrimaryKey(CrFormularioValidacionPk pk) throws CrFormularioValidacionDaoException;

	/** 
	 * Returns all rows from the cr_formulario_validacion table that match the criteria 'id_formulario_validacion = :idFormularioValidacion'.
	 */
	public CrFormularioValidacion findByPrimaryKey(int idFormularioValidacion) throws CrFormularioValidacionDaoException;

	/** 
	 * Returns all rows from the cr_formulario_validacion table that match the criteria ''.
	 */
	public CrFormularioValidacion[] findAll() throws CrFormularioValidacionDaoException;

	/** 
	 * Returns all rows from the cr_formulario_validacion table that match the criteria 'id_formulario_validacion = :idFormularioValidacion'.
	 */
	public CrFormularioValidacion[] findWhereIdFormularioValidacionEquals(int idFormularioValidacion) throws CrFormularioValidacionDaoException;

	/** 
	 * Returns all rows from the cr_formulario_validacion table that match the criteria 'nombre = :nombre'.
	 */
	public CrFormularioValidacion[] findWhereNombreEquals(String nombre) throws CrFormularioValidacionDaoException;

	/** 
	 * Returns all rows from the cr_formulario_validacion table that match the criteria 'descripcion = :descripcion'.
	 */
	public CrFormularioValidacion[] findWhereDescripcionEquals(String descripcion) throws CrFormularioValidacionDaoException;

	/** 
	 * Returns all rows from the cr_formulario_validacion table that match the criteria 'regex_java = :regexJava'.
	 */
	public CrFormularioValidacion[] findWhereRegexJavaEquals(String regexJava) throws CrFormularioValidacionDaoException;

	/** 
	 * Returns all rows from the cr_formulario_validacion table that match the criteria 'regex_lenguaje_ext = :regexLenguajeExt'.
	 */
	public CrFormularioValidacion[] findWhereRegexLenguajeExtEquals(String regexLenguajeExt) throws CrFormularioValidacionDaoException;

	/** 
	 * Returns all rows from the cr_formulario_validacion table that match the criteria 'is_creado_sistema = :isCreadoSistema'.
	 */
	public CrFormularioValidacion[] findWhereIsCreadoSistemaEquals(int isCreadoSistema) throws CrFormularioValidacionDaoException;

	/** 
	 * Returns all rows from the cr_formulario_validacion table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public CrFormularioValidacion[] findWhereIdEmpresaEquals(int idEmpresa) throws CrFormularioValidacionDaoException;

	/** 
	 * Returns all rows from the cr_formulario_validacion table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public CrFormularioValidacion[] findWhereIdEstatusEquals(int idEstatus) throws CrFormularioValidacionDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the cr_formulario_validacion table that match the specified arbitrary SQL statement
	 */
	public CrFormularioValidacion[] findByDynamicSelect(String sql, Object[] sqlParams) throws CrFormularioValidacionDaoException;

	/** 
	 * Returns all rows from the cr_formulario_validacion table that match the specified arbitrary SQL statement
	 */
	public CrFormularioValidacion[] findByDynamicWhere(String sql, Object[] sqlParams) throws CrFormularioValidacionDaoException;

}
