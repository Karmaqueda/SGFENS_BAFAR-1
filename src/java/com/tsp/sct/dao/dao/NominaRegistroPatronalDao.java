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

public interface NominaRegistroPatronalDao
{
	/** 
	 * Inserts a new row in the nomina_registro_patronal table.
	 */
	public NominaRegistroPatronalPk insert(NominaRegistroPatronal dto) throws NominaRegistroPatronalDaoException;

	/** 
	 * Updates a single row in the nomina_registro_patronal table.
	 */
	public void update(NominaRegistroPatronalPk pk, NominaRegistroPatronal dto) throws NominaRegistroPatronalDaoException;

	/** 
	 * Deletes a single row in the nomina_registro_patronal table.
	 */
	public void delete(NominaRegistroPatronalPk pk) throws NominaRegistroPatronalDaoException;

	/** 
	 * Returns the rows from the nomina_registro_patronal table that matches the specified primary-key value.
	 */
	public NominaRegistroPatronal findByPrimaryKey(NominaRegistroPatronalPk pk) throws NominaRegistroPatronalDaoException;

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the criteria 'id_nomina_reg_patronal = :idNominaRegPatronal'.
	 */
	public NominaRegistroPatronal findByPrimaryKey(int idNominaRegPatronal) throws NominaRegistroPatronalDaoException;

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the criteria ''.
	 */
	public NominaRegistroPatronal[] findAll() throws NominaRegistroPatronalDaoException;

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the criteria 'id_nomina_reg_patronal = :idNominaRegPatronal'.
	 */
	public NominaRegistroPatronal[] findWhereIdNominaRegPatronalEquals(int idNominaRegPatronal) throws NominaRegistroPatronalDaoException;

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public NominaRegistroPatronal[] findWhereIdEmpresaEquals(int idEmpresa) throws NominaRegistroPatronalDaoException;

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the criteria 'registro_patronal = :registroPatronal'.
	 */
	public NominaRegistroPatronal[] findWhereRegistroPatronalEquals(String registroPatronal) throws NominaRegistroPatronalDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the specified arbitrary SQL statement
	 */
	public NominaRegistroPatronal[] findByDynamicSelect(String sql, Object[] sqlParams) throws NominaRegistroPatronalDaoException;

	/** 
	 * Returns all rows from the nomina_registro_patronal table that match the specified arbitrary SQL statement
	 */
	public NominaRegistroPatronal[] findByDynamicWhere(String sql, Object[] sqlParams) throws NominaRegistroPatronalDaoException;

}
