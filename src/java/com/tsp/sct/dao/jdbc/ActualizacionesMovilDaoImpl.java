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
import java.util.Date;
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

public class ActualizacionesMovilDaoImpl extends AbstractDAO implements ActualizacionesMovilDao
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
	protected final String SQL_SELECT = "SELECT ID_ACTUALIZACION, VERSION_CODE, NUM_VERSION, FECHA_LIBERACION, COMENTARIOS, PLATAFORMA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_ACTUALIZACION, VERSION_CODE, NUM_VERSION, FECHA_LIBERACION, COMENTARIOS, PLATAFORMA ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_ACTUALIZACION = ?, VERSION_CODE = ?, NUM_VERSION = ?, FECHA_LIBERACION = ?, COMENTARIOS = ?, PLATAFORMA = ? WHERE ID_ACTUALIZACION = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_ACTUALIZACION = ?";

	/** 
	 * Index of column ID_ACTUALIZACION
	 */
	protected static final int COLUMN_ID_ACTUALIZACION = 1;

	/** 
	 * Index of column VERSION_CODE
	 */
	protected static final int COLUMN_VERSION_CODE = 2;

	/** 
	 * Index of column NUM_VERSION
	 */
	protected static final int COLUMN_NUM_VERSION = 3;

	/** 
	 * Index of column FECHA_LIBERACION
	 */
	protected static final int COLUMN_FECHA_LIBERACION = 4;

	/** 
	 * Index of column COMENTARIOS
	 */
	protected static final int COLUMN_COMENTARIOS = 5;

	/** 
	 * Index of column PLATAFORMA
	 */
	protected static final int COLUMN_PLATAFORMA = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column ID_ACTUALIZACION
	 */
	protected static final int PK_COLUMN_ID_ACTUALIZACION = 1;

	/** 
	 * Inserts a new row in the actualizaciones_movil table.
	 */
	public ActualizacionesMovilPk insert(ActualizacionesMovil dto) throws ActualizacionesMovilDaoException
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
			if (dto.isIdActualizacionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ACTUALIZACION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isVersionCodeModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "VERSION_CODE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNumVersionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NUM_VERSION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaLiberacionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_LIBERACION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isComentariosModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "COMENTARIOS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPlataformaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "PLATAFORMA" );
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
			if (dto.isIdActualizacionModified()) {
				stmt.setInt( index++, dto.getIdActualizacion() );
			}
		
			if (dto.isVersionCodeModified()) {
				if (dto.isVersionCodeNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getVersionCode() );
				}
		
			}
		
			if (dto.isNumVersionModified()) {
				stmt.setString( index++, dto.getNumVersion() );
			}
		
			if (dto.isFechaLiberacionModified()) {
				stmt.setDate(index++, dto.getFechaLiberacion()==null ? null : new java.sql.Date( dto.getFechaLiberacion().getTime() ) );
			}
		
			if (dto.isComentariosModified()) {
				stmt.setString( index++, dto.getComentarios() );
			}
		
			if (dto.isPlataformaModified()) {
				if (dto.isPlataformaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getPlataforma() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdActualizacion( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ActualizacionesMovilDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the actualizaciones_movil table.
	 */
	public void update(ActualizacionesMovilPk pk, ActualizacionesMovil dto) throws ActualizacionesMovilDaoException
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
			if (dto.isIdActualizacionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ACTUALIZACION=?" );
				modified=true;
			}
		
			if (dto.isVersionCodeModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "VERSION_CODE=?" );
				modified=true;
			}
		
			if (dto.isNumVersionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NUM_VERSION=?" );
				modified=true;
			}
		
			if (dto.isFechaLiberacionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_LIBERACION=?" );
				modified=true;
			}
		
			if (dto.isComentariosModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "COMENTARIOS=?" );
				modified=true;
			}
		
			if (dto.isPlataformaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PLATAFORMA=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_ACTUALIZACION=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdActualizacionModified()) {
				stmt.setInt( index++, dto.getIdActualizacion() );
			}
		
			if (dto.isVersionCodeModified()) {
				if (dto.isVersionCodeNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getVersionCode() );
				}
		
			}
		
			if (dto.isNumVersionModified()) {
				stmt.setString( index++, dto.getNumVersion() );
			}
		
			if (dto.isFechaLiberacionModified()) {
				stmt.setDate(index++, dto.getFechaLiberacion()==null ? null : new java.sql.Date( dto.getFechaLiberacion().getTime() ) );
			}
		
			if (dto.isComentariosModified()) {
				stmt.setString( index++, dto.getComentarios() );
			}
		
			if (dto.isPlataformaModified()) {
				if (dto.isPlataformaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getPlataforma() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdActualizacion() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ActualizacionesMovilDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the actualizaciones_movil table.
	 */
	public void delete(ActualizacionesMovilPk pk) throws ActualizacionesMovilDaoException
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
			stmt.setInt( 1, pk.getIdActualizacion() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ActualizacionesMovilDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the actualizaciones_movil table that matches the specified primary-key value.
	 */
	public ActualizacionesMovil findByPrimaryKey(ActualizacionesMovilPk pk) throws ActualizacionesMovilDaoException
	{
		return findByPrimaryKey( pk.getIdActualizacion() );
	}

	/** 
	 * Returns all rows from the actualizaciones_movil table that match the criteria 'ID_ACTUALIZACION = :idActualizacion'.
	 */
	public ActualizacionesMovil findByPrimaryKey(int idActualizacion) throws ActualizacionesMovilDaoException
	{
		ActualizacionesMovil ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_ACTUALIZACION = ?", new Object[] {  new Integer(idActualizacion) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the actualizaciones_movil table that match the criteria ''.
	 */
	public ActualizacionesMovil[] findAll() throws ActualizacionesMovilDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_ACTUALIZACION", null );
	}

	/** 
	 * Returns all rows from the actualizaciones_movil table that match the criteria 'ID_ACTUALIZACION = :idActualizacion'.
	 */
	public ActualizacionesMovil[] findWhereIdActualizacionEquals(int idActualizacion) throws ActualizacionesMovilDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ACTUALIZACION = ? ORDER BY ID_ACTUALIZACION", new Object[] {  new Integer(idActualizacion) } );
	}

	/** 
	 * Returns all rows from the actualizaciones_movil table that match the criteria 'VERSION_CODE = :versionCode'.
	 */
	public ActualizacionesMovil[] findWhereVersionCodeEquals(int versionCode) throws ActualizacionesMovilDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VERSION_CODE = ? ORDER BY VERSION_CODE", new Object[] {  new Integer(versionCode) } );
	}

	/** 
	 * Returns all rows from the actualizaciones_movil table that match the criteria 'NUM_VERSION = :numVersion'.
	 */
	public ActualizacionesMovil[] findWhereNumVersionEquals(String numVersion) throws ActualizacionesMovilDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUM_VERSION = ? ORDER BY NUM_VERSION", new Object[] { numVersion } );
	}

	/** 
	 * Returns all rows from the actualizaciones_movil table that match the criteria 'FECHA_LIBERACION = :fechaLiberacion'.
	 */
	public ActualizacionesMovil[] findWhereFechaLiberacionEquals(Date fechaLiberacion) throws ActualizacionesMovilDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_LIBERACION = ? ORDER BY FECHA_LIBERACION", new Object[] { fechaLiberacion==null ? null : new java.sql.Date( fechaLiberacion.getTime() ) } );
	}

	/** 
	 * Returns all rows from the actualizaciones_movil table that match the criteria 'COMENTARIOS = :comentarios'.
	 */
	public ActualizacionesMovil[] findWhereComentariosEquals(String comentarios) throws ActualizacionesMovilDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COMENTARIOS = ? ORDER BY COMENTARIOS", new Object[] { comentarios } );
	}

	/** 
	 * Returns all rows from the actualizaciones_movil table that match the criteria 'PLATAFORMA = :plataforma'.
	 */
	public ActualizacionesMovil[] findWherePlataformaEquals(int plataforma) throws ActualizacionesMovilDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PLATAFORMA = ? ORDER BY PLATAFORMA", new Object[] {  new Integer(plataforma) } );
	}

	/**
	 * Method 'ActualizacionesMovilDaoImpl'
	 * 
	 */
	public ActualizacionesMovilDaoImpl()
	{
	}

	/**
	 * Method 'ActualizacionesMovilDaoImpl'
	 * 
	 * @param userConn
	 */
	public ActualizacionesMovilDaoImpl(final java.sql.Connection userConn)
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
		return "actualizaciones_movil";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ActualizacionesMovil fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ActualizacionesMovil dto = new ActualizacionesMovil();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ActualizacionesMovil[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ActualizacionesMovil dto = new ActualizacionesMovil();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ActualizacionesMovil ret[] = new ActualizacionesMovil[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ActualizacionesMovil dto, ResultSet rs) throws SQLException
	{
		dto.setIdActualizacion( rs.getInt( COLUMN_ID_ACTUALIZACION ) );
		dto.setVersionCode( rs.getInt( COLUMN_VERSION_CODE ) );
		if (rs.wasNull()) {
			dto.setVersionCodeNull( true );
		}
		
		dto.setNumVersion( rs.getString( COLUMN_NUM_VERSION ) );
		dto.setFechaLiberacion( rs.getDate(COLUMN_FECHA_LIBERACION ) );
		dto.setComentarios( rs.getString( COLUMN_COMENTARIOS ) );
		dto.setPlataforma( rs.getInt( COLUMN_PLATAFORMA ) );
		if (rs.wasNull()) {
			dto.setPlataformaNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ActualizacionesMovil dto)
	{
		dto.setIdActualizacionModified( false );
		dto.setVersionCodeModified( false );
		dto.setNumVersionModified( false );
		dto.setFechaLiberacionModified( false );
		dto.setComentariosModified( false );
		dto.setPlataformaModified( false );
	}

	/** 
	 * Returns all rows from the actualizaciones_movil table that match the specified arbitrary SQL statement
	 */
	public ActualizacionesMovil[] findByDynamicSelect(String sql, Object[] sqlParams) throws ActualizacionesMovilDaoException
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
			throw new ActualizacionesMovilDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the actualizaciones_movil table that match the specified arbitrary SQL statement
	 */
	public ActualizacionesMovil[] findByDynamicWhere(String sql, Object[] sqlParams) throws ActualizacionesMovilDaoException
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
			throw new ActualizacionesMovilDaoException( "Exception: " + _e.getMessage(), _e );
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
