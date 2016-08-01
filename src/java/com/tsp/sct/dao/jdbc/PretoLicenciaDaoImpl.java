/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.jdbc;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class PretoLicenciaDaoImpl extends AbstractDAO implements PretoLicenciaDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT ID_PRETO_LICENCIA, NOMBRE_LICENCIA, DESCRIPCION_LICENCIA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_PRETO_LICENCIA, NOMBRE_LICENCIA, DESCRIPCION_LICENCIA ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_PRETO_LICENCIA = ?, NOMBRE_LICENCIA = ?, DESCRIPCION_LICENCIA = ? WHERE ID_PRETO_LICENCIA = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_PRETO_LICENCIA = ?";

	/** 
	 * Index of column ID_PRETO_LICENCIA
	 */
	protected static final int COLUMN_ID_PRETO_LICENCIA = 1;

	/** 
	 * Index of column NOMBRE_LICENCIA
	 */
	protected static final int COLUMN_NOMBRE_LICENCIA = 2;

	/** 
	 * Index of column DESCRIPCION_LICENCIA
	 */
	protected static final int COLUMN_DESCRIPCION_LICENCIA = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column ID_PRETO_LICENCIA
	 */
	protected static final int PK_COLUMN_ID_PRETO_LICENCIA = 1;

	/** 
	 * Inserts a new row in the preto_licencia table.
	 */
	public PretoLicenciaPk insert(PretoLicencia dto) throws PretoLicenciaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdPretoLicenciaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_PRETO_LICENCIA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreLicenciaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_LICENCIA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescripcionLicenciaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DESCRIPCION_LICENCIA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdPretoLicenciaModified()) {
				stmt.setInt( index++, dto.getIdPretoLicencia() );
			}
		
			if (dto.isNombreLicenciaModified()) {
				stmt.setString( index++, dto.getNombreLicencia() );
			}
		
			if (dto.isDescripcionLicenciaModified()) {
				stmt.setString( index++, dto.getDescripcionLicencia() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdPretoLicencia( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PretoLicenciaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the preto_licencia table.
	 */
	public void update(PretoLicenciaPk pk, PretoLicencia dto) throws PretoLicenciaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdPretoLicenciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_PRETO_LICENCIA=?" );
				modified=true;
			}
		
			if (dto.isNombreLicenciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_LICENCIA=?" );
				modified=true;
			}
		
			if (dto.isDescripcionLicenciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DESCRIPCION_LICENCIA=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_PRETO_LICENCIA=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdPretoLicenciaModified()) {
				stmt.setInt( index++, dto.getIdPretoLicencia() );
			}
		
			if (dto.isNombreLicenciaModified()) {
				stmt.setString( index++, dto.getNombreLicencia() );
			}
		
			if (dto.isDescripcionLicenciaModified()) {
				stmt.setString( index++, dto.getDescripcionLicencia() );
			}
		
			stmt.setInt( index++, pk.getIdPretoLicencia() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PretoLicenciaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the preto_licencia table.
	 */
	public void delete(PretoLicenciaPk pk) throws PretoLicenciaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdPretoLicencia() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PretoLicenciaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the preto_licencia table that matches the specified primary-key value.
	 */
	public PretoLicencia findByPrimaryKey(PretoLicenciaPk pk) throws PretoLicenciaDaoException
	{
		return findByPrimaryKey( pk.getIdPretoLicencia() );
	}

	/** 
	 * Returns all rows from the preto_licencia table that match the criteria 'ID_PRETO_LICENCIA = :idPretoLicencia'.
	 */
	public PretoLicencia findByPrimaryKey(int idPretoLicencia) throws PretoLicenciaDaoException
	{
		PretoLicencia ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_PRETO_LICENCIA = ?", new Object[] {  new Integer(idPretoLicencia) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the preto_licencia table that match the criteria ''.
	 */
	public PretoLicencia[] findAll() throws PretoLicenciaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_PRETO_LICENCIA", null );
	}

	/** 
	 * Returns all rows from the preto_licencia table that match the criteria 'ID_PRETO_LICENCIA = :idPretoLicencia'.
	 */
	public PretoLicencia[] findWhereIdPretoLicenciaEquals(int idPretoLicencia) throws PretoLicenciaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PRETO_LICENCIA = ? ORDER BY ID_PRETO_LICENCIA", new Object[] {  new Integer(idPretoLicencia) } );
	}

	/** 
	 * Returns all rows from the preto_licencia table that match the criteria 'NOMBRE_LICENCIA = :nombreLicencia'.
	 */
	public PretoLicencia[] findWhereNombreLicenciaEquals(String nombreLicencia) throws PretoLicenciaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_LICENCIA = ? ORDER BY NOMBRE_LICENCIA", new Object[] { nombreLicencia } );
	}

	/** 
	 * Returns all rows from the preto_licencia table that match the criteria 'DESCRIPCION_LICENCIA = :descripcionLicencia'.
	 */
	public PretoLicencia[] findWhereDescripcionLicenciaEquals(String descripcionLicencia) throws PretoLicenciaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION_LICENCIA = ? ORDER BY DESCRIPCION_LICENCIA", new Object[] { descripcionLicencia } );
	}

	/**
	 * Method 'PretoLicenciaDaoImpl'
	 * 
	 */
	public PretoLicenciaDaoImpl()
	{
	}

	/**
	 * Method 'PretoLicenciaDaoImpl'
	 * 
	 * @param userConn
	 */
	public PretoLicenciaDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "preto_licencia";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected PretoLicencia fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			PretoLicencia dto = new PretoLicencia();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected PretoLicencia[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			PretoLicencia dto = new PretoLicencia();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		PretoLicencia ret[] = new PretoLicencia[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(PretoLicencia dto, ResultSet rs) throws SQLException
	{
		dto.setIdPretoLicencia( rs.getInt( COLUMN_ID_PRETO_LICENCIA ) );
		dto.setNombreLicencia( rs.getString( COLUMN_NOMBRE_LICENCIA ) );
		dto.setDescripcionLicencia( rs.getString( COLUMN_DESCRIPCION_LICENCIA ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(PretoLicencia dto)
	{
		dto.setIdPretoLicenciaModified( false );
		dto.setNombreLicenciaModified( false );
		dto.setDescripcionLicenciaModified( false );
	}

	/** 
	 * Returns all rows from the preto_licencia table that match the specified arbitrary SQL statement
	 */
	public PretoLicencia[] findByDynamicSelect(String sql, Object[] sqlParams) throws PretoLicenciaDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PretoLicenciaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the preto_licencia table that match the specified arbitrary SQL statement
	 */
	public PretoLicencia[] findByDynamicWhere(String sql, Object[] sqlParams) throws PretoLicenciaDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PretoLicenciaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
