package br.com.workmade.algamoneyAPI.event;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEvent;

public class RecursoCriadoEvento extends ApplicationEvent{

	private static final long serialVersionUID = 4726868938978058825L;
	private HttpServletResponse response;
	private Long codigo;
	public RecursoCriadoEvento(Object source, HttpServletResponse response, Long codigo) {
		super(source);
		this.response = response;
		this.codigo = codigo;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public Long getCodigo() {
		return codigo;
	}



	
}
