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

public class NominaTipoIncapacidadDaoImpl extends AbstractDAO implements NominaTipoIncapacidadDao
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
	protected final String SQL_SELECT = "SELECT ID_TIPO_INCAPACIDAD, DESCRIPCION, CLAVE FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_TIPO_INCAPACIDAD, DESCRIPCION, CLAVE ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_TIPO_INCAPACIDAD = ?, DESCRIPCION = ?, CLAVE = ? WHERE ID_TIPO_INCAPACIDAD = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_TIPO_INCAPACIDAD = ?";

	/** 
	 * Index of column ID_TIPO_INCAPACIDAD
	 */
	protected static final int COLUMN_ID_TIPO_INCAPACIDAD = 1;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 2;

	/** 
	 * Index of column CLAVE
	 */
	protected static final int COLUMN_CLAVE = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column ID_TIPO_INCAPACIDAD
	 */
	protected static final int PK_COLUMN_ID_TIPO_INCAPACIDAD = 1;

	/** 
	 * Inserts a new row in the nomina_tipo_incapacidad table.
	 */
	public NominaTipoIncapacidadPk insert(NominaTipoIncapacidad dto) throws NominaTipoIncapacidadDaoException
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
			if (dto.isIdTipoIncapacidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_TIPO_INCAPACIDAD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescripcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DESCRIPCION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isClaveModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CLAVE" );
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
			if (dto.isIdTipoIncapacidadModified()) {
				stmt.setInt( index++, dto.getIdTipoIncapacidad() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isClaveModified()) {
				if (dto.isClaveNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getClave() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdTipoIncapacidad( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaTipoIncapacidadDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the nomina_tipo_incapacidad table.
	 */
	public void update(NominaTipoIncapacidadPk pk, NominaTipoIncapacidad dto) throws NominaTipoIncapacidadDaoException
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
			if (dto.isIdTipoIncapacidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_TIPO_INCAPACIDAD=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DESCRIPCION=?" );
				modified=true;
			}
		
			if (dto.isClaveModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CLAVE=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_TIPO_INCAPACIDAD=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdTipoIncapacidadModified()) {
				stmt.setInt( index++, dto.getIdTipoIncapacidad() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isClaveModified()) {
				if (dto.isClaveNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getClave() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdTipoIncapacidad() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaTipoIncapacidadDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the nomina_tipo_incapacidad table.
	 */
	public void delete(NominaTipoIncapacidadPk pk) throws NominaTipoIncapacidadDaoException
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
			stmt.setInt( 1, pk.getIdTipoIncapacidad() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaTipoIncapacidadDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the nomina_tipo_incapacidad table that matches the specified primary-key value.
	 */
	public NominaTipoIncapacidad findByPrimaryKey(NominaTipoIncapacidadPk pk) throws NominaTipoIncapacidadDaoException
	{
		return findByPrimaryKey( pk.getIdTipoIncapacidad() );
	}

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the criteria 'ID_TIPO_INCAPACIDAD = :idTipoIncapacidad'.
	 */
	public NominaTipoIncapacidad findByPrimaryKey(int idTipoIncapacidad) throws NominaTipoIncapacidadDaoException
	{
		NominaTipoIncapacidad ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_TIPO_INCAPACIDAD = ?", new Object[] {  new Integer(idTipoIncapacidad) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the criteria ''.
	 */
	public NominaTipoIncapacidad[] findAll() throws NominaTipoIncapacidadDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_TIPO_INCAPACIDAD", null );
	}

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the criteria 'ID_TIPO_INCAPACIDAD = :idTipoIncapacidad'.
	 */
	public NominaTipoIncapacidad[] findWhereIdTipoIncapacidadEquals(int idTipoIncapacidad) throws NominaTipoIncapacidadDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_TIPO_INCAPACIDAD = ? ORDER BY ID_TIPO_INCAPACIDAD", new Object[] {  new Integer(idTipoIncapacidad) } );
	}

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public NominaTipoIncapacidad[] findWhereDescripcionEquals(String descripcion) throws NominaTipoIncapacidadDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the criteria 'CLAVE = :clave'.
	 */
	public NominaTipoIncapacidad[] findWhereClaveEquals(int clave) throws NominaTipoIncapacidadDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CLAVE = ? ORDER BY CLAVE", new Object[] {  new Integer(clave) } );
	}

	/**
	 * Method 'NominaTipoIncapacidadDaoImpl'
	 * 
	 */
	public NominaTipoIncapacidadDaoImpl()
	{
	}

	/**
	 * Method 'NominaTipoIncapacidadDaoImpl'
	 * 
	 * @param userConn
	 */
	public NominaTipoIncapacidadDaoImpl(final java.sql.Connection userConn)
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
		return "nomina_tipo_incapacidad";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected NominaTipoIncapacidad fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			NominaTipoIncapacidad dto = new NominaTipoIncapacidad();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected NominaTipoIncapacidad[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			NominaTipoIncapacidad dto = new NominaTipoIncapacidad();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		NominaTipoIncapacidad ret[] = new NominaTipoIncapacidad[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(NominaTipoIncapacidad dto, ResultSet rs) throws SQLException
	{
		dto.setIdTipoIncapacidad( rs.getInt( COLUMN_ID_TIPO_INCAPACIDAD ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setClave( rs.getInt( COLUMN_CLAVE ) );
		if (rs.wasNull()) {
			dto.setClaveNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(NominaTipoIncapacidad dto)
	{
		dto.setIdTipoIncapacidadModified( false );
		dto.setDescripcionModified( false );
		dto.setClaveModified( false );
	}

	/** 
	 * Returns all rows from the nomina_tipo_incapacidad table that match the specified arbitrary SQL statement
	 */
	public NominaTipoIncapacidad[] findByDynamicSelect(String sql, Object[] sqlParams) throws NominaTipoIncapacidadDaoException
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
			throw new NominaTipoIncapacidadDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the nomina_tipo_incapacidad table that match the specified arbitrary SQL statement
	 */
	public NominaTipoIncapacidad[] findByDynamicWhere(String sql, Object[] sqlParams) throws NominaTipoIncapacidadDaoException
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
			throw new NominaTipoIncapacidadDaoException( "Exception: " + _e.getMessage(), _e );
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
