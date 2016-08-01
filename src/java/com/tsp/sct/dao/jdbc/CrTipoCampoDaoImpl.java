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

public class CrTipoCampoDaoImpl extends AbstractDAO implements CrTipoCampoDao
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
	protected final String SQL_SELECT = "SELECT id_tipo_campo, nombre, descripcion, img_vista_previa, icono_nombre, id_empresa, id_estatus, is_creado_sistema FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_tipo_campo, nombre, descripcion, img_vista_previa, icono_nombre, id_empresa, id_estatus, is_creado_sistema ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_tipo_campo = ?, nombre = ?, descripcion = ?, img_vista_previa = ?, icono_nombre = ?, id_empresa = ?, id_estatus = ?, is_creado_sistema = ? WHERE id_tipo_campo = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_tipo_campo = ?";

	/** 
	 * Index of column id_tipo_campo
	 */
	protected static final int COLUMN_ID_TIPO_CAMPO = 1;

	/** 
	 * Index of column nombre
	 */
	protected static final int COLUMN_NOMBRE = 2;

	/** 
	 * Index of column descripcion
	 */
	protected static final int COLUMN_DESCRIPCION = 3;

	/** 
	 * Index of column img_vista_previa
	 */
	protected static final int COLUMN_IMG_VISTA_PREVIA = 4;

	/** 
	 * Index of column icono_nombre
	 */
	protected static final int COLUMN_ICONO_NOMBRE = 5;

	/** 
	 * Index of column id_empresa
	 */
	protected static final int COLUMN_ID_EMPRESA = 6;

	/** 
	 * Index of column id_estatus
	 */
	protected static final int COLUMN_ID_ESTATUS = 7;

	/** 
	 * Index of column is_creado_sistema
	 */
	protected static final int COLUMN_IS_CREADO_SISTEMA = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Index of primary-key column id_tipo_campo
	 */
	protected static final int PK_COLUMN_ID_TIPO_CAMPO = 1;

	/** 
	 * Inserts a new row in the cr_tipo_campo table.
	 */
	public CrTipoCampoPk insert(CrTipoCampo dto) throws CrTipoCampoDaoException
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
			if (dto.isIdTipoCampoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_tipo_campo" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "nombre" );
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
		
			if (dto.isImgVistaPreviaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "img_vista_previa" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIconoNombreModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "icono_nombre" );
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
		
			if (dto.isIdEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_estatus" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIsCreadoSistemaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "is_creado_sistema" );
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
			if (dto.isIdTipoCampoModified()) {
				stmt.setInt( index++, dto.getIdTipoCampo() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isImgVistaPreviaModified()) {
				stmt.setString( index++, dto.getImgVistaPrevia() );
			}
		
			if (dto.isIconoNombreModified()) {
				super.setBlobColumn(stmt, index++, dto.getIconoNombre() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			if (dto.isIsCreadoSistemaModified()) {
				if (dto.isIsCreadoSistemaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIsCreadoSistema() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdTipoCampo( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrTipoCampoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the cr_tipo_campo table.
	 */
	public void update(CrTipoCampoPk pk, CrTipoCampo dto) throws CrTipoCampoDaoException
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
			if (dto.isIdTipoCampoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_tipo_campo=?" );
				modified=true;
			}
		
			if (dto.isNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "nombre=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "descripcion=?" );
				modified=true;
			}
		
			if (dto.isImgVistaPreviaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "img_vista_previa=?" );
				modified=true;
			}
		
			if (dto.isIconoNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "icono_nombre=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_empresa=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_estatus=?" );
				modified=true;
			}
		
			if (dto.isIsCreadoSistemaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "is_creado_sistema=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id_tipo_campo=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdTipoCampoModified()) {
				stmt.setInt( index++, dto.getIdTipoCampo() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isImgVistaPreviaModified()) {
				stmt.setString( index++, dto.getImgVistaPrevia() );
			}
		
			if (dto.isIconoNombreModified()) {
				super.setBlobColumn(stmt, index++, dto.getIconoNombre() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			if (dto.isIsCreadoSistemaModified()) {
				if (dto.isIsCreadoSistemaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIsCreadoSistema() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdTipoCampo() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrTipoCampoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the cr_tipo_campo table.
	 */
	public void delete(CrTipoCampoPk pk) throws CrTipoCampoDaoException
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
			stmt.setInt( 1, pk.getIdTipoCampo() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrTipoCampoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the cr_tipo_campo table that matches the specified primary-key value.
	 */
	public CrTipoCampo findByPrimaryKey(CrTipoCampoPk pk) throws CrTipoCampoDaoException
	{
		return findByPrimaryKey( pk.getIdTipoCampo() );
	}

	/** 
	 * Returns all rows from the cr_tipo_campo table that match the criteria 'id_tipo_campo = :idTipoCampo'.
	 */
	public CrTipoCampo findByPrimaryKey(int idTipoCampo) throws CrTipoCampoDaoException
	{
		CrTipoCampo ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_tipo_campo = ?", new Object[] {  new Integer(idTipoCampo) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the cr_tipo_campo table that match the criteria ''.
	 */
	public CrTipoCampo[] findAll() throws CrTipoCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_tipo_campo", null );
	}

	/** 
	 * Returns all rows from the cr_tipo_campo table that match the criteria 'id_tipo_campo = :idTipoCampo'.
	 */
	public CrTipoCampo[] findWhereIdTipoCampoEquals(int idTipoCampo) throws CrTipoCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_tipo_campo = ? ORDER BY id_tipo_campo", new Object[] {  new Integer(idTipoCampo) } );
	}

	/** 
	 * Returns all rows from the cr_tipo_campo table that match the criteria 'nombre = :nombre'.
	 */
	public CrTipoCampo[] findWhereNombreEquals(String nombre) throws CrTipoCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombre = ? ORDER BY nombre", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the cr_tipo_campo table that match the criteria 'descripcion = :descripcion'.
	 */
	public CrTipoCampo[] findWhereDescripcionEquals(String descripcion) throws CrTipoCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE descripcion = ? ORDER BY descripcion", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the cr_tipo_campo table that match the criteria 'img_vista_previa = :imgVistaPrevia'.
	 */
	public CrTipoCampo[] findWhereImgVistaPreviaEquals(String imgVistaPrevia) throws CrTipoCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE img_vista_previa = ? ORDER BY img_vista_previa", new Object[] { imgVistaPrevia } );
	}

	/** 
	 * Returns all rows from the cr_tipo_campo table that match the criteria 'icono_nombre = :iconoNombre'.
	 */
	public CrTipoCampo[] findWhereIconoNombreEquals(byte[] iconoNombre) throws CrTipoCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE icono_nombre = ? ORDER BY icono_nombre", new Object[] { iconoNombre } );
	}

	/** 
	 * Returns all rows from the cr_tipo_campo table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public CrTipoCampo[] findWhereIdEmpresaEquals(int idEmpresa) throws CrTipoCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_empresa = ? ORDER BY id_empresa", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the cr_tipo_campo table that match the criteria 'id_estatus = :idEstatus'.
	 */
	public CrTipoCampo[] findWhereIdEstatusEquals(int idEstatus) throws CrTipoCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_estatus = ? ORDER BY id_estatus", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the cr_tipo_campo table that match the criteria 'is_creado_sistema = :isCreadoSistema'.
	 */
	public CrTipoCampo[] findWhereIsCreadoSistemaEquals(int isCreadoSistema) throws CrTipoCampoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE is_creado_sistema = ? ORDER BY is_creado_sistema", new Object[] {  new Integer(isCreadoSistema) } );
	}

	/**
	 * Method 'CrTipoCampoDaoImpl'
	 * 
	 */
	public CrTipoCampoDaoImpl()
	{
	}

	/**
	 * Method 'CrTipoCampoDaoImpl'
	 * 
	 * @param userConn
	 */
	public CrTipoCampoDaoImpl(final java.sql.Connection userConn)
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
		return "cr_tipo_campo";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected CrTipoCampo fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			CrTipoCampo dto = new CrTipoCampo();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected CrTipoCampo[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			CrTipoCampo dto = new CrTipoCampo();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		CrTipoCampo ret[] = new CrTipoCampo[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(CrTipoCampo dto, ResultSet rs) throws SQLException
	{
		dto.setIdTipoCampo( rs.getInt( COLUMN_ID_TIPO_CAMPO ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setImgVistaPrevia( rs.getString( COLUMN_IMG_VISTA_PREVIA ) );
		dto.setIconoNombre( super.getBlobColumn(rs, COLUMN_ICONO_NOMBRE ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		dto.setIsCreadoSistema( rs.getInt( COLUMN_IS_CREADO_SISTEMA ) );
		if (rs.wasNull()) {
			dto.setIsCreadoSistemaNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(CrTipoCampo dto)
	{
		dto.setIdTipoCampoModified( false );
		dto.setNombreModified( false );
		dto.setDescripcionModified( false );
		dto.setImgVistaPreviaModified( false );
		dto.setIconoNombreModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdEstatusModified( false );
		dto.setIsCreadoSistemaModified( false );
	}

	/** 
	 * Returns all rows from the cr_tipo_campo table that match the specified arbitrary SQL statement
	 */
	public CrTipoCampo[] findByDynamicSelect(String sql, Object[] sqlParams) throws CrTipoCampoDaoException
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
			throw new CrTipoCampoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the cr_tipo_campo table that match the specified arbitrary SQL statement
	 */
	public CrTipoCampo[] findByDynamicWhere(String sql, Object[] sqlParams) throws CrTipoCampoDaoException
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
			throw new CrTipoCampoDaoException( "Exception: " + _e.getMessage(), _e );
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
