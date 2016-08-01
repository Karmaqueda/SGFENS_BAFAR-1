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

public class EmpleadoArqueoDaoImpl extends AbstractDAO implements EmpleadoArqueoDao
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
	protected final String SQL_SELECT = "SELECT ID_ARQUEO, ID_EMPLEADO, ID_COBRANZA_METODO_PAGO, MONTO, REFERENCIA, FECHA, ID_ESTATUS FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_ARQUEO, ID_EMPLEADO, ID_COBRANZA_METODO_PAGO, MONTO, REFERENCIA, FECHA, ID_ESTATUS ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_ARQUEO = ?, ID_EMPLEADO = ?, ID_COBRANZA_METODO_PAGO = ?, MONTO = ?, REFERENCIA = ?, FECHA = ?, ID_ESTATUS = ? WHERE ID_ARQUEO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_ARQUEO = ?";

	/** 
	 * Index of column ID_ARQUEO
	 */
	protected static final int COLUMN_ID_ARQUEO = 1;

	/** 
	 * Index of column ID_EMPLEADO
	 */
	protected static final int COLUMN_ID_EMPLEADO = 2;

	/** 
	 * Index of column ID_COBRANZA_METODO_PAGO
	 */
	protected static final int COLUMN_ID_COBRANZA_METODO_PAGO = 3;

	/** 
	 * Index of column MONTO
	 */
	protected static final int COLUMN_MONTO = 4;

	/** 
	 * Index of column REFERENCIA
	 */
	protected static final int COLUMN_REFERENCIA = 5;

	/** 
	 * Index of column FECHA
	 */
	protected static final int COLUMN_FECHA = 6;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column ID_ARQUEO
	 */
	protected static final int PK_COLUMN_ID_ARQUEO = 1;

	/** 
	 * Inserts a new row in the empleado_arqueo table.
	 */
	public EmpleadoArqueoPk insert(EmpleadoArqueo dto) throws EmpleadoArqueoDaoException
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
			if (dto.isIdArqueoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ARQUEO" );
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
		
			if (dto.isIdCobranzaMetodoPagoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_COBRANZA_METODO_PAGO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMontoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MONTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isReferenciaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "REFERENCIA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA" );
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
			if (dto.isIdArqueoModified()) {
				stmt.setInt( index++, dto.getIdArqueo() );
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (dto.isIdEmpleadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleado() );
				}
		
			}
		
			if (dto.isIdCobranzaMetodoPagoModified()) {
				if (dto.isIdCobranzaMetodoPagoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCobranzaMetodoPago() );
				}
		
			}
		
			if (dto.isMontoModified()) {
				if (dto.isMontoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMonto() );
				}
		
			}
		
			if (dto.isReferenciaModified()) {
				stmt.setString( index++, dto.getReferencia() );
			}
		
			if (dto.isFechaModified()) {
				stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
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
				dto.setIdArqueo( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmpleadoArqueoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the empleado_arqueo table.
	 */
	public void update(EmpleadoArqueoPk pk, EmpleadoArqueo dto) throws EmpleadoArqueoDaoException
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
			if (dto.isIdArqueoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ARQUEO=?" );
				modified=true;
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPLEADO=?" );
				modified=true;
			}
		
			if (dto.isIdCobranzaMetodoPagoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_COBRANZA_METODO_PAGO=?" );
				modified=true;
			}
		
			if (dto.isMontoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MONTO=?" );
				modified=true;
			}
		
			if (dto.isReferenciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "REFERENCIA=?" );
				modified=true;
			}
		
			if (dto.isFechaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA=?" );
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
		
			sql.append( " WHERE ID_ARQUEO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdArqueoModified()) {
				stmt.setInt( index++, dto.getIdArqueo() );
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (dto.isIdEmpleadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleado() );
				}
		
			}
		
			if (dto.isIdCobranzaMetodoPagoModified()) {
				if (dto.isIdCobranzaMetodoPagoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCobranzaMetodoPago() );
				}
		
			}
		
			if (dto.isMontoModified()) {
				if (dto.isMontoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getMonto() );
				}
		
			}
		
			if (dto.isReferenciaModified()) {
				stmt.setString( index++, dto.getReferencia() );
			}
		
			if (dto.isFechaModified()) {
				stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdArqueo() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmpleadoArqueoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the empleado_arqueo table.
	 */
	public void delete(EmpleadoArqueoPk pk) throws EmpleadoArqueoDaoException
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
			stmt.setInt( 1, pk.getIdArqueo() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmpleadoArqueoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the empleado_arqueo table that matches the specified primary-key value.
	 */
	public EmpleadoArqueo findByPrimaryKey(EmpleadoArqueoPk pk) throws EmpleadoArqueoDaoException
	{
		return findByPrimaryKey( pk.getIdArqueo() );
	}

	/** 
	 * Returns all rows from the empleado_arqueo table that match the criteria 'ID_ARQUEO = :idArqueo'.
	 */
	public EmpleadoArqueo findByPrimaryKey(int idArqueo) throws EmpleadoArqueoDaoException
	{
		EmpleadoArqueo ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_ARQUEO = ?", new Object[] {  new Integer(idArqueo) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the empleado_arqueo table that match the criteria ''.
	 */
	public EmpleadoArqueo[] findAll() throws EmpleadoArqueoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_ARQUEO", null );
	}

	/** 
	 * Returns all rows from the empleado_arqueo table that match the criteria 'ID_ARQUEO = :idArqueo'.
	 */
	public EmpleadoArqueo[] findWhereIdArqueoEquals(int idArqueo) throws EmpleadoArqueoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ARQUEO = ? ORDER BY ID_ARQUEO", new Object[] {  new Integer(idArqueo) } );
	}

	/** 
	 * Returns all rows from the empleado_arqueo table that match the criteria 'ID_EMPLEADO = :idEmpleado'.
	 */
	public EmpleadoArqueo[] findWhereIdEmpleadoEquals(int idEmpleado) throws EmpleadoArqueoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPLEADO = ? ORDER BY ID_EMPLEADO", new Object[] {  new Integer(idEmpleado) } );
	}

	/** 
	 * Returns all rows from the empleado_arqueo table that match the criteria 'ID_COBRANZA_METODO_PAGO = :idCobranzaMetodoPago'.
	 */
	public EmpleadoArqueo[] findWhereIdCobranzaMetodoPagoEquals(int idCobranzaMetodoPago) throws EmpleadoArqueoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COBRANZA_METODO_PAGO = ? ORDER BY ID_COBRANZA_METODO_PAGO", new Object[] {  new Integer(idCobranzaMetodoPago) } );
	}

	/** 
	 * Returns all rows from the empleado_arqueo table that match the criteria 'MONTO = :monto'.
	 */
	public EmpleadoArqueo[] findWhereMontoEquals(double monto) throws EmpleadoArqueoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MONTO = ? ORDER BY MONTO", new Object[] {  new Double(monto) } );
	}

	/** 
	 * Returns all rows from the empleado_arqueo table that match the criteria 'REFERENCIA = :referencia'.
	 */
	public EmpleadoArqueo[] findWhereReferenciaEquals(String referencia) throws EmpleadoArqueoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REFERENCIA = ? ORDER BY REFERENCIA", new Object[] { referencia } );
	}

	/** 
	 * Returns all rows from the empleado_arqueo table that match the criteria 'FECHA = :fecha'.
	 */
	public EmpleadoArqueo[] findWhereFechaEquals(Date fecha) throws EmpleadoArqueoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA = ? ORDER BY FECHA", new Object[] { fecha==null ? null : new java.sql.Timestamp( fecha.getTime() ) } );
	}

	/** 
	 * Returns all rows from the empleado_arqueo table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public EmpleadoArqueo[] findWhereIdEstatusEquals(int idEstatus) throws EmpleadoArqueoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/**
	 * Method 'EmpleadoArqueoDaoImpl'
	 * 
	 */
	public EmpleadoArqueoDaoImpl()
	{
	}

	/**
	 * Method 'EmpleadoArqueoDaoImpl'
	 * 
	 * @param userConn
	 */
	public EmpleadoArqueoDaoImpl(final java.sql.Connection userConn)
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
		return "empleado_arqueo";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected EmpleadoArqueo fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			EmpleadoArqueo dto = new EmpleadoArqueo();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected EmpleadoArqueo[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			EmpleadoArqueo dto = new EmpleadoArqueo();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		EmpleadoArqueo ret[] = new EmpleadoArqueo[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(EmpleadoArqueo dto, ResultSet rs) throws SQLException
	{
		dto.setIdArqueo( rs.getInt( COLUMN_ID_ARQUEO ) );
		dto.setIdEmpleado( rs.getInt( COLUMN_ID_EMPLEADO ) );
		if (rs.wasNull()) {
			dto.setIdEmpleadoNull( true );
		}
		
		dto.setIdCobranzaMetodoPago( rs.getInt( COLUMN_ID_COBRANZA_METODO_PAGO ) );
		if (rs.wasNull()) {
			dto.setIdCobranzaMetodoPagoNull( true );
		}
		
		dto.setMonto( rs.getDouble( COLUMN_MONTO ) );
		if (rs.wasNull()) {
			dto.setMontoNull( true );
		}
		
		dto.setReferencia( rs.getString( COLUMN_REFERENCIA ) );
		dto.setFecha( rs.getTimestamp(COLUMN_FECHA ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(EmpleadoArqueo dto)
	{
		dto.setIdArqueoModified( false );
		dto.setIdEmpleadoModified( false );
		dto.setIdCobranzaMetodoPagoModified( false );
		dto.setMontoModified( false );
		dto.setReferenciaModified( false );
		dto.setFechaModified( false );
		dto.setIdEstatusModified( false );
	}

	/** 
	 * Returns all rows from the empleado_arqueo table that match the specified arbitrary SQL statement
	 */
	public EmpleadoArqueo[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpleadoArqueoDaoException
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
			throw new EmpleadoArqueoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the empleado_arqueo table that match the specified arbitrary SQL statement
	 */
	public EmpleadoArqueo[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpleadoArqueoDaoException
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
			throw new EmpleadoArqueoDaoException( "Exception: " + _e.getMessage(), _e );
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
