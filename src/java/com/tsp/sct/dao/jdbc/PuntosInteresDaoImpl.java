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

public class PuntosInteresDaoImpl extends AbstractDAO implements PuntosInteresDao
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
	protected final String SQL_SELECT = "SELECT ID_PUNTO, ID_EMPRESA, NOMBRE, DESCRIPCION, LATITUD, LONGITUD, ID_TIPO_PUNTO, DIRECCION, IMAGEN FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_PUNTO, ID_EMPRESA, NOMBRE, DESCRIPCION, LATITUD, LONGITUD, ID_TIPO_PUNTO, DIRECCION, IMAGEN ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_PUNTO = ?, ID_EMPRESA = ?, NOMBRE = ?, DESCRIPCION = ?, LATITUD = ?, LONGITUD = ?, ID_TIPO_PUNTO = ?, DIRECCION = ?, IMAGEN = ? WHERE ID_PUNTO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_PUNTO = ?";

	/** 
	 * Index of column ID_PUNTO
	 */
	protected static final int COLUMN_ID_PUNTO = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column NOMBRE
	 */
	protected static final int COLUMN_NOMBRE = 3;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 4;

	/** 
	 * Index of column LATITUD
	 */
	protected static final int COLUMN_LATITUD = 5;

	/** 
	 * Index of column LONGITUD
	 */
	protected static final int COLUMN_LONGITUD = 6;

	/** 
	 * Index of column ID_TIPO_PUNTO
	 */
	protected static final int COLUMN_ID_TIPO_PUNTO = 7;

	/** 
	 * Index of column DIRECCION
	 */
	protected static final int COLUMN_DIRECCION = 8;

	/** 
	 * Index of column IMAGEN
	 */
	protected static final int COLUMN_IMAGEN = 9;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 9;

	/** 
	 * Index of primary-key column ID_PUNTO
	 */
	protected static final int PK_COLUMN_ID_PUNTO = 1;

	/** 
	 * Inserts a new row in the puntos_interes table.
	 */
	public PuntosInteresPk insert(PuntosInteres dto) throws PuntosInteresDaoException
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
			if (dto.isIdPuntoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_PUNTO" );
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
		
			if (dto.isNombreModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescripcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DESCRIPCION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isLatitudModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "LATITUD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isLongitudModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "LONGITUD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdTipoPuntoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_TIPO_PUNTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDireccionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DIRECCION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isImagenModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "IMAGEN" );
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
			if (dto.isIdPuntoModified()) {
				stmt.setInt( index++, dto.getIdPunto() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isLatitudModified()) {
				stmt.setString( index++, dto.getLatitud() );
			}
		
			if (dto.isLongitudModified()) {
				stmt.setString( index++, dto.getLongitud() );
			}
		
			if (dto.isIdTipoPuntoModified()) {
				stmt.setInt( index++, dto.getIdTipoPunto() );
			}
		
			if (dto.isDireccionModified()) {
				stmt.setString( index++, dto.getDireccion() );
			}
		
			if (dto.isImagenModified()) {
				stmt.setString( index++, dto.getImagen() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdPunto( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PuntosInteresDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the puntos_interes table.
	 */
	public void update(PuntosInteresPk pk, PuntosInteres dto) throws PuntosInteresDaoException
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
			if (dto.isIdPuntoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_PUNTO=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DESCRIPCION=?" );
				modified=true;
			}
		
			if (dto.isLatitudModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "LATITUD=?" );
				modified=true;
			}
		
			if (dto.isLongitudModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "LONGITUD=?" );
				modified=true;
			}
		
			if (dto.isIdTipoPuntoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_TIPO_PUNTO=?" );
				modified=true;
			}
		
			if (dto.isDireccionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DIRECCION=?" );
				modified=true;
			}
		
			if (dto.isImagenModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "IMAGEN=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_PUNTO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdPuntoModified()) {
				stmt.setInt( index++, dto.getIdPunto() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isLatitudModified()) {
				stmt.setString( index++, dto.getLatitud() );
			}
		
			if (dto.isLongitudModified()) {
				stmt.setString( index++, dto.getLongitud() );
			}
		
			if (dto.isIdTipoPuntoModified()) {
				stmt.setInt( index++, dto.getIdTipoPunto() );
			}
		
			if (dto.isDireccionModified()) {
				stmt.setString( index++, dto.getDireccion() );
			}
		
			if (dto.isImagenModified()) {
				stmt.setString( index++, dto.getImagen() );
			}
		
			stmt.setInt( index++, pk.getIdPunto() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PuntosInteresDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the puntos_interes table.
	 */
	public void delete(PuntosInteresPk pk) throws PuntosInteresDaoException
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
			stmt.setInt( 1, pk.getIdPunto() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PuntosInteresDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the puntos_interes table that matches the specified primary-key value.
	 */
	public PuntosInteres findByPrimaryKey(PuntosInteresPk pk) throws PuntosInteresDaoException
	{
		return findByPrimaryKey( pk.getIdPunto() );
	}

	/** 
	 * Returns all rows from the puntos_interes table that match the criteria 'ID_PUNTO = :idPunto'.
	 */
	public PuntosInteres findByPrimaryKey(int idPunto) throws PuntosInteresDaoException
	{
		PuntosInteres ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_PUNTO = ?", new Object[] {  new Integer(idPunto) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the puntos_interes table that match the criteria ''.
	 */
	public PuntosInteres[] findAll() throws PuntosInteresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_PUNTO", null );
	}

	/** 
	 * Returns all rows from the puntos_interes table that match the criteria 'ID_PUNTO = :idPunto'.
	 */
	public PuntosInteres[] findWhereIdPuntoEquals(int idPunto) throws PuntosInteresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PUNTO = ? ORDER BY ID_PUNTO", new Object[] {  new Integer(idPunto) } );
	}

	/** 
	 * Returns all rows from the puntos_interes table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public PuntosInteres[] findWhereIdEmpresaEquals(int idEmpresa) throws PuntosInteresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the puntos_interes table that match the criteria 'NOMBRE = :nombre'.
	 */
	public PuntosInteres[] findWhereNombreEquals(String nombre) throws PuntosInteresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the puntos_interes table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public PuntosInteres[] findWhereDescripcionEquals(String descripcion) throws PuntosInteresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the puntos_interes table that match the criteria 'LATITUD = :latitud'.
	 */
	public PuntosInteres[] findWhereLatitudEquals(String latitud) throws PuntosInteresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LATITUD = ? ORDER BY LATITUD", new Object[] { latitud } );
	}

	/** 
	 * Returns all rows from the puntos_interes table that match the criteria 'LONGITUD = :longitud'.
	 */
	public PuntosInteres[] findWhereLongitudEquals(String longitud) throws PuntosInteresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LONGITUD = ? ORDER BY LONGITUD", new Object[] { longitud } );
	}

	/** 
	 * Returns all rows from the puntos_interes table that match the criteria 'ID_TIPO_PUNTO = :idTipoPunto'.
	 */
	public PuntosInteres[] findWhereIdTipoPuntoEquals(int idTipoPunto) throws PuntosInteresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_TIPO_PUNTO = ? ORDER BY ID_TIPO_PUNTO", new Object[] {  new Integer(idTipoPunto) } );
	}

	/** 
	 * Returns all rows from the puntos_interes table that match the criteria 'DIRECCION = :direccion'.
	 */
	public PuntosInteres[] findWhereDireccionEquals(String direccion) throws PuntosInteresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DIRECCION = ? ORDER BY DIRECCION", new Object[] { direccion } );
	}

	/** 
	 * Returns all rows from the puntos_interes table that match the criteria 'IMAGEN = :imagen'.
	 */
	public PuntosInteres[] findWhereImagenEquals(String imagen) throws PuntosInteresDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IMAGEN = ? ORDER BY IMAGEN", new Object[] { imagen } );
	}

	/**
	 * Method 'PuntosInteresDaoImpl'
	 * 
	 */
	public PuntosInteresDaoImpl()
	{
	}

	/**
	 * Method 'PuntosInteresDaoImpl'
	 * 
	 * @param userConn
	 */
	public PuntosInteresDaoImpl(final java.sql.Connection userConn)
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
		return "puntos_interes";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected PuntosInteres fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			PuntosInteres dto = new PuntosInteres();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected PuntosInteres[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			PuntosInteres dto = new PuntosInteres();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		PuntosInteres ret[] = new PuntosInteres[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(PuntosInteres dto, ResultSet rs) throws SQLException
	{
		dto.setIdPunto( rs.getInt( COLUMN_ID_PUNTO ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setLatitud( rs.getString( COLUMN_LATITUD ) );
		dto.setLongitud( rs.getString( COLUMN_LONGITUD ) );
		dto.setIdTipoPunto( rs.getInt( COLUMN_ID_TIPO_PUNTO ) );
		dto.setDireccion( rs.getString( COLUMN_DIRECCION ) );
		dto.setImagen( rs.getString( COLUMN_IMAGEN ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(PuntosInteres dto)
	{
		dto.setIdPuntoModified( false );
		dto.setIdEmpresaModified( false );
		dto.setNombreModified( false );
		dto.setDescripcionModified( false );
		dto.setLatitudModified( false );
		dto.setLongitudModified( false );
		dto.setIdTipoPuntoModified( false );
		dto.setDireccionModified( false );
		dto.setImagenModified( false );
	}

	/** 
	 * Returns all rows from the puntos_interes table that match the specified arbitrary SQL statement
	 */
	public PuntosInteres[] findByDynamicSelect(String sql, Object[] sqlParams) throws PuntosInteresDaoException
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
			throw new PuntosInteresDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the puntos_interes table that match the specified arbitrary SQL statement
	 */
	public PuntosInteres[] findByDynamicWhere(String sql, Object[] sqlParams) throws PuntosInteresDaoException
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
			throw new PuntosInteresDaoException( "Exception: " + _e.getMessage(), _e );
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
