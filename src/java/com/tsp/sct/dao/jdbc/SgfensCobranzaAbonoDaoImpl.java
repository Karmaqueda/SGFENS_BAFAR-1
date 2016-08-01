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

public class SgfensCobranzaAbonoDaoImpl extends AbstractDAO implements SgfensCobranzaAbonoDao
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
	protected final String SQL_SELECT = "SELECT ID_COBRANZA_ABONO, ID_EMPRESA, ID_PEDIDO, ID_COMPROBANTE_FISCAL, ID_USUARIO_VENDEDOR, ID_CLIENTE, FECHA_ABONO, MONTO_ABONO, ID_ESTATUS, ID_COBRANZA_METODO_PAGO, IDENTIFICADOR_OPERACION, COMENTARIOS, ID_OPERACION_BANCARIA, LATITUD, LONGITUD, NOMBRE_ARCHIVO_IMG_FIRMA, FOLIO_COBRANZA_MOVIL, ID_DEPOSITO, SINCRONIZACION_MICROSIP, REFERENCIA, FECHA_ACTUALIZA_REFERENCIA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_COBRANZA_ABONO, ID_EMPRESA, ID_PEDIDO, ID_COMPROBANTE_FISCAL, ID_USUARIO_VENDEDOR, ID_CLIENTE, FECHA_ABONO, MONTO_ABONO, ID_ESTATUS, ID_COBRANZA_METODO_PAGO, IDENTIFICADOR_OPERACION, COMENTARIOS, ID_OPERACION_BANCARIA, LATITUD, LONGITUD, NOMBRE_ARCHIVO_IMG_FIRMA, FOLIO_COBRANZA_MOVIL, ID_DEPOSITO, SINCRONIZACION_MICROSIP, REFERENCIA, FECHA_ACTUALIZA_REFERENCIA ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_COBRANZA_ABONO = ?, ID_EMPRESA = ?, ID_PEDIDO = ?, ID_COMPROBANTE_FISCAL = ?, ID_USUARIO_VENDEDOR = ?, ID_CLIENTE = ?, FECHA_ABONO = ?, MONTO_ABONO = ?, ID_ESTATUS = ?, ID_COBRANZA_METODO_PAGO = ?, IDENTIFICADOR_OPERACION = ?, COMENTARIOS = ?, ID_OPERACION_BANCARIA = ?, LATITUD = ?, LONGITUD = ?, NOMBRE_ARCHIVO_IMG_FIRMA = ?, FOLIO_COBRANZA_MOVIL = ?, ID_DEPOSITO = ?, SINCRONIZACION_MICROSIP = ?, REFERENCIA = ?, FECHA_ACTUALIZA_REFERENCIA = ? WHERE ID_COBRANZA_ABONO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_COBRANZA_ABONO = ?";

	/** 
	 * Index of column ID_COBRANZA_ABONO
	 */
	protected static final int COLUMN_ID_COBRANZA_ABONO = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column ID_PEDIDO
	 */
	protected static final int COLUMN_ID_PEDIDO = 3;

	/** 
	 * Index of column ID_COMPROBANTE_FISCAL
	 */
	protected static final int COLUMN_ID_COMPROBANTE_FISCAL = 4;

	/** 
	 * Index of column ID_USUARIO_VENDEDOR
	 */
	protected static final int COLUMN_ID_USUARIO_VENDEDOR = 5;

	/** 
	 * Index of column ID_CLIENTE
	 */
	protected static final int COLUMN_ID_CLIENTE = 6;

	/** 
	 * Index of column FECHA_ABONO
	 */
	protected static final int COLUMN_FECHA_ABONO = 7;

	/** 
	 * Index of column MONTO_ABONO
	 */
	protected static final int COLUMN_MONTO_ABONO = 8;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 9;

	/** 
	 * Index of column ID_COBRANZA_METODO_PAGO
	 */
	protected static final int COLUMN_ID_COBRANZA_METODO_PAGO = 10;

	/** 
	 * Index of column IDENTIFICADOR_OPERACION
	 */
	protected static final int COLUMN_IDENTIFICADOR_OPERACION = 11;

	/** 
	 * Index of column COMENTARIOS
	 */
	protected static final int COLUMN_COMENTARIOS = 12;

	/** 
	 * Index of column ID_OPERACION_BANCARIA
	 */
	protected static final int COLUMN_ID_OPERACION_BANCARIA = 13;

	/** 
	 * Index of column LATITUD
	 */
	protected static final int COLUMN_LATITUD = 14;

	/** 
	 * Index of column LONGITUD
	 */
	protected static final int COLUMN_LONGITUD = 15;

	/** 
	 * Index of column NOMBRE_ARCHIVO_IMG_FIRMA
	 */
	protected static final int COLUMN_NOMBRE_ARCHIVO_IMG_FIRMA = 16;

	/** 
	 * Index of column FOLIO_COBRANZA_MOVIL
	 */
	protected static final int COLUMN_FOLIO_COBRANZA_MOVIL = 17;

	/** 
	 * Index of column ID_DEPOSITO
	 */
	protected static final int COLUMN_ID_DEPOSITO = 18;

	/** 
	 * Index of column SINCRONIZACION_MICROSIP
	 */
	protected static final int COLUMN_SINCRONIZACION_MICROSIP = 19;

	/** 
	 * Index of column REFERENCIA
	 */
	protected static final int COLUMN_REFERENCIA = 20;

	/** 
	 * Index of column FECHA_ACTUALIZA_REFERENCIA
	 */
	protected static final int COLUMN_FECHA_ACTUALIZA_REFERENCIA = 21;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 21;

	/** 
	 * Index of primary-key column ID_COBRANZA_ABONO
	 */
	protected static final int PK_COLUMN_ID_COBRANZA_ABONO = 1;

	/** 
	 * Inserts a new row in the sgfens_cobranza_abono table.
	 */
	public SgfensCobranzaAbonoPk insert(SgfensCobranzaAbono dto) throws SgfensCobranzaAbonoDaoException
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
			if (dto.isIdCobranzaAbonoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_COBRANZA_ABONO" );
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
		
			if (dto.isIdPedidoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_PEDIDO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdComprobanteFiscalModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_COMPROBANTE_FISCAL" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdUsuarioVendedorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_USUARIO_VENDEDOR" );
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
		
			if (dto.isFechaAbonoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_ABONO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMontoAbonoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "MONTO_ABONO" );
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
		
			if (dto.isIdCobranzaMetodoPagoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_COBRANZA_METODO_PAGO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdentificadorOperacionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "IDENTIFICADOR_OPERACION" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isComentariosModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "COMENTARIOS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdOperacionBancariaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_OPERACION_BANCARIA" );
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
		
			if (dto.isNombreArchivoImgFirmaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "NOMBRE_ARCHIVO_IMG_FIRMA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFolioCobranzaMovilModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FOLIO_COBRANZA_MOVIL" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdDepositoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_DEPOSITO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isSincronizacionMicrosipModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "SINCRONIZACION_MICROSIP" );
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
		
			if (dto.isFechaActualizaReferenciaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_ACTUALIZA_REFERENCIA" );
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
			if (dto.isIdCobranzaAbonoModified()) {
				stmt.setInt( index++, dto.getIdCobranzaAbono() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdPedidoModified()) {
				stmt.setInt( index++, dto.getIdPedido() );
			}
		
			if (dto.isIdComprobanteFiscalModified()) {
				stmt.setInt( index++, dto.getIdComprobanteFiscal() );
			}
		
			if (dto.isIdUsuarioVendedorModified()) {
				stmt.setInt( index++, dto.getIdUsuarioVendedor() );
			}
		
			if (dto.isIdClienteModified()) {
				stmt.setInt( index++, dto.getIdCliente() );
			}
		
			if (dto.isFechaAbonoModified()) {
				stmt.setTimestamp(index++, dto.getFechaAbono()==null ? null : new java.sql.Timestamp( dto.getFechaAbono().getTime() ) );
			}
		
			if (dto.isMontoAbonoModified()) {
				stmt.setDouble( index++, dto.getMontoAbono() );
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			if (dto.isIdCobranzaMetodoPagoModified()) {
				stmt.setInt( index++, dto.getIdCobranzaMetodoPago() );
			}
		
			if (dto.isIdentificadorOperacionModified()) {
				stmt.setString( index++, dto.getIdentificadorOperacion() );
			}
		
			if (dto.isComentariosModified()) {
				stmt.setString( index++, dto.getComentarios() );
			}
		
			if (dto.isIdOperacionBancariaModified()) {
				if (dto.isIdOperacionBancariaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdOperacionBancaria() );
				}
		
			}
		
			if (dto.isLatitudModified()) {
				stmt.setDouble( index++, dto.getLatitud() );
			}
		
			if (dto.isLongitudModified()) {
				stmt.setDouble( index++, dto.getLongitud() );
			}
		
			if (dto.isNombreArchivoImgFirmaModified()) {
				stmt.setString( index++, dto.getNombreArchivoImgFirma() );
			}
		
			if (dto.isFolioCobranzaMovilModified()) {
				stmt.setString( index++, dto.getFolioCobranzaMovil() );
			}
		
			if (dto.isIdDepositoModified()) {
				stmt.setString( index++, dto.getIdDeposito() );
			}
		
			if (dto.isSincronizacionMicrosipModified()) {
				if (dto.isSincronizacionMicrosipNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getSincronizacionMicrosip() );
				}
		
			}
		
			if (dto.isReferenciaModified()) {
				stmt.setString( index++, dto.getReferencia() );
			}
		
			if (dto.isFechaActualizaReferenciaModified()) {
				stmt.setTimestamp(index++, dto.getFechaActualizaReferencia()==null ? null : new java.sql.Timestamp( dto.getFechaActualizaReferencia().getTime() ) );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdCobranzaAbono( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensCobranzaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the sgfens_cobranza_abono table.
	 */
	public void update(SgfensCobranzaAbonoPk pk, SgfensCobranzaAbono dto) throws SgfensCobranzaAbonoDaoException
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
			if (dto.isIdCobranzaAbonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_COBRANZA_ABONO=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isIdPedidoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_PEDIDO=?" );
				modified=true;
			}
		
			if (dto.isIdComprobanteFiscalModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_COMPROBANTE_FISCAL=?" );
				modified=true;
			}
		
			if (dto.isIdUsuarioVendedorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_USUARIO_VENDEDOR=?" );
				modified=true;
			}
		
			if (dto.isIdClienteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CLIENTE=?" );
				modified=true;
			}
		
			if (dto.isFechaAbonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_ABONO=?" );
				modified=true;
			}
		
			if (dto.isMontoAbonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "MONTO_ABONO=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isIdCobranzaMetodoPagoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_COBRANZA_METODO_PAGO=?" );
				modified=true;
			}
		
			if (dto.isIdentificadorOperacionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "IDENTIFICADOR_OPERACION=?" );
				modified=true;
			}
		
			if (dto.isComentariosModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "COMENTARIOS=?" );
				modified=true;
			}
		
			if (dto.isIdOperacionBancariaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_OPERACION_BANCARIA=?" );
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
		
			if (dto.isNombreArchivoImgFirmaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "NOMBRE_ARCHIVO_IMG_FIRMA=?" );
				modified=true;
			}
		
			if (dto.isFolioCobranzaMovilModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FOLIO_COBRANZA_MOVIL=?" );
				modified=true;
			}
		
			if (dto.isIdDepositoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_DEPOSITO=?" );
				modified=true;
			}
		
			if (dto.isSincronizacionMicrosipModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "SINCRONIZACION_MICROSIP=?" );
				modified=true;
			}
		
			if (dto.isReferenciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "REFERENCIA=?" );
				modified=true;
			}
		
			if (dto.isFechaActualizaReferenciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_ACTUALIZA_REFERENCIA=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_COBRANZA_ABONO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdCobranzaAbonoModified()) {
				stmt.setInt( index++, dto.getIdCobranzaAbono() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdPedidoModified()) {
				stmt.setInt( index++, dto.getIdPedido() );
			}
		
			if (dto.isIdComprobanteFiscalModified()) {
				stmt.setInt( index++, dto.getIdComprobanteFiscal() );
			}
		
			if (dto.isIdUsuarioVendedorModified()) {
				stmt.setInt( index++, dto.getIdUsuarioVendedor() );
			}
		
			if (dto.isIdClienteModified()) {
				stmt.setInt( index++, dto.getIdCliente() );
			}
		
			if (dto.isFechaAbonoModified()) {
				stmt.setTimestamp(index++, dto.getFechaAbono()==null ? null : new java.sql.Timestamp( dto.getFechaAbono().getTime() ) );
			}
		
			if (dto.isMontoAbonoModified()) {
				stmt.setDouble( index++, dto.getMontoAbono() );
			}
		
			if (dto.isIdEstatusModified()) {
				stmt.setInt( index++, dto.getIdEstatus() );
			}
		
			if (dto.isIdCobranzaMetodoPagoModified()) {
				stmt.setInt( index++, dto.getIdCobranzaMetodoPago() );
			}
		
			if (dto.isIdentificadorOperacionModified()) {
				stmt.setString( index++, dto.getIdentificadorOperacion() );
			}
		
			if (dto.isComentariosModified()) {
				stmt.setString( index++, dto.getComentarios() );
			}
		
			if (dto.isIdOperacionBancariaModified()) {
				if (dto.isIdOperacionBancariaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdOperacionBancaria() );
				}
		
			}
		
			if (dto.isLatitudModified()) {
				stmt.setDouble( index++, dto.getLatitud() );
			}
		
			if (dto.isLongitudModified()) {
				stmt.setDouble( index++, dto.getLongitud() );
			}
		
			if (dto.isNombreArchivoImgFirmaModified()) {
				stmt.setString( index++, dto.getNombreArchivoImgFirma() );
			}
		
			if (dto.isFolioCobranzaMovilModified()) {
				stmt.setString( index++, dto.getFolioCobranzaMovil() );
			}
		
			if (dto.isIdDepositoModified()) {
				stmt.setString( index++, dto.getIdDeposito() );
			}
		
			if (dto.isSincronizacionMicrosipModified()) {
				if (dto.isSincronizacionMicrosipNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getSincronizacionMicrosip() );
				}
		
			}
		
			if (dto.isReferenciaModified()) {
				stmt.setString( index++, dto.getReferencia() );
			}
		
			if (dto.isFechaActualizaReferenciaModified()) {
				stmt.setTimestamp(index++, dto.getFechaActualizaReferencia()==null ? null : new java.sql.Timestamp( dto.getFechaActualizaReferencia().getTime() ) );
			}
		
			stmt.setInt( index++, pk.getIdCobranzaAbono() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensCobranzaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the sgfens_cobranza_abono table.
	 */
	public void delete(SgfensCobranzaAbonoPk pk) throws SgfensCobranzaAbonoDaoException
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
			stmt.setInt( 1, pk.getIdCobranzaAbono() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SgfensCobranzaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the sgfens_cobranza_abono table that matches the specified primary-key value.
	 */
	public SgfensCobranzaAbono findByPrimaryKey(SgfensCobranzaAbonoPk pk) throws SgfensCobranzaAbonoDaoException
	{
		return findByPrimaryKey( pk.getIdCobranzaAbono() );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'ID_COBRANZA_ABONO = :idCobranzaAbono'.
	 */
	public SgfensCobranzaAbono findByPrimaryKey(int idCobranzaAbono) throws SgfensCobranzaAbonoDaoException
	{
		SgfensCobranzaAbono ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_COBRANZA_ABONO = ?", new Object[] {  new Integer(idCobranzaAbono) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria ''.
	 */
	public SgfensCobranzaAbono[] findAll() throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_COBRANZA_ABONO", null );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'ID_COBRANZA_ABONO = :idCobranzaAbono'.
	 */
	public SgfensCobranzaAbono[] findWhereIdCobranzaAbonoEquals(int idCobranzaAbono) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COBRANZA_ABONO = ? ORDER BY ID_COBRANZA_ABONO", new Object[] {  new Integer(idCobranzaAbono) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public SgfensCobranzaAbono[] findWhereIdEmpresaEquals(int idEmpresa) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'ID_PEDIDO = :idPedido'.
	 */
	public SgfensCobranzaAbono[] findWhereIdPedidoEquals(int idPedido) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PEDIDO = ? ORDER BY ID_PEDIDO", new Object[] {  new Integer(idPedido) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'ID_COMPROBANTE_FISCAL = :idComprobanteFiscal'.
	 */
	public SgfensCobranzaAbono[] findWhereIdComprobanteFiscalEquals(int idComprobanteFiscal) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COMPROBANTE_FISCAL = ? ORDER BY ID_COMPROBANTE_FISCAL", new Object[] {  new Integer(idComprobanteFiscal) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'ID_USUARIO_VENDEDOR = :idUsuarioVendedor'.
	 */
	public SgfensCobranzaAbono[] findWhereIdUsuarioVendedorEquals(int idUsuarioVendedor) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO_VENDEDOR = ? ORDER BY ID_USUARIO_VENDEDOR", new Object[] {  new Integer(idUsuarioVendedor) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public SgfensCobranzaAbono[] findWhereIdClienteEquals(int idCliente) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CLIENTE = ? ORDER BY ID_CLIENTE", new Object[] {  new Integer(idCliente) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'FECHA_ABONO = :fechaAbono'.
	 */
	public SgfensCobranzaAbono[] findWhereFechaAbonoEquals(Date fechaAbono) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_ABONO = ? ORDER BY FECHA_ABONO", new Object[] { fechaAbono==null ? null : new java.sql.Timestamp( fechaAbono.getTime() ) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'MONTO_ABONO = :montoAbono'.
	 */
	public SgfensCobranzaAbono[] findWhereMontoAbonoEquals(double montoAbono) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MONTO_ABONO = ? ORDER BY MONTO_ABONO", new Object[] {  new Double(montoAbono) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public SgfensCobranzaAbono[] findWhereIdEstatusEquals(int idEstatus) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'ID_COBRANZA_METODO_PAGO = :idCobranzaMetodoPago'.
	 */
	public SgfensCobranzaAbono[] findWhereIdCobranzaMetodoPagoEquals(int idCobranzaMetodoPago) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COBRANZA_METODO_PAGO = ? ORDER BY ID_COBRANZA_METODO_PAGO", new Object[] {  new Integer(idCobranzaMetodoPago) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'IDENTIFICADOR_OPERACION = :identificadorOperacion'.
	 */
	public SgfensCobranzaAbono[] findWhereIdentificadorOperacionEquals(String identificadorOperacion) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDENTIFICADOR_OPERACION = ? ORDER BY IDENTIFICADOR_OPERACION", new Object[] { identificadorOperacion } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'COMENTARIOS = :comentarios'.
	 */
	public SgfensCobranzaAbono[] findWhereComentariosEquals(String comentarios) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COMENTARIOS = ? ORDER BY COMENTARIOS", new Object[] { comentarios } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'ID_OPERACION_BANCARIA = :idOperacionBancaria'.
	 */
	public SgfensCobranzaAbono[] findWhereIdOperacionBancariaEquals(int idOperacionBancaria) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_OPERACION_BANCARIA = ? ORDER BY ID_OPERACION_BANCARIA", new Object[] {  new Integer(idOperacionBancaria) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'LATITUD = :latitud'.
	 */
	public SgfensCobranzaAbono[] findWhereLatitudEquals(double latitud) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LATITUD = ? ORDER BY LATITUD", new Object[] {  new Double(latitud) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'LONGITUD = :longitud'.
	 */
	public SgfensCobranzaAbono[] findWhereLongitudEquals(double longitud) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LONGITUD = ? ORDER BY LONGITUD", new Object[] {  new Double(longitud) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'NOMBRE_ARCHIVO_IMG_FIRMA = :nombreArchivoImgFirma'.
	 */
	public SgfensCobranzaAbono[] findWhereNombreArchivoImgFirmaEquals(String nombreArchivoImgFirma) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE_ARCHIVO_IMG_FIRMA = ? ORDER BY NOMBRE_ARCHIVO_IMG_FIRMA", new Object[] { nombreArchivoImgFirma } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'FOLIO_COBRANZA_MOVIL = :folioCobranzaMovil'.
	 */
	public SgfensCobranzaAbono[] findWhereFolioCobranzaMovilEquals(String folioCobranzaMovil) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FOLIO_COBRANZA_MOVIL = ? ORDER BY FOLIO_COBRANZA_MOVIL", new Object[] { folioCobranzaMovil } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'ID_DEPOSITO = :idDeposito'.
	 */
	public SgfensCobranzaAbono[] findWhereIdDepositoEquals(String idDeposito) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_DEPOSITO = ? ORDER BY ID_DEPOSITO", new Object[] { idDeposito } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'SINCRONIZACION_MICROSIP = :sincronizacionMicrosip'.
	 */
	public SgfensCobranzaAbono[] findWhereSincronizacionMicrosipEquals(int sincronizacionMicrosip) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SINCRONIZACION_MICROSIP = ? ORDER BY SINCRONIZACION_MICROSIP", new Object[] {  new Integer(sincronizacionMicrosip) } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'REFERENCIA = :referencia'.
	 */
	public SgfensCobranzaAbono[] findWhereReferenciaEquals(String referencia) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REFERENCIA = ? ORDER BY REFERENCIA", new Object[] { referencia } );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the criteria 'FECHA_ACTUALIZA_REFERENCIA = :fechaActualizaReferencia'.
	 */
	public SgfensCobranzaAbono[] findWhereFechaActualizaReferenciaEquals(Date fechaActualizaReferencia) throws SgfensCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_ACTUALIZA_REFERENCIA = ? ORDER BY FECHA_ACTUALIZA_REFERENCIA", new Object[] { fechaActualizaReferencia==null ? null : new java.sql.Timestamp( fechaActualizaReferencia.getTime() ) } );
	}

	/**
	 * Method 'SgfensCobranzaAbonoDaoImpl'
	 * 
	 */
	public SgfensCobranzaAbonoDaoImpl()
	{
	}

	/**
	 * Method 'SgfensCobranzaAbonoDaoImpl'
	 * 
	 * @param userConn
	 */
	public SgfensCobranzaAbonoDaoImpl(final java.sql.Connection userConn)
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
		return "sgfens_cobranza_abono";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected SgfensCobranzaAbono fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			SgfensCobranzaAbono dto = new SgfensCobranzaAbono();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected SgfensCobranzaAbono[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			SgfensCobranzaAbono dto = new SgfensCobranzaAbono();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		SgfensCobranzaAbono ret[] = new SgfensCobranzaAbono[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(SgfensCobranzaAbono dto, ResultSet rs) throws SQLException
	{
		dto.setIdCobranzaAbono( rs.getInt( COLUMN_ID_COBRANZA_ABONO ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdPedido( rs.getInt( COLUMN_ID_PEDIDO ) );
		dto.setIdComprobanteFiscal( rs.getInt( COLUMN_ID_COMPROBANTE_FISCAL ) );
		dto.setIdUsuarioVendedor( rs.getInt( COLUMN_ID_USUARIO_VENDEDOR ) );
		dto.setIdCliente( rs.getInt( COLUMN_ID_CLIENTE ) );
		dto.setFechaAbono( rs.getTimestamp(COLUMN_FECHA_ABONO ) );
		dto.setMontoAbono( rs.getDouble( COLUMN_MONTO_ABONO ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		dto.setIdCobranzaMetodoPago( rs.getInt( COLUMN_ID_COBRANZA_METODO_PAGO ) );
		dto.setIdentificadorOperacion( rs.getString( COLUMN_IDENTIFICADOR_OPERACION ) );
		dto.setComentarios( rs.getString( COLUMN_COMENTARIOS ) );
		dto.setIdOperacionBancaria( rs.getInt( COLUMN_ID_OPERACION_BANCARIA ) );
		if (rs.wasNull()) {
			dto.setIdOperacionBancariaNull( true );
		}
		
		dto.setLatitud( rs.getDouble( COLUMN_LATITUD ) );
		dto.setLongitud( rs.getDouble( COLUMN_LONGITUD ) );
		dto.setNombreArchivoImgFirma( rs.getString( COLUMN_NOMBRE_ARCHIVO_IMG_FIRMA ) );
		dto.setFolioCobranzaMovil( rs.getString( COLUMN_FOLIO_COBRANZA_MOVIL ) );
		dto.setIdDeposito( rs.getString( COLUMN_ID_DEPOSITO ) );
		dto.setSincronizacionMicrosip( rs.getInt( COLUMN_SINCRONIZACION_MICROSIP ) );
		if (rs.wasNull()) {
			dto.setSincronizacionMicrosipNull( true );
		}
		
		dto.setReferencia( rs.getString( COLUMN_REFERENCIA ) );
		dto.setFechaActualizaReferencia( rs.getTimestamp(COLUMN_FECHA_ACTUALIZA_REFERENCIA ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(SgfensCobranzaAbono dto)
	{
		dto.setIdCobranzaAbonoModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdPedidoModified( false );
		dto.setIdComprobanteFiscalModified( false );
		dto.setIdUsuarioVendedorModified( false );
		dto.setIdClienteModified( false );
		dto.setFechaAbonoModified( false );
		dto.setMontoAbonoModified( false );
		dto.setIdEstatusModified( false );
		dto.setIdCobranzaMetodoPagoModified( false );
		dto.setIdentificadorOperacionModified( false );
		dto.setComentariosModified( false );
		dto.setIdOperacionBancariaModified( false );
		dto.setLatitudModified( false );
		dto.setLongitudModified( false );
		dto.setNombreArchivoImgFirmaModified( false );
		dto.setFolioCobranzaMovilModified( false );
		dto.setIdDepositoModified( false );
		dto.setSincronizacionMicrosipModified( false );
		dto.setReferenciaModified( false );
		dto.setFechaActualizaReferenciaModified( false );
	}

	/** 
	 * Returns all rows from the sgfens_cobranza_abono table that match the specified arbitrary SQL statement
	 */
	public SgfensCobranzaAbono[] findByDynamicSelect(String sql, Object[] sqlParams) throws SgfensCobranzaAbonoDaoException
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
		
		
			//System.out.println( "Executing " + SQL );
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
			throw new SgfensCobranzaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the sgfens_cobranza_abono table that match the specified arbitrary SQL statement
	 */
	public SgfensCobranzaAbono[] findByDynamicWhere(String sql, Object[] sqlParams) throws SgfensCobranzaAbonoDaoException
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
		
		
			//System.out.println( "Executing " + SQL );
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
			throw new SgfensCobranzaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
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