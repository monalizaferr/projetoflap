	package br.com.fiap.beans;
	
import java.sql.Date;
import java.util.Calendar;

	//JAVABEANS 
	public class Flap {
		
		//ATRIBUTOS 
		private long id;
		private String nome;
		private String email;
		private int telefone;
		private String senha;
		private Date data = new Date (Calendar.getInstance().getTimeInMillis());
		
		//CONTRUTOR
		public Flap() {
			
		}
		
			public Flap(long id, String nome, String email, int telefone, String senha) {
			super();
			this.id = id;
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
			this.senha = senha;
			
		}




		//METODOS GETTER// SETTER
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getTelefone() {
			return telefone;
		}

		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

	}

