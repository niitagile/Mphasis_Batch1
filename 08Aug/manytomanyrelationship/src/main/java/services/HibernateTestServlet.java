package services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




import beans.ReaderEntity;
import beans.SubscriptionEntity;



@WebServlet("/HibernateTestServlet")
public class HibernateTestServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	void register(List<ReaderEntity> rlist){
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		for(ReaderEntity obj :rlist){
		session.save(obj);
		}
		
		session.getTransaction().commit();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//Add Readers in Set
				List<ReaderEntity> rlist=new ArrayList<ReaderEntity>();
				
				ReaderEntity readerone=new ReaderEntity();
				readerone.setReaderName("Kanika");
				ReaderEntity readertwo=new ReaderEntity();
				readertwo.setReaderName("Manika");
				
				rlist.add(readerone);
				rlist.add(readertwo);
				
				//Add Subscriptions in Set
				List<SubscriptionEntity> slist=new ArrayList<SubscriptionEntity>();
			    
				SubscriptionEntity sone=new SubscriptionEntity();
			     sone.setSubsname("primevideo");
			     
			     SubscriptionEntity stwo=new SubscriptionEntity();
			     stwo.setSubsname("hotstar");
			     slist.add(sone);
			     slist.add(stwo);
			     
			     readerone.setSubscriptions(slist);
			     readertwo.setSubscriptions(slist);
			    
			     sone.setReaders(rlist);
			     stwo.setReaders(rlist);
				    
		register(rlist);
	}

}
