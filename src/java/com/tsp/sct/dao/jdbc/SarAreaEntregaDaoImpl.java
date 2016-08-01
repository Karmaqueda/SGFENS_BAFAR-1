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

public class SarAreaEntregaDaoImpl extends AbstractDAO implements SarAreaEntregaDao
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
	protected final String SQL_SELECT = "SELECT ID_SAR_AREA_ENTREGA, ID_SAR_USUARIO, EXT_SAR_ID_AREA, EXT_SAR_NOMBRE, EXT_SAR_CODPROV_AREA, ID_ESTATUS, ID_CLIENTE FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_SAR_AREA_ENTREGA, ID_SAR_USUARIO, EXT_SAR_ID_AREA, EXT_SAR_NOMBRE, EXT_SAR_CODPROV_AREA, ID_ESTATUS, ID_CLIENTE ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_SAR_AREA_ENTREGA = ?, ID_SAR_USUARIO = ?, EXT_SAR_ID_AREA = ?, EXT_SAR_NOMBRE = ?, EXT_SAR_CODPROV_AREA = ?, ID_ESTATUS = ?, ID_CLIENTE = ? WHERE ID_SAR_AREA_ENTREGA = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_SAR_AREA_ENTREGA = ?";

	/** 
	 * Index of column ID_SAR_AREA_ENTREGA
	 */
	protected static final int COLUMN_ID_SAR_AREA_ENTREGA = 1;

	/** 
	 * Index of column ID_SAR_USUARIO
	 */
	protected static final int COLUMN_ID_SAR_USUARIO = 2;

	/** 
	 * Index of column EXT_SAR_ID_AREA
	 */
	protected static final int COLUMN_EXT_SAR_ID_AREA = 3;

	/** 
	 * Index of column EXT_SAR_NOMBRE
	 */
	protected static final int COLUMN_EXT_SAR_NOMBRE = 4;

	/** 
	 * Index of column EXT_SAR_CODPROV_AREA
	 */
	protected static final int COLUMN_EXT_SAR_CODPROV_AREA = 5;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 6;

	/** 
	 * Index of column ID_CLIENTE
	 */
	protected static final int COLUMN_ID_CLIENTE = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column ID_SAR_AREA_ENTREGA
	 */
	protected static final int PK_COLUMN_ID_SAR_AREA_ENTREGA = 1;

	/** 
	 * Inserts a new row in the sar_area_entrega table.
	 */
	public SarAreaEntregaPk insert(SarAreaEntrega dto) throws SarAreaEntregaDaoException
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
			if (dto.isIdSarAreaEntregaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_SAR_AREA_ENTREGA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdSarUsuarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_SAR_USUARIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isExtSarIdAreaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "EXT_SAR_ID_AREA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isExtSarNombreModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "EXT_SAR_NOMBRE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isExtSarCodprovAreaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "EXT_SAR_CODPROV_AREA" );
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
		
			if (dto.isIdClienteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CLIENTE" );
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
			if (dto.isIdSarAreaEntregaModified()) {
				stmt.setInt( index++, dto.getIdSarAreaEntrega() );
			}
		
			if (dto.isIdSarUsuarioModified()) {
				stmt.setInt( index++, dto.getIdSarUsuario() );
			}
		
			if (dto.isExtSarIdAreaModified()) {
				stmt.setInt( index++, dto.getExtSarIdArea() );
			}
		
			if (dto.isExtSarNombreModified()) {
				stmt.setString( index++, dto.getExtSarNombre() );
			}
		
			if (dto.isExtSarCodprovAreaModified()) {
				stmt.setString( index++, dto.getExtSarCodprovArea() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isIdClienteModified()) {
				if (dto.isIdClienteNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCliente() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdSarAreaEntrega( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SarAreaEntregaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the sar_area_entrega table.
	 */
	public void update(SarAreaEntregaPk pk, SarAreaEntrega dto) throws SarAreaEntregaDaoException
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
			if (dto.isIdSarAreaEntregaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_SAR_AREA_ENTREGA=?" );
				modified=true;
			}
		
			if (dto.isIdSarUsuarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_SAR_USUARIO=?" );
				modified=true;
			}
		
			if (dto.isExtSarIdAreaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "EXT_SAR_ID_AREA=?" );
				modified=true;
			}
		
			if (dto.isExtSarNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "EXT_SAR_NOMBRE=?" );
				modified=true;
			}
		
			if (dto.isExtSarCodprovAreaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "EXT_SAR_CODPROV_AREA=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isIdClienteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CLIENTE=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_SAR_AREA_ENTREGA=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdSarAreaEntregaModified()) {
				stmt.setInt( index++, dto.getIdSarAreaEntrega() );
			}
		
			if (dto.isIdSarUsuarioModified()) {
				stmt.setInt( index++, dto.getIdSarUsuario() );
			}
		
			if (dto.isExtSarIdAreaModified()) {
				stmt.setInt( index++, dto.getExtSarIdArea() );
			}
		
			if (dto.isExtSarNombreModified()) {
				stmt.setString( index++, dto.getExtSarNombre() );
			}
		
			if (dto.isExtSarCodprovAreaModified()) {
				stmt.setString( index++, dto.getExtSarCodprovArea() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isIdClienteModified()) {
				if (dto.isIdClienteNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCliente() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdSarAreaEntrega() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SarAreaEntregaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the sar_area_entrega table.
	 */
	public void delete(SarAreaEntregaPk pk) throws SarAreaEntregaDaoException
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
			stmt.setInt( 1, pk.getIdSarAreaEntrega() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SarAreaEntregaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the sar_area_entrega table that matches the specified primary-key value.
	 */
	public SarAreaEntrega findByPrimaryKey(SarAreaEntregaPk pk) throws SarAreaEntregaDaoException
	{
		return findByPrimaryKey( pk.getIdSarAreaEntrega() );
	}

	/** 
	 * Returns all rows from the sar_area_entrega table that match the criteria 'ID_SAR_AREA_ENTREGA = :idSarAreaEntrega'.
	 */
	public SarAreaEntrega findByPrimaryKey(int idSarAreaEntrega) throws SarAreaEntregaDaoException
	{
		SarAreaEntrega ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_SAR_AREA_ENTREGA = ?", new Object[] {  new Integer(idSarAreaEntrega) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the sar_area_entrega table that match the criteria ''.
	 */
	public SarAreaEntrega[] findAll() throws SarAreaEntregaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_SAR_AREA_ENTREGA", null );
	}

	/** 
	 * Returns all rows from the sar_area_entrega table that match the criteria 'ID_SAR_AREA_ENTREGA = :idSarAreaEntrega'.
	 */
	public SarAreaEntrega[] findWhereIdSarAreaEntregaEquals(int idSarAreaEntrega) throws SarAreaEntregaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_SAR_AREA_ENTREGA = ? ORDER BY ID_SAR_AREA_ENTREGA", new Object[] {  new Integer(idSarAreaEntrega) } );
	}

	/** 
	 * Returns all rows from the sar_area_entrega table that match the criteria 'ID_SAR_USUARIO = :idSarUsuario'.
	 */
	public SarAreaEntrega[] findWhereIdSarUsuarioEquals(int idSarUsuario) throws SarAreaEntregaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_SAR_USUARIO = ? ORDER BY ID_SAR_USUARIO", new Object[] {  new Integer(idSarUsuario) } );
	}

	/** 
	 * Returns all rows from the sar_area_entrega table that match the criteria 'EXT_SAR_ID_AREA = :extSarIdArea'.
	 */
	public SarAreaEntrega[] findWhereExtSarIdAreaEquals(int extSarIdArea) throws SarAreaEntregaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EXT_SAR_ID_AREA = ? ORDER BY EXT_SAR_ID_AREA", new Object[] {  new Integer(extSarIdArea) } );
	}

	/** 
	 * Returns all rows from the sar_area_entrega table that match the criteria 'EXT_SAR_NOMBRE = :extSarNombre'.
	 */
	public SarAreaEntrega[] findWhereExtSarNombreEquals(String extSarNombre) throws SarAreaEntregaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EXT_SAR_NOMBRE = ? ORDER BY EXT_SAR_NOMBRE", new Object[] { extSarNombre } );
	}

	/** 
	 * Returns all rows from the sar_area_entrega table that match the criteria 'EXT_SAR_CODPROV_AREA = :extSarCodprovArea'.
	 */
	public SarAreaEntrega[] findWhereExtSarCodprovAreaEquals(String extSarCodprovArea) throws SarAreaEntregaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EXT_SAR_CODPROV_AREA = ? ORDER BY EXT_SAR_CODPROV_AREA", new Object[] { extSarCodprovArea } );
	}

	/** 
	 * Returns all rows from the sar_area_entrega table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public SarAreaEntrega[] findWhereIdEstatusEquals(int idEstatus) throws SarAreaEntregaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the sar_area_entrega table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public SarAreaEntrega[] findWhereIdClienteEquals(int idCliente) throws SarAreaEntregaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CLIENTE = ? ORDER BY ID_CLIENTE", new Object[] {  new Integer(idCliente) } );
	}

	/**
	 * Method 'SarAreaEntregaDaoImpl'
	 * 
	 */
	public SarAreaEntregaDaoImpl()
	{
	}

	/**
	 * Method 'SarAreaEntregaDaoImpl'
	 * 
	 * @param userConn
	 */
	public SarAreaEntregaDaoImpl(final java.sql.Connection userConn)
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
		return "sar_area_entrega";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected SarAreaEntrega fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			SarAreaEntrega dto = new SarAreaEntrega();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected SarAreaEntrega[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			SarAreaEntrega dto = new SarAreaEntrega();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		SarAreaEntrega ret[] = new SarAreaEntrega[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(SarAreaEntrega dto, ResultSet rs) throws SQLException
	{
		dto.setIdSarAreaEntrega( rs.getInt( COLUMN_ID_SAR_AREA_ENTREGA ) );
		dto.setIdSarUsuario( rs.getInt( COLUMN_ID_SAR_USUARIO ) );
		dto.setExtSarIdArea( rs.getInt( COLUMN_EXT_SAR_ID_AREA ) );
		dto.setExtSarNombre( rs.getString( COLUMN_EXT_SAR_NOMBRE ) );
		dto.setExtSarCodprovArea( rs.getString( COLUMN_EXT_SAR_CODPROV_AREA ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		dto.setIdCliente( rs.getInt( COLUMN_ID_CLIENTE ) );
		if (rs.wasNull()) {
			dto.setIdClienteNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(SarAreaEntrega dto)
	{
		dto.setIdSarAreaEntregaModified( false );
		dto.setIdSarUsuarioModified( false );
		dto.setExtSarIdAreaModified( false );
		dto.setExtSarNombreModified( false );
		dto.setExtSarCodprovAreaModified( false );
		dto.setIdEstatusModified( false );
		dto.setIdClienteModified( false );
	}

	/** 
	 * Returns all rows from the sar_area_entrega table that match the specified arbitrary SQL statement
	 */
	public SarAreaEntrega[] findByDynamicSelect(String sql, Object[] sqlParams) throws SarAreaEntregaDaoException
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
			throw new SarAreaEntregaDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the sar_area_entrega table that match the specified arbitrary SQL statement
	 */
	public SarAreaEntrega[] findByDynamicWhere(String sql, Object[] sqlParams) throws SarAreaEntregaDaoException
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
			throw new SarAreaEntregaDaoException( "Exception: " + _e.getMessage(), _e );
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
