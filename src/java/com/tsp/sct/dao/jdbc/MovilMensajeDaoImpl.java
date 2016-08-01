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

public class MovilMensajeDaoImpl extends AbstractDAO implements MovilMensajeDao
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
	protected final String SQL_SELECT = "SELECT ID_MOVIL_MENSAJE, EMISOR_TIPO, ID_EMPLEADO_EMISOR, RECEPTOR_TIPO, ID_EMPLEADO_RECEPTOR, FECHA_EMISION, FECHA_RECEPCION, MENSAJE, RECIBIDO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_MOVIL_MENSAJE, EMISOR_TIPO, ID_EMPLEADO_EMISOR, RECEPTOR_TIPO, ID_EMPLEADO_RECEPTOR, FECHA_EMISION, FECHA_RECEPCION, MENSAJE, RECIBIDO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_MOVIL_MENSAJE = ?, EMISOR_TIPO = ?, ID_EMPLEADO_EMISOR = ?, RECEPTOR_TIPO = ?, ID_EMPLEADO_RECEPTOR = ?, FECHA_EMISION = ?, FECHA_RECEPCION = ?, MENSAJE = ?, RECIBIDO = ? WHERE ID_MOVIL_MENSAJE = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_MOVIL_MENSAJE = ?";

	/** 
	 * Index of column ID_MOVIL_MENSAJE
	 */
	protected static final int COLUMN_ID_MOVIL_MENSAJE = 1;

	/** 
	 * Index of column EMISOR_TIPO
	 */
	protected static final int COLUMN_EMISOR_TIPO = 2;

	/** 
	 * Index of column ID_EMPLEADO_EMISOR
	 */
	protected static final int COLUMN_ID_EMPLEADO_EMISOR = 3;

	/** 
	 * Index of column RECEPTOR_TIPO
	 */
	protected static final int COLUMN_RECEPTOR_TIPO = 4;

	/** 
	 * Index of column ID_EMPLEADO_RECEPTOR
	 */
	protected static final int COLUMN_ID_EMPLEADO_RECEPTOR = 5;

	/** 
	 * Index of column FECHA_EMISION
	 */
	protected static final int COLUMN_FECHA_EMISION = 6;

	/** 
	 * Index of column FECHA_RECEPCION
	 */
	protected static final int COLUMN_FECHA_RECEPCION = 7;

	/** 
	 * Index of column MENSAJE
	 */
	protected static final int COLUMN_MENSAJE = 8;

	/** 
	 * Index of column RECIBIDO
	 */
	protected static final int COLUMN_RECIBIDO = 9;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 9;

	/** 
	 * Index of primary-key column ID_MOVIL_MENSAJE
	 */
	protected static final int PK_COLUMN_ID_MOVIL_MENSAJE = 1;

	/** 
	 * Inserts a new row in the MOVIL_MENSAJE table.
	 */
	public MovilMensajePk insert(MovilMensaje dto) throws MovilMensajeDaoException
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
			if (dto.isIdMovilMensajeModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_MOVIL_MENSAJE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isEmisorTipoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "EMISOR_TIPO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpleadoEmisorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPLEADO_EMISOR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isReceptorTipoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "RECEPTOR_TIPO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpleadoReceptorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPLEADO_RECEPTOR" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaEmisionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_EMISION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaRecepcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_RECEPCION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMensajeModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MENSAJE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isRecibidoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "RECIBIDO" );
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
			if (dto.isIdMovilMensajeModified()) {
				stmt.setInt( index++, dto.getIdMovilMensaje() );
			}
		
			if (dto.isEmisorTipoModified()) {
				stmt.setInt( index++, dto.getEmisorTipo() );
			}
		
			if (dto.isIdEmpleadoEmisorModified()) {
				if (dto.isIdEmpleadoEmisorNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleadoEmisor() );
				}
		
			}
		
			if (dto.isReceptorTipoModified()) {
				stmt.setInt( index++, dto.getReceptorTipo() );
			}
		
			if (dto.isIdEmpleadoReceptorModified()) {
				if (dto.isIdEmpleadoReceptorNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleadoReceptor() );
				}
		
			}
		
			if (dto.isFechaEmisionModified()) {
				stmt.setTimestamp(index++, dto.getFechaEmision()==null ? null : new java.sql.Timestamp( dto.getFechaEmision().getTime() ) );
			}
		
			if (dto.isFechaRecepcionModified()) {
				stmt.setTimestamp(index++, dto.getFechaRecepcion()==null ? null : new java.sql.Timestamp( dto.getFechaRecepcion().getTime() ) );
			}
		
			if (dto.isMensajeModified()) {
				stmt.setString( index++, dto.getMensaje() );
			}
		
			if (dto.isRecibidoModified()) {
				stmt.setInt( index++, dto.getRecibido() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdMovilMensaje( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MovilMensajeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the MOVIL_MENSAJE table.
	 */
	public void update(MovilMensajePk pk, MovilMensaje dto) throws MovilMensajeDaoException
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
			if (dto.isIdMovilMensajeModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_MOVIL_MENSAJE=?" );
				modified=true;
			}
		
			if (dto.isEmisorTipoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "EMISOR_TIPO=?" );
				modified=true;
			}
		
			if (dto.isIdEmpleadoEmisorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPLEADO_EMISOR=?" );
				modified=true;
			}
		
			if (dto.isReceptorTipoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "RECEPTOR_TIPO=?" );
				modified=true;
			}
		
			if (dto.isIdEmpleadoReceptorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPLEADO_RECEPTOR=?" );
				modified=true;
			}
		
			if (dto.isFechaEmisionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_EMISION=?" );
				modified=true;
			}
		
			if (dto.isFechaRecepcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_RECEPCION=?" );
				modified=true;
			}
		
			if (dto.isMensajeModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MENSAJE=?" );
				modified=true;
			}
		
			if (dto.isRecibidoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "RECIBIDO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_MOVIL_MENSAJE=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdMovilMensajeModified()) {
				stmt.setInt( index++, dto.getIdMovilMensaje() );
			}
		
			if (dto.isEmisorTipoModified()) {
				stmt.setInt( index++, dto.getEmisorTipo() );
			}
		
			if (dto.isIdEmpleadoEmisorModified()) {
				if (dto.isIdEmpleadoEmisorNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleadoEmisor() );
				}
		
			}
		
			if (dto.isReceptorTipoModified()) {
				stmt.setInt( index++, dto.getReceptorTipo() );
			}
		
			if (dto.isIdEmpleadoReceptorModified()) {
				if (dto.isIdEmpleadoReceptorNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleadoReceptor() );
				}
		
			}
		
			if (dto.isFechaEmisionModified()) {
				stmt.setTimestamp(index++, dto.getFechaEmision()==null ? null : new java.sql.Timestamp( dto.getFechaEmision().getTime() ) );
			}
		
			if (dto.isFechaRecepcionModified()) {
				stmt.setTimestamp(index++, dto.getFechaRecepcion()==null ? null : new java.sql.Timestamp( dto.getFechaRecepcion().getTime() ) );
			}
		
			if (dto.isMensajeModified()) {
				stmt.setString( index++, dto.getMensaje() );
			}
		
			if (dto.isRecibidoModified()) {
				stmt.setInt( index++, dto.getRecibido() );
			}
		
			stmt.setInt( index++, pk.getIdMovilMensaje() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MovilMensajeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the MOVIL_MENSAJE table.
	 */
	public void delete(MovilMensajePk pk) throws MovilMensajeDaoException
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
			stmt.setInt( 1, pk.getIdMovilMensaje() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MovilMensajeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the MOVIL_MENSAJE table that matches the specified primary-key value.
	 */
	public MovilMensaje findByPrimaryKey(MovilMensajePk pk) throws MovilMensajeDaoException
	{
		return findByPrimaryKey( pk.getIdMovilMensaje() );
	}

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'ID_MOVIL_MENSAJE = :idMovilMensaje'.
	 */
	public MovilMensaje findByPrimaryKey(int idMovilMensaje) throws MovilMensajeDaoException
	{
		MovilMensaje ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_MOVIL_MENSAJE = ?", new Object[] {  new Integer(idMovilMensaje) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria ''.
	 */
	public MovilMensaje[] findAll() throws MovilMensajeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_MOVIL_MENSAJE", null );
	}

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'ID_MOVIL_MENSAJE = :idMovilMensaje'.
	 */
	public MovilMensaje[] findWhereIdMovilMensajeEquals(int idMovilMensaje) throws MovilMensajeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_MOVIL_MENSAJE = ? ORDER BY ID_MOVIL_MENSAJE", new Object[] {  new Integer(idMovilMensaje) } );
	}

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'EMISOR_TIPO = :emisorTipo'.
	 */
	public MovilMensaje[] findWhereEmisorTipoEquals(int emisorTipo) throws MovilMensajeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMISOR_TIPO = ? ORDER BY EMISOR_TIPO", new Object[] {  new Integer(emisorTipo) } );
	}

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'ID_EMPLEADO_EMISOR = :idEmpleadoEmisor'.
	 */
	public MovilMensaje[] findWhereIdEmpleadoEmisorEquals(int idEmpleadoEmisor) throws MovilMensajeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPLEADO_EMISOR = ? ORDER BY ID_EMPLEADO_EMISOR", new Object[] {  new Integer(idEmpleadoEmisor) } );
	}

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'RECEPTOR_TIPO = :receptorTipo'.
	 */
	public MovilMensaje[] findWhereReceptorTipoEquals(int receptorTipo) throws MovilMensajeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE RECEPTOR_TIPO = ? ORDER BY RECEPTOR_TIPO", new Object[] {  new Integer(receptorTipo) } );
	}

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'ID_EMPLEADO_RECEPTOR = :idEmpleadoReceptor'.
	 */
	public MovilMensaje[] findWhereIdEmpleadoReceptorEquals(int idEmpleadoReceptor) throws MovilMensajeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPLEADO_RECEPTOR = ? ORDER BY ID_EMPLEADO_RECEPTOR", new Object[] {  new Integer(idEmpleadoReceptor) } );
	}

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'FECHA_EMISION = :fechaEmision'.
	 */
	public MovilMensaje[] findWhereFechaEmisionEquals(Date fechaEmision) throws MovilMensajeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_EMISION = ? ORDER BY FECHA_EMISION", new Object[] { fechaEmision==null ? null : new java.sql.Timestamp( fechaEmision.getTime() ) } );
	}

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'FECHA_RECEPCION = :fechaRecepcion'.
	 */
	public MovilMensaje[] findWhereFechaRecepcionEquals(Date fechaRecepcion) throws MovilMensajeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_RECEPCION = ? ORDER BY FECHA_RECEPCION", new Object[] { fechaRecepcion==null ? null : new java.sql.Timestamp( fechaRecepcion.getTime() ) } );
	}

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'MENSAJE = :mensaje'.
	 */
	public MovilMensaje[] findWhereMensajeEquals(String mensaje) throws MovilMensajeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MENSAJE = ? ORDER BY MENSAJE", new Object[] { mensaje } );
	}

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the criteria 'RECIBIDO = :recibido'.
	 */
	public MovilMensaje[] findWhereRecibidoEquals(int recibido) throws MovilMensajeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE RECIBIDO = ? ORDER BY RECIBIDO", new Object[] {  new Integer(recibido) } );
	}

	/**
	 * Method 'MovilMensajeDaoImpl'
	 * 
	 */
	public MovilMensajeDaoImpl()
	{
	}

	/**
	 * Method 'MovilMensajeDaoImpl'
	 * 
	 * @param userConn
	 */
	public MovilMensajeDaoImpl(final java.sql.Connection userConn)
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
		return "MOVIL_MENSAJE";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected MovilMensaje fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			MovilMensaje dto = new MovilMensaje();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected MovilMensaje[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			MovilMensaje dto = new MovilMensaje();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		MovilMensaje ret[] = new MovilMensaje[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(MovilMensaje dto, ResultSet rs) throws SQLException
	{
		dto.setIdMovilMensaje( rs.getInt( COLUMN_ID_MOVIL_MENSAJE ) );
		dto.setEmisorTipo( rs.getInt( COLUMN_EMISOR_TIPO ) );
		dto.setIdEmpleadoEmisor( rs.getInt( COLUMN_ID_EMPLEADO_EMISOR ) );
		if (rs.wasNull()) {
			dto.setIdEmpleadoEmisorNull( true );
		}
		
		dto.setReceptorTipo( rs.getInt( COLUMN_RECEPTOR_TIPO ) );
		dto.setIdEmpleadoReceptor( rs.getInt( COLUMN_ID_EMPLEADO_RECEPTOR ) );
		if (rs.wasNull()) {
			dto.setIdEmpleadoReceptorNull( true );
		}
		
		dto.setFechaEmision( rs.getTimestamp(COLUMN_FECHA_EMISION ) );
		dto.setFechaRecepcion( rs.getTimestamp(COLUMN_FECHA_RECEPCION ) );
		dto.setMensaje( rs.getString( COLUMN_MENSAJE ) );
		dto.setRecibido( rs.getInt( COLUMN_RECIBIDO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(MovilMensaje dto)
	{
		dto.setIdMovilMensajeModified( false );
		dto.setEmisorTipoModified( false );
		dto.setIdEmpleadoEmisorModified( false );
		dto.setReceptorTipoModified( false );
		dto.setIdEmpleadoReceptorModified( false );
		dto.setFechaEmisionModified( false );
		dto.setFechaRecepcionModified( false );
		dto.setMensajeModified( false );
		dto.setRecibidoModified( false );
	}

	/** 
	 * Returns all rows from the MOVIL_MENSAJE table that match the specified arbitrary SQL statement
	 */
	public MovilMensaje[] findByDynamicSelect(String sql, Object[] sqlParams) throws MovilMensajeDaoException
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
			throw new MovilMensajeDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the MOVIL_MENSAJE table that match the specified arbitrary SQL statement
	 */
	public MovilMensaje[] findByDynamicWhere(String sql, Object[] sqlParams) throws MovilMensajeDaoException
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
			throw new MovilMensajeDaoException( "Exception: " + _e.getMessage(), _e );
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