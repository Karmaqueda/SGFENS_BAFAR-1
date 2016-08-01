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

public class CuentaDeTercerosDaoImpl extends AbstractDAO implements CuentaDeTercerosDao
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
	protected final String SQL_SELECT = "SELECT ID_CUENTA_TERCEROS, ID_COMPROBANTE_DESCRIPCION, ID_COMPROBANTE_FISCAL, RFC, NOMBRE, CALLE, NUMERO, NUMERO_INTERIOR, COLONIA, LOCALIDAD, REFERENCIA, MUNICIPIO, ESTADO, PAIS, CODIGO_POSTAL, CUENTA_PREDIAL FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_CUENTA_TERCEROS, ID_COMPROBANTE_DESCRIPCION, ID_COMPROBANTE_FISCAL, RFC, NOMBRE, CALLE, NUMERO, NUMERO_INTERIOR, COLONIA, LOCALIDAD, REFERENCIA, MUNICIPIO, ESTADO, PAIS, CODIGO_POSTAL, CUENTA_PREDIAL ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_CUENTA_TERCEROS = ?, ID_COMPROBANTE_DESCRIPCION = ?, ID_COMPROBANTE_FISCAL = ?, RFC = ?, NOMBRE = ?, CALLE = ?, NUMERO = ?, NUMERO_INTERIOR = ?, COLONIA = ?, LOCALIDAD = ?, REFERENCIA = ?, MUNICIPIO = ?, ESTADO = ?, PAIS = ?, CODIGO_POSTAL = ?, CUENTA_PREDIAL = ? WHERE ID_CUENTA_TERCEROS = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_CUENTA_TERCEROS = ?";

	/** 
	 * Index of column ID_CUENTA_TERCEROS
	 */
	protected static final int COLUMN_ID_CUENTA_TERCEROS = 1;

	/** 
	 * Index of column ID_COMPROBANTE_DESCRIPCION
	 */
	protected static final int COLUMN_ID_COMPROBANTE_DESCRIPCION = 2;

	/** 
	 * Index of column ID_COMPROBANTE_FISCAL
	 */
	protected static final int COLUMN_ID_COMPROBANTE_FISCAL = 3;

	/** 
	 * Index of column RFC
	 */
	protected static final int COLUMN_RFC = 4;

	/** 
	 * Index of column NOMBRE
	 */
	protected static final int COLUMN_NOMBRE = 5;

	/** 
	 * Index of column CALLE
	 */
	protected static final int COLUMN_CALLE = 6;

	/** 
	 * Index of column NUMERO
	 */
	protected static final int COLUMN_NUMERO = 7;

	/** 
	 * Index of column NUMERO_INTERIOR
	 */
	protected static final int COLUMN_NUMERO_INTERIOR = 8;

	/** 
	 * Index of column COLONIA
	 */
	protected static final int COLUMN_COLONIA = 9;

	/** 
	 * Index of column LOCALIDAD
	 */
	protected static final int COLUMN_LOCALIDAD = 10;

	/** 
	 * Index of column REFERENCIA
	 */
	protected static final int COLUMN_REFERENCIA = 11;

	/** 
	 * Index of column MUNICIPIO
	 */
	protected static final int COLUMN_MUNICIPIO = 12;

	/** 
	 * Index of column ESTADO
	 */
	protected static final int COLUMN_ESTADO = 13;

	/** 
	 * Index of column PAIS
	 */
	protected static final int COLUMN_PAIS = 14;

	/** 
	 * Index of column CODIGO_POSTAL
	 */
	protected static final int COLUMN_CODIGO_POSTAL = 15;

	/** 
	 * Index of column CUENTA_PREDIAL
	 */
	protected static final int COLUMN_CUENTA_PREDIAL = 16;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 16;

	/** 
	 * Index of primary-key column ID_CUENTA_TERCEROS
	 */
	protected static final int PK_COLUMN_ID_CUENTA_TERCEROS = 1;

	/** 
	 * Inserts a new row in the cuenta_de_terceros table.
	 */
	public CuentaDeTercerosPk insert(CuentaDeTerceros dto) throws CuentaDeTercerosDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setInt( index++, dto.getIdCuentaTerceros() );
			if (dto.isIdComprobanteDescripcionNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdComprobanteDescripcion() );
			}
		
			if (dto.isIdComprobanteFiscalNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdComprobanteFiscal() );
			}
		
			stmt.setString( index++, dto.getRfc() );
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getCalle() );
			stmt.setString( index++, dto.getNumero() );
			stmt.setString( index++, dto.getNumeroInterior() );
			stmt.setString( index++, dto.getColonia() );
			stmt.setString( index++, dto.getLocalidad() );
			stmt.setString( index++, dto.getReferencia() );
			stmt.setString( index++, dto.getMunicipio() );
			stmt.setString( index++, dto.getEstado() );
			stmt.setString( index++, dto.getPais() );
			stmt.setString( index++, dto.getCodigoPostal() );
			stmt.setString( index++, dto.getCuentaPredial() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CuentaDeTercerosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the cuenta_de_terceros table.
	 */
	public void update(CuentaDeTercerosPk pk, CuentaDeTerceros dto) throws CuentaDeTercerosDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getIdCuentaTerceros() );
			if (dto.isIdComprobanteDescripcionNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdComprobanteDescripcion() );
			}
		
			if (dto.isIdComprobanteFiscalNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIdComprobanteFiscal() );
			}
		
			stmt.setString( index++, dto.getRfc() );
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getCalle() );
			stmt.setString( index++, dto.getNumero() );
			stmt.setString( index++, dto.getNumeroInterior() );
			stmt.setString( index++, dto.getColonia() );
			stmt.setString( index++, dto.getLocalidad() );
			stmt.setString( index++, dto.getReferencia() );
			stmt.setString( index++, dto.getMunicipio() );
			stmt.setString( index++, dto.getEstado() );
			stmt.setString( index++, dto.getPais() );
			stmt.setString( index++, dto.getCodigoPostal() );
			stmt.setString( index++, dto.getCuentaPredial() );
			stmt.setInt( 17, pk.getIdCuentaTerceros() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CuentaDeTercerosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the cuenta_de_terceros table.
	 */
	public void delete(CuentaDeTercerosPk pk) throws CuentaDeTercerosDaoException
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
			stmt.setInt( 1, pk.getIdCuentaTerceros() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CuentaDeTercerosDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the cuenta_de_terceros table that matches the specified primary-key value.
	 */
	public CuentaDeTerceros findByPrimaryKey(CuentaDeTercerosPk pk) throws CuentaDeTercerosDaoException
	{
		return findByPrimaryKey( pk.getIdCuentaTerceros() );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'ID_CUENTA_TERCEROS = :idCuentaTerceros'.
	 */
	public CuentaDeTerceros findByPrimaryKey(int idCuentaTerceros) throws CuentaDeTercerosDaoException
	{
		CuentaDeTerceros ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_CUENTA_TERCEROS = ?", new Object[] {  new Integer(idCuentaTerceros) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria ''.
	 */
	public CuentaDeTerceros[] findAll() throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_CUENTA_TERCEROS", null );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'ID_CUENTA_TERCEROS = :idCuentaTerceros'.
	 */
	public CuentaDeTerceros[] findWhereIdCuentaTercerosEquals(int idCuentaTerceros) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CUENTA_TERCEROS = ? ORDER BY ID_CUENTA_TERCEROS", new Object[] {  new Integer(idCuentaTerceros) } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'ID_COMPROBANTE_DESCRIPCION = :idComprobanteDescripcion'.
	 */
	public CuentaDeTerceros[] findWhereIdComprobanteDescripcionEquals(int idComprobanteDescripcion) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COMPROBANTE_DESCRIPCION = ? ORDER BY ID_COMPROBANTE_DESCRIPCION", new Object[] {  new Integer(idComprobanteDescripcion) } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'ID_COMPROBANTE_FISCAL = :idComprobanteFiscal'.
	 */
	public CuentaDeTerceros[] findWhereIdComprobanteFiscalEquals(int idComprobanteFiscal) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COMPROBANTE_FISCAL = ? ORDER BY ID_COMPROBANTE_FISCAL", new Object[] {  new Integer(idComprobanteFiscal) } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'RFC = :rfc'.
	 */
	public CuentaDeTerceros[] findWhereRfcEquals(String rfc) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE RFC = ? ORDER BY RFC", new Object[] { rfc } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'NOMBRE = :nombre'.
	 */
	public CuentaDeTerceros[] findWhereNombreEquals(String nombre) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'CALLE = :calle'.
	 */
	public CuentaDeTerceros[] findWhereCalleEquals(String calle) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CALLE = ? ORDER BY CALLE", new Object[] { calle } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'NUMERO = :numero'.
	 */
	public CuentaDeTerceros[] findWhereNumeroEquals(String numero) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUMERO = ? ORDER BY NUMERO", new Object[] { numero } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'NUMERO_INTERIOR = :numeroInterior'.
	 */
	public CuentaDeTerceros[] findWhereNumeroInteriorEquals(String numeroInterior) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUMERO_INTERIOR = ? ORDER BY NUMERO_INTERIOR", new Object[] { numeroInterior } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'COLONIA = :colonia'.
	 */
	public CuentaDeTerceros[] findWhereColoniaEquals(String colonia) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COLONIA = ? ORDER BY COLONIA", new Object[] { colonia } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'LOCALIDAD = :localidad'.
	 */
	public CuentaDeTerceros[] findWhereLocalidadEquals(String localidad) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LOCALIDAD = ? ORDER BY LOCALIDAD", new Object[] { localidad } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'REFERENCIA = :referencia'.
	 */
	public CuentaDeTerceros[] findWhereReferenciaEquals(String referencia) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REFERENCIA = ? ORDER BY REFERENCIA", new Object[] { referencia } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'MUNICIPIO = :municipio'.
	 */
	public CuentaDeTerceros[] findWhereMunicipioEquals(String municipio) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MUNICIPIO = ? ORDER BY MUNICIPIO", new Object[] { municipio } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'ESTADO = :estado'.
	 */
	public CuentaDeTerceros[] findWhereEstadoEquals(String estado) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ESTADO = ? ORDER BY ESTADO", new Object[] { estado } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'PAIS = :pais'.
	 */
	public CuentaDeTerceros[] findWherePaisEquals(String pais) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PAIS = ? ORDER BY PAIS", new Object[] { pais } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'CODIGO_POSTAL = :codigoPostal'.
	 */
	public CuentaDeTerceros[] findWhereCodigoPostalEquals(String codigoPostal) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CODIGO_POSTAL = ? ORDER BY CODIGO_POSTAL", new Object[] { codigoPostal } );
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the criteria 'CUENTA_PREDIAL = :cuentaPredial'.
	 */
	public CuentaDeTerceros[] findWhereCuentaPredialEquals(String cuentaPredial) throws CuentaDeTercerosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CUENTA_PREDIAL = ? ORDER BY CUENTA_PREDIAL", new Object[] { cuentaPredial } );
	}

	/**
	 * Method 'CuentaDeTercerosDaoImpl'
	 * 
	 */
	public CuentaDeTercerosDaoImpl()
	{
	}

	/**
	 * Method 'CuentaDeTercerosDaoImpl'
	 * 
	 * @param userConn
	 */
	public CuentaDeTercerosDaoImpl(final java.sql.Connection userConn)
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
		return "cuenta_de_terceros";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected CuentaDeTerceros fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			CuentaDeTerceros dto = new CuentaDeTerceros();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected CuentaDeTerceros[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			CuentaDeTerceros dto = new CuentaDeTerceros();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		CuentaDeTerceros ret[] = new CuentaDeTerceros[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(CuentaDeTerceros dto, ResultSet rs) throws SQLException
	{
		dto.setIdCuentaTerceros( rs.getInt( COLUMN_ID_CUENTA_TERCEROS ) );
		dto.setIdComprobanteDescripcion( rs.getInt( COLUMN_ID_COMPROBANTE_DESCRIPCION ) );
		if (rs.wasNull()) {
			dto.setIdComprobanteDescripcionNull( true );
		}
		
		dto.setIdComprobanteFiscal( rs.getInt( COLUMN_ID_COMPROBANTE_FISCAL ) );
		if (rs.wasNull()) {
			dto.setIdComprobanteFiscalNull( true );
		}
		
		dto.setRfc( rs.getString( COLUMN_RFC ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setCalle( rs.getString( COLUMN_CALLE ) );
		dto.setNumero( rs.getString( COLUMN_NUMERO ) );
		dto.setNumeroInterior( rs.getString( COLUMN_NUMERO_INTERIOR ) );
		dto.setColonia( rs.getString( COLUMN_COLONIA ) );
		dto.setLocalidad( rs.getString( COLUMN_LOCALIDAD ) );
		dto.setReferencia( rs.getString( COLUMN_REFERENCIA ) );
		dto.setMunicipio( rs.getString( COLUMN_MUNICIPIO ) );
		dto.setEstado( rs.getString( COLUMN_ESTADO ) );
		dto.setPais( rs.getString( COLUMN_PAIS ) );
		dto.setCodigoPostal( rs.getString( COLUMN_CODIGO_POSTAL ) );
		dto.setCuentaPredial( rs.getString( COLUMN_CUENTA_PREDIAL ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(CuentaDeTerceros dto)
	{
	}

	/** 
	 * Returns all rows from the cuenta_de_terceros table that match the specified arbitrary SQL statement
	 */
	public CuentaDeTerceros[] findByDynamicSelect(String sql, Object[] sqlParams) throws CuentaDeTercerosDaoException
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
			throw new CuentaDeTercerosDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the cuenta_de_terceros table that match the specified arbitrary SQL statement
	 */
	public CuentaDeTerceros[] findByDynamicWhere(String sql, Object[] sqlParams) throws CuentaDeTercerosDaoException
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
			throw new CuentaDeTercerosDaoException( "Exception: " + _e.getMessage(), _e );
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
