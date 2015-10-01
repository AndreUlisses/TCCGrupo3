<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Usuário</title>
    </head>
    <body>
        <h1>Novo Usuário</h1>
        <br>
        <form method="post" name="frmPrincipal" id="frmPrincipal" action="Servlet">
            Informe seu nome: <input type="text" name="txtNome" id="txtId" value="">
            <br>
            Informe seu email: <input type="text" name="txtEmail" id="txtEmail" value="">
            <br>
            Informe seu senha: <input type="password" name="txtSenha" id="txtSenha" value="">
            <br>
            <br>
            <button type="submit">Enviar dados</button>
            
            
            <input type="hidden" name="txtObjeto" id="txtObjeto" value="Usuario">
            <input type="hidden" name="txtMetodo" id="txtMetodo" value="Salvar">            
        </form>
        
        
    </body>
</html>
