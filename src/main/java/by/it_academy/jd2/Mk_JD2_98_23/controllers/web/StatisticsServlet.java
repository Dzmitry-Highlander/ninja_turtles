package by.it_academy.jd2.Mk_JD2_98_23.controllers.web;

import by.it_academy.jd2.Mk_JD2_98_23.service.api.IStatisticsService;
import by.it_academy.jd2.Mk_JD2_98_23.service.factory.StatisticsServiceFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/api/admin/statistics")
public class StatisticsServlet extends HttpServlet {
    private final IStatisticsService statisticsService;

    public StatisticsServlet() {
        this.statisticsService = StatisticsServiceFactory.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        session.setAttribute("activeSessions", statisticsService.getActiveSessions());
        session.setAttribute("userCount", statisticsService.getUserCount());
        session.setAttribute("messageCount", statisticsService.getMessageCount());

        resp.sendRedirect(req.getContextPath() + "/ui/admin/statistics");
    }
}