<%@page pageEncoding="UTF-8"%>
<%@ include file="/Views/shared/_listheader.jsp"%>

<style>
    <!--
    .page_form table {
        width: 75%;
        margin: auto;
    }

    div.checkboxStyle{
        float: left;
        margin-left: 12px;
        margin-top: 3px;
        width:83px;
        text-align: justify;
    }
    .elementInput{
        float: left;
        margin-left:  6px;
        margin-top: 3px;
    }
    .elementInput input{
        width: 72%;
    }
    .evaluateHead{
        width:12.5%;
        text-align: center;
    }
    .nursing_technology{
        float: left;
        margin-left: 12px;
        margin-top: 3px;
    }
    .nursing_technology input{
        width: 60px;
    }
    -->
</style>


<div id="page-wrapper" class="container">
    <div class="page_index">
        <div class="topPanel">
            <div class="toolbar">
                <div class="operate">
                    <button id="btn_brief_add" type="button" class="btn">
                        <i class="fa fa-plus"></i>暂存
                    </button>
                    <button id="btn_save" type="button" class="btn">
                        <i class="fa fa-save"></i>保存
                    </button>
                    <button id="btn_delete" type="button" class="btn">
                        <i class="fa fa-trash-o"></i>删除
                    </button>
                </div>
            </div>
        </div>
        <form id="form1">
            <div class="page_form">
                <table>
                    <tr>
                        <th class="formTitle" colspan="12" style="text-align:center; ">
                            <select id = "templateId" name= "templateId">
                                <option value = "250f67e7a04749dd9588bbfec4f6b3d0">胃疡(消化性溃疡)</option>
                            </select>
                            中医护理效果评价表
                        </th>
                    </tr>
                </table>
                <table class="form-line">
                    <tr>
                        <th class="formTitle" >医院</th>
                        <td class="formValue" >
                            <label id="lblname"></label>
                        </td>
                        <th class="formTitle" >科室</th>
                        <td class="formValue" >
                            <label id="lblward"></label>
                        </td>
                        <th class="formTitle" >入院日期</th>
                        <td class="formValue" >
                            <label id="lblbed_date"></label>
                        </td>
                        <th class="formTitle" >出院日期</th>
                        <td class="formValue" >
                            <label id="lblbed_number"></label>
                        </td>
                        <th class="formTitle" >住院天数</th>
                        <td class="formValue" colspan="3">
                            <label id="lblsex"></label>
                        </td>
                    </tr>
                    <tr>
                        <th class="formTitle">患者姓名</th>
                        <td class="formValue" >
                            <label id="patientName"></label>
                        </td>
                        <th class="formTitle">性别</th>
                        <td class="formValue" >
                            <label id="sex"></label>
                        </td>
                        <th class="formTitle">年龄</th>
                        <td class="formValue" >
                            <label id="age"></label>
                        </td>
                        <th class="formTitle">ID(住院号)</th>
                        <td class="formValue" >
                            <label id="admissionNumber"></label>
                        </td>
                        <th class="formTitle">文化程度</th>
                        <td class="formValue" >
                            <label id="lbladmission_diagnosis"></label>
                        </td>
                        <th class="formTitle">纳入中医</br>临床路径</th>
                        <td class="formValue" >
                            <input type="checkbox" id="bringInto" name="turnOver" value="0" />
                            <label for="bringInto">是</label>
                            <input type="checkbox" id="notbringInto" name="turnOver" value="0" />
                            <label for="notbringInto">否</label>
                        </td>
                    </tr>
                    <tr>
                        <th class = "formTitle" >症候诊断</th>
                        <td colspan="11" id = "symptomsDiagnosis" style="width: 100%;position: relative;">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="12"><div class="main_headline">中医护理效果评价</div></td>
                    </tr>
                    <tr>
                        <td  colspan="12">
                            <table id = "main_symptom" style='width: 100%;'>
                                <tr>
                                    <th style="width: 10%;text-align: center;">主要症状</th>
                                    <th style="width: 25%;text-align: center;">主要辩护施护方法</th>
                                    <th style="width: 45%;text-align: center;">中医护理技术</th>
                                    <th style="width: 20%;text-align: center;">护理效果</th>
                                </tr>

                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="12"><div class="main_headline">护理依从性及满意度评价</div></td>
                    </tr>

                    <tr>
                        <td colspan="12">
                            <table style="width:100%;">
                                <tr>
                                    <th rowspan="2" colspan="2" style = "text-align: center;width: 25%;">项目评价</th>
                                    <th colspan="3" style = "text-align: center;width: 37.5%;">患者对护理的依从性</th>
                                    <th colspan="3" style = "text-align: center;width: 37.5%;">患者对护理的满意度</th>
                                </tr>
                                <tr>
                                    <th class = 'evaluateHead'>依从</th>
                                    <th class = 'evaluateHead'>部分依从</th>
                                    <th class = 'evaluateHead'>不依从</th>
                                    <th class = 'evaluateHead'>满意</th>
                                    <th class = 'evaluateHead'>一般</th>
                                    <th class = 'evaluateHead'>不满意</th>
                                </tr>
                                <tr>
                                    <th style = "width: 10%;text-align: center;">中医护理技术</th>
                                    <td colspan="7">
                                        <table id = 'tcm_ntep' style="width:100%;">
                                        </table>
                                    </td>
                                </tr>

                                <tr>
                                    <th colspan="2" style = "text-align: center;">健康指导</th>
                                    <td>/</td>
                                    <td>/</td>
                                    <td>/</td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <th colspan="2" style = "text-align: center;">签名</th>
                                    <td colspan="3">
                                        <label>责任护士签名</label>
                                        <input type="text" id="primaryNurseSignature" style="width: 120px;"  name="primaryNurseSignature"  />
                                    </td>
                                    <td colspan="3">
                                        <label>上级护士或护士长签名</label>
                                        <input type="text" id="superiorNurseSignature" style="width: 120px;"   name="superiorNurseSignature"  />
                                    </td>
                                </tr>

                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="12"><div class="main_headline">责任护士对本病中医护理方案的评价</div></td>
                    </tr>

                    <tr>
                        <th class="formTitle">评价</th>
                        <td class="formValue" colspan="11">
                            <label for="practicability">实用性强</label>
                            <input type="radio" id="practicability" name="turnOver" value="0" />
                            <label for="practicabilityStrong">实用性较强</label>
                            <input type="checkbox" id="practicabilityStrong" name="turnOver" value="0" />
                            <label for="practicabilityOrdinary">实用性一般</label>
                            <input type="checkbox" id="practicabilityOrdinary" name="turnOver" value="0" />
                            <label for="unusefulness">不实用</label>
                            <input type="checkbox" id="unusefulness" name="turnOver" value="0" />
                        </td>
                    </tr>
                    <tr>
                        <th class="formTitle">改进意见</th>
                        <td class="formValue" colspan="11" >
                        	<textarea  id="notificationTime" name="notificationTime" type="text"
                                       class="form-control" ></textarea>
                        </td>
                    </tr>
                    <tr>
                        <th class="formTitle">评价人(责任护士)姓名</th>
                        <td class="formValue" colspan="2">
                            <<input type="text" name="nurseDefiniteItemOther" style="
    width: 41%;
">input id="primaryNurse" name="primaryNurse"
                                   type="text" class="form-control" style="width: 100px;" />
                        </td>
                        <th class="formTitle">技术职称</th>
                        <td class="formValue" colspan="2">
                            <input id="technicalTitles" name="technicalTitles"
                                   type="text" class="form-control" style="width: 100px;" />
                        </td>
                        <th class="formTitle">完成日期</th>
                        <td class="formValue" colspan="2">
                            <input id="recordingTime" name="recordingTime" type="text"
                                   class="form-control input-wdatepicker" style="width: 160px;" />
                        </td>
                        <th class="formTitle">护士长签字</th>
                        <td class="formValue" colspan="2">
                            <input id="responsibleNursename" name="responsibleNursename"
                                   type="text" class="form-control" style="width: 100px;" />
                            <input id="responsibleNurseId" name="responsibleNurseId"
                                   type="hidden" />
                            <label id="responsible_nurse_name2"></label>
                        </td>
                    </tr>
                </table>
            </div>
        </form>
    </div>
</div>
<script>
    //初始化加载
    $(function() {
        loadTcmTemplateDict();

        /*
         initControl();
         loadData("0"); */

    });

    function loadTcmTemplateDict(){
        //需要获得下拉框选中的模板id
        var templateId = $("#templateId").val();

        //通过id查询字典表数据
        if (!!templateId) {
            $.doGet({
                url : "/cn/tcm/nse/template/item/queryCnTcmNseTemplate",
                data : {
                    "keyValue" : templateId
                },
                dataType : "json",
                async : false,
                success : function(data) {
                    //动态显示页面元素
                    dataEchoDisplay(data)
                }
            });
        }


    }
    //页面回显
    function dataEchoDisplay(data){

        var html;

        //循环主要症候和评价项目
        $.each(data.dictList,function(index,element){

            if(element.dictGroup == 3000){
                html = "<div class='checkboxStyle'>" +
                "<input type='"+element.dictType+"' id='dict"+element.dictKey+"' " +
                "name='dict"+element.dictGroup+"' value = '"+element.dictKey+"' />" +
                "<label for='dict"+element.dictKey+"'>"+element.dictValue+"</label>" +
                "</div>";
                $("#symptomsDiagnosis").append(html);
                //添加中医护理效果评价
            }else if(element.dictGroup == 3005){
                addMainSymptom(element,html);
                //页面添加护理依从性及满意度评价
            }else if( element.dictGroup == 3025 ){
                addTcmNtep(element,html);
            }
        });
        html = "<div class='elementInput'>" +
        "<label>其他</label>"+
        "<input type='text' id='symptomsDiagnosisOther'/>" +
        "</div>"
        $("#symptomsDiagnosis").append(html);

    }
    //添加中医护理效果评价
    function addMainSymptom(element,html){
        html = "<tr id='main"+element.dictKey+"'>" +
        "<td>"+
        "<input type='checkbox' id='"+element.dictKey+"'  name='mainSymptom' />" +
        "<label for='"+element.dictKey+"'>"+element.dictValue+"</label>" +
        "</td>";
        //循环主要症状的其余列

        html += "<td style='text-align: center;'>";
        var i =1;
        console.info(element.tcmDictList);
        //主要辩护施护方法
        $.each(element.tcmDictList,function(index,tcmDict){
            if(tcmDict.dictGroup == 3010 && tcmDict.dictKey != 30100000){

                html +=	"<div style='width:100%;clear: both'>" +
                "<div class='checkboxStyle'>" +
                "<label for='nurseDefiniteItem"+element.dictKey+"'>"+i+"."+tcmDict.dictValue+"</label>" +
                "<input type='checkbox' id='nurseDefiniteItem"+element.dictKey+"' name='"+tcmDict.dictValue+"'/>" +
                "</div>";

                if(element.tcmDictList[index+1].dictKey == 30100000){
                    html += "<div class = 'elementInput' style='width: 100px;'>" +
                    "<label>评分</label>" +
                    "<input type='text'  name='nurseItemGtaded'  />" +
                    "</div>"
                }
                html += "</div>";
                i++;
            }
        });

        html += "</td>" +
        "<td>";
        //中医护理技术
        i =1;
        $.each(element.tcmDictList,function(index,tcmDict){
            if(tcmDict.dictGroup == 3015){
                html += "<div style='width:100%;clear: both'>" +
                "<div class='checkboxStyle'>" +
                "<label for='definiteTechnique"+element.dictKey+"'>"+i+"."+tcmDict.dictValue+"</label>" +
                "<input type='checkbox' id='definiteTechnique"+element.dictKey+"' name='definiteTechnique' value = '"+tcmDict.dictValue+"' />" +
                "</div>" +
                "<div class = 'nursing_technology'>" +
                "<label>应用次数</label>" +
                "<input type='text' id='useNum"+element.dictKey+"' name='useNum'  />" +
                "<label>次,应用时间</label>" +
                "<input type='text' id='useDay"+element.dictKey+"' name='useDay'  />" +
                "<label>天</label>" +
                "</div>" +
                "</div>";
                i++;
            }
        });
        html +="</td>" +
        "<td>"  +
        "<div class='checkboxStyle' style = 'width:140px;'>" +
        "<label for='good"+element.dictKey+"'>好</label>" +
        "<input type='checkbox' id='good"+element.dictKey+"' name='nursingEfficacy"+element.dictKey+"' value='0' />" +
        "<label for='preferably"+element.dictKey+"'>较好</label>" +
        "<input type='checkbox' id='preferably"+element.dictKey+"' name='nursingEfficacy"+element.dictKey+"' value='1' />" +
        "<label for='ordinary"+element.dictKey+"'>一般</label>" +
        "<input type='checkbox' id='ordinary"+element.dictKey+"' name='nursingEfficacy"+element.dictKey+"' value='2' />" +
        "<label for='bad"+element.dictKey+"'>差</label>" +
        "<input type='checkbox' id='bad"+element.dictKey+"' name='nursingEfficacy"+element.dictKey+"' value='3' />" +
        "</div>" ;
        //护理效果中是否有疼痛评分
        $.each(element.tcmDictList,function(index,tcmDict){
            if(tcmDict.dictGroup == 3020){
                html += "<div style = 'width:100%;margin-left: -9%;'>" +
                "<label>疼痛评分</label>" +
                "<input type='text'  style = 'width: 40%;' id='ear' name='painScore"+element.dictKey+"' value='' />" +
                "</div>";
            }
        });

        html +=  "</td>"+
        "</tr>";
        $("#main_symptom").append(html);


    }
    //页面添加护理依从性及满意度评价 
    function addTcmNtep(element,html){
        html = "<tr>" +
        "<td style='width: 16.5%;'>"+element.dictValue+"</td>" +
        "<td>" +
        "<input type='checkbox' id='eadordly1' name='earlySudcking'  />"+
        "</td>" +
        "<td>" +
        "<input type='checkbox' id='eaodrdly1' name='earlySudcking'  />" +
        "</td>" +
        "<td>" +
        "<input type='checkbox' id='eaodrdly1' name='earlySucking'  />" +
        "</td>" +
        "<td>" +
        "<input type='checkbox' id='eadrodly1' name='earlySudcking'  />" +
        "</td>" +
        "<td>" +
        "<input type='checkbox' id='euaodrdlyo' name='earlydSucking'  />" +
        "</td>" +
        "<td>" +
        "<input type='checkbox' id='eyadordly1' name='earlySucking'  />" +
        "</td>" +
        "</tr>";
        $("#tcm_ntep").append(html);

    }

    //拼装集合  每一个主要症状 和护理效果 为一个对象  这个对象中包含了主要辩护施护方法  中医护理技术
    //通过main+主要症状字典key 得到

    $("#addDiv>div").each(function(){



    });

    //如果循环name得到的是表单元素  






    //parm为删除标记//初始数据绑定
    /* 	function loadData() {
     var patientId = "0123456";
     var deleteMark = "0";
     if (!!patientId) {
     $.doGet({
     url : "/cn/firstnurserecord/queryFirstNurseRecord",
     data : {
     patientId : patientId,
     deleteMark : deleteMark
     },
     dataType : "json",
     async : false,
     success : function(data) {
     if (data.autoid != null || data.autoid != undefined
     || parm == "1") {
     $("#form1").formSerialize(data);
     $("#autoid").val(data.autoid);
     if (data.notificationTime == null) {
     GetTime("1");
     }
     if (data.recordingTime == null) {
     GetTime("2");
     }
     } else {
     GetTime("0");
     }
     }
     });
     }
     }
     //初始化获取系统当前时间
     function GetTime(eve) {
     var myDate = new Date();
     var date = $.formatDate(myDate, "yyyy-MM-dd hh:mm:ss");
     if (eve == "0") {
     $("#notificationTime").val(date);
     $("#recordingTime").val(date);
     }
     if (eve == "1") {
     $("#notificationTime").val(date);
     }
     if (eve == "2") {
     $("#recordingTime").val(date);
     }
     }
     //初始化时给前台控件附加方法
     function initControl() {
     GetTime("0")
     //绑定时间控件
     $("#notificationTime").focus(function(e) {
     WdatePicker({
     dateFmt : 'yyyy-MM-dd HH:mm:ss'
     });
     });
     $("#recordingTime").focus(function(e) {
     WdatePicker({
     dateFmt : 'yyyy-MM-dd HH:mm:ss'
     });
     });
     $("#div_anaphylaxis").click(function() {
     SelectClickGMS();
     });
     $("#div_anaphylaxis1").click(function() {
     SelectClickGMS();
     });
     $.each($("div[id^='div_smoke']"), function(i, obj) {
     $("#" + obj.id).click(function() {
     SelectClickSmoke();
     });
     });
     $.each($("div[id^='div_drinkWine']"), function(i, obj) {
     $("#" + obj.id).click(function() {
     SelectClicks('drinkWine3', 'spdrink_wine', 'milliliter');
     });
     });
     $("#btn_brief_add").click(function() {
     submitFirstNurseRecord("0");
     });
     $("#btn_save").click(function() {
     submitFirstNurseRecord("1");
     });
     //删除方法
     $("#btn_delete").click(function() {
     var patientId = "0123456";
     $.deleteForm({
     url : "/firstnurserecord/deleteFirstNurseRecord",
     param : {
     patientId : patientId
     },
     success : function() {
     loadData("1");
     }
     });
     });
     }
     //过敏史
     function SelectClickGMS() {
     var $anaphylaxis = $("#anaphylaxis1");
     if ($anaphylaxis.is(":checked")) {
     $("#TxtGmyw").val("");
     $("#TxtGmbx").val("");
     $("#drugAllergy").attr("checked", false);
     $("#foodAllergy").attr("checked", false);
     $("#TxtGmswmc").val("");
     $("#allergicConstitution").attr("checked", false);
     }
     displayornot('anaphylaxis1', 'tab_gms');
     }
     //过敏史显示隐藏
     function displayornot(ctrl1, ctrl2) {
     if (ctrl1 == '') {
     $("#" + ctrl2).prop("style", "display: block;width: 100%");
     }
     if ($("#" + ctrl1).is(":checked")) {
     $("#" + ctrl2).prop("style", "display: block;width: 100%");
     } else {
     $("#" + ctrl2).prop("style", "display: none;width: 100%");
     }

     }
     //吸烟
     function SelectClickSmoke() {
     if ($("#smoke1").is(":checked")) {
     $("#quitSmoking").val("");
     displayornotSmoke('smoke1', 'spsmoke1');
     } else {
     $("#onlyANumber").val("");
     displayornotSmoke('smoke2', 'spsmoke2');
     }
     }
     //吸烟显示隐藏
     function displayornotSmoke(ctrl1, ctrl2) {
     if (ctrl1 == '') {
     $("#" + ctrl2).hide();
     }
     if ($("#smoke1").is(":checked")) {
     $("#spsmoke1").show();
     $("#spsmoke2").hide();
     } else if ($("#smoke2").is(":checked")) {
     $("#spsmoke2").show();
     $("#spsmoke1").hide();
     } else {
     $("#spsmoke1").hide();
     $("#spsmoke2").hide();
     }
     }
     //其他（过敏史，吸烟除外）单选方法
     function SelectClicks(ctrl1, ctrl2, ctrl3) {
     if ($("#" + ctrl1).is(":checked")) {
     displayornots(ctrl1, ctrl2);
     } else {
     if (ctrl3 != "") {
     if (ctrl3 == "radio") {
     $("#dorsalis_pedis_left").attr("checked", false);
     $("#dorsalis_pedis_right").attr("checked", false);
     } else if (ctrl3 == "checkbox") {
     $("#turn_over").attr("checked", false);
     $("#atomization_inhalation").attr("checked", false);
     $("#phlegm_sucking").attr("checked", false);
     } else {
     $("#" + ctrl3).val("");
     }
     }
     displayornots('', ctrl2);
     }
     }
     ////其他（过敏史，吸烟除外）显示隐藏方法
     function displayornots(ctrl1, ctrl2) {
     if (ctrl1 == '') {
     $("#" + ctrl2).hide();
     }
     if ($("#" + ctrl1).is(":checked")) {
     $("#" + ctrl2).show();
     } else {
     $("#" + ctrl2).hide();
     }
     }
     //保存数据方法
     function submitFirstNurseRecord(val) {
     if (!$('#form1').formValid()) {
     return false;
     }
     var postData = $("#form1").formSerialize();
     if(val=="0"){
     postData.saveState = "0";//暂存
     }else{
     postData.saveState = "1";//保存
     }
     $.submitForm({
     url : "/cn/firstnurserecord/submitFirstNurseRecord",
     param : postData,
     close : false,
     showlayer : true,
     success : function(data) {
     loadData("0");//加载数据
     }
     });
     } */
</script>


