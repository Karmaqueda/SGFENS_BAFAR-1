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

public class AddendasDaoImpl extends AbstractDAO implements AddendasDao
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
	protected final String SQL_SELECT = "SELECT ID_ADDENDAS, ID_ESTATUS, NOMBRE_XML, NOMBRE_CLIENTE FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_ADDENDAS, ID_ESTATUS, NOMBRE_XML, NOMBRE_CLIENTE ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_ADDENDAS = ?, ID_ESTATUS = ?, NOMBRE_XML = ?, NOMBRE_CLIENTE = ? WHERE ID_ADDENDAS = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_ADDENDAS = ?";

	/** 
	 * Index of column ID_ADDENDAS
	 */
	protected static final int COLUMN_ID_ADDENDAS = 1;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 2;

	/** 
	 * Index of column NOMBRE_XML
	 */
	protected static final int COLUMN_NOMBRE_XML = 3;

	/** 
	 * Index of column NOMBRE_CLIENTE
	 */
	protected static final int COLUMN_NOMBRE_CLIENTE = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column ID_ADDENDAS
	 */
	protected static final int PK_COLUMN_ID_ADDENDAS = 1;

	/** 
	 * Inserts a new row in the addendas table.
	 */
	public AddendasPk insert(Addendas dto) throws AddendasDaoException
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
			stmt.setInt( index++, dto.getIdAddendas() );
			stmt.setInt( index++, dto.getIdEstatus() );
			stmt.setString( index++, dto.getNombreXml() );
			stmt.setString( index++, dto.getNombreCliente() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AddendasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the addendas table.
	 */
	public void update(AddendasPk pk, Addendas dto) throws AddendasDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getIdAddendas() );
			stmt.setInt( index++, dto.getIdEstatus() );
			stmt.setString( index++, dto.getNombreXml() );
			stmt.setString( index++, dto.getNombreCliente() );
			stmt.setInt( 5, pk.getIdAddendas() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AddendasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the addendas table.
	 */
	public void delete(AddendasPk pk) throws AddendasDaoException
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
			stmt.setInt( 1, pk.getIdAddendas() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AddendasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the addendas table that matches the specified primary-key value.
	 */
	public Addendas findByPrimaryKey(AddendasPk pk) throws AddendasDaoException
	{
		return findByPrimaryKey( pk.getIdAddendas() );
	}

	/** 
	 * Returns all rows from the addendas table that match the criteria 'ID_ADDENDAS = :idAddendas'.
	 */
	public Addendas findByPrimaryKey(int idAddendas) throws AddendasDaoException
	{
		Addendas ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_ADDENDAS = ?", new Object[] {  new Integer(idAddendas) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the addendas table that match the criteria ''.
	 */
	public Addendas[] findAll() throws AddendasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_ADDENDAS", null );
	}

	/** 
	 * Returns all rows from the addendas table that match the criteria 'ID_ADDENDAS = :idAddendas'.
	 */
	public Addendas[] findWhereIdAddendasEquals(int idAddendas) throws AddendasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ADDENDAS = ? ORDER BY ID_ADDENDAS", new Object[] {  new Integer(idAddendas) } );
	}

	/** 
	 * Returns all rows from the addendas table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Addendas[] findWhereIdEstatusEquals(int idEstatus) throws AddendasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the addendas table that match the criteria 'NOMBRE_XML = :nombreXml'.
	 */
	public Addendas[] findWhereNombreXmlEquals(String nombreXml) throws AddendasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_XML = ? ORDER BY NOMBRE_XML", new Object[] { nombreXml } );
	}

	/** 
	 * Returns all rows from the addendas table that match the criteria 'NOMBRE_CLIENTE = :nombreCliente'.
	 */
	public Addendas[] findWhereNombreClienteEquals(String nombreCliente) throws AddendasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_CLIENTE = ? ORDER BY NOMBRE_CLIENTE", new Object[] { nombreCliente } );
	}

	/**
	 * Method 'AddendasDaoImpl'
	 * 
	 */
	public AddendasDaoImpl()
	{
	}

	/**
	 * Method 'AddendasDaoImpl'
	 * 
	 * @param userConn
	 */
	public AddendasDaoImpl(final java.sql.Connection userConn)
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
		return "ADDENDAS";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Addendas fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Addendas dto = new Addendas();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Addendas[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Addendas dto = new Addendas();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Addendas ret[] = new Addendas[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Addendas dto, ResultSet rs) throws SQLException
	{
		dto.setIdAddendas( rs.getInt( COLUMN_ID_ADDENDAS ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		dto.setNombreXml( rs.getString( COLUMN_NOMBRE_XML ) );
		dto.setNombreCliente( rs.getString( COLUMN_NOMBRE_CLIENTE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Addendas dto)
	{
	}

	/** 
	 * Returns all rows from the addendas table that match the specified arbitrary SQL statement
	 */
	public Addendas[] findByDynamicSelect(String sql, Object[] sqlParams) throws AddendasDaoException
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
			throw new AddendasDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the addendas table that match the specified arbitrary SQL statement
	 */
	public Addendas[] findByDynamicWhere(String sql, Object[] sqlParams) throws AddendasDaoException
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
			throw new AddendasDaoException( "Exception: " + _e.getMessage(), _e );
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
