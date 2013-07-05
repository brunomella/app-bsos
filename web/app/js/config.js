/*
 *  SYSTEM    :: Bruno | Sistema de Ordem de Servico
 *  DEV       :: Bruno Luiz MElla ON 2013
 *  VERSION   :: 1.0
 */


$(document).ready(function() {

    // selecionado o tipo de pessoa
//    $('._radioPessoa').on('change', function() {
//        $val = $(this).val();
//        if ($val == 'F') {         
//            $("#fisica").css({'display': 'block'});
//            $("#juridica").css({'display': 'none'});
//        } else if ($val == 'J') {
//           
//            $("#fisica").css({'display': 'none'});
//            $("#juridica").css({'display': 'block'});
//        }
//    });

//    $('a[data-toggle=tab]').tooltip({placement: "top"});

//    $('input').on("keyup", function() {
//        if (this.value.length <= 3) {
//            $(this).tooltip("show");
//        } else {
//            $(this).tooltip("hide");
//        }
//    }).tooltip({
//        placement: "right"
////        trigger: "focus"
//        
//    });


//Mascaras dos campos
    $("._telefone").mask("(99) 9999-9999", {placeholder: " "});
    $("._rg").mask("9999999999", {placeholder: " "});
    $("._cpf").mask("999.999.999-99", {placeholder: " "});
    $("._cnpj").mask("99.999.999/9999-99", {placeholder: " "});
    $("._ie").mask("9999999999-9", {placeholder: " "});
    $("._CEP").mask("99999-999", {placeholder: " "});
    $("._UF").mask("aa", {placeholder: " "});

    $('#datepicker').datepicker({
        language: 'pt-BR'
    });

});




$('.datepicker').datepicker();

$(function() {
    $('table').footable();
});

//function Compara_Datas(data_inicial, data_final){  
//    //Verifica se a data inicial é maior que a data final  
//    var data_inicial = document.getElementById(data_inicial);  
//    var data_final   = document.getElementById(data_final);  
//    str_data_inicial = data_inicial.value;  
//    str_data_final   = data_final.value;  
//    dia_inicial      = data_inicial.value.substr(0,2);  
//    dia_final        = data_final.value.substr(0,2);  
//    mes_inicial      = data_inicial.value.substr(3,2);  
//    mes_final        = data_final.value.substr(3,2);  
//    ano_inicial      = data_inicial.value.substr(6,4);  
//    ano_final        = data_final.value.substr(6,4);  
//    if(ano_inicial > ano_final){  
//        alert("A data inicial deve ser menor que a data final.");   
//        data_inicial.focus();  
//        return false  
//    }else{  
//    if(ano_inicial == ano_final){  
//    if(mes_inicial > mes_final){  
//    alert("A data inicial deve ser menor que a data final.");  
//                data_final.focus();  
//                return false  
//            }else{  
//                if(mes_inicial == mes_final){  
//                    if(dia_inicial > dia_final){  
//                        alert("A data inicial deve ser menor que a data final.");  
//                        data_final.focus();  
//                        return false  
//                    }  
//                }  
//            }  
//        }  
//    }  
//}  


