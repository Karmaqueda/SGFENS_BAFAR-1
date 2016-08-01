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

public class FoliosFensDaoImpl extends AbstractDAO implements FoliosFensDao
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
	protected final String SQL_SELECT = "SELECT ID_FOLIOS_FENS, ID_TIPO_FOLIO_FENS, ID_EMPRESA, USER_NAME, CLAVE, FOLIOS_DISPONIBLES, FECHA_ALTA, FECHA_VIGENCIA, ACTIVO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_FOLIOS_FENS, ID_TIPO_FOLIO_FENS, ID_EMPRESA, USER_NAME, CLAVE, FOLIOS_DISPONIBLES, FECHA_ALTA, FECHA_VIGENCIA, ACTIVO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_FOLIOS_FENS = ?, ID_TIPO_FOLIO_FENS = ?, ID_EMPRESA = ?, USER_NAME = ?, CLAVE = ?, FOLIOS_DISPONIBLES = ?, FECHA_ALTA = ?, FECHA_VIGENCIA = ?, ACTIVO = ? WHERE ID_FOLIOS_FENS = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_FOLIOS_FENS = ?";

	/** 
	 * Index of column ID_FOLIOS_FENS
	 */
	protected static final int COLUMN_ID_FOLIOS_FENS = 1;

	/** 
	 * Index of column ID_TIPO_FOLIO_FENS
	 */
	protected static final int COLUMN_ID_TIPO_FOLIO_FENS = 2;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 3;

	/** 
	 * Index of column USER_NAME
	 */
	protected static final int COLUMN_USER_NAME = 4;

	/** 
	 * Index of column CLAVE
	 */
	protected static final int COLUMN_CLAVE = 5;

	/** 
	 * Index of column FOLIOS_DISPONIBLES
	 */
	protected static final int COLUMN_FOLIOS_DISPONIBLES = 6;

	/** 
	 * Index of column FECHA_ALTA
	 */
	protected static final int COLUMN_FECHA_ALTA = 7;

	/** 
	 * Index of column FECHA_VIGENCIA
	 */
	protected static final int COLUMN_FECHA_VIGENCIA = 8;

	/** 
	 * Index of column ACTIVO
	 */
	protected static final int COLUMN_ACTIVO = 9;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 9;

	/** 
	 * Index of primary-key column ID_FOLIOS_FENS
	 */
	protected static final int PK_COLUMN_ID_FOLIOS_FENS = 1;

	/** 
	 * Inserts a new row in the folios_fens table.
	 */
	public FoliosFensPk insert(FoliosFens dto) throws FoliosFensDaoException
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
			stmt.setInt( index++, dto.getIdFoliosFens() );
			stmt.setInt( index++, dto.getIdTipoFolioFens() );
			stmt.setInt( index++, dto.getIdEmpresa() );
			stmt.setString( index++, dto.getUserName() );
			stmt.setString( index++, dto.getClave() );
			if (dto.isFoliosDisponiblesNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getFoliosDisponibles() );
			}
		
			stmt.setDate(index++, dto.getFechaAlta()==null ? null : new java.sql.Date( dto.getFechaAlta().getTime() ) );
			stmt.setDate(index++, dto.getFechaVigencia()==null ? null : new java.sql.Date( dto.getFechaVigencia().getTime() ) );
			if (dto.isActivoNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setShort( index++, dto.getActivo() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FoliosFensDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the folios_fens table.
	 */
	public void update(FoliosFensPk pk, FoliosFens dto) throws FoliosFensDaoException
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
			stmt.setInt( index++, dto.getIdFoliosFens() );
			stmt.setInt( index++, dto.getIdTipoFolioFens() );
			stmt.setInt( index++, dto.getIdEmpresa() );
			stmt.setString( index++, dto.getUserName() );
			stmt.setString( index++, dto.getClave() );
			if (dto.isFoliosDisponiblesNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getFoliosDisponibles() );
			}
		
			stmt.setDate(index++, dto.getFechaAlta()==null ? null : new java.sql.Date( dto.getFechaAlta().getTime() ) );
			stmt.setDate(index++, dto.getFechaVigencia()==null ? null : new java.sql.Date( dto.getFechaVigencia().getTime() ) );
			if (dto.isActivoNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setShort( index++, dto.getActivo() );
			}
		
			stmt.setInt( 10, pk.getIdFoliosFens() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FoliosFensDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the folios_fens table.
	 */
	public void delete(FoliosFensPk pk) throws FoliosFensDaoException
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
			stmt.setInt( 1, pk.getIdFoliosFens() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FoliosFensDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the folios_fens table that matches the specified primary-key value.
	 */
	public FoliosFens findByPrimaryKey(FoliosFensPk pk) throws FoliosFensDaoException
	{
		return findByPrimaryKey( pk.getIdFoliosFens() );
	}

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'ID_FOLIOS_FENS = :idFoliosFens'.
	 */
	public FoliosFens findByPrimaryKey(int idFoliosFens) throws FoliosFensDaoException
	{
		FoliosFens ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_FOLIOS_FENS = ?", new Object[] {  new Integer(idFoliosFens) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the folios_fens table that match the criteria ''.
	 */
	public FoliosFens[] findAll() throws FoliosFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_FOLIOS_FENS", null );
	}

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'ID_FOLIOS_FENS = :idFoliosFens'.
	 */
	public FoliosFens[] findWhereIdFoliosFensEquals(int idFoliosFens) throws FoliosFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_FOLIOS_FENS = ? ORDER BY ID_FOLIOS_FENS", new Object[] {  new Integer(idFoliosFens) } );
	}

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'ID_TIPO_FOLIO_FENS = :idTipoFolioFens'.
	 */
	public FoliosFens[] findWhereIdTipoFolioFensEquals(int idTipoFolioFens) throws FoliosFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_TIPO_FOLIO_FENS = ? ORDER BY ID_TIPO_FOLIO_FENS", new Object[] {  new Integer(idTipoFolioFens) } );
	}

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public FoliosFens[] findWhereIdEmpresaEquals(int idEmpresa) throws FoliosFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'USER_NAME = :userName'.
	 */
	public FoliosFens[] findWhereUserNameEquals(String userName) throws FoliosFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE USER_NAME = ? ORDER BY USER_NAME", new Object[] { userName } );
	}

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'CLAVE = :clave'.
	 */
	public FoliosFens[] findWhereClaveEquals(String clave) throws FoliosFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CLAVE = ? ORDER BY CLAVE", new Object[] { clave } );
	}

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'FOLIOS_DISPONIBLES = :foliosDisponibles'.
	 */
	public FoliosFens[] findWhereFoliosDisponiblesEquals(int foliosDisponibles) throws FoliosFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FOLIOS_DISPONIBLES = ? ORDER BY FOLIOS_DISPONIBLES", new Object[] {  new Integer(foliosDisponibles) } );
	}

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'FECHA_ALTA = :fechaAlta'.
	 */
	public FoliosFens[] findWhereFechaAltaEquals(Date fechaAlta) throws FoliosFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_ALTA = ? ORDER BY FECHA_ALTA", new Object[] { fechaAlta==null ? null : new java.sql.Date( fechaAlta.getTime() ) } );
	}

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'FECHA_VIGENCIA = :fechaVigencia'.
	 */
	public FoliosFens[] findWhereFechaVigenciaEquals(Date fechaVigencia) throws FoliosFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_VIGENCIA = ? ORDER BY FECHA_VIGENCIA", new Object[] { fechaVigencia==null ? null : new java.sql.Date( fechaVigencia.getTime() ) } );
	}

	/** 
	 * Returns all rows from the folios_fens table that match the criteria 'ACTIVO = :activo'.
	 */
	public FoliosFens[] findWhereActivoEquals(short activo) throws FoliosFensDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ACTIVO = ? ORDER BY ACTIVO", new Object[] {  new Short(activo) } );
	}

	/**
	 * Method 'FoliosFensDaoImpl'
	 * 
	 */
	public FoliosFensDaoImpl()
	{
	}

	/**
	 * Method 'FoliosFensDaoImpl'
	 * 
	 * @param userConn
	 */
	public FoliosFensDaoImpl(final java.sql.Connection userConn)
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
		return "FOLIOS_FENS";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected FoliosFens fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			FoliosFens dto = new FoliosFens();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected FoliosFens[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			FoliosFens dto = new FoliosFens();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		FoliosFens ret[] = new FoliosFens[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(FoliosFens dto, ResultSet rs) throws SQLException
	{
		dto.setIdFoliosFens( rs.getInt( COLUMN_ID_FOLIOS_FENS ) );
		dto.setIdTipoFolioFens( rs.getInt( COLUMN_ID_TIPO_FOLIO_FENS ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setUserName( rs.getString( COLUMN_USER_NAME ) );
		dto.setClave( rs.getString( COLUMN_CLAVE ) );
		dto.setFoliosDisponibles( rs.getInt( COLUMN_FOLIOS_DISPONIBLES ) );
		if (rs.wasNull()) {
			dto.setFoliosDisponiblesNull( true );
		}
		
		dto.setFechaAlta( rs.getDate(COLUMN_FECHA_ALTA ) );
		dto.setFechaVigencia( rs.getDate(COLUMN_FECHA_VIGENCIA ) );
		dto.setActivo( rs.getShort( COLUMN_ACTIVO ) );
		if (rs.wasNull()) {
			dto.setActivoNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(FoliosFens dto)
	{
	}

	/** 
	 * Returns all rows from the folios_fens table that match the specified arbitrary SQL statement
	 */
	public FoliosFens[] findByDynamicSelect(String sql, Object[] sqlParams) throws FoliosFensDaoException
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
			throw new FoliosFensDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the folios_fens table that match the specified arbitrary SQL statement
	 */
	public FoliosFens[] findByDynamicWhere(String sql, Object[] sqlParams) throws FoliosFensDaoException
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
			throw new FoliosFensDaoException( "Exception: " + _e.getMessage(), _e );
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
