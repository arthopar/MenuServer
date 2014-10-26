import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import db.ProductDAO;
import dto.ProductDto;

@WebServlet("/test")
public class Product extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8222589541315260159L;

	/**
	 * Constructor of the object.
	 */
	public Product() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("application/json");
		
		//send response to out
		PrintWriter out = response.getWriter();
		
		String stringId = request.getParameter("id");
		
		if(stringId != null)
		{
			out.write(convertObjectToJson(listProductById(Integer.parseInt(stringId))));
			return;
		}
		
		out.write(convertObjectToJson(listProduct()));
	}

	private static String convertObjectToJson(List<?> product)
	{
		Gson gson = new Gson();
		
		//Convert db product object to product dto
		ArrayList<ProductDto> productList = new ArrayList<>();
		for (Object currentproduct : product) {
			ProductDto productDto = new ProductDto((db.Product)currentproduct);
			productList.add(productDto);
		}
		
		//create json object from product dto
		return gson.toJson(productList);
	}
	
	private static List<?> listProduct() {
		
		ProductDAO dao = new ProductDAO();
		//FIXME reload data 
		List<?> product = dao.findAll();
		dao.getSession().close();
		
		return product;
	}
	
	private static List<?> listProductById(Integer id) {
		
		ProductDAO dao = new ProductDAO();
		//FIXME reload data 
		List<?> product = dao.findByCategoryId(id);
		dao.getSession().close();
		
		return product;
	}
	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
