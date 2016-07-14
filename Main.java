package ac.jp.hal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

    int point =100;
    String hedHtml ="<!doctype html><html lang='ja'><head></head><body>";
    String footHtml="<a href='index.jsp'>トップページへ</a></body></html>";
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		if(request.getParameter("type") != null){
		int type = Integer.parseInt(request.getParameter("type"));

		//ページ遷移テスト
		System.out.println(type+"ガチャタイプ");
		switch(type){

		case 1:

			Gacha  ga   = new NormalGacha();
			String html = ga.chooseCards();

			if(point > ga.Point){
				point = point - ga.Point;
				out.print(hedHtml+ga.gachaName+"<p>利用ポイント："+ ga.Point+"</p><p>残りポイント："+point+"</p><p>No:名前：レアリティ</p><p>"+ html +"</p>"+footHtml);
			}else{
				out.print(hedHtml+"<h1>ポイントが足りないよ！</h1>"+footHtml);
			}
			break;

		case 2:

			Gacha  ga2   = new BoxGacha();
			String html2 = ga2.chooseCards();
			if(point > ga2.Point){
				point = point-ga2.Point;
				out.print(hedHtml+ga2.gachaName+"<p>利用ポイント："+ga2.Point+"</p><p>残りポイント："+point+"</p><p>No:名前：レアリティ</p><p>"+ html2 +"</p>"+footHtml);
			}else{
				out.print(hedHtml+"<h1>ポイントが足りないよ！</h1>"+footHtml);
			}
			break;

		case 3:

			point = point + 100;
			out.print(hedHtml+"<h1>ポイントチャージ</h1><p>ポイントチャージしました。</p><p>保有ポイント："+point+"</p>"+footHtml);
			break;
		}

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
