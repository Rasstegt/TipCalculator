package calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calc.Bill;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Bill amountBill = new Bill();
		amountBill.setAmount(Double.parseDouble(request.getParameter("inputAmount")));
		int tipAmt = Integer.parseInt(request.getParameter("options"));
		double tipDecimal = 0.01 * tipAmt;
		double totalCost = amountBill.calcTip(amountBill.getAmount(), tipDecimal);
		
		request.setAttribute("amount", amountBill.getAmount());
		request.setAttribute("tip", tipAmt);
		request.setAttribute("total", totalCost);
		
		request.getRequestDispatcher("Output.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
