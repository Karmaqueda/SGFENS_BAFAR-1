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

public class ZonaHorariaDaoImpl extends AbstractDAO implements ZonaHorariaDao
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
	protected final String SQL_SELECT = "SELECT ID_EMPRESA, ID_ZONA_HORARIA_CATALOGO, FECHA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_EMPRESA, ID_ZONA_HORARIA_CATALOGO, FECHA ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_EMPRESA = ?, ID_ZONA_HORARIA_CATALOGO = ?, FECHA = ? WHERE ID_EMPRESA = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_EMPRESA = ?";

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 1;

	/** 
	 * Index of column ID_ZONA_HORARIA_CATALOGO
	 */
	protected static final int COLUMN_ID_ZONA_HORARIA_CATALOGO = 2;

	/** 
	 * Index of column FECHA
	 */
	protected static final int COLUMN_FECHA = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column ID_EMPRESA
	 */
	protected static final int PK_COLUMN_ID_EMPRESA = 1;

	/** 
	 * Inserts a new row in the zona_horaria table.
	 */
	public ZonaHorariaPk insert(ZonaHoraria dto) throws ZonaHorariaDaoException
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
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPRESA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdZonaHorariaCatalogoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ZONA_HORARIA_CATALOGO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA" );
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
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdZonaHorariaCatalogoModified()) {
				stmt.setInt( index++, dto.getIdZonaHorariaCatalogo() );
			}
		
			if (dto.isFechaModified()) {
				stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ZonaHorariaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the zona_horaria table.
	 */
	public void update(ZonaHorariaPk pk, ZonaHoraria dto) throws ZonaHorariaDaoException
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
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isIdZonaHorariaCatalogoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ZONA_HORARIA_CATALOGO=?" );
				modified=true;
			}
		
			if (dto.isFechaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_EMPRESA=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdZonaHorariaCatalogoModified()) {
				stmt.setInt( index++, dto.getIdZonaHorariaCatalogo() );
			}
		
			if (dto.isFechaModified()) {
				stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			}
		
			stmt.setInt( index++, pk.getIdEmpresa() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ZonaHorariaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the zona_horaria table.
	 */
	public void delete(ZonaHorariaPk pk) throws ZonaHorariaDaoException
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
			stmt.setInt( 1, pk.getIdEmpresa() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ZonaHorariaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the zona_horaria table that matches the specified primary-key value.
	 */
	public ZonaHoraria findByPrimaryKey(ZonaHorariaPk pk) throws ZonaHorariaDaoException
	{
		return findByPrimaryKey( pk.getIdEmpresa() );
	}

	/** 
	 * Returns all rows from the zona_horaria table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public ZonaHoraria findByPrimaryKey(int idEmpresa) throws ZonaHorariaDaoException
	{
		ZonaHoraria ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ?", new Object[] {  new Integer(idEmpresa) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the zona_horaria table that match the criteria ''.
	 */
	public ZonaHoraria[] findAll() throws ZonaHorariaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_EMPRESA", null );
	}

	/** 
	 * Returns all rows from the zona_horaria table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public ZonaHoraria[] findWhereIdEmpresaEquals(int idEmpresa) throws ZonaHorariaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the zona_horaria table that match the criteria 'ID_ZONA_HORARIA_CATALOGO = :idZonaHorariaCatalogo'.
	 */
	public ZonaHoraria[] findWhereIdZonaHorariaCatalogoEquals(int idZonaHorariaCatalogo) throws ZonaHorariaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ZONA_HORARIA_CATALOGO = ? ORDER BY ID_ZONA_HORARIA_CATALOGO", new Object[] {  new Integer(idZonaHorariaCatalogo) } );
	}

	/** 
	 * Returns all rows from the zona_horaria table that match the criteria 'FECHA = :fecha'.
	 */
	public ZonaHoraria[] findWhereFechaEquals(Date fecha) throws ZonaHorariaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA = ? ORDER BY FECHA", new Object[] { fecha==null ? null : new java.sql.Timestamp( fecha.getTime() ) } );
	}

	/**
	 * Method 'ZonaHorariaDaoImpl'
	 * 
	 */
	public ZonaHorariaDaoImpl()
	{
	}

	/**
	 * Method 'ZonaHorariaDaoImpl'
	 * 
	 * @param userConn
	 */
	public ZonaHorariaDaoImpl(final java.sql.Connection userConn)
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
		return "zona_horaria";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ZonaHoraria fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ZonaHoraria dto = new ZonaHoraria();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ZonaHoraria[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ZonaHoraria dto = new ZonaHoraria();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ZonaHoraria ret[] = new ZonaHoraria[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ZonaHoraria dto, ResultSet rs) throws SQLException
	{
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdZonaHorariaCatalogo( rs.getInt( COLUMN_ID_ZONA_HORARIA_CATALOGO ) );
		dto.setFecha( rs.getTimestamp(COLUMN_FECHA ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ZonaHoraria dto)
	{
		dto.setIdEmpresaModified( false );
		dto.setIdZonaHorariaCatalogoModified( false );
		dto.setFechaModified( false );
	}

	/** 
	 * Returns all rows from the zona_horaria table that match the specified arbitrary SQL statement
	 */
	public ZonaHoraria[] findByDynamicSelect(String sql, Object[] sqlParams) throws ZonaHorariaDaoException
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
			throw new ZonaHorariaDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the zona_horaria table that match the specified arbitrary SQL statement
	 */
	public ZonaHoraria[] findByDynamicWhere(String sql, Object[] sqlParams) throws ZonaHorariaDaoException
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
			throw new ZonaHorariaDaoException( "Exception: " + _e.getMessage(), _e );
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
