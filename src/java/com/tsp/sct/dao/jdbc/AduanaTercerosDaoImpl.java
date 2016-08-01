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

public class AduanaTercerosDaoImpl extends AbstractDAO implements AduanaTercerosDao
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
	protected final String SQL_SELECT = "SELECT ID_ADUANA_TERCEROS, ID_ADUANA, ID_CUENTA_TERCEROS FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_ADUANA_TERCEROS, ID_ADUANA, ID_CUENTA_TERCEROS ) VALUES ( ?, ?, ? )";

	/** 
	 * Index of column ID_ADUANA_TERCEROS
	 */
	protected static final int COLUMN_ID_ADUANA_TERCEROS = 1;

	/** 
	 * Index of column ID_ADUANA
	 */
	protected static final int COLUMN_ID_ADUANA = 2;

	/** 
	 * Index of column ID_CUENTA_TERCEROS
	 */
	protected static final int COLUMN_ID_CUENTA_TERCEROS = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Inserts a new row in the aduana_terceros table.
	 */
	public void insert(AduanaTerceros dto) throws AduanaTercerosDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setInt( index++, dto.getIdAduanaTerceros() );
			stmt.setInt( index++, dto.getIdAduana() );
			stmt.setInt( index++, dto.getIdCuentaTerceros() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AduanaTercerosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the aduana_terceros table that match the criteria ''.
	 */
	public AduanaTerceros[] findAll() throws AduanaTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the aduana_terceros table that match the criteria 'ID_ADUANA_TERCEROS = :idAduanaTerceros'.
	 */
	public AduanaTerceros[] findWhereIdAduanaTercerosEquals(int idAduanaTerceros) throws AduanaTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ADUANA_TERCEROS = ? ORDER BY ID_ADUANA_TERCEROS", new Object[] {  new Integer(idAduanaTerceros) } );
	}

	/** 
	 * Returns all rows from the aduana_terceros table that match the criteria 'ID_ADUANA = :idAduana'.
	 */
	public AduanaTerceros[] findWhereIdAduanaEquals(int idAduana) throws AduanaTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ADUANA = ? ORDER BY ID_ADUANA", new Object[] {  new Integer(idAduana) } );
	}

	/** 
	 * Returns all rows from the aduana_terceros table that match the criteria 'ID_CUENTA_TERCEROS = :idCuentaTerceros'.
	 */
	public AduanaTerceros[] findWhereIdCuentaTercerosEquals(int idCuentaTerceros) throws AduanaTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CUENTA_TERCEROS = ? ORDER BY ID_CUENTA_TERCEROS", new Object[] {  new Integer(idCuentaTerceros) } );
	}

	/**
	 * Method 'AduanaTercerosDaoImpl'
	 * 
	 */
	public AduanaTercerosDaoImpl()
	{
	}

	/**
	 * Method 'AduanaTercerosDaoImpl'
	 * 
	 * @param userConn
	 */
	public AduanaTercerosDaoImpl(final java.sql.Connection userConn)
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
		return "aduana_terceros";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected AduanaTerceros fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			AduanaTerceros dto = new AduanaTerceros();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected AduanaTerceros[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			AduanaTerceros dto = new AduanaTerceros();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		AduanaTerceros ret[] = new AduanaTerceros[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(AduanaTerceros dto, ResultSet rs) throws SQLException
	{
		dto.setIdAduanaTerceros( rs.getInt( COLUMN_ID_ADUANA_TERCEROS ) );
		dto.setIdAduana( rs.getInt( COLUMN_ID_ADUANA ) );
		dto.setIdCuentaTerceros( rs.getInt( COLUMN_ID_CUENTA_TERCEROS ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(AduanaTerceros dto)
	{
	}

	/** 
	 * Returns all rows from the aduana_terceros table that match the specified arbitrary SQL statement
	 */
	public AduanaTerceros[] findByDynamicSelect(String sql, Object[] sqlParams) throws AduanaTercerosDaoException
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
			throw new AduanaTercerosDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the aduana_terceros table that match the specified arbitrary SQL statement
	 */
	public AduanaTerceros[] findByDynamicWhere(String sql, Object[] sqlParams) throws AduanaTercerosDaoException
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
			throw new AduanaTercerosDaoException( "Exception: " + _e.getMessage(), _e );
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
