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

public class MunicipioDaoImpl extends AbstractDAO implements MunicipioDao
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
	protected final String SQL_SELECT = "SELECT ID_ESTADO, ID_MUNICIPIO, ID_CLAVE, MUN_DESCRIPCION, ACTIVO, FECHA_DESACTIVACION FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_ESTADO, ID_MUNICIPIO, ID_CLAVE, MUN_DESCRIPCION, ACTIVO, FECHA_DESACTIVACION ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_ESTADO = ?, ID_MUNICIPIO = ?, ID_CLAVE = ?, MUN_DESCRIPCION = ?, ACTIVO = ?, FECHA_DESACTIVACION = ? WHERE ID_MUNICIPIO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_MUNICIPIO = ?";

	/** 
	 * Index of column ID_ESTADO
	 */
	protected static final int COLUMN_ID_ESTADO = 1;

	/** 
	 * Index of column ID_MUNICIPIO
	 */
	protected static final int COLUMN_ID_MUNICIPIO = 2;

	/** 
	 * Index of column ID_CLAVE
	 */
	protected static final int COLUMN_ID_CLAVE = 3;

	/** 
	 * Index of column MUN_DESCRIPCION
	 */
	protected static final int COLUMN_MUN_DESCRIPCION = 4;

	/** 
	 * Index of column ACTIVO
	 */
	protected static final int COLUMN_ACTIVO = 5;

	/** 
	 * Index of column FECHA_DESACTIVACION
	 */
	protected static final int COLUMN_FECHA_DESACTIVACION = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column ID_MUNICIPIO
	 */
	protected static final int PK_COLUMN_ID_MUNICIPIO = 1;

	/** 
	 * Inserts a new row in the municipio table.
	 */
	public MunicipioPk insert(Municipio dto) throws MunicipioDaoException
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
			stmt.setLong( index++, dto.getIdEstado() );
			stmt.setLong( index++, dto.getIdMunicipio() );
			stmt.setInt( index++, dto.getIdClave() );
			stmt.setString( index++, dto.getMunDescripcion() );
			if (dto.isActivoNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getActivo() );
			}
		
			stmt.setDate(index++, dto.getFechaDesactivacion()==null ? null : new java.sql.Date( dto.getFechaDesactivacion().getTime() ) );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the municipio table.
	 */
	public void update(MunicipioPk pk, Municipio dto) throws MunicipioDaoException
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
			stmt.setLong( index++, dto.getIdEstado() );
			stmt.setLong( index++, dto.getIdMunicipio() );
			stmt.setInt( index++, dto.getIdClave() );
			stmt.setString( index++, dto.getMunDescripcion() );
			if (dto.isActivoNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getActivo() );
			}
		
			stmt.setDate(index++, dto.getFechaDesactivacion()==null ? null : new java.sql.Date( dto.getFechaDesactivacion().getTime() ) );
			stmt.setLong( 7, pk.getIdMunicipio() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the municipio table.
	 */
	public void delete(MunicipioPk pk) throws MunicipioDaoException
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
			stmt.setLong( 1, pk.getIdMunicipio() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the municipio table that matches the specified primary-key value.
	 */
	public Municipio findByPrimaryKey(MunicipioPk pk) throws MunicipioDaoException
	{
		return findByPrimaryKey( pk.getIdMunicipio() );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'ID_MUNICIPIO = :idMunicipio'.
	 */
	public Municipio findByPrimaryKey(long idMunicipio) throws MunicipioDaoException
	{
		Municipio ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_MUNICIPIO = ?", new Object[] {  new Long(idMunicipio) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria ''.
	 */
	public Municipio[] findAll() throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_MUNICIPIO", null );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'ID_ESTADO = :idEstado'.
	 */
	public Municipio[] findWhereIdEstadoEquals(long idEstado) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTADO = ? ORDER BY ID_ESTADO", new Object[] {  new Long(idEstado) } );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'ID_MUNICIPIO = :idMunicipio'.
	 */
	public Municipio[] findWhereIdMunicipioEquals(long idMunicipio) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_MUNICIPIO = ? ORDER BY ID_MUNICIPIO", new Object[] {  new Long(idMunicipio) } );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'ID_CLAVE = :idClave'.
	 */
	public Municipio[] findWhereIdClaveEquals(int idClave) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CLAVE = ? ORDER BY ID_CLAVE", new Object[] {  new Integer(idClave) } );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'MUN_DESCRIPCION = :munDescripcion'.
	 */
	public Municipio[] findWhereMunDescripcionEquals(String munDescripcion) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MUN_DESCRIPCION = ? ORDER BY MUN_DESCRIPCION", new Object[] { munDescripcion } );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'ACTIVO = :activo'.
	 */
	public Municipio[] findWhereActivoEquals(int activo) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ACTIVO = ? ORDER BY ACTIVO", new Object[] {  new Integer(activo) } );
	}

	/** 
	 * Returns all rows from the municipio table that match the criteria 'FECHA_DESACTIVACION = :fechaDesactivacion'.
	 */
	public Municipio[] findWhereFechaDesactivacionEquals(Date fechaDesactivacion) throws MunicipioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_DESACTIVACION = ? ORDER BY FECHA_DESACTIVACION", new Object[] { fechaDesactivacion==null ? null : new java.sql.Date( fechaDesactivacion.getTime() ) } );
	}

	/**
	 * Method 'MunicipioDaoImpl'
	 * 
	 */
	public MunicipioDaoImpl()
	{
	}

	/**
	 * Method 'MunicipioDaoImpl'
	 * 
	 * @param userConn
	 */
	public MunicipioDaoImpl(final java.sql.Connection userConn)
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
		return "MUNICIPIO";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Municipio fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Municipio dto = new Municipio();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Municipio[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Municipio dto = new Municipio();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Municipio ret[] = new Municipio[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Municipio dto, ResultSet rs) throws SQLException
	{
		dto.setIdEstado( rs.getLong( COLUMN_ID_ESTADO ) );
		dto.setIdMunicipio( rs.getLong( COLUMN_ID_MUNICIPIO ) );
		dto.setIdClave( rs.getInt( COLUMN_ID_CLAVE ) );
		dto.setMunDescripcion( rs.getString( COLUMN_MUN_DESCRIPCION ) );
		dto.setActivo( rs.getInt( COLUMN_ACTIVO ) );
		if (rs.wasNull()) {
			dto.setActivoNull( true );
		}
		
		dto.setFechaDesactivacion( rs.getDate(COLUMN_FECHA_DESACTIVACION ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Municipio dto)
	{
	}

	/** 
	 * Returns all rows from the municipio table that match the specified arbitrary SQL statement
	 */
	public Municipio[] findByDynamicSelect(String sql, Object[] sqlParams) throws MunicipioDaoException
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
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the municipio table that match the specified arbitrary SQL statement
	 */
	public Municipio[] findByDynamicWhere(String sql, Object[] sqlParams) throws MunicipioDaoException
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
			throw new MunicipioDaoException( "Exception: " + _e.getMessage(), _e );
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
