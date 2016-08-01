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

public class SarUsuarioProveedorDaoImpl extends AbstractDAO implements SarUsuarioProveedorDao
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
	protected final String SQL_SELECT = "SELECT ID_SAR_USUARIO, ID_EMPRESA, EXT_SAR_ID_USUARIO, EXT_SAR_USUARIO, EXT_SAR_PASS, EXT_SAR_ID_PROVEEDOR, EXT_SAR_RFC_PROVEEDOR, ID_ESTATUS FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_SAR_USUARIO, ID_EMPRESA, EXT_SAR_ID_USUARIO, EXT_SAR_USUARIO, EXT_SAR_PASS, EXT_SAR_ID_PROVEEDOR, EXT_SAR_RFC_PROVEEDOR, ID_ESTATUS ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_SAR_USUARIO = ?, ID_EMPRESA = ?, EXT_SAR_ID_USUARIO = ?, EXT_SAR_USUARIO = ?, EXT_SAR_PASS = ?, EXT_SAR_ID_PROVEEDOR = ?, EXT_SAR_RFC_PROVEEDOR = ?, ID_ESTATUS = ? WHERE ID_SAR_USUARIO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_SAR_USUARIO = ?";

	/** 
	 * Index of column ID_SAR_USUARIO
	 */
	protected static final int COLUMN_ID_SAR_USUARIO = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column EXT_SAR_ID_USUARIO
	 */
	protected static final int COLUMN_EXT_SAR_ID_USUARIO = 3;

	/** 
	 * Index of column EXT_SAR_USUARIO
	 */
	protected static final int COLUMN_EXT_SAR_USUARIO = 4;

	/** 
	 * Index of column EXT_SAR_PASS
	 */
	protected static final int COLUMN_EXT_SAR_PASS = 5;

	/** 
	 * Index of column EXT_SAR_ID_PROVEEDOR
	 */
	protected static final int COLUMN_EXT_SAR_ID_PROVEEDOR = 6;

	/** 
	 * Index of column EXT_SAR_RFC_PROVEEDOR
	 */
	protected static final int COLUMN_EXT_SAR_RFC_PROVEEDOR = 7;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Index of primary-key column ID_SAR_USUARIO
	 */
	protected static final int PK_COLUMN_ID_SAR_USUARIO = 1;

	/** 
	 * Inserts a new row in the sar_usuario_proveedor table.
	 */
	public SarUsuarioProveedorPk insert(SarUsuarioProveedor dto) throws SarUsuarioProveedorDaoException
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
			if (dto.isIdSarUsuarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_SAR_USUARIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPRESA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isExtSarIdUsuarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "EXT_SAR_ID_USUARIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isExtSarUsuarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "EXT_SAR_USUARIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isExtSarPassModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "EXT_SAR_PASS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isExtSarIdProveedorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "EXT_SAR_ID_PROVEEDOR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isExtSarRfcProveedorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "EXT_SAR_RFC_PROVEEDOR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ESTATUS" );
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
			if (dto.isIdSarUsuarioModified()) {
				stmt.setInt( index++, dto.getIdSarUsuario() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isExtSarIdUsuarioModified()) {
				stmt.setInt( index++, dto.getExtSarIdUsuario() );
			}
		
			if (dto.isExtSarUsuarioModified()) {
				stmt.setString( index++, dto.getExtSarUsuario() );
			}
		
			if (dto.isExtSarPassModified()) {
				stmt.setString( index++, dto.getExtSarPass() );
			}
		
			if (dto.isExtSarIdProveedorModified()) {
				stmt.setInt( index++, dto.getExtSarIdProveedor() );
			}
		
			if (dto.isExtSarRfcProveedorModified()) {
				stmt.setString( index++, dto.getExtSarRfcProveedor() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdSarUsuario( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SarUsuarioProveedorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the sar_usuario_proveedor table.
	 */
	public void update(SarUsuarioProveedorPk pk, SarUsuarioProveedor dto) throws SarUsuarioProveedorDaoException
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
			if (dto.isIdSarUsuarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_SAR_USUARIO=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isExtSarIdUsuarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "EXT_SAR_ID_USUARIO=?" );
				modified=true;
			}
		
			if (dto.isExtSarUsuarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "EXT_SAR_USUARIO=?" );
				modified=true;
			}
		
			if (dto.isExtSarPassModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "EXT_SAR_PASS=?" );
				modified=true;
			}
		
			if (dto.isExtSarIdProveedorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "EXT_SAR_ID_PROVEEDOR=?" );
				modified=true;
			}
		
			if (dto.isExtSarRfcProveedorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "EXT_SAR_RFC_PROVEEDOR=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_SAR_USUARIO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdSarUsuarioModified()) {
				stmt.setInt( index++, dto.getIdSarUsuario() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isExtSarIdUsuarioModified()) {
				stmt.setInt( index++, dto.getExtSarIdUsuario() );
			}
		
			if (dto.isExtSarUsuarioModified()) {
				stmt.setString( index++, dto.getExtSarUsuario() );
			}
		
			if (dto.isExtSarPassModified()) {
				stmt.setString( index++, dto.getExtSarPass() );
			}
		
			if (dto.isExtSarIdProveedorModified()) {
				stmt.setInt( index++, dto.getExtSarIdProveedor() );
			}
		
			if (dto.isExtSarRfcProveedorModified()) {
				stmt.setString( index++, dto.getExtSarRfcProveedor() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdSarUsuario() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SarUsuarioProveedorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the sar_usuario_proveedor table.
	 */
	public void delete(SarUsuarioProveedorPk pk) throws SarUsuarioProveedorDaoException
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
			stmt.setInt( 1, pk.getIdSarUsuario() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SarUsuarioProveedorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the sar_usuario_proveedor table that matches the specified primary-key value.
	 */
	public SarUsuarioProveedor findByPrimaryKey(SarUsuarioProveedorPk pk) throws SarUsuarioProveedorDaoException
	{
		return findByPrimaryKey( pk.getIdSarUsuario() );
	}

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'ID_SAR_USUARIO = :idSarUsuario'.
	 */
	public SarUsuarioProveedor findByPrimaryKey(int idSarUsuario) throws SarUsuarioProveedorDaoException
	{
		SarUsuarioProveedor ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_SAR_USUARIO = ?", new Object[] {  new Integer(idSarUsuario) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria ''.
	 */
	public SarUsuarioProveedor[] findAll() throws SarUsuarioProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_SAR_USUARIO", null );
	}

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'ID_SAR_USUARIO = :idSarUsuario'.
	 */
	public SarUsuarioProveedor[] findWhereIdSarUsuarioEquals(int idSarUsuario) throws SarUsuarioProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_SAR_USUARIO = ? ORDER BY ID_SAR_USUARIO", new Object[] {  new Integer(idSarUsuario) } );
	}

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public SarUsuarioProveedor[] findWhereIdEmpresaEquals(int idEmpresa) throws SarUsuarioProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'EXT_SAR_ID_USUARIO = :extSarIdUsuario'.
	 */
	public SarUsuarioProveedor[] findWhereExtSarIdUsuarioEquals(int extSarIdUsuario) throws SarUsuarioProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EXT_SAR_ID_USUARIO = ? ORDER BY EXT_SAR_ID_USUARIO", new Object[] {  new Integer(extSarIdUsuario) } );
	}

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'EXT_SAR_USUARIO = :extSarUsuario'.
	 */
	public SarUsuarioProveedor[] findWhereExtSarUsuarioEquals(String extSarUsuario) throws SarUsuarioProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EXT_SAR_USUARIO = ? ORDER BY EXT_SAR_USUARIO", new Object[] { extSarUsuario } );
	}

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'EXT_SAR_PASS = :extSarPass'.
	 */
	public SarUsuarioProveedor[] findWhereExtSarPassEquals(String extSarPass) throws SarUsuarioProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EXT_SAR_PASS = ? ORDER BY EXT_SAR_PASS", new Object[] { extSarPass } );
	}

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'EXT_SAR_ID_PROVEEDOR = :extSarIdProveedor'.
	 */
	public SarUsuarioProveedor[] findWhereExtSarIdProveedorEquals(int extSarIdProveedor) throws SarUsuarioProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EXT_SAR_ID_PROVEEDOR = ? ORDER BY EXT_SAR_ID_PROVEEDOR", new Object[] {  new Integer(extSarIdProveedor) } );
	}

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'EXT_SAR_RFC_PROVEEDOR = :extSarRfcProveedor'.
	 */
	public SarUsuarioProveedor[] findWhereExtSarRfcProveedorEquals(String extSarRfcProveedor) throws SarUsuarioProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EXT_SAR_RFC_PROVEEDOR = ? ORDER BY EXT_SAR_RFC_PROVEEDOR", new Object[] { extSarRfcProveedor } );
	}

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public SarUsuarioProveedor[] findWhereIdEstatusEquals(int idEstatus) throws SarUsuarioProveedorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/**
	 * Method 'SarUsuarioProveedorDaoImpl'
	 * 
	 */
	public SarUsuarioProveedorDaoImpl()
	{
	}

	/**
	 * Method 'SarUsuarioProveedorDaoImpl'
	 * 
	 * @param userConn
	 */
	public SarUsuarioProveedorDaoImpl(final java.sql.Connection userConn)
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
		return "sar_usuario_proveedor";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected SarUsuarioProveedor fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			SarUsuarioProveedor dto = new SarUsuarioProveedor();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected SarUsuarioProveedor[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			SarUsuarioProveedor dto = new SarUsuarioProveedor();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		SarUsuarioProveedor ret[] = new SarUsuarioProveedor[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(SarUsuarioProveedor dto, ResultSet rs) throws SQLException
	{
		dto.setIdSarUsuario( rs.getInt( COLUMN_ID_SAR_USUARIO ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setExtSarIdUsuario( rs.getInt( COLUMN_EXT_SAR_ID_USUARIO ) );
		dto.setExtSarUsuario( rs.getString( COLUMN_EXT_SAR_USUARIO ) );
		dto.setExtSarPass( rs.getString( COLUMN_EXT_SAR_PASS ) );
		dto.setExtSarIdProveedor( rs.getInt( COLUMN_EXT_SAR_ID_PROVEEDOR ) );
		dto.setExtSarRfcProveedor( rs.getString( COLUMN_EXT_SAR_RFC_PROVEEDOR ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(SarUsuarioProveedor dto)
	{
		dto.setIdSarUsuarioModified( false );
		dto.setIdEmpresaModified( false );
		dto.setExtSarIdUsuarioModified( false );
		dto.setExtSarUsuarioModified( false );
		dto.setExtSarPassModified( false );
		dto.setExtSarIdProveedorModified( false );
		dto.setExtSarRfcProveedorModified( false );
		dto.setIdEstatusModified( false );
	}

	/** 
	 * Returns all rows from the sar_usuario_proveedor table that match the specified arbitrary SQL statement
	 */
	public SarUsuarioProveedor[] findByDynamicSelect(String sql, Object[] sqlParams) throws SarUsuarioProveedorDaoException
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
			throw new SarUsuarioProveedorDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the sar_usuario_proveedor table that match the specified arbitrary SQL statement
	 */
	public SarUsuarioProveedor[] findByDynamicWhere(String sql, Object[] sqlParams) throws SarUsuarioProveedorDaoException
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
			throw new SarUsuarioProveedorDaoException( "Exception: " + _e.getMessage(), _e );
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
