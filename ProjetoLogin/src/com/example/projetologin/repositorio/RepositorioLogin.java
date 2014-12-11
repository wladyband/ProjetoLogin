package com.example.projetologin.repositorio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class RepositorioLogin {
	
	
	private static final String CATEGORIA = "LoginCategoria";

	// Nome do banco
	private static final String NOME_BANCO = "Projeto_login";
	// Nome da tabela
	public static final String NOME_TABELA = "LoginUsuario";

	protected SQLiteDatabase db;

	public RepositorioLogin(Context ctx) {
		// Abre o banco de dados já existente
		db = ctx.openOrCreateDatabase(NOME_BANCO, Context.MODE_PRIVATE, null);
	}
	public void fechar() {
		// fecha o banco de dados
		if (db != null) {
			db.close();
		}
	}


}
