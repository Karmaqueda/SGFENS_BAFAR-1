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

public class FoliosCfdSatDaoImpl extends AbstractDAO implements FoliosCfdSatDao
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
	protected final String SQL_SELECT = "SELECT RFC, NO_APROBACION, ANO_APROBACION, SERIE, FOLIO_INICIAL, FOLIO_FINAL FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( RFC, NO_APROBACION, ANO_APROBACION, SERIE, FOLIO_INICIAL, FOLIO_FINAL ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * Index of column RFC
	 */
	protected static final int COLUMN_RFC = 1;

	/** 
	 * Index of column NO_APROBACION
	 */
	protected static final int COLUMN_NO_APROBACION = 2;

	/** 
	 * Index of column ANO_APROBACION
	 */
	protected static final int COLUMN_ANO_APROBACION = 3;

	/** 
	 * Index of column SERIE
	 */
	protected static final int COLUMN_SERIE = 4;

	/** 
	 * Index of column FOLIO_INICIAL
	 */
	protected static final int COLUMN_FOLIO_INICIAL = 5;

	/** 
	 * Index of column FOLIO_FINAL
	 */
	protected static final int COLUMN_FOLIO_FINAL = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Inserts a new row in the folios_cfd_sat table.
	 */
	public void insert(FoliosCfdSat dto) throws FoliosCfdSatDaoException
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
			stmt.setString( index++, dto.getRfc() );
			stmt.setString( index++, dto.getNoAprobacion() );
			stmt.setString( index++, dto.getAnoAprobacion() );
			stmt.setString( index++, dto.getSerie() );
			stmt.setInt( index++, dto.getFolioInicial() );
			stmt.setInt( index++, dto.getFolioFinal() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FoliosCfdSatDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the folios_cfd_sat table that match the criteria ''.
	 */
	public FoliosCfdSat[] findAll() throws FoliosCfdSatDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the folios_cfd_sat table that match the criteria 'RFC = :rfc'.
	 */
	public FoliosCfdSat[] findWhereRfcEquals(String rfc) throws FoliosCfdSatDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE RFC = ? ORDER BY RFC", new Object[] { rfc } );
	}

	/** 
	 * Returns all rows from the folios_cfd_sat table that match the criteria 'NO_APROBACION = :noAprobacion'.
	 */
	public FoliosCfdSat[] findWhereNoAprobacionEquals(String noAprobacion) throws FoliosCfdSatDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NO_APROBACION = ? ORDER BY NO_APROBACION", new Object[] { noAprobacion } );
	}

	/** 
	 * Returns all rows from the folios_cfd_sat table that match the criteria 'ANO_APROBACION = :anoAprobacion'.
	 */
	public FoliosCfdSat[] findWhereAnoAprobacionEquals(String anoAprobacion) throws FoliosCfdSatDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ANO_APROBACION = ? ORDER BY ANO_APROBACION", new Object[] { anoAprobacion } );
	}

	/** 
	 * Returns all rows from the folios_cfd_sat table that match the criteria 'SERIE = :serie'.
	 */
	public FoliosCfdSat[] findWhereSerieEquals(String serie) throws FoliosCfdSatDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SERIE = ? ORDER BY SERIE", new Object[] { serie } );
	}

	/** 
	 * Returns all rows from the folios_cfd_sat table that match the criteria 'FOLIO_INICIAL = :folioInicial'.
	 */
	public FoliosCfdSat[] findWhereFolioInicialEquals(int folioInicial) throws FoliosCfdSatDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FOLIO_INICIAL = ? ORDER BY FOLIO_INICIAL", new Object[] {  new Integer(folioInicial) } );
	}

	/** 
	 * Returns all rows from the folios_cfd_sat table that match the criteria 'FOLIO_FINAL = :folioFinal'.
	 */
	public FoliosCfdSat[] findWhereFolioFinalEquals(int folioFinal) throws FoliosCfdSatDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FOLIO_FINAL = ? ORDER BY FOLIO_FINAL", new Object[] {  new Integer(folioFinal) } );
	}

	/**
	 * Method 'FoliosCfdSatDaoImpl'
	 * 
	 */
	public FoliosCfdSatDaoImpl()
	{
	}

	/**
	 * Method 'FoliosCfdSatDaoImpl'
	 * 
	 * @param userConn
	 */
	public FoliosCfdSatDaoImpl(final java.sql.Connection userConn)
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
		return "FOLIOS_CFD_SAT";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected FoliosCfdSat fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			FoliosCfdSat dto = new FoliosCfdSat();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected FoliosCfdSat[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			FoliosCfdSat dto = new FoliosCfdSat();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		FoliosCfdSat ret[] = new FoliosCfdSat[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(FoliosCfdSat dto, ResultSet rs) throws SQLException
	{
		dto.setRfc( rs.getString( COLUMN_RFC ) );
		dto.setNoAprobacion( rs.getString( COLUMN_NO_APROBACION ) );
		dto.setAnoAprobacion( rs.getString( COLUMN_ANO_APROBACION ) );
		dto.setSerie( rs.getString( COLUMN_SERIE ) );
		dto.setFolioInicial( rs.getInt( COLUMN_FOLIO_INICIAL ) );
		dto.setFolioFinal( rs.getInt( COLUMN_FOLIO_FINAL ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(FoliosCfdSat dto)
	{
	}

	/** 
	 * Returns all rows from the folios_cfd_sat table that match the specified arbitrary SQL statement
	 */
	public FoliosCfdSat[] findByDynamicSelect(String sql, Object[] sqlParams) throws FoliosCfdSatDaoException
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
			throw new FoliosCfdSatDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the folios_cfd_sat table that match the specified arbitrary SQL statement
	 */
	public FoliosCfdSat[] findByDynamicWhere(String sql, Object[] sqlParams) throws FoliosCfdSatDaoException
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
			throw new FoliosCfdSatDaoException( "Exception: " + _e.getMessage(), _e );
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
