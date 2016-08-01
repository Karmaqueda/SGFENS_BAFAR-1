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

public class MetasEmpleadoDaoImpl extends AbstractDAO implements MetasEmpleadoDao
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
	protected final String SQL_SELECT = "SELECT ID_META_VENTA, ID_EMPLEADO, ID_ESTATUS, OBJETIVO_META, CICLO_META_EMPLEADO, FECHA_INICIO, FECHA_FIN, ID_META_EMPLEADO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_META_VENTA, ID_EMPLEADO, ID_ESTATUS, OBJETIVO_META, CICLO_META_EMPLEADO, FECHA_INICIO, FECHA_FIN, ID_META_EMPLEADO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_META_VENTA = ?, ID_EMPLEADO = ?, ID_ESTATUS = ?, OBJETIVO_META = ?, CICLO_META_EMPLEADO = ?, FECHA_INICIO = ?, FECHA_FIN = ?, ID_META_EMPLEADO = ? WHERE ID_META_EMPLEADO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_META_EMPLEADO = ?";

	/** 
	 * Index of column ID_META_VENTA
	 */
	protected static final int COLUMN_ID_META_VENTA = 1;

	/** 
	 * Index of column ID_EMPLEADO
	 */
	protected static final int COLUMN_ID_EMPLEADO = 2;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 3;

	/** 
	 * Index of column OBJETIVO_META
	 */
	protected static final int COLUMN_OBJETIVO_META = 4;

	/** 
	 * Index of column CICLO_META_EMPLEADO
	 */
	protected static final int COLUMN_CICLO_META_EMPLEADO = 5;

	/** 
	 * Index of column FECHA_INICIO
	 */
	protected static final int COLUMN_FECHA_INICIO = 6;

	/** 
	 * Index of column FECHA_FIN
	 */
	protected static final int COLUMN_FECHA_FIN = 7;

	/** 
	 * Index of column ID_META_EMPLEADO
	 */
	protected static final int COLUMN_ID_META_EMPLEADO = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Index of primary-key column ID_META_EMPLEADO
	 */
	protected static final int PK_COLUMN_ID_META_EMPLEADO = 1;

	/** 
	 * Inserts a new row in the metas_empleado table.
	 */
	public MetasEmpleadoPk insert(MetasEmpleado dto) throws MetasEmpleadoDaoException
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
			if (dto.isIdMetaVentaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_META_VENTA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPLEADO" );
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
		
			if (dto.isObjetivoMetaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "OBJETIVO_META" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCicloMetaEmpleadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CICLO_META_EMPLEADO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaInicioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_INICIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaFinModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_FIN" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdMetaEmpleadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_META_EMPLEADO" );
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
			if (dto.isIdMetaVentaModified()) {
				stmt.setInt( index++, dto.getIdMetaVenta() );
			}
		
			if (dto.isIdEmpleadoModified()) {
				stmt.setInt( index++, dto.getIdEmpleado() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isObjetivoMetaModified()) {
				if (dto.isObjetivoMetaNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getObjetivoMeta() );
				}
		
			}
		
			if (dto.isCicloMetaEmpleadoModified()) {
				if (dto.isCicloMetaEmpleadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getCicloMetaEmpleado() );
				}
		
			}
		
			if (dto.isFechaInicioModified()) {
				stmt.setTimestamp(index++, dto.getFechaInicio()==null ? null : new java.sql.Timestamp( dto.getFechaInicio().getTime() ) );
			}
		
			if (dto.isFechaFinModified()) {
				stmt.setTimestamp(index++, dto.getFechaFin()==null ? null : new java.sql.Timestamp( dto.getFechaFin().getTime() ) );
			}
		
			if (dto.isIdMetaEmpleadoModified()) {
				stmt.setInt( index++, dto.getIdMetaEmpleado() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdMetaEmpleado( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MetasEmpleadoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the metas_empleado table.
	 */
	public void update(MetasEmpleadoPk pk, MetasEmpleado dto) throws MetasEmpleadoDaoException
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
			if (dto.isIdMetaVentaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_META_VENTA=?" );
				modified=true;
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPLEADO=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isObjetivoMetaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "OBJETIVO_META=?" );
				modified=true;
			}
		
			if (dto.isCicloMetaEmpleadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CICLO_META_EMPLEADO=?" );
				modified=true;
			}
		
			if (dto.isFechaInicioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_INICIO=?" );
				modified=true;
			}
		
			if (dto.isFechaFinModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_FIN=?" );
				modified=true;
			}
		
			if (dto.isIdMetaEmpleadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_META_EMPLEADO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_META_EMPLEADO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdMetaVentaModified()) {
				stmt.setInt( index++, dto.getIdMetaVenta() );
			}
		
			if (dto.isIdEmpleadoModified()) {
				stmt.setInt( index++, dto.getIdEmpleado() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isObjetivoMetaModified()) {
				if (dto.isObjetivoMetaNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getObjetivoMeta() );
				}
		
			}
		
			if (dto.isCicloMetaEmpleadoModified()) {
				if (dto.isCicloMetaEmpleadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getCicloMetaEmpleado() );
				}
		
			}
		
			if (dto.isFechaInicioModified()) {
				stmt.setTimestamp(index++, dto.getFechaInicio()==null ? null : new java.sql.Timestamp( dto.getFechaInicio().getTime() ) );
			}
		
			if (dto.isFechaFinModified()) {
				stmt.setTimestamp(index++, dto.getFechaFin()==null ? null : new java.sql.Timestamp( dto.getFechaFin().getTime() ) );
			}
		
			if (dto.isIdMetaEmpleadoModified()) {
				stmt.setInt( index++, dto.getIdMetaEmpleado() );
			}
		
			stmt.setInt( index++, pk.getIdMetaEmpleado() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MetasEmpleadoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the metas_empleado table.
	 */
	public void delete(MetasEmpleadoPk pk) throws MetasEmpleadoDaoException
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
			stmt.setInt( 1, pk.getIdMetaEmpleado() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MetasEmpleadoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the metas_empleado table that matches the specified primary-key value.
	 */
	public MetasEmpleado findByPrimaryKey(MetasEmpleadoPk pk) throws MetasEmpleadoDaoException
	{
		return findByPrimaryKey( pk.getIdMetaEmpleado() );
	}

	/** 
	 * Returns all rows from the metas_empleado table that match the criteria 'ID_META_EMPLEADO = :idMetaEmpleado'.
	 */
	public MetasEmpleado findByPrimaryKey(int idMetaEmpleado) throws MetasEmpleadoDaoException
	{
		MetasEmpleado ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_META_EMPLEADO = ?", new Object[] {  new Integer(idMetaEmpleado) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the metas_empleado table that match the criteria ''.
	 */
	public MetasEmpleado[] findAll() throws MetasEmpleadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_META_EMPLEADO", null );
	}

	/** 
	 * Returns all rows from the metas_empleado table that match the criteria 'ID_META_VENTA = :idMetaVenta'.
	 */
	public MetasEmpleado[] findWhereIdMetaVentaEquals(int idMetaVenta) throws MetasEmpleadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_META_VENTA = ? ORDER BY ID_META_VENTA", new Object[] {  new Integer(idMetaVenta) } );
	}

	/** 
	 * Returns all rows from the metas_empleado table that match the criteria 'ID_EMPLEADO = :idEmpleado'.
	 */
	public MetasEmpleado[] findWhereIdEmpleadoEquals(int idEmpleado) throws MetasEmpleadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPLEADO = ? ORDER BY ID_EMPLEADO", new Object[] {  new Integer(idEmpleado) } );
	}

	/** 
	 * Returns all rows from the metas_empleado table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public MetasEmpleado[] findWhereIdEstatusEquals(int idEstatus) throws MetasEmpleadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the metas_empleado table that match the criteria 'OBJETIVO_META = :objetivoMeta'.
	 */
	public MetasEmpleado[] findWhereObjetivoMetaEquals(double objetivoMeta) throws MetasEmpleadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE OBJETIVO_META = ? ORDER BY OBJETIVO_META", new Object[] {  new Double(objetivoMeta) } );
	}

	/** 
	 * Returns all rows from the metas_empleado table that match the criteria 'CICLO_META_EMPLEADO = :cicloMetaEmpleado'.
	 */
	public MetasEmpleado[] findWhereCicloMetaEmpleadoEquals(int cicloMetaEmpleado) throws MetasEmpleadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CICLO_META_EMPLEADO = ? ORDER BY CICLO_META_EMPLEADO", new Object[] {  new Integer(cicloMetaEmpleado) } );
	}

	/** 
	 * Returns all rows from the metas_empleado table that match the criteria 'FECHA_INICIO = :fechaInicio'.
	 */
	public MetasEmpleado[] findWhereFechaInicioEquals(Date fechaInicio) throws MetasEmpleadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_INICIO = ? ORDER BY FECHA_INICIO", new Object[] { fechaInicio==null ? null : new java.sql.Timestamp( fechaInicio.getTime() ) } );
	}

	/** 
	 * Returns all rows from the metas_empleado table that match the criteria 'FECHA_FIN = :fechaFin'.
	 */
	public MetasEmpleado[] findWhereFechaFinEquals(Date fechaFin) throws MetasEmpleadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_FIN = ? ORDER BY FECHA_FIN", new Object[] { fechaFin==null ? null : new java.sql.Timestamp( fechaFin.getTime() ) } );
	}

	/** 
	 * Returns all rows from the metas_empleado table that match the criteria 'ID_META_EMPLEADO = :idMetaEmpleado'.
	 */
	public MetasEmpleado[] findWhereIdMetaEmpleadoEquals(int idMetaEmpleado) throws MetasEmpleadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_META_EMPLEADO = ? ORDER BY ID_META_EMPLEADO", new Object[] {  new Integer(idMetaEmpleado) } );
	}

	/**
	 * Method 'MetasEmpleadoDaoImpl'
	 * 
	 */
	public MetasEmpleadoDaoImpl()
	{
	}

	/**
	 * Method 'MetasEmpleadoDaoImpl'
	 * 
	 * @param userConn
	 */
	public MetasEmpleadoDaoImpl(final java.sql.Connection userConn)
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
		return "metas_empleado";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected MetasEmpleado fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			MetasEmpleado dto = new MetasEmpleado();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected MetasEmpleado[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			MetasEmpleado dto = new MetasEmpleado();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		MetasEmpleado ret[] = new MetasEmpleado[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(MetasEmpleado dto, ResultSet rs) throws SQLException
	{
		dto.setIdMetaVenta( rs.getInt( COLUMN_ID_META_VENTA ) );
		dto.setIdEmpleado( rs.getInt( COLUMN_ID_EMPLEADO ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		dto.setObjetivoMeta( rs.getDouble( COLUMN_OBJETIVO_META ) );
		if (rs.wasNull()) {
			dto.setObjetivoMetaNull( true );
		}
		
		dto.setCicloMetaEmpleado( rs.getInt( COLUMN_CICLO_META_EMPLEADO ) );
		if (rs.wasNull()) {
			dto.setCicloMetaEmpleadoNull( true );
		}
		
		dto.setFechaInicio( rs.getTimestamp(COLUMN_FECHA_INICIO ) );
		dto.setFechaFin( rs.getTimestamp(COLUMN_FECHA_FIN ) );
		dto.setIdMetaEmpleado( rs.getInt( COLUMN_ID_META_EMPLEADO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(MetasEmpleado dto)
	{
		dto.setIdMetaVentaModified( false );
		dto.setIdEmpleadoModified( false );
		dto.setIdEstatusModified( false );
		dto.setObjetivoMetaModified( false );
		dto.setCicloMetaEmpleadoModified( false );
		dto.setFechaInicioModified( false );
		dto.setFechaFinModified( false );
		dto.setIdMetaEmpleadoModified( false );
	}

	/** 
	 * Returns all rows from the metas_empleado table that match the specified arbitrary SQL statement
	 */
	public MetasEmpleado[] findByDynamicSelect(String sql, Object[] sqlParams) throws MetasEmpleadoDaoException
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
			throw new MetasEmpleadoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the metas_empleado table that match the specified arbitrary SQL statement
	 */
	public MetasEmpleado[] findByDynamicWhere(String sql, Object[] sqlParams) throws MetasEmpleadoDaoException
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
			throw new MetasEmpleadoDaoException( "Exception: " + _e.getMessage(), _e );
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
