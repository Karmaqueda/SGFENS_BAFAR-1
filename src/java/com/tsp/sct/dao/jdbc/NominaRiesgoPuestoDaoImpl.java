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

public class NominaRiesgoPuestoDaoImpl extends AbstractDAO implements NominaRiesgoPuestoDao
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
	protected final String SQL_SELECT = "SELECT ID_RIESGO_PUESTO, NOMBRE, DESCRIPCION FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_RIESGO_PUESTO, NOMBRE, DESCRIPCION ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_RIESGO_PUESTO = ?, NOMBRE = ?, DESCRIPCION = ? WHERE ID_RIESGO_PUESTO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_RIESGO_PUESTO = ?";

	/** 
	 * Index of column ID_RIESGO_PUESTO
	 */
	protected static final int COLUMN_ID_RIESGO_PUESTO = 1;

	/** 
	 * Index of column NOMBRE
	 */
	protected static final int COLUMN_NOMBRE = 2;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column ID_RIESGO_PUESTO
	 */
	protected static final int PK_COLUMN_ID_RIESGO_PUESTO = 1;

	/** 
	 * Inserts a new row in the nomina_riesgo_puesto table.
	 */
	public NominaRiesgoPuestoPk insert(NominaRiesgoPuesto dto) throws NominaRiesgoPuestoDaoException
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
			if (dto.isIdRiesgoPuestoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_RIESGO_PUESTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE" );
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
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdRiesgoPuestoModified()) {
				stmt.setInt( index++, dto.getIdRiesgoPuesto() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdRiesgoPuesto( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaRiesgoPuestoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the nomina_riesgo_puesto table.
	 */
	public void update(NominaRiesgoPuestoPk pk, NominaRiesgoPuesto dto) throws NominaRiesgoPuestoDaoException
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
			if (dto.isIdRiesgoPuestoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_RIESGO_PUESTO=?" );
				modified=true;
			}
		
			if (dto.isNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DESCRIPCION=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_RIESGO_PUESTO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdRiesgoPuestoModified()) {
				stmt.setInt( index++, dto.getIdRiesgoPuesto() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			stmt.setInt( index++, pk.getIdRiesgoPuesto() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaRiesgoPuestoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the nomina_riesgo_puesto table.
	 */
	public void delete(NominaRiesgoPuestoPk pk) throws NominaRiesgoPuestoDaoException
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
			stmt.setInt( 1, pk.getIdRiesgoPuesto() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaRiesgoPuestoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the nomina_riesgo_puesto table that matches the specified primary-key value.
	 */
	public NominaRiesgoPuesto findByPrimaryKey(NominaRiesgoPuestoPk pk) throws NominaRiesgoPuestoDaoException
	{
		return findByPrimaryKey( pk.getIdRiesgoPuesto() );
	}

	/** 
	 * Returns all rows from the nomina_riesgo_puesto table that match the criteria 'ID_RIESGO_PUESTO = :idRiesgoPuesto'.
	 */
	public NominaRiesgoPuesto findByPrimaryKey(int idRiesgoPuesto) throws NominaRiesgoPuestoDaoException
	{
		NominaRiesgoPuesto ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_RIESGO_PUESTO = ?", new Object[] {  new Integer(idRiesgoPuesto) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the nomina_riesgo_puesto table that match the criteria ''.
	 */
	public NominaRiesgoPuesto[] findAll() throws NominaRiesgoPuestoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_RIESGO_PUESTO", null );
	}

	/** 
	 * Returns all rows from the nomina_riesgo_puesto table that match the criteria 'ID_RIESGO_PUESTO = :idRiesgoPuesto'.
	 */
	public NominaRiesgoPuesto[] findWhereIdRiesgoPuestoEquals(int idRiesgoPuesto) throws NominaRiesgoPuestoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_RIESGO_PUESTO = ? ORDER BY ID_RIESGO_PUESTO", new Object[] {  new Integer(idRiesgoPuesto) } );
	}

	/** 
	 * Returns all rows from the nomina_riesgo_puesto table that match the criteria 'NOMBRE = :nombre'.
	 */
	public NominaRiesgoPuesto[] findWhereNombreEquals(String nombre) throws NominaRiesgoPuestoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the nomina_riesgo_puesto table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public NominaRiesgoPuesto[] findWhereDescripcionEquals(String descripcion) throws NominaRiesgoPuestoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/**
	 * Method 'NominaRiesgoPuestoDaoImpl'
	 * 
	 */
	public NominaRiesgoPuestoDaoImpl()
	{
	}

	/**
	 * Method 'NominaRiesgoPuestoDaoImpl'
	 * 
	 * @param userConn
	 */
	public NominaRiesgoPuestoDaoImpl(final java.sql.Connection userConn)
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
		return "nomina_riesgo_puesto";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected NominaRiesgoPuesto fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			NominaRiesgoPuesto dto = new NominaRiesgoPuesto();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected NominaRiesgoPuesto[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			NominaRiesgoPuesto dto = new NominaRiesgoPuesto();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		NominaRiesgoPuesto ret[] = new NominaRiesgoPuesto[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(NominaRiesgoPuesto dto, ResultSet rs) throws SQLException
	{
		dto.setIdRiesgoPuesto( rs.getInt( COLUMN_ID_RIESGO_PUESTO ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(NominaRiesgoPuesto dto)
	{
		dto.setIdRiesgoPuestoModified( false );
		dto.setNombreModified( false );
		dto.setDescripcionModified( false );
	}

	/** 
	 * Returns all rows from the nomina_riesgo_puesto table that match the specified arbitrary SQL statement
	 */
	public NominaRiesgoPuesto[] findByDynamicSelect(String sql, Object[] sqlParams) throws NominaRiesgoPuestoDaoException
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
			throw new NominaRiesgoPuestoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the nomina_riesgo_puesto table that match the specified arbitrary SQL statement
	 */
	public NominaRiesgoPuesto[] findByDynamicWhere(String sql, Object[] sqlParams) throws NominaRiesgoPuestoDaoException
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
			throw new NominaRiesgoPuestoDaoException( "Exception: " + _e.getMessage(), _e );
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
