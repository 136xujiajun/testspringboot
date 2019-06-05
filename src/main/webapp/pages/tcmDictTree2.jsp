<script type="text/javascript">
    $(document).ready(function() {
        //输入框 联想搜索下拉提示
        var result=new Array();
        $('#cardNo').keyup(function(event){
            if($('#cardNo').val()!=''){  //当输入框的值不为空的时候才能发送请求
                $.ajax({
                    type : "POST",
                    url:"${ctx}/testCard/getCardNoList",// 跳转到 action  
                    async:true,
                    data : {"cardNo":$('#cardNo').val()},
                    dataType : 'text',
                    success:function(res){
                        //res返回数据格式：<String> a,b,c,d,
                        $('li').remove();//先清空之前记录
                        res=res.substring(0,res.length-1);//去掉末位逗号
                        console.log(res);
                        result=res.split(',');//转数组
                        for(var i=0;i<result.length;i++){
                            oli_i=$('<li> '+result[i]+' </li>');//拼接li
                            console.log(oli_i);
                            $('#box ul').append(oli_i);//添加 li
                            //点击查询结果写入input
                            $('#box ul li').eq(i).click(function(){
                                $('#cardNo').val($(this).text());//写入input
                                $('li').remove();//添加完成关闭 li
                            });
                        };
                    },
                    error:function(res){
                        console.log(res) ;
                    }
                });
            }else{
                $('#box ul').html('') ;   //如果输入框的词都删除了，把获取的数据结果也清空，因为已经获取到数据了，即使阻止再次发送请求也不会把已经获得的数据清除，所以这里直接用了最简单的办法，直接清空数据
            };
        });

    });
</script>
<style type="text/css">
    ul,li{ line-height: 14px;    font-size: 17px; padding: 5px 10px;  margin-left: 84px;  width: 200px;   }
    li{   list-style:none;  }
    li.current{  background:#CCCCCC; color:#0000FF; cursor: pointer;  }
    li:hover{  background:#CCCCCC;   color:#0000FF;  cursor: pointer; }
</style>
</head>
<body>
<ul class="nav nav-tabs">

</ul><br/>
<form:form id="inputForm" modelAttribute="testCard" action="${ctx}/testCard/save" method="post" class="form-horizontal">

    <div class="control-group">
        <label class="control-label">卡号：</label>
        <div class="controls">
            <form:input path="cardNo" htmlEscape="false" maxlength="30" class="input-xlarge"   /><span style="font-style:oblique;color: #ff5500">&nbsp;&nbsp;&nbsp;&nbsp;提示：输入卡号可以进行模糊查询。</span>
        </div>
        <div class="box" id="box">
            <ul   >

            </ul>
        </div>
    </div>
</form:form>

</body>