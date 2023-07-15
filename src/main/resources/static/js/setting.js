$(function (){
    $("#uploadForm").submit(upload);
});

function upload(){
    $.ajax({
        url:"http://upload-z1.qiniup.com",
        method:"post",
        processData:false,
        contentType:false,
        data:new FormData($("#uploadForm")[0]),
        success:function (data){
            if (data&&data.code==0){
            //    更新头像访问路径
                $.post(
                  CONTEXT_PATH + "/user/header/url",
                    {"fileName":$("input[name='key']").val()},
                    function (data){
                      data = $.parseJSON(data);
                      if (data.code==0){
                          window.location.reload();
                      }
                      else{
                          alert(data.msg);
                      }
                    }
                );
            }
            else{
                alert("上传失败!");
            }
        }
    });
    //不再提交表单，上面逻辑已经处理完上传
    return false;
}