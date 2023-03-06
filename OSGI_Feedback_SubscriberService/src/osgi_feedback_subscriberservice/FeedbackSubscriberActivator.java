package osgi_feedback_subscriberservice;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.service.feedbackServicePublish;

public class FeedbackSubscriberActivator implements BundleActivator {

	ServiceReference serviceReference;
	//ServiceReference serviceRef5;
			Scanner sc = new Scanner(System.in);
			int choice = 0;

	public void start(BundleContext context) throws Exception {
		System.out.println("subscriber Service Start");
		serviceReference =  context.getServiceReference(feedbackServicePublish.class.getName());
		feedbackServicePublish FeedbackservicePublish = (feedbackServicePublish)context.getService(serviceReference);
		
		 

		while(true) {
			System.out.println("====================================================================================================");
			System.out.println("                                                                                                    ");
			System.out.println("                              Welcome to the Online Resturant                                       ");
			System.out.println("                                                                                                    ");
			System.out.println("====================================================================================================");
			
			System.out.println("1). -Give Feedback for Food-");
			System.out.println("0). -Exit-");
			System.out.println("----------------------------------");
			System.out.println();
			System.out.print("Enter No : ");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				FeedbackservicePublish.publishfeedbackService();
			}else if(choice == 0){
				break;
			}
			System.out.print("Do you want to Continue ? Y/N   ");
			String s = sc.next();

			if (s.equalsIgnoreCase("N")) {
				break;
			} else {
				continue;
			}
		}
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Good Bye");
		context.ungetService(serviceReference);
		
		
	}

}
