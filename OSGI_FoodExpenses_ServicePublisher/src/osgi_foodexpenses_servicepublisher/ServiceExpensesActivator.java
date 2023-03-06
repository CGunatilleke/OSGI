package osgi_foodexpenses_servicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceExpensesActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("### Expenses Publisher starts ###");

		ServicePublishExpenses servicepublisherexpences = new ServicePublishExpensesImpl();
		publishServiceRegistration = context.registerService(ServicePublishExpenses.class.getName(),
				servicepublisherexpences, null);

	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("### Expenses Publisher Stop ###");
		publishServiceRegistration.unregister();

	}

}
