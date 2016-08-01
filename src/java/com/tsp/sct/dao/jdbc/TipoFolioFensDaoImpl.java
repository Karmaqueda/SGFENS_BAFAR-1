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

public class TipoFolioFensDaoImpl extends AbstractDAO implements TipoFolioFensDao
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
	protected final String SQL_SELECT = "SELECT ID_TIPO_FOLIO_FENS, NOMBRE, DESCRIPCION FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_TIPO_FOLIO_FENS, NOMBRE, DESCRIPCION ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_TIPO_FOLIO_FENS = ?, NOMBRE = ?, DESCRIPCION = ? WHERE ID_TIPO_FOLIO_FENS = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_TIPO_FOLIO_FENS = ?";

	/** 
	 * Index of column ID_TIPO_FOLIO_FENS
	 */
	protected static final int COLUMN_ID_TIPO_FOLIO_FENS = 1;

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
	 * Index of primary-key column ID_TIPO_FOLIO_FENS
	 */
	protected static final int PK_COLUMN_ID_TIPO_FOLIO_FENS = 1;

	/** 
	 * Inserts a new row in the tipo_folio_fens table.
	 */
	public TipoFolioFensPk insert(TipoFolioFens dto) throws TipoFolioFensDaoException
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
			stmt.setInt( index++, dto.getIdTipoFolioFens() );
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getDescripcion() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TipoFolioFensDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the tipo_folio_fens table.
	 */
	public void update(TipoFolioFensPk pk, TipoFolioFens dto) throws TipoFolioFensDaoException
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
			stmt.setInt( index++, dto.getIdTipoFolioFens() );
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getDescripcion() );
			stmt.setInt( 4, pk.getIdTipoFolioFens() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TipoFolioFensDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the tipo_folio_fens table.
	 */
	public void delete(TipoFolioFensPk pk) throws TipoFolioFensDaoException
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
			stmt.setInt( 1, pk.getIdTipoFolioFens() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new TipoFolioFensDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the tipo_folio_fens table that matches the specified primary-key value.
	 */
	public TipoFolioFens findByPrimaryKey(TipoFolioFensPk pk) throws TipoFolioFensDaoException
	{
		return findByPrimaryKey( pk.getIdTipoFolioFens() );
	}

	/** 
	 * Returns all rows from the tipo_folio_fens table that match the criteria 'ID_TIPO_FOLIO_FENS = :idTipoFolioFens'.
	 */
	public TipoFolioFens findByPrimaryKey(int idTipoFolioFens) throws TipoFolioFensDaoException
	{
		TipoFolioFens ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_TIPO_FOLIO_FENS = ?", new Object[] {  new Integer(idTipoFolioFens) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the tipo_folio_fens table that match the criteria ''.
	 */
	public TipoFolioFens[] findAll() throws TipoFolioFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_TIPO_FOLIO_FENS", null );
	}

	/** 
	 * Returns all rows from the tipo_folio_fens table that match the criteria 'ID_TIPO_FOLIO_FENS = :idTipoFolioFens'.
	 */
	public TipoFolioFens[] findWhereIdTipoFolioFensEquals(int idTipoFolioFens) throws TipoFolioFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_TIPO_FOLIO_FENS = ? ORDER BY ID_TIPO_FOLIO_FENS", new Object[] {  new Integer(idTipoFolioFens) } );
	}

	/** 
	 * Returns all rows from the tipo_folio_fens table that match the criteria 'NOMBRE = :nombre'.
	 */
	public TipoFolioFens[] findWhereNombreEquals(String nombre) throws TipoFolioFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the tipo_folio_fens table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public TipoFolioFens[] findWhereDescripcionEquals(String descripcion) throws TipoFolioFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/**
	 * Method 'TipoFolioFensDaoImpl'
	 * 
	 */
	public TipoFolioFensDaoImpl()
	{
	}

	/**
	 * Method 'TipoFolioFensDaoImpl'
	 * 
	 * @param userConn
	 */
	public TipoFolioFensDaoImpl(final java.sql.Connection userConn)
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
		return "TIPO_FOLIO_FENS";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected TipoFolioFens fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			TipoFolioFens dto = new TipoFolioFens();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected TipoFolioFens[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			TipoFolioFens dto = new TipoFolioFens();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		TipoFolioFens ret[] = new TipoFolioFens[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(TipoFolioFens dto, ResultSet rs) throws SQLException
	{
		dto.setIdTipoFolioFens( rs.getInt( COLUMN_ID_TIPO_FOLIO_FENS ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(TipoFolioFens dto)
	{
	}

	/** 
	 * Returns all rows from the tipo_folio_fens table that match the specified arbitrary SQL statement
	 */
	public TipoFolioFens[] findByDynamicSelect(String sql, Object[] sqlParams) throws TipoFolioFensDaoException
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
			throw new TipoFolioFensDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the tipo_folio_fens table that match the specified arbitrary SQL statement
	 */
	public TipoFolioFens[] findByDynamicWhere(String sql, Object[] sqlParams) throws TipoFolioFensDaoException
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
			throw new TipoFolioFensDaoException( "Exception: " + _e.getMessage(), _e );
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
