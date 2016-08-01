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

public interface RutaDao
{
	/** 
	 * Inserts a new row in the ruta table.
	 */
	public RutaPk insert(Ruta dto) throws RutaDaoException;

	/** 
	 * Updates a single row in the ruta table.
	 */
	public void update(RutaPk pk, Ruta dto) throws RutaDaoException;

	/** 
	 * Deletes a single row in the ruta table.
	 */
	public void delete(RutaPk pk) throws RutaDaoException;

	/** 
	 * Returns the rows from the ruta table that matches the specified primary-key value.
	 */
	public Ruta findByPrimaryKey(RutaPk pk) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria 'ID_RUTA = :idRuta'.
	 */
	public Ruta findByPrimaryKey(int idRuta) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria ''.
	 */
	public Ruta[] findAll() throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria 'ID_RUTA = :idRuta'.
	 */
	public Ruta[] findWhereIdRutaEquals(int idRuta) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria 'ID_TIPO_RUTA = :idTipoRuta'.
	 */
	public Ruta[] findWhereIdTipoRutaEquals(int idTipoRuta) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria 'ID_EMPLEADO = :idEmpleado'.
	 */
	public Ruta[] findWhereIdEmpleadoEquals(int idEmpleado) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria 'NOMBRE_RUTA = :nombreRuta'.
	 */
	public Ruta[] findWhereNombreRutaEquals(String nombreRuta) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria 'COMENTARIO_RUTA = :comentarioRuta'.
	 */
	public Ruta[] findWhereComentarioRutaEquals(String comentarioRuta) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria 'FH_REG_RUTA = :fhRegRuta'.
	 */
	public Ruta[] findWhereFhRegRutaEquals(Date fhRegRuta) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria 'FH_MODIFICA_RUTA = :fhModificaRuta'.
	 */
	public Ruta[] findWhereFhModificaRutaEquals(Date fhModificaRuta) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria 'RECORRIDO_RUTA = :recorridoRuta'.
	 */
	public Ruta[] findWhereRecorridoRutaEquals(String recorridoRuta) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria 'PARADAS_RUTA = :paradasRuta'.
	 */
	public Ruta[] findWhereParadasRutaEquals(int paradasRuta) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Ruta[] findWhereIdEmpresaEquals(long idEmpresa) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the criteria 'DIAS_SEMANA_RUTA = :diasSemanaRuta'.
	 */
	public Ruta[] findWhereDiasSemanaRutaEquals(String diasSemanaRuta) throws RutaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ruta table that match the specified arbitrary SQL statement
	 */
	public Ruta[] findByDynamicSelect(String sql, Object[] sqlParams) throws RutaDaoException;

	/** 
	 * Returns all rows from the ruta table that match the specified arbitrary SQL statement
	 */
	public Ruta[] findByDynamicWhere(String sql, Object[] sqlParams) throws RutaDaoException;

}