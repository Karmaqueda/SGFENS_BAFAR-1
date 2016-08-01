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

public class BitacoraDaoImpl extends AbstractDAO implements BitacoraDao
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
	protected final String SQL_SELECT = "SELECT ID_BITACORA, ID_APLICATIVO, ID_USUARIO, ID_EMPRESA, USUARIO_NOMBRE, DESCRIPCION_EVENTO, FECHA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_BITACORA, ID_APLICATIVO, ID_USUARIO, ID_EMPRESA, USUARIO_NOMBRE, DESCRIPCION_EVENTO, FECHA ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_BITACORA = ?, ID_APLICATIVO = ?, ID_USUARIO = ?, ID_EMPRESA = ?, USUARIO_NOMBRE = ?, DESCRIPCION_EVENTO = ?, FECHA = ? WHERE ID_BITACORA = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_BITACORA = ?";

	/** 
	 * Index of column ID_BITACORA
	 */
	protected static final int COLUMN_ID_BITACORA = 1;

	/** 
	 * Index of column ID_APLICATIVO
	 */
	protected static final int COLUMN_ID_APLICATIVO = 2;

	/** 
	 * Index of column ID_USUARIO
	 */
	protected static final int COLUMN_ID_USUARIO = 3;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 4;

	/** 
	 * Index of column USUARIO_NOMBRE
	 */
	protected static final int COLUMN_USUARIO_NOMBRE = 5;

	/** 
	 * Index of column DESCRIPCION_EVENTO
	 */
	protected static final int COLUMN_DESCRIPCION_EVENTO = 6;

	/** 
	 * Index of column FECHA
	 */
	protected static final int COLUMN_FECHA = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column ID_BITACORA
	 */
	protected static final int PK_COLUMN_ID_BITACORA = 1;

	/** 
	 * Inserts a new row in the bitacora table.
	 */
	public BitacoraPk insert(Bitacora dto) throws BitacoraDaoException
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
			stmt.setInt( index++, dto.getIdBitacora() );
			if (dto.isIdAplicativoNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdAplicativo() );
			}
		
			if (dto.isIdUsuarioNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdUsuario() );
			}
		
			if (dto.isIdEmpresaNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			stmt.setString( index++, dto.getUsuarioNombre() );
			stmt.setString( index++, dto.getDescripcionEvento() );
			stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BitacoraDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the bitacora table.
	 */
	public void update(BitacoraPk pk, Bitacora dto) throws BitacoraDaoException
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
			stmt.setInt( index++, dto.getIdBitacora() );
			if (dto.isIdAplicativoNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdAplicativo() );
			}
		
			if (dto.isIdUsuarioNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdUsuario() );
			}
		
			if (dto.isIdEmpresaNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			stmt.setString( index++, dto.getUsuarioNombre() );
			stmt.setString( index++, dto.getDescripcionEvento() );
			stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			stmt.setInt( 8, pk.getIdBitacora() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BitacoraDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the bitacora table.
	 */
	public void delete(BitacoraPk pk) throws BitacoraDaoException
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
			stmt.setInt( 1, pk.getIdBitacora() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BitacoraDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the bitacora table that matches the specified primary-key value.
	 */
	public Bitacora findByPrimaryKey(BitacoraPk pk) throws BitacoraDaoException
	{
		return findByPrimaryKey( pk.getIdBitacora() );
	}

	/** 
	 * Returns all rows from the bitacora table that match the criteria 'ID_BITACORA = :idBitacora'.
	 */
	public Bitacora findByPrimaryKey(int idBitacora) throws BitacoraDaoException
	{
		Bitacora ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_BITACORA = ?", new Object[] {  new Integer(idBitacora) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the bitacora table that match the criteria ''.
	 */
	public Bitacora[] findAll() throws BitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_BITACORA", null );
	}

	/** 
	 * Returns all rows from the bitacora table that match the criteria 'ID_BITACORA = :idBitacora'.
	 */
	public Bitacora[] findWhereIdBitacoraEquals(int idBitacora) throws BitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_BITACORA = ? ORDER BY ID_BITACORA", new Object[] {  new Integer(idBitacora) } );
	}

	/** 
	 * Returns all rows from the bitacora table that match the criteria 'ID_APLICATIVO = :idAplicativo'.
	 */
	public Bitacora[] findWhereIdAplicativoEquals(int idAplicativo) throws BitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_APLICATIVO = ? ORDER BY ID_APLICATIVO", new Object[] {  new Integer(idAplicativo) } );
	}

	/** 
	 * Returns all rows from the bitacora table that match the criteria 'ID_USUARIO = :idUsuario'.
	 */
	public Bitacora[] findWhereIdUsuarioEquals(int idUsuario) throws BitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO = ? ORDER BY ID_USUARIO", new Object[] {  new Integer(idUsuario) } );
	}

	/** 
	 * Returns all rows from the bitacora table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Bitacora[] findWhereIdEmpresaEquals(int idEmpresa) throws BitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the bitacora table that match the criteria 'USUARIO_NOMBRE = :usuarioNombre'.
	 */
	public Bitacora[] findWhereUsuarioNombreEquals(String usuarioNombre) throws BitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE USUARIO_NOMBRE = ? ORDER BY USUARIO_NOMBRE", new Object[] { usuarioNombre } );
	}

	/** 
	 * Returns all rows from the bitacora table that match the criteria 'DESCRIPCION_EVENTO = :descripcionEvento'.
	 */
	public Bitacora[] findWhereDescripcionEventoEquals(String descripcionEvento) throws BitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION_EVENTO = ? ORDER BY DESCRIPCION_EVENTO", new Object[] { descripcionEvento } );
	}

	/** 
	 * Returns all rows from the bitacora table that match the criteria 'FECHA = :fecha'.
	 */
	public Bitacora[] findWhereFechaEquals(Date fecha) throws BitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA = ? ORDER BY FECHA", new Object[] { fecha==null ? null : new java.sql.Timestamp( fecha.getTime() ) } );
	}

	/**
	 * Method 'BitacoraDaoImpl'
	 * 
	 */
	public BitacoraDaoImpl()
	{
	}

	/**
	 * Method 'BitacoraDaoImpl'
	 * 
	 * @param userConn
	 */
	public BitacoraDaoImpl(final java.sql.Connection userConn)
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
		return "BITACORA";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Bitacora fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Bitacora dto = new Bitacora();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Bitacora[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Bitacora dto = new Bitacora();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Bitacora ret[] = new Bitacora[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Bitacora dto, ResultSet rs) throws SQLException
	{
		dto.setIdBitacora( rs.getInt( COLUMN_ID_BITACORA ) );
		dto.setIdAplicativo( rs.getInt( COLUMN_ID_APLICATIVO ) );
		if (rs.wasNull()) {
			dto.setIdAplicativoNull( true );
		}
		
		dto.setIdUsuario( rs.getInt( COLUMN_ID_USUARIO ) );
		if (rs.wasNull()) {
			dto.setIdUsuarioNull( true );
		}
		
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setUsuarioNombre( rs.getString( COLUMN_USUARIO_NOMBRE ) );
		dto.setDescripcionEvento( rs.getString( COLUMN_DESCRIPCION_EVENTO ) );
		dto.setFecha( rs.getTimestamp(COLUMN_FECHA ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Bitacora dto)
	{
	}

	/** 
	 * Returns all rows from the bitacora table that match the specified arbitrary SQL statement
	 */
	public Bitacora[] findByDynamicSelect(String sql, Object[] sqlParams) throws BitacoraDaoException
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
			throw new BitacoraDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the bitacora table that match the specified arbitrary SQL statement
	 */
	public Bitacora[] findByDynamicWhere(String sql, Object[] sqlParams) throws BitacoraDaoException
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
			throw new BitacoraDaoException( "Exception: " + _e.getMessage(), _e );
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
