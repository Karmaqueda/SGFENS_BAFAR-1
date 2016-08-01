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

public class CrSolicitudBitacoraDaoImpl extends AbstractDAO implements CrSolicitudBitacoraDao
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
	protected final String SQL_SELECT = "SELECT id_solicitud_bitacora, id_formulario_evento, id_estado_solicitud, id_usuario, id_empresa, descripcion_evento, fecha_hr_creacion FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_solicitud_bitacora, id_formulario_evento, id_estado_solicitud, id_usuario, id_empresa, descripcion_evento, fecha_hr_creacion ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_solicitud_bitacora = ?, id_formulario_evento = ?, id_estado_solicitud = ?, id_usuario = ?, id_empresa = ?, descripcion_evento = ?, fecha_hr_creacion = ? WHERE id_solicitud_bitacora = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_solicitud_bitacora = ?";

	/** 
	 * Index of column id_solicitud_bitacora
	 */
	protected static final int COLUMN_ID_SOLICITUD_BITACORA = 1;

	/** 
	 * Index of column id_formulario_evento
	 */
	protected static final int COLUMN_ID_FORMULARIO_EVENTO = 2;

	/** 
	 * Index of column id_estado_solicitud
	 */
	protected static final int COLUMN_ID_ESTADO_SOLICITUD = 3;

	/** 
	 * Index of column id_usuario
	 */
	protected static final int COLUMN_ID_USUARIO = 4;

	/** 
	 * Index of column id_empresa
	 */
	protected static final int COLUMN_ID_EMPRESA = 5;

	/** 
	 * Index of column descripcion_evento
	 */
	protected static final int COLUMN_DESCRIPCION_EVENTO = 6;

	/** 
	 * Index of column fecha_hr_creacion
	 */
	protected static final int COLUMN_FECHA_HR_CREACION = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column id_solicitud_bitacora
	 */
	protected static final int PK_COLUMN_ID_SOLICITUD_BITACORA = 1;

	/** 
	 * Inserts a new row in the cr_solicitud_bitacora table.
	 */
	public CrSolicitudBitacoraPk insert(CrSolicitudBitacora dto) throws CrSolicitudBitacoraDaoException
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
			if (dto.isIdSolicitudBitacoraModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_solicitud_bitacora" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdFormularioEventoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_formulario_evento" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEstadoSolicitudModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_estado_solicitud" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdUsuarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_usuario" );
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
		
			if (dto.isDescripcionEventoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "descripcion_evento" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaHrCreacionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "fecha_hr_creacion" );
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
			if (dto.isIdSolicitudBitacoraModified()) {
				stmt.setInt( index++, dto.getIdSolicitudBitacora() );
			}
		
			if (dto.isIdFormularioEventoModified()) {
				stmt.setInt( index++, dto.getIdFormularioEvento() );
			}
		
			if (dto.isIdEstadoSolicitudModified()) {
				stmt.setInt( index++, dto.getIdEstadoSolicitud() );
			}
		
			if (dto.isIdUsuarioModified()) {
				stmt.setInt( index++, dto.getIdUsuario() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isDescripcionEventoModified()) {
				stmt.setString( index++, dto.getDescripcionEvento() );
			}
		
			if (dto.isFechaHrCreacionModified()) {
				stmt.setTimestamp(index++, dto.getFechaHrCreacion()==null ? null : new java.sql.Timestamp( dto.getFechaHrCreacion().getTime() ) );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdSolicitudBitacora( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrSolicitudBitacoraDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the cr_solicitud_bitacora table.
	 */
	public void update(CrSolicitudBitacoraPk pk, CrSolicitudBitacora dto) throws CrSolicitudBitacoraDaoException
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
			if (dto.isIdSolicitudBitacoraModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_solicitud_bitacora=?" );
				modified=true;
			}
		
			if (dto.isIdFormularioEventoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_formulario_evento=?" );
				modified=true;
			}
		
			if (dto.isIdEstadoSolicitudModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_estado_solicitud=?" );
				modified=true;
			}
		
			if (dto.isIdUsuarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_usuario=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_empresa=?" );
				modified=true;
			}
		
			if (dto.isDescripcionEventoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "descripcion_evento=?" );
				modified=true;
			}
		
			if (dto.isFechaHrCreacionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "fecha_hr_creacion=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id_solicitud_bitacora=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdSolicitudBitacoraModified()) {
				stmt.setInt( index++, dto.getIdSolicitudBitacora() );
			}
		
			if (dto.isIdFormularioEventoModified()) {
				stmt.setInt( index++, dto.getIdFormularioEvento() );
			}
		
			if (dto.isIdEstadoSolicitudModified()) {
				stmt.setInt( index++, dto.getIdEstadoSolicitud() );
			}
		
			if (dto.isIdUsuarioModified()) {
				stmt.setInt( index++, dto.getIdUsuario() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isDescripcionEventoModified()) {
				stmt.setString( index++, dto.getDescripcionEvento() );
			}
		
			if (dto.isFechaHrCreacionModified()) {
				stmt.setTimestamp(index++, dto.getFechaHrCreacion()==null ? null : new java.sql.Timestamp( dto.getFechaHrCreacion().getTime() ) );
			}
		
			stmt.setInt( index++, pk.getIdSolicitudBitacora() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrSolicitudBitacoraDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the cr_solicitud_bitacora table.
	 */
	public void delete(CrSolicitudBitacoraPk pk) throws CrSolicitudBitacoraDaoException
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
			stmt.setInt( 1, pk.getIdSolicitudBitacora() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CrSolicitudBitacoraDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the cr_solicitud_bitacora table that matches the specified primary-key value.
	 */
	public CrSolicitudBitacora findByPrimaryKey(CrSolicitudBitacoraPk pk) throws CrSolicitudBitacoraDaoException
	{
		return findByPrimaryKey( pk.getIdSolicitudBitacora() );
	}

	/** 
	 * Returns all rows from the cr_solicitud_bitacora table that match the criteria 'id_solicitud_bitacora = :idSolicitudBitacora'.
	 */
	public CrSolicitudBitacora findByPrimaryKey(int idSolicitudBitacora) throws CrSolicitudBitacoraDaoException
	{
		CrSolicitudBitacora ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_solicitud_bitacora = ?", new Object[] {  new Integer(idSolicitudBitacora) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the cr_solicitud_bitacora table that match the criteria ''.
	 */
	public CrSolicitudBitacora[] findAll() throws CrSolicitudBitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_solicitud_bitacora", null );
	}

	/** 
	 * Returns all rows from the cr_solicitud_bitacora table that match the criteria 'id_solicitud_bitacora = :idSolicitudBitacora'.
	 */
	public CrSolicitudBitacora[] findWhereIdSolicitudBitacoraEquals(int idSolicitudBitacora) throws CrSolicitudBitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_solicitud_bitacora = ? ORDER BY id_solicitud_bitacora", new Object[] {  new Integer(idSolicitudBitacora) } );
	}

	/** 
	 * Returns all rows from the cr_solicitud_bitacora table that match the criteria 'id_formulario_evento = :idFormularioEvento'.
	 */
	public CrSolicitudBitacora[] findWhereIdFormularioEventoEquals(int idFormularioEvento) throws CrSolicitudBitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_formulario_evento = ? ORDER BY id_formulario_evento", new Object[] {  new Integer(idFormularioEvento) } );
	}

	/** 
	 * Returns all rows from the cr_solicitud_bitacora table that match the criteria 'id_estado_solicitud = :idEstadoSolicitud'.
	 */
	public CrSolicitudBitacora[] findWhereIdEstadoSolicitudEquals(int idEstadoSolicitud) throws CrSolicitudBitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_estado_solicitud = ? ORDER BY id_estado_solicitud", new Object[] {  new Integer(idEstadoSolicitud) } );
	}

	/** 
	 * Returns all rows from the cr_solicitud_bitacora table that match the criteria 'id_usuario = :idUsuario'.
	 */
	public CrSolicitudBitacora[] findWhereIdUsuarioEquals(int idUsuario) throws CrSolicitudBitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_usuario = ? ORDER BY id_usuario", new Object[] {  new Integer(idUsuario) } );
	}

	/** 
	 * Returns all rows from the cr_solicitud_bitacora table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public CrSolicitudBitacora[] findWhereIdEmpresaEquals(int idEmpresa) throws CrSolicitudBitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_empresa = ? ORDER BY id_empresa", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the cr_solicitud_bitacora table that match the criteria 'descripcion_evento = :descripcionEvento'.
	 */
	public CrSolicitudBitacora[] findWhereDescripcionEventoEquals(String descripcionEvento) throws CrSolicitudBitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE descripcion_evento = ? ORDER BY descripcion_evento", new Object[] { descripcionEvento } );
	}

	/** 
	 * Returns all rows from the cr_solicitud_bitacora table that match the criteria 'fecha_hr_creacion = :fechaHrCreacion'.
	 */
	public CrSolicitudBitacora[] findWhereFechaHrCreacionEquals(Date fechaHrCreacion) throws CrSolicitudBitacoraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fecha_hr_creacion = ? ORDER BY fecha_hr_creacion", new Object[] { fechaHrCreacion==null ? null : new java.sql.Timestamp( fechaHrCreacion.getTime() ) } );
	}

	/**
	 * Method 'CrSolicitudBitacoraDaoImpl'
	 * 
	 */
	public CrSolicitudBitacoraDaoImpl()
	{
	}

	/**
	 * Method 'CrSolicitudBitacoraDaoImpl'
	 * 
	 * @param userConn
	 */
	public CrSolicitudBitacoraDaoImpl(final java.sql.Connection userConn)
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
		return "cr_solicitud_bitacora";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected CrSolicitudBitacora fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			CrSolicitudBitacora dto = new CrSolicitudBitacora();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected CrSolicitudBitacora[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			CrSolicitudBitacora dto = new CrSolicitudBitacora();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		CrSolicitudBitacora ret[] = new CrSolicitudBitacora[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(CrSolicitudBitacora dto, ResultSet rs) throws SQLException
	{
		dto.setIdSolicitudBitacora( rs.getInt( COLUMN_ID_SOLICITUD_BITACORA ) );
		dto.setIdFormularioEvento( rs.getInt( COLUMN_ID_FORMULARIO_EVENTO ) );
		dto.setIdEstadoSolicitud( rs.getInt( COLUMN_ID_ESTADO_SOLICITUD ) );
		dto.setIdUsuario( rs.getInt( COLUMN_ID_USUARIO ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setDescripcionEvento( rs.getString( COLUMN_DESCRIPCION_EVENTO ) );
		dto.setFechaHrCreacion( rs.getTimestamp(COLUMN_FECHA_HR_CREACION ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(CrSolicitudBitacora dto)
	{
		dto.setIdSolicitudBitacoraModified( false );
		dto.setIdFormularioEventoModified( false );
		dto.setIdEstadoSolicitudModified( false );
		dto.setIdUsuarioModified( false );
		dto.setIdEmpresaModified( false );
		dto.setDescripcionEventoModified( false );
		dto.setFechaHrCreacionModified( false );
	}

	/** 
	 * Returns all rows from the cr_solicitud_bitacora table that match the specified arbitrary SQL statement
	 */
	public CrSolicitudBitacora[] findByDynamicSelect(String sql, Object[] sqlParams) throws CrSolicitudBitacoraDaoException
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
			throw new CrSolicitudBitacoraDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the cr_solicitud_bitacora table that match the specified arbitrary SQL statement
	 */
	public CrSolicitudBitacora[] findByDynamicWhere(String sql, Object[] sqlParams) throws CrSolicitudBitacoraDaoException
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
			throw new CrSolicitudBitacoraDaoException( "Exception: " + _e.getMessage(), _e );
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
