package osgi_foodexpenses_servicepublisher;

import java.util.Scanner;

public class ServicePublishExpensesImpl implements ServicePublishExpenses {

	// selling price
	int milkricePrice = 170;
	int noodlesPrice = 200;
	int ricePrice = 200;
	int lumpricePrice = 400;
	int kottuPrice = 300;
	int hoppersPrice = 180;

	// initial expense per packet
	int milkriceInitialCost = 120;
	int noodlesInitialCost = 150;
	int riceInitialCost = 150;
	int lumpriceInitialCost = 350;
	int kottuInitialCost = 250;
	int hoppersInitialCost = 130;

	int totExpenses, milkriceTotal, noodlesTotal, riceTotal, lumppriceTotal, hoppersTotal, kottuTotal, totIncome,
			milkriceInitialExpense, noodlesInitialExpense, riceInitialExpense, lumpriceInitialExpense,
			hoppersInitialExpense, kottuInitialExpense, milkriceIncome, kottupacketIncome, hopperspacketIncome,
			lumpricepacketIncome, ricepacketIncome, noodlesIncome;
	int labourCost = 500000;
	int allowance = 200000;
	int otherCosts = 300000;

	public void milkriceExpenses() {
		System.out.println("Please Enter Your Monthly Sold Milk Rice Packets Amount :");

		Scanner sc = new Scanner(System.in);
		int mrcount = sc.nextInt();

		// int MilkricepacketPrice = milkriceCost*milkriceQuantity;

		int milkriceIncome = milkricePrice * mrcount; // milkrice total income
		int milkriceInitialExpense = mrcount * milkriceInitialCost; // milkrice preparing cost
		int milkriceProfit = milkriceIncome - milkriceInitialExpense;

		System.out.println("Total Milkrice Packets Expense is =  " + milkriceInitialExpense);
		System.out.println("Total Milkrice Packets Income is =  " + milkriceIncome);
		System.out.println("Total Milkrice Packets Profit is =  " + milkriceProfit);

	}

	public void noodlesExpenses() {
		System.out.println("Please Enter Your Monthly Sold Noodles Packets Amount :");

		Scanner sc = new Scanner(System.in);
		int noocount = sc.nextInt();

		int noodlesIncome = noodlesPrice * noocount; // noodles total income
		int noodlesInitialExpense = noocount * noodlesInitialCost; // noodles preparing cost
		int noodlesProfit = noodlesIncome - noodlesInitialExpense; // noodles profit

		System.out.println("Total Noodles Packets Expense is =  " + noodlesInitialExpense);
		System.out.println("Total Noodles Packets Income is =  " + noodlesIncome);
		System.out.println("Total Noodles Packets Profit is =  " + noodlesInitialExpense);

	}

	public void riceExpenses() {
		System.out.println("Please Enter Your Monthly Sold Rice Packets Amount : ");

		Scanner sc = new Scanner(System.in);
		int rcount = sc.nextInt();

		int ricepacketIncome = ricePrice * rcount; // rice income
		int riceInitialExpense = rcount * riceInitialCost; // rice preparing cost
		int riceProfit = ricepacketIncome - riceInitialExpense; // rice profit

		System.out.println("Total Rice Packets Expense is =  " + riceInitialExpense);
		System.out.println("Total Rice Packets Income is =  " + ricepacketIncome);
		System.out.println("Total Rice Packets Profit is =  " + riceInitialExpense);

	}

	public void lumpriceCost() {
		System.out.println("Please Enter Your Monthly Sold Lumprice Packets Amount : ");

		Scanner sc = new Scanner(System.in);
		int lrcount = sc.nextInt();

		int lumpricepacketIncome = lumpricePrice * lrcount; // lumprice income
		int lumpriceInitialExpense = lumpriceInitialCost * lrcount;// lumprice preparing cost
		int lumpriceProfit = lumpricepacketIncome - lumpriceInitialExpense; // lumprice profit

		System.out.println("Total Lumprice Packets Expense is =  " + lumpriceInitialExpense);
		System.out.println("Total Lumprice Packets Income is =  " + lumpricepacketIncome);
		System.out.println("Total Lumprice Packets Profit is =  " + lumpriceProfit);

	}

	public void hoppersCost() {
		System.out.println("Please Enter Your Monthly Sold Hoppers Packet Amount : ");

		Scanner sc = new Scanner(System.in);
		int hcount = sc.nextInt();

		int hopperspacketIncome = hoppersPrice * hcount;
		int hoppersInitialExpense = hoppersInitialCost * hcount;
		int hoppersProfit = hopperspacketIncome - hoppersInitialExpense;

		System.out.println("Total Hoppers Packets Expense is =  " + hoppersInitialExpense);
		System.out.println("Total Hoppers Packets Income is =  " + hopperspacketIncome);
		System.out.println("Total Hoppers Packets Profit is =  " + hoppersProfit);

	}

	public void kottuCost() {
		System.out.println("Please Enter Your Monthly Sold Kottu Packets Amount : ");

		Scanner sc = new Scanner(System.in);
		int kcount = sc.nextInt();

		int kottupacketIncome = kottuPrice * kcount;
		int kottuInitialExpense = kottuInitialCost * kcount;
		int kottuProfit = kottupacketIncome - kottuInitialExpense;

		System.out.println("Total Kottu Packets Expense is =  " + kottuInitialExpense);
		System.out.println("Total Kottu Packets Income is =  " + kottupacketIncome);
		System.out.println("Total Kottu Packets Profit is =  " + kottuProfit);

	}

	public int showallexpenses() {

		System.out.println("Please Enter Your Monthly Sold Milk Rice Packets Amount :");

		Scanner sc = new Scanner(System.in);
		int mrcount = sc.nextInt();

		int milkriceInitialExpense = mrcount * milkriceInitialCost; // milkrice preparing cost

		System.out.println("Please Enter Your Monthly Sold Noodles Packets Amount :");

		int noocount = sc.nextInt();

		System.out.println("Please Enter Your Monthly Sold Rice Packets Amount : ");

		int rcount = sc.nextInt();

		int riceInitialExpense = rcount * riceInitialCost; // rice preparing cost

		System.out.println("Please Enter Your Monthly Sold Lumprice Packets Amount : ");

		int lrcount = sc.nextInt();

		int lumpriceInitialExpense = lumpriceInitialCost * lrcount;// lumprice preparing cost

		System.out.println("Please Enter Your Monthly Sold Hoppers Packet Amount : ");

		int hcount = sc.nextInt();

		System.out.println("Please Enter Your Monthly Sold Kottu Packets Amount : ");

		int kcount = sc.nextInt();

		int kottuInitialExpense = kottuInitialCost * kcount;

		totExpenses = labourCost + otherCosts + allowance + milkriceInitialExpense + noodlesInitialExpense
				+ riceInitialExpense + lumpriceInitialExpense + hoppersInitialExpense + kottuInitialExpense;
		System.out.println("Your Resturant Total Expense is : " + totExpenses);

		return totExpenses;
	}

	public int showfoodIncome() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Monthly Income of Milkrice: ");
		milkriceIncome = sc.nextInt();
		System.out.println();

		System.out.println("Enter Your Monthly Income of Noodles : ");
		noodlesIncome = sc.nextInt();
		System.out.println();

		System.out.println("Your Monthly Income of Rice Packets :");
		ricepacketIncome = sc.nextInt();
		System.out.println();

		System.out.println("Your Monthly Income of Lumprice :");
		lumpricepacketIncome = sc.nextInt();
		System.out.println();

		System.out.println("Your Monthly Income of Hoppers :");
		hopperspacketIncome = sc.nextInt();
		System.out.println();

		System.out.println("Your Monthly Income of Kottu :");
		kottupacketIncome = sc.nextInt();
		System.out.println();

		totIncome = milkriceIncome + noodlesIncome + ricepacketIncome + lumpricepacketIncome + hopperspacketIncome
				+ kottupacketIncome;
		//System.out.println("Your Resturant Total Income is : " + totIncome);

		return totIncome;
	}

	public void totalResturantProfit() {

		showallexpenses();

		showfoodIncome();

		totIncome = milkriceIncome + noodlesIncome + ricepacketIncome + lumpricepacketIncome + hopperspacketIncome
				+ kottupacketIncome;
		System.out.println("Your Resturant Total Income is : " + totIncome);

		int totalProfit = totIncome - totExpenses;
		System.out.println("Your Total Profit is =  " + totalProfit);
		System.out.println("Your Resturant Total Expense is : " + totExpenses);

	}

}
