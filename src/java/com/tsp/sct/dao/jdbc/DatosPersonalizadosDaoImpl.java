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

public class DatosPersonalizadosDaoImpl extends AbstractDAO implements DatosPersonalizadosDao
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
	protected final String SQL_SELECT = "SELECT id_datos_personalizados, id_empresa, variable, descripcion, tipo FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_datos_personalizados, id_empresa, variable, descripcion, tipo ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_datos_personalizados = ?, id_empresa = ?, variable = ?, descripcion = ?, tipo = ? WHERE id_datos_personalizados = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_datos_personalizados = ?";

	/** 
	 * Index of column id_datos_personalizados
	 */
	protected static final int COLUMN_ID_DATOS_PERSONALIZADOS = 1;

	/** 
	 * Index of column id_empresa
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column variable
	 */
	protected static final int COLUMN_VARIABLE = 3;

	/** 
	 * Index of column descripcion
	 */
	protected static final int COLUMN_DESCRIPCION = 4;

	/** 
	 * Index of column tipo
	 */
	protected static final int COLUMN_TIPO = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column id_datos_personalizados
	 */
	protected static final int PK_COLUMN_ID_DATOS_PERSONALIZADOS = 1;

	/** 
	 * Inserts a new row in the datos_personalizados table.
	 */
	public DatosPersonalizadosPk insert(DatosPersonalizados dto) throws DatosPersonalizadosDaoException
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
			if (dto.isIdDatosPersonalizadosModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_datos_personalizados" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_empresa" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isVariableModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "variable" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescripcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "descripcion" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTipoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "tipo" );
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
			if (dto.isIdDatosPersonalizadosModified()) {
				stmt.setInt( index++, dto.getIdDatosPersonalizados() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isVariableModified()) {
				stmt.setString( index++, dto.getVariable() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isTipoModified()) {
				stmt.setShort( index++, dto.getTipo() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdDatosPersonalizados( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DatosPersonalizadosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the datos_personalizados table.
	 */
	public void update(DatosPersonalizadosPk pk, DatosPersonalizados dto) throws DatosPersonalizadosDaoException
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
			if (dto.isIdDatosPersonalizadosModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_datos_personalizados=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_empresa=?" );
				modified=true;
			}
		
			if (dto.isVariableModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "variable=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "descripcion=?" );
				modified=true;
			}
		
			if (dto.isTipoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "tipo=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id_datos_personalizados=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdDatosPersonalizadosModified()) {
				stmt.setInt( index++, dto.getIdDatosPersonalizados() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isVariableModified()) {
				stmt.setString( index++, dto.getVariable() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isTipoModified()) {
				stmt.setShort( index++, dto.getTipo() );
			}
		
			stmt.setInt( index++, pk.getIdDatosPersonalizados() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DatosPersonalizadosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the datos_personalizados table.
	 */
	public void delete(DatosPersonalizadosPk pk) throws DatosPersonalizadosDaoException
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
			stmt.setInt( 1, pk.getIdDatosPersonalizados() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DatosPersonalizadosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the datos_personalizados table that matches the specified primary-key value.
	 */
	public DatosPersonalizados findByPrimaryKey(DatosPersonalizadosPk pk) throws DatosPersonalizadosDaoException
	{
		return findByPrimaryKey( pk.getIdDatosPersonalizados() );
	}

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria 'id_datos_personalizados = :idDatosPersonalizados'.
	 */
	public DatosPersonalizados findByPrimaryKey(int idDatosPersonalizados) throws DatosPersonalizadosDaoException
	{
		DatosPersonalizados ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_datos_personalizados = ?", new Object[] {  new Integer(idDatosPersonalizados) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria ''.
	 */
	public DatosPersonalizados[] findAll() throws DatosPersonalizadosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_datos_personalizados", null );
	}

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria 'id_datos_personalizados = :idDatosPersonalizados'.
	 */
	public DatosPersonalizados[] findWhereIdDatosPersonalizadosEquals(int idDatosPersonalizados) throws DatosPersonalizadosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_datos_personalizados = ? ORDER BY id_datos_personalizados", new Object[] {  new Integer(idDatosPersonalizados) } );
	}

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public DatosPersonalizados[] findWhereIdEmpresaEquals(int idEmpresa) throws DatosPersonalizadosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_empresa = ? ORDER BY id_empresa", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria 'variable = :variable'.
	 */
	public DatosPersonalizados[] findWhereVariableEquals(String variable) throws DatosPersonalizadosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE variable = ? ORDER BY variable", new Object[] { variable } );
	}

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria 'descripcion = :descripcion'.
	 */
	public DatosPersonalizados[] findWhereDescripcionEquals(String descripcion) throws DatosPersonalizadosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE descripcion = ? ORDER BY descripcion", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the datos_personalizados table that match the criteria 'tipo = :tipo'.
	 */
	public DatosPersonalizados[] findWhereTipoEquals(short tipo) throws DatosPersonalizadosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tipo = ? ORDER BY tipo", new Object[] {  new Short(tipo) } );
	}

	/**
	 * Method 'DatosPersonalizadosDaoImpl'
	 * 
	 */
	public DatosPersonalizadosDaoImpl()
	{
	}

	/**
	 * Method 'DatosPersonalizadosDaoImpl'
	 * 
	 * @param userConn
	 */
	public DatosPersonalizadosDaoImpl(final java.sql.Connection userConn)
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
		return "datos_personalizados";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected DatosPersonalizados fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			DatosPersonalizados dto = new DatosPersonalizados();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected DatosPersonalizados[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			DatosPersonalizados dto = new DatosPersonalizados();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		DatosPersonalizados ret[] = new DatosPersonalizados[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(DatosPersonalizados dto, ResultSet rs) throws SQLException
	{
		dto.setIdDatosPersonalizados( rs.getInt( COLUMN_ID_DATOS_PERSONALIZADOS ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setVariable( rs.getString( COLUMN_VARIABLE ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setTipo( rs.getShort( COLUMN_TIPO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(DatosPersonalizados dto)
	{
		dto.setIdDatosPersonalizadosModified( false );
		dto.setIdEmpresaModified( false );
		dto.setVariableModified( false );
		dto.setDescripcionModified( false );
		dto.setTipoModified( false );
	}

	/** 
	 * Returns all rows from the datos_personalizados table that match the specified arbitrary SQL statement
	 */
	public DatosPersonalizados[] findByDynamicSelect(String sql, Object[] sqlParams) throws DatosPersonalizadosDaoException
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
			throw new DatosPersonalizadosDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the datos_personalizados table that match the specified arbitrary SQL statement
	 */
	public DatosPersonalizados[] findByDynamicWhere(String sql, Object[] sqlParams) throws DatosPersonalizadosDaoException
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
			throw new DatosPersonalizadosDaoException( "Exception: " + _e.getMessage(), _e );
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
