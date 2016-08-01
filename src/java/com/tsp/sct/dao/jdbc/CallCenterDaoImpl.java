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

public class CallCenterDaoImpl extends AbstractDAO implements CallCenterDao
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
	protected final String SQL_SELECT = "SELECT ID_CALL_CENTER, ID_EMPRESA, ID_CLIENTE, NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO, TELEFONO, CORREO, TIPO, ESTADO, DESCRIPCION, ID_USUARIO, NUMERO_TICKET, FECHA_CREACION, CON_SEGUIMIENTO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_CALL_CENTER, ID_EMPRESA, ID_CLIENTE, NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO, TELEFONO, CORREO, TIPO, ESTADO, DESCRIPCION, ID_USUARIO, NUMERO_TICKET, FECHA_CREACION, CON_SEGUIMIENTO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_CALL_CENTER = ?, ID_EMPRESA = ?, ID_CLIENTE = ?, NOMBRE = ?, APELLIDO_PATERNO = ?, APELLIDO_MATERNO = ?, TELEFONO = ?, CORREO = ?, TIPO = ?, ESTADO = ?, DESCRIPCION = ?, ID_USUARIO = ?, NUMERO_TICKET = ?, FECHA_CREACION = ?, CON_SEGUIMIENTO = ? WHERE ID_CALL_CENTER = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_CALL_CENTER = ?";

	/** 
	 * Index of column ID_CALL_CENTER
	 */
	protected static final int COLUMN_ID_CALL_CENTER = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column ID_CLIENTE
	 */
	protected static final int COLUMN_ID_CLIENTE = 3;

	/** 
	 * Index of column NOMBRE
	 */
	protected static final int COLUMN_NOMBRE = 4;

	/** 
	 * Index of column APELLIDO_PATERNO
	 */
	protected static final int COLUMN_APELLIDO_PATERNO = 5;

	/** 
	 * Index of column APELLIDO_MATERNO
	 */
	protected static final int COLUMN_APELLIDO_MATERNO = 6;

	/** 
	 * Index of column TELEFONO
	 */
	protected static final int COLUMN_TELEFONO = 7;

	/** 
	 * Index of column CORREO
	 */
	protected static final int COLUMN_CORREO = 8;

	/** 
	 * Index of column TIPO
	 */
	protected static final int COLUMN_TIPO = 9;

	/** 
	 * Index of column ESTADO
	 */
	protected static final int COLUMN_ESTADO = 10;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 11;

	/** 
	 * Index of column ID_USUARIO
	 */
	protected static final int COLUMN_ID_USUARIO = 12;

	/** 
	 * Index of column NUMERO_TICKET
	 */
	protected static final int COLUMN_NUMERO_TICKET = 13;

	/** 
	 * Index of column FECHA_CREACION
	 */
	protected static final int COLUMN_FECHA_CREACION = 14;

	/** 
	 * Index of column CON_SEGUIMIENTO
	 */
	protected static final int COLUMN_CON_SEGUIMIENTO = 15;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 15;

	/** 
	 * Index of primary-key column ID_CALL_CENTER
	 */
	protected static final int PK_COLUMN_ID_CALL_CENTER = 1;

	/** 
	 * Inserts a new row in the call_center table.
	 */
	public CallCenterPk insert(CallCenter dto) throws CallCenterDaoException
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
			if (dto.isIdCallCenterModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CALL_CENTER" );
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
		
			if (dto.isIdClienteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CLIENTE" );
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
		
			if (dto.isApellidoPaternoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "APELLIDO_PATERNO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isApellidoMaternoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "APELLIDO_MATERNO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTelefonoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "TELEFONO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCorreoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CORREO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTipoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "TIPO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isEstadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ESTADO" );
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
		
			if (dto.isIdUsuarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_USUARIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNumeroTicketModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NUMERO_TICKET" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaCreacionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_CREACION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isConSeguimientoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CON_SEGUIMIENTO" );
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
			if (dto.isIdCallCenterModified()) {
				stmt.setInt( index++, dto.getIdCallCenter() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isIdClienteModified()) {
				if (dto.isIdClienteNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCliente() );
				}
		
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isApellidoPaternoModified()) {
				stmt.setString( index++, dto.getApellidoPaterno() );
			}
		
			if (dto.isApellidoMaternoModified()) {
				stmt.setString( index++, dto.getApellidoMaterno() );
			}
		
			if (dto.isTelefonoModified()) {
				stmt.setString( index++, dto.getTelefono() );
			}
		
			if (dto.isCorreoModified()) {
				stmt.setString( index++, dto.getCorreo() );
			}
		
			if (dto.isTipoModified()) {
				if (dto.isTipoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getTipo() );
				}
		
			}
		
			if (dto.isEstadoModified()) {
				if (dto.isEstadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getEstado() );
				}
		
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isIdUsuarioModified()) {
				if (dto.isIdUsuarioNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdUsuario() );
				}
		
			}
		
			if (dto.isNumeroTicketModified()) {
				stmt.setString( index++, dto.getNumeroTicket() );
			}
		
			if (dto.isFechaCreacionModified()) {
				stmt.setTimestamp(index++, dto.getFechaCreacion()==null ? null : new java.sql.Timestamp( dto.getFechaCreacion().getTime() ) );
			}
		
			if (dto.isConSeguimientoModified()) {
				if (dto.isConSeguimientoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getConSeguimiento() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdCallCenter( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CallCenterDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the call_center table.
	 */
	public void update(CallCenterPk pk, CallCenter dto) throws CallCenterDaoException
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
			if (dto.isIdCallCenterModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CALL_CENTER=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isIdClienteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CLIENTE=?" );
				modified=true;
			}
		
			if (dto.isNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE=?" );
				modified=true;
			}
		
			if (dto.isApellidoPaternoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "APELLIDO_PATERNO=?" );
				modified=true;
			}
		
			if (dto.isApellidoMaternoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "APELLIDO_MATERNO=?" );
				modified=true;
			}
		
			if (dto.isTelefonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TELEFONO=?" );
				modified=true;
			}
		
			if (dto.isCorreoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CORREO=?" );
				modified=true;
			}
		
			if (dto.isTipoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TIPO=?" );
				modified=true;
			}
		
			if (dto.isEstadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ESTADO=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DESCRIPCION=?" );
				modified=true;
			}
		
			if (dto.isIdUsuarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_USUARIO=?" );
				modified=true;
			}
		
			if (dto.isNumeroTicketModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NUMERO_TICKET=?" );
				modified=true;
			}
		
			if (dto.isFechaCreacionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_CREACION=?" );
				modified=true;
			}
		
			if (dto.isConSeguimientoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CON_SEGUIMIENTO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_CALL_CENTER=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdCallCenterModified()) {
				stmt.setInt( index++, dto.getIdCallCenter() );
			}
		
			if (dto.isIdEmpresaModified()) {
				if (dto.isIdEmpresaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpresa() );
				}
		
			}
		
			if (dto.isIdClienteModified()) {
				if (dto.isIdClienteNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCliente() );
				}
		
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isApellidoPaternoModified()) {
				stmt.setString( index++, dto.getApellidoPaterno() );
			}
		
			if (dto.isApellidoMaternoModified()) {
				stmt.setString( index++, dto.getApellidoMaterno() );
			}
		
			if (dto.isTelefonoModified()) {
				stmt.setString( index++, dto.getTelefono() );
			}
		
			if (dto.isCorreoModified()) {
				stmt.setString( index++, dto.getCorreo() );
			}
		
			if (dto.isTipoModified()) {
				if (dto.isTipoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getTipo() );
				}
		
			}
		
			if (dto.isEstadoModified()) {
				if (dto.isEstadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getEstado() );
				}
		
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isIdUsuarioModified()) {
				if (dto.isIdUsuarioNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdUsuario() );
				}
		
			}
		
			if (dto.isNumeroTicketModified()) {
				stmt.setString( index++, dto.getNumeroTicket() );
			}
		
			if (dto.isFechaCreacionModified()) {
				stmt.setTimestamp(index++, dto.getFechaCreacion()==null ? null : new java.sql.Timestamp( dto.getFechaCreacion().getTime() ) );
			}
		
			if (dto.isConSeguimientoModified()) {
				if (dto.isConSeguimientoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getConSeguimiento() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdCallCenter() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CallCenterDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the call_center table.
	 */
	public void delete(CallCenterPk pk) throws CallCenterDaoException
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
			stmt.setInt( 1, pk.getIdCallCenter() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CallCenterDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the call_center table that matches the specified primary-key value.
	 */
	public CallCenter findByPrimaryKey(CallCenterPk pk) throws CallCenterDaoException
	{
		return findByPrimaryKey( pk.getIdCallCenter() );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'ID_CALL_CENTER = :idCallCenter'.
	 */
	public CallCenter findByPrimaryKey(int idCallCenter) throws CallCenterDaoException
	{
		CallCenter ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_CALL_CENTER = ?", new Object[] {  new Integer(idCallCenter) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria ''.
	 */
	public CallCenter[] findAll() throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_CALL_CENTER", null );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'ID_CALL_CENTER = :idCallCenter'.
	 */
	public CallCenter[] findWhereIdCallCenterEquals(int idCallCenter) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CALL_CENTER = ? ORDER BY ID_CALL_CENTER", new Object[] {  new Integer(idCallCenter) } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public CallCenter[] findWhereIdEmpresaEquals(int idEmpresa) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public CallCenter[] findWhereIdClienteEquals(int idCliente) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CLIENTE = ? ORDER BY ID_CLIENTE", new Object[] {  new Integer(idCliente) } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'NOMBRE = :nombre'.
	 */
	public CallCenter[] findWhereNombreEquals(String nombre) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'APELLIDO_PATERNO = :apellidoPaterno'.
	 */
	public CallCenter[] findWhereApellidoPaternoEquals(String apellidoPaterno) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE APELLIDO_PATERNO = ? ORDER BY APELLIDO_PATERNO", new Object[] { apellidoPaterno } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'APELLIDO_MATERNO = :apellidoMaterno'.
	 */
	public CallCenter[] findWhereApellidoMaternoEquals(String apellidoMaterno) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE APELLIDO_MATERNO = ? ORDER BY APELLIDO_MATERNO", new Object[] { apellidoMaterno } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'TELEFONO = :telefono'.
	 */
	public CallCenter[] findWhereTelefonoEquals(String telefono) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TELEFONO = ? ORDER BY TELEFONO", new Object[] { telefono } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'CORREO = :correo'.
	 */
	public CallCenter[] findWhereCorreoEquals(String correo) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CORREO = ? ORDER BY CORREO", new Object[] { correo } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'TIPO = :tipo'.
	 */
	public CallCenter[] findWhereTipoEquals(int tipo) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TIPO = ? ORDER BY TIPO", new Object[] {  new Integer(tipo) } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'ESTADO = :estado'.
	 */
	public CallCenter[] findWhereEstadoEquals(int estado) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ESTADO = ? ORDER BY ESTADO", new Object[] {  new Integer(estado) } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public CallCenter[] findWhereDescripcionEquals(String descripcion) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'ID_USUARIO = :idUsuario'.
	 */
	public CallCenter[] findWhereIdUsuarioEquals(int idUsuario) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO = ? ORDER BY ID_USUARIO", new Object[] {  new Integer(idUsuario) } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'NUMERO_TICKET = :numeroTicket'.
	 */
	public CallCenter[] findWhereNumeroTicketEquals(String numeroTicket) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUMERO_TICKET = ? ORDER BY NUMERO_TICKET", new Object[] { numeroTicket } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'FECHA_CREACION = :fechaCreacion'.
	 */
	public CallCenter[] findWhereFechaCreacionEquals(Date fechaCreacion) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_CREACION = ? ORDER BY FECHA_CREACION", new Object[] { fechaCreacion==null ? null : new java.sql.Timestamp( fechaCreacion.getTime() ) } );
	}

	/** 
	 * Returns all rows from the call_center table that match the criteria 'CON_SEGUIMIENTO = :conSeguimiento'.
	 */
	public CallCenter[] findWhereConSeguimientoEquals(int conSeguimiento) throws CallCenterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CON_SEGUIMIENTO = ? ORDER BY CON_SEGUIMIENTO", new Object[] {  new Integer(conSeguimiento) } );
	}

	/**
	 * Method 'CallCenterDaoImpl'
	 * 
	 */
	public CallCenterDaoImpl()
	{
	}

	/**
	 * Method 'CallCenterDaoImpl'
	 * 
	 * @param userConn
	 */
	public CallCenterDaoImpl(final java.sql.Connection userConn)
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
		return "call_center";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected CallCenter fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			CallCenter dto = new CallCenter();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected CallCenter[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			CallCenter dto = new CallCenter();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		CallCenter ret[] = new CallCenter[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(CallCenter dto, ResultSet rs) throws SQLException
	{
		dto.setIdCallCenter( rs.getInt( COLUMN_ID_CALL_CENTER ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		if (rs.wasNull()) {
			dto.setIdEmpresaNull( true );
		}
		
		dto.setIdCliente( rs.getInt( COLUMN_ID_CLIENTE ) );
		if (rs.wasNull()) {
			dto.setIdClienteNull( true );
		}
		
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setApellidoPaterno( rs.getString( COLUMN_APELLIDO_PATERNO ) );
		dto.setApellidoMaterno( rs.getString( COLUMN_APELLIDO_MATERNO ) );
		dto.setTelefono( rs.getString( COLUMN_TELEFONO ) );
		dto.setCorreo( rs.getString( COLUMN_CORREO ) );
		dto.setTipo( rs.getInt( COLUMN_TIPO ) );
		if (rs.wasNull()) {
			dto.setTipoNull( true );
		}
		
		dto.setEstado( rs.getInt( COLUMN_ESTADO ) );
		if (rs.wasNull()) {
			dto.setEstadoNull( true );
		}
		
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setIdUsuario( rs.getInt( COLUMN_ID_USUARIO ) );
		if (rs.wasNull()) {
			dto.setIdUsuarioNull( true );
		}
		
		dto.setNumeroTicket( rs.getString( COLUMN_NUMERO_TICKET ) );
		dto.setFechaCreacion( rs.getTimestamp(COLUMN_FECHA_CREACION ) );
		dto.setConSeguimiento( rs.getInt( COLUMN_CON_SEGUIMIENTO ) );
		if (rs.wasNull()) {
			dto.setConSeguimientoNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(CallCenter dto)
	{
		dto.setIdCallCenterModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdClienteModified( false );
		dto.setNombreModified( false );
		dto.setApellidoPaternoModified( false );
		dto.setApellidoMaternoModified( false );
		dto.setTelefonoModified( false );
		dto.setCorreoModified( false );
		dto.setTipoModified( false );
		dto.setEstadoModified( false );
		dto.setDescripcionModified( false );
		dto.setIdUsuarioModified( false );
		dto.setNumeroTicketModified( false );
		dto.setFechaCreacionModified( false );
		dto.setConSeguimientoModified( false );
	}

	/** 
	 * Returns all rows from the call_center table that match the specified arbitrary SQL statement
	 */
	public CallCenter[] findByDynamicSelect(String sql, Object[] sqlParams) throws CallCenterDaoException
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
			throw new CallCenterDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the call_center table that match the specified arbitrary SQL statement
	 */
	public CallCenter[] findByDynamicWhere(String sql, Object[] sqlParams) throws CallCenterDaoException
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
			throw new CallCenterDaoException( "Exception: " + _e.getMessage(), _e );
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
