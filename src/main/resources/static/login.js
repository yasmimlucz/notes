$("#login").click(enviarLogin);

function enviarLogin(){
let matricula = $("#matricula").val();
let senha = $("#senha").val();

$.ajax({

type : "POST",
url: "/login",
data:{
matricula:matricula /*variavel tem que estar colado no :*/
senha:senha
},

sucess:function(data){
if(data){
alert("deveria ter logado!");
}else{
alert("errouuuuuu!");
}

},

error: function(){
alert("falha ao tentar realizar o login!")
}
});
}
