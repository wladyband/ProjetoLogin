package com.example.projetologin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.projetologin.model.LoginUsuario;

public class Login extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_login);
		final EditText login = (EditText) findViewById(R.id.login);
		final EditText senha = (EditText) findViewById(R.id.senha);
		Button entrar = (Button) findViewById(R.id.entrar);

		entrar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				LoginUsuario l = new LoginUsuario();
				

				String loginCerto = l.getUsuario();
				String senhaCerta = l.getPassword();

				String StrLogin = login.getText().toString();
				String StrSenha = senha.getText().toString();

				if (StrLogin.equals(loginCerto) && StrSenha.equals(senhaCerta)) {
					startActivity(new Intent(Login.this, Resultado.class));
            		//	Toast.makeText(Login.this, login.getText().toString(), Toast.LENGTH_SHORT).show();
					//Toast.makeText(Login.this, senha.getText().toString(), Toast.LENGTH_SHORT).show();

					login.setText(" ");
					senha.setText(" ");

				}else{
					Toast.makeText(Login.this, "Senha Incorreta", Toast.LENGTH_SHORT).show();
					senha.setText(" ");
				
				}

			}
		});

	}

}
