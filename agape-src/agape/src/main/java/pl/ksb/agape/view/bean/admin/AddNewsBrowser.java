package pl.ksb.agape.view.bean.admin;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import pl.ksb.agape.domain.dao.NewsDAOBean;
import pl.ksb.agape.domain.model.News;


@ManagedBean
@ViewScoped
public class AddNewsBrowser implements Serializable{


	private static final long serialVersionUID = -4194566763519941343L;


	public AddNewsBrowser() {
		// TODO Auto-generated constructor stub
	}
	
	private News news = new News();
	
	@EJB
	private NewsDAOBean newsDAOBean;
	
	
	public void zapisz(){
		
		newsDAOBean.zapisz(news);
		
		news = new News();
	}


	public News getNews() {
		return news;
	}
	
	

}
