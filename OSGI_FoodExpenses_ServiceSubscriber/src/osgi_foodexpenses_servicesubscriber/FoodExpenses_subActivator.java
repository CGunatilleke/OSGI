package osgi_foodexpenses_servicesubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import osgi_foodexpenses_servicepublisher.ServicePublishExpenses;

public class FoodExpenses_subActivator implements BundleActivator {

	ServiceReference serviceReference;
	Scanner sc = new Scanner(System.in);
	int eno = 0;

	public void start(BundleContext context) throws Exception {

		System.out.println("### Expenses Subscriber starts ###");
		serviceReference = context.getServiceReference(ServicePublishExpenses.class.getName());
		ServicePublishExpenses servicePublishExpences = (ServicePublishExpenses) context.getService(serviceReference);
		// System.out.println(servicePublishExpences.milkriceExpenses());

		while (true) {
			System.out.println();
			System.out.println(
					"====================================================================================================");
			System.out.println(
					"                                                                                                    ");
			System.out.println(
					"                              Welcome to the Resturant                                       ");
			System.out.println(
					"                                                                                                    ");
			System.out.println(
					"====================================================================================================");
			System.out.println();

			System.out.println("---------------Time to Calculate Expenses--------------");
			System.out.println();
			System.out.println("********** Categories **********");
			System.out.println();
			System.out.println("1). MilkRice");
			System.out.println("2). Noodles");
			System.out.println("3). Rice");
			System.out.println("4). Lumprice");
			System.out.println("5). Kottu");
			System.out.println("6). Hoppers");
			System.out.println("7). Resturant Food Income");
			System.out.println("8). Total Resturant Expenses");
			System.out.println("9). Restaurant Profit");
			System.out.println("0). --Exit--");
			System.out.println();
			System.out.println("********************************");
			System.out.println();

			System.out.println("Enter Category Number : ");

			eno = sc.nextInt();

			if (eno == 1) {

				System.out.println("########## Milk Rice Expenses ##########");
				servicePublishExpences.milkriceExpenses();

			} else if (eno == 2) {
				System.out.println("########## Noodles Expenses ##########");
				servicePublishExpences.noodlesExpenses();

			} else if (eno == 3) {
				System.out.println("########## Rice Packets Expenses ##########");
				servicePublishExpences.riceExpenses();

			} else if (eno == 4) {
				System.out.println("########## Lumprice Packets Expenses ##########");
				servicePublishExpences.lumpriceCost();
				
			} else if (eno == 5) {
				System.out.println("########## Kottu Packets Expenses ##########");
				servicePublishExpences.kottuCost();

			} else if (eno == 6) {
				System.out.println("########## Hoppers Packets Expenses ##########");
				servicePublishExpences.hoppersCost();

			} else if (eno == 7) {

				System.out.println("########## Total Resturant Food Income ##########");
				servicePublishExpences.showfoodIncome();

			}   else if (eno == 8) {

				System.out.println("########## Total Resturant Expenses ##########");
				servicePublishExpences.showallexpenses();

			} else if (eno == 9) {

				System.out.println("########## Total Resturant Profit ##########");
				servicePublishExpences.totalResturantProfit();

			}else if (eno == 0) {
				break;
			}

			System.out.println();
			System.out.println("### THANK YOU  ###");

			System.out.println("Do you want to continue? (Y/N) : ");

			String userInput = sc.next();

			if (userInput.equalsIgnoreCase("N")) {
				break;

			} else {
				continue;
			}
		}

	}

	public void stop(BundleContext context) throws Exception {

		System.out.println("### THANK YOU  ###");
		context.ungetService(serviceReference);

	}

}
