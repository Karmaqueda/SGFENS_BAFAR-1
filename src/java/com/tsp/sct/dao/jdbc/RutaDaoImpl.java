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

public class RutaDaoImpl extends AbstractDAO implements RutaDao
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
	protected final String SQL_SELECT = "SELECT ID_RUTA, ID_TIPO_RUTA, ID_EMPLEADO, NOMBRE_RUTA, COMENTARIO_RUTA, FH_REG_RUTA, FH_MODIFICA_RUTA, RECORRIDO_RUTA, PARADAS_RUTA, ID_EMPRESA, DIAS_SEMANA_RUTA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_RUTA, ID_TIPO_RUTA, ID_EMPLEADO, NOMBRE_RUTA, COMENTARIO_RUTA, FH_REG_RUTA, FH_MODIFICA_RUTA, RECORRIDO_RUTA, PARADAS_RUTA, ID_EMPRESA, DIAS_SEMANA_RUTA ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_RUTA = ?, ID_TIPO_RUTA = ?, ID_EMPLEADO = ?, NOMBRE_RUTA = ?, COMENTARIO_RUTA = ?, FH_REG_RUTA = ?, FH_MODIFICA_RUTA = ?, RECORRIDO_RUTA = ?, PARADAS_RUTA = ?, ID_EMPRESA = ?, DIAS_SEMANA_RUTA = ? WHERE ID_RUTA = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_RUTA = ?";

	/** 
	 * Index of column ID_RUTA
	 */
	protected static final int COLUMN_ID_RUTA = 1;

	/** 
	 * Index of column ID_TIPO_RUTA
	 */
	protected static final int COLUMN_ID_TIPO_RUTA = 2;

	/** 
	 * Index of column ID_EMPLEADO
	 */
	protected static final int COLUMN_ID_EMPLEADO = 3;

	/** 
	 * Index of column NOMBRE_RUTA
	 */
	protected static final int COLUMN_NOMBRE_RUTA = 4;

	/** 
	 * Index of column COMENTARIO_RUTA
	 */
	protected static final int COLUMN_COMENTARIO_RUTA = 5;

	/** 
	 * Index of column FH_REG_RUTA
	 */
	protected static final int COLUMN_FH_REG_RUTA = 6;

	/** 
	 * Index of column FH_MODIFICA_RUTA
	 */
	protected static final int COLUMN_FH_MODIFICA_RUTA = 7;

	/** 
	 * Index of column RECORRIDO_RUTA
	 */
	protected static final int COLUMN_RECORRIDO_RUTA = 8;

	/** 
	 * Index of column PARADAS_RUTA
	 */
	protected static final int COLUMN_PARADAS_RUTA = 9;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 10;

	/** 
	 * Index of column DIAS_SEMANA_RUTA
	 */
	protected static final int COLUMN_DIAS_SEMANA_RUTA = 11;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 11;

	/** 
	 * Index of primary-key column ID_RUTA
	 */
	protected static final int PK_COLUMN_ID_RUTA = 1;

	/** 
	 * Inserts a new row in the ruta table.
	 */
	public RutaPk insert(Ruta dto) throws RutaDaoException
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
			if (dto.isIdRutaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_RUTA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdTipoRutaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_TIPO_RUTA" );
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
		
			if (dto.isNombreRutaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_RUTA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isComentarioRutaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "COMENTARIO_RUTA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFhRegRutaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FH_REG_RUTA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFhModificaRutaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FH_MODIFICA_RUTA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isRecorridoRutaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "RECORRIDO_RUTA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isParadasRutaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "PARADAS_RUTA" );
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
		
			if (dto.isDiasSemanaRutaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "DIAS_SEMANA_RUTA" );
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
			if (dto.isIdRutaModified()) {
				stmt.setInt( index++, dto.getIdRuta() );
			}
		
			if (dto.isIdTipoRutaModified()) {
				stmt.setInt( index++, dto.getIdTipoRuta() );
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (dto.isIdEmpleadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleado() );
				}
		
			}
		
			if (dto.isNombreRutaModified()) {
				stmt.setString( index++, dto.getNombreRuta() );
			}
		
			if (dto.isComentarioRutaModified()) {
				stmt.setString( index++, dto.getComentarioRuta() );
			}
		
			if (dto.isFhRegRutaModified()) {
				stmt.setTimestamp(index++, dto.getFhRegRuta()==null ? null : new java.sql.Timestamp( dto.getFhRegRuta().getTime() ) );
			}
		
			if (dto.isFhModificaRutaModified()) {
				stmt.setTimestamp(index++, dto.getFhModificaRuta()==null ? null : new java.sql.Timestamp( dto.getFhModificaRuta().getTime() ) );
			}
		
			if (dto.isRecorridoRutaModified()) {
				stmt.setString( index++, dto.getRecorridoRuta() );
			}
		
			if (dto.isParadasRutaModified()) {
				stmt.setInt( index++, dto.getParadasRuta() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setLong( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isDiasSemanaRutaModified()) {
				stmt.setString( index++, dto.getDiasSemanaRuta() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdRuta( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new RutaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ruta table.
	 */
	public void update(RutaPk pk, Ruta dto) throws RutaDaoException
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
			if (dto.isIdRutaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_RUTA=?" );
				modified=true;
			}
		
			if (dto.isIdTipoRutaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_TIPO_RUTA=?" );
				modified=true;
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPLEADO=?" );
				modified=true;
			}
		
			if (dto.isNombreRutaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_RUTA=?" );
				modified=true;
			}
		
			if (dto.isComentarioRutaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "COMENTARIO_RUTA=?" );
				modified=true;
			}
		
			if (dto.isFhRegRutaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FH_REG_RUTA=?" );
				modified=true;
			}
		
			if (dto.isFhModificaRutaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FH_MODIFICA_RUTA=?" );
				modified=true;
			}
		
			if (dto.isRecorridoRutaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "RECORRIDO_RUTA=?" );
				modified=true;
			}
		
			if (dto.isParadasRutaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PARADAS_RUTA=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isDiasSemanaRutaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "DIAS_SEMANA_RUTA=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_RUTA=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdRutaModified()) {
				stmt.setInt( index++, dto.getIdRuta() );
			}
		
			if (dto.isIdTipoRutaModified()) {
				stmt.setInt( index++, dto.getIdTipoRuta() );
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (dto.isIdEmpleadoNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEmpleado() );
				}
		
			}
		
			if (dto.isNombreRutaModified()) {
				stmt.setString( index++, dto.getNombreRuta() );
			}
		
			if (dto.isComentarioRutaModified()) {
				stmt.setString( index++, dto.getComentarioRuta() );
			}
		
			if (dto.isFhRegRutaModified()) {
				stmt.setTimestamp(index++, dto.getFhRegRuta()==null ? null : new java.sql.Timestamp( dto.getFhRegRuta().getTime() ) );
			}
		
			if (dto.isFhModificaRutaModified()) {
				stmt.setTimestamp(index++, dto.getFhModificaRuta()==null ? null : new java.sql.Timestamp( dto.getFhModificaRuta().getTime() ) );
			}
		
			if (dto.isRecorridoRutaModified()) {
				stmt.setString( index++, dto.getRecorridoRuta() );
			}
		
			if (dto.isParadasRutaModified()) {
				stmt.setInt( index++, dto.getParadasRuta() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setLong( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isDiasSemanaRutaModified()) {
				stmt.setString( index++, dto.getDiasSemanaRuta() );
			}
		
			stmt.setInt( index++, pk.getIdRuta() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new RutaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ruta table.
	 */
	public void delete(RutaPk pk) throws RutaDaoException
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
			stmt.setInt( 1, pk.getIdRuta() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new RutaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ruta table that matches the specified primary-key value.
	 */
	public Ruta findByPrimaryKey(RutaPk pk) throws RutaDaoException
	{
		return findByPrimaryKey( pk.getIdRuta() );
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria 'ID_RUTA = :idRuta'.
	 */
	public Ruta findByPrimaryKey(int idRuta) throws RutaDaoException
	{
		Ruta ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_RUTA = ?", new Object[] {  new Integer(idRuta) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria ''.
	 */
	public Ruta[] findAll() throws RutaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_RUTA", null );
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria 'ID_RUTA = :idRuta'.
	 */
	public Ruta[] findWhereIdRutaEquals(int idRuta) throws RutaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_RUTA = ? ORDER BY ID_RUTA", new Object[] {  new Integer(idRuta) } );
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria 'ID_TIPO_RUTA = :idTipoRuta'.
	 */
	public Ruta[] findWhereIdTipoRutaEquals(int idTipoRuta) throws RutaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_TIPO_RUTA = ? ORDER BY ID_TIPO_RUTA", new Object[] {  new Integer(idTipoRuta) } );
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria 'ID_EMPLEADO = :idEmpleado'.
	 */
	public Ruta[] findWhereIdEmpleadoEquals(int idEmpleado) throws RutaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPLEADO = ? ORDER BY ID_EMPLEADO", new Object[] {  new Integer(idEmpleado) } );
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria 'NOMBRE_RUTA = :nombreRuta'.
	 */
	public Ruta[] findWhereNombreRutaEquals(String nombreRuta) throws RutaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_RUTA = ? ORDER BY NOMBRE_RUTA", new Object[] { nombreRuta } );
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria 'COMENTARIO_RUTA = :comentarioRuta'.
	 */
	public Ruta[] findWhereComentarioRutaEquals(String comentarioRuta) throws RutaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COMENTARIO_RUTA = ? ORDER BY COMENTARIO_RUTA", new Object[] { comentarioRuta } );
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria 'FH_REG_RUTA = :fhRegRuta'.
	 */
	public Ruta[] findWhereFhRegRutaEquals(Date fhRegRuta) throws RutaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FH_REG_RUTA = ? ORDER BY FH_REG_RUTA", new Object[] { fhRegRuta==null ? null : new java.sql.Timestamp( fhRegRuta.getTime() ) } );
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria 'FH_MODIFICA_RUTA = :fhModificaRuta'.
	 */
	public Ruta[] findWhereFhModificaRutaEquals(Date fhModificaRuta) throws RutaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FH_MODIFICA_RUTA = ? ORDER BY FH_MODIFICA_RUTA", new Object[] { fhModificaRuta==null ? null : new java.sql.Timestamp( fhModificaRuta.getTime() ) } );
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria 'RECORRIDO_RUTA = :recorridoRuta'.
	 */
	public Ruta[] findWhereRecorridoRutaEquals(String recorridoRuta) throws RutaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE RECORRIDO_RUTA = ? ORDER BY RECORRIDO_RUTA", new Object[] { recorridoRuta } );
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria 'PARADAS_RUTA = :paradasRuta'.
	 */
	public Ruta[] findWhereParadasRutaEquals(int paradasRuta) throws RutaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PARADAS_RUTA = ? ORDER BY PARADAS_RUTA", new Object[] {  new Integer(paradasRuta) } );
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public Ruta[] findWhereIdEmpresaEquals(long idEmpresa) throws RutaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Long(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the ruta table that match the criteria 'DIAS_SEMANA_RUTA = :diasSemanaRuta'.
	 */
	public Ruta[] findWhereDiasSemanaRutaEquals(String diasSemanaRuta) throws RutaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DIAS_SEMANA_RUTA = ? ORDER BY DIAS_SEMANA_RUTA", new Object[] { diasSemanaRuta } );
	}

	/**
	 * Method 'RutaDaoImpl'
	 * 
	 */
	public RutaDaoImpl()
	{
	}

	/**
	 * Method 'RutaDaoImpl'
	 * 
	 * @param userConn
	 */
	public RutaDaoImpl(final java.sql.Connection userConn)
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
		return "ruta";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Ruta fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Ruta dto = new Ruta();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Ruta[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Ruta dto = new Ruta();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Ruta ret[] = new Ruta[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Ruta dto, ResultSet rs) throws SQLException
	{
		dto.setIdRuta( rs.getInt( COLUMN_ID_RUTA ) );
		dto.setIdTipoRuta( rs.getInt( COLUMN_ID_TIPO_RUTA ) );
		dto.setIdEmpleado( rs.getInt( COLUMN_ID_EMPLEADO ) );
		if (rs.wasNull()) {
			dto.setIdEmpleadoNull( true );
		}
		
		dto.setNombreRuta( rs.getString( COLUMN_NOMBRE_RUTA ) );
		dto.setComentarioRuta( rs.getString( COLUMN_COMENTARIO_RUTA ) );
		dto.setFhRegRuta( rs.getTimestamp(COLUMN_FH_REG_RUTA ) );
		dto.setFhModificaRuta( rs.getTimestamp(COLUMN_FH_MODIFICA_RUTA ) );
		dto.setRecorridoRuta( rs.getString( COLUMN_RECORRIDO_RUTA ) );
		dto.setParadasRuta( rs.getInt( COLUMN_PARADAS_RUTA ) );
		dto.setIdEmpresa( rs.getLong( COLUMN_ID_EMPRESA ) );
		dto.setDiasSemanaRuta( rs.getString( COLUMN_DIAS_SEMANA_RUTA ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Ruta dto)
	{
		dto.setIdRutaModified( false );
		dto.setIdTipoRutaModified( false );
		dto.setIdEmpleadoModified( false );
		dto.setNombreRutaModified( false );
		dto.setComentarioRutaModified( false );
		dto.setFhRegRutaModified( false );
		dto.setFhModificaRutaModified( false );
		dto.setRecorridoRutaModified( false );
		dto.setParadasRutaModified( false );
		dto.setIdEmpresaModified( false );
		dto.setDiasSemanaRutaModified( false );
	}

	/** 
	 * Returns all rows from the ruta table that match the specified arbitrary SQL statement
	 */
	public Ruta[] findByDynamicSelect(String sql, Object[] sqlParams) throws RutaDaoException
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
			throw new RutaDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ruta table that match the specified arbitrary SQL statement
	 */
	public Ruta[] findByDynamicWhere(String sql, Object[] sqlParams) throws RutaDaoException
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
			throw new RutaDaoException( "Exception: " + _e.getMessage(), _e );
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
