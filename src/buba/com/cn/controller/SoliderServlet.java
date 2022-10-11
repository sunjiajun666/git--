package buba.com.cn.controller;

import buba.com.cn.dao.SoliderDao;
import buba.com.cn.dao.impl.SoliderDaoimpl;
import buba.com.cn.entity.Solider;
import buba.com.cn.utils.ViewBaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SoliderServlet extends ViewBaseServlet {
  private  SoliderDao soliderDao=new SoliderDaoimpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        if (req.getParameter("method").equals("findAllSoldiers")){
        this.findAllSoldiers(req,resp);
        }
        if (req.getParameter("method").equals("delSoldier")){
            this.delSoldier(req,resp);
        }
        if (req.getParameter("method").equals("addSoldier")){
            this.addSoldier(req,resp);
        }
        if (req.getParameter("method").equals("updateSoldier")){
            this.updateSoldier(req,resp);
        }
        if (req.getParameter("method").equals("update")){
            this.update(req,resp);
        }
    }


    protected void findAllSoldiers(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Solider> allSoldiers = soliderDao.findAllSoldiers();
req.setAttribute("allSoldiers",allSoldiers);
processTemplate("list" ,req,resp);
    }


    protected void delSoldier(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        soliderDao.delSoldier(Integer.valueOf(id));
this.findAllSoldiers(req,resp);
    }
    protected void addSoldier(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String userweapon = req.getParameter("userweapon");
        Solider solider = new Solider(username, userweapon);
        soliderDao.addSoldier(solider);
        this.findAllSoldiers(req,resp);
    }
    protected void updateSoldier(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String username = req.getParameter("name");
        String userweapon = req.getParameter("waepon");
        Solider solider = new Solider(Integer.valueOf(id),username, userweapon);
req.setAttribute("solider",solider);
  processTemplate("update",req,resp);
    }
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("userid");
        String username = req.getParameter("username");
        String userweapon = req.getParameter("userweapon");
        Solider solider = new Solider(Integer.valueOf(id),username, userweapon);
    soliderDao.updateSoldier(solider);
        this.findAllSoldiers(req,resp);
    }
}
