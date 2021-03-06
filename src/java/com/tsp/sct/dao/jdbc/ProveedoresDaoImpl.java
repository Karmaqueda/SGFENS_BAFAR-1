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

public class ProveedoresDaoImpl extends AbstractDAO implements ProveedoresDao
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
	protected final String SQL_SELECT = "SELECT ID_PROVEEDORES, ID_EMPRESA, ID_ESTATUS, NUM_PROVEEDOR, NOMBRE, DESCRIPCION FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_PROVEEDORES, ID_EMPRESA, ID_ESTATUS, NUM_PROVEEDOR, NOMBRE, DESCRIPCION ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_PROVEEDORES = ?, ID_EMPRESA = ?, ID_ESTATUS = ?, NUM_PROVEEDOR = ?, NOMBRE = ?, DESCRIPCION = ? WHERE ID_PROVEEDORES = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_PROVEEDORES = ?";

	/** 
	 * Index of column ID_PROVEEDORES
	 */
	protected static final int COLUMN_ID_PROVEEDORES = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 3;

	/** 
	 * Index of column NUM_PROVEEDOR
	 */
	protected static final int COLUMN_NUM_PROVEEDOR = 4;

	/** 
	 * Index of column NOMBRE
	 */
	protected static final int COLUMN_NOMBRE = 5;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column ID_PROVEEDORES
	 */
	protected static final int PK_COLUMN_ID_PROVEEDORES = 1;

	/** 
	 * Inserts a new row in the proveedores table.
	 */
	public ProveedoresPk insert(Proveedores dto) throws ProveedoresDaoException
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
			stmt.setInt( index++, dto.getIdProveedores() );
			stmt.setInt( index++, dto.getIdEmpresa() );
			stmt.setInt( index++, dto.getIdEstatus() );
			if (dto.isNumProveedorNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getNumProveedor() );
			}
		
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
			throw new ProveedoresDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the proveedores table.
	 */
	public void update(ProveedoresPk pk, Proveedores dto) throws ProveedoresDaoException
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
			stmt.setInt( index++, dto.getIdProveedores() );
			stmt.setInt( index++, dto.getIdEmpresa() );
			stmt.setInt( index++, dto.getIdEstatus() );
			if (dto.isNumProveedorNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getNumProveedor() );
			}
		
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getDescripcion() );
			stmt.setInt( 7, pk.getIdProveedores() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProveedoresDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the proveedores table.
	 */
	public void delete(ProveedoresPk pk) throws ProveedoresDaoException
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
			stmt.setInt( 1, pk.getIdProveedores() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProveedoresDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the proveedores table that matches the specified primary-key value.
	 */
	public Proveedores findByPrimaryKey(ProveedoresPk pk) throws ProveedoresDaoException
	{
		return findByPrimaryKey( pk.getIdProveedores() );
	}

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'ID_PROVEEDORES = :idProveedores'.
	 */
	public Proveedores findByPrimaryKey(int idProveedores) throws ProveedoresDaoException
	{
		Proveedores ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_PROVEEDORES = ?", new Object[] {  new Integer(idProveedores) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the proveedores table that match the criteria ''.
	 */
	public Proveedores[] findAll() throws ProveedoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_PROVEEDORES", null );
	}

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'ID_PROVEEDORES = :idProveedores'.
	 */
	public Proveedores[] findWhereIdProveedoresEquals(int idProveedores) throws ProveedoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PROVEEDORES = ? ORDER BY ID_PROVEEDORES", new Object[] {  new Integer(idProveedores) } );
	}

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Proveedores[] findWhereIdEmpresaEquals(int idEmpresa) throws ProveedoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public Proveedores[] findWhereIdEstatusEquals(int idEstatus) throws ProveedoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'NUM_PROVEEDOR = :numProveedor'.
	 */
	public Proveedores[] findWhereNumProveedorEquals(int numProveedor) throws ProveedoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUM_PROVEEDOR = ? ORDER BY NUM_PROVEEDOR", new Object[] {  new Integer(numProveedor) } );
	}

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'NOMBRE = :nombre'.
	 */
	public Proveedores[] findWhereNombreEquals(String nombre) throws ProveedoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the proveedores table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public Proveedores[] findWhereDescripcionEquals(String descripcion) throws ProveedoresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/**
	 * Method 'ProveedoresDaoImpl'
	 * 
	 */
	public ProveedoresDaoImpl()
	{
	}

	/**
	 * Method 'ProveedoresDaoImpl'
	 * 
	 * @param userConn
	 */
	public ProveedoresDaoImpl(final java.sql.Connection userConn)
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
		return "PROVEEDORES";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Proveedores fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Proveedores dto = new Proveedores();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Proveedores[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Proveedores dto = new Proveedores();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Proveedores ret[] = new Proveedores[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Proveedores dto, ResultSet rs) throws SQLException
	{
		dto.setIdProveedores( rs.getInt( COLUMN_ID_PROVEEDORES ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		dto.setNumProveedor( rs.getInt( COLUMN_NUM_PROVEEDOR ) );
		if (rs.wasNull()) {
			dto.setNumProveedorNull( true );
		}
		
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Proveedores dto)
	{
	}

	/** 
	 * Returns all rows from the proveedores table that match the specified arbitrary SQL statement
	 */
	public Proveedores[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProveedoresDaoException
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
			throw new ProveedoresDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the proveedores table that match the specified arbitrary SQL statement
	 */
	public Proveedores[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProveedoresDaoException
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
			throw new ProveedoresDaoException( "Exception: " + _e.getMessage(), _e );
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
