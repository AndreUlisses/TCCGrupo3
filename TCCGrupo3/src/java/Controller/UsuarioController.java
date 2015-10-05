package Controller;

import DAO1.UsuarioDAO1;
import Entidade1.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsuarioController {

    public void Cadastro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("UsuarioCadastro.jsp");
        rd.forward(request, response);

    }

    public void Salvar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Usuario usuario = new Usuario();
        usuario.setNome(request.getParameter("txtNome"));
        usuario.setEmail(request.getParameter("txtEmail"));
        usuario.setSenha(request.getParameter("txtSenha"));

        UsuarioDAO1 usuarioDao = new UsuarioDAO1();
        if (usuarioDao.salvar(usuario) == -1) {
            RequestDispatcher rd = request.getRequestDispatcher("mensagemErro.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("mensagemOK.jsp");
            rd.forward(request, response);
        }

    }

}
