package com.example.projetologin.repositorio;



import android.content.Context;

public class RepositorioLoginScript  extends RepositorioLogin{
	
	private static final String SCRIPT_DATABASE_DELETE = "DROP TABLE IF EXISTS LoginUsuario";
	
	private static final String [] SCRIPT_DATABASE_CREATE = new String[]{
		"create table LoginUsuario ( _id integer primary key autoincrement, usuario text not null,password  text not null);",
		"insert into LoginUsuario(usuario,password) values('wladimir','1234');"	};
	
	private static final String NOME_BANCO = "Projeto_login";
	
	private static final int VERSAO_BANCO = 1;
	
	public static final String TABELA_LOGIN = "LoginUsuario";
	
	private SQLiteHelper dbHelper;

	// Cria o banco de dados com um script SQL
	public RepositorioLoginScript(Context ctx) {
		super(ctx);
		// Criar utilizando um script SQL
		dbHelper = new SQLiteHelper(ctx, RepositorioLoginScript.NOME_BANCO, RepositorioLoginScript.VERSAO_BANCO,
				RepositorioLoginScript.SCRIPT_DATABASE_CREATE, RepositorioLoginScript.SCRIPT_DATABASE_DELETE);

		// abre o banco no modo escrita para poder alterar também
		db = dbHelper.getWritableDatabase();
	}
	
	// Fecha o banco
		@Override
		public void fechar() {
			super.fechar();
			if (dbHelper != null) {
				dbHelper.close();
			}
		}
	

}
