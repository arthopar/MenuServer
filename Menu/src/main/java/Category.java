

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import db.CategoryDAO;
import dto.CategoryDto;

public class Category extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7127640366588835748L;

	/**
	 * Constructor of the object.
	 */
	public Category() {
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
		
		Gson gson = new Gson();
		 
		//get category from db
		List<?> category = listCategory();
		//Convert db category object to category dto
		ArrayList<CategoryDto> categoriesList = new ArrayList<>();
		for (Object currentCategory : category) {
			CategoryDto categoryDto = new CategoryDto((db.Category)currentCategory);
			categoriesList.add(categoryDto);
		}
		//create json object from category dto
		String json = gson.toJson(categoriesList);
		
		//send response to out
		PrintWriter out = response.getWriter();
		out.write(json);
	}

	private static List<?> listCategory() {
		
		CategoryDAO dao = new CategoryDAO();
		//FIXME reload data 
		List<?> category = dao.findAll();
		dao.getSession().close();
		
		return category;
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
