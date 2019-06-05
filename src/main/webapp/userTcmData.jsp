<%@page pageEncoding="UTF-8"%>
<%@ include file="/Views/shared/_listheader.jsp"%>

<style>
    <!--
    .page_form table {
        width: 75%;
        margin: auto;
    }

    .checkboxStyle{
        float: left;
        margin-left: 12px;
        margin-top: 8px;
        text-align: justify;
    }
    .checkboxStyle input[type='checkbox']{
    	margin : 0px;
    }
    .elementInput{
        float: left;
        margin-left:  12px;
        margin-top: 8px;
        text-align: justify;
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
        margin-left: 15px;
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
	                <button id="btn_back" type="button" class="btn">
						<i class="fa fa-backward"></i>返回列表
					</button>
                
                    <button id="btn_save" type="button" class="btn">
                        <i class="fa fa-save"></i>保存
                    </button>
                </div>
            </div>
        </div>
        <form id="form1">
            <div class="page_form">
                <table>
                    <tr>
                    	<input type="hidden" id = "autoid"/>
                        <th class="formTitle" colspan="12" style="text-align:center; ">
                            <select id = "templateId" name= "templateId">
                            	<option value=""></option>
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
                            <input type="checkbox" id="tcmClinicalPathway" name="tcmClinicalPathway" value="0" />
                            <label for="tcmClinicalPathway">是</label>
                            <input type="checkbox" id="notTcmClinicalPathway" name="tcmClinicalPathway" value="1" />
                            <label for="notTcmClinicalPathway">否</label>
                        </td>
                    </tr>
                    <tr>
                        <th class = "formTitle" >症候诊断</th>
                        <td colspan="11" id = "symptoms_diagnosis" style="width: 100%;position: relative;">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="12"><div class="main_headline">中医护理效果评价</div></td>
                    </tr>
                    <tr>
                        <td  colspan="12">
                            <table id = "main_symptom" style='width: 100%;'>
                            	<thead>
                                <tr>
                                    <th style="width: 10%;text-align: center;">主要症状</th>
                                    <th style="width: 25%;text-align: center;">主要辩护施护方法</th>
                                    <th style="width: 45%;text-align: center;">中医护理技术</th>
                                    <th style="width: 20%;text-align: center;">护理效果</th>
                                </tr>
                                </thead>
                                <tbody>
                                
                                </tbody>
								
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
                            <label for="eursingEvaluation">实用性强</label>
                            <input type="checkbox" id="eursingEvaluation" name="eursingEvaluation" value="0" />
                            <label for="practicabilityStrong">实用性较强</label>
                            <input type="checkbox" id="practicabilityStrong" name="eursingEvaluation" value="1" />
                            <label for="practicabilityOrdinary">实用性一般</label>
                            <input type="checkbox" id="practicabilityOrdinary" name="eursingEvaluation" value="2" />
                            <label for="unusefulness">不实用</label>
                            <input type="checkbox" id="unusefulness" name="eursingEvaluation" value="3" />
                        </td>
                    </tr>
                    <tr>
                    
                        <th class="formTitle">改进意见</th>
                        <td class="formValue" colspan="11" >
                        	<textarea  id="improvementSuggestions" name="improvementSuggestions" type="text"
                                       class="form-control" ></textarea>
                        </td>
                    </tr>
                    <tr>
                        <th class="formTitle">评价人(责任护士)姓名</th>
                        <td class="formValue" colspan="2">
                            <input id="primaryNurseName" name="primaryNurseName"
                                   type="text" class="form-control" style="width: 100px;" />
                        </td>
                        <th class="formTitle">技术职称</th>
                        <td class="formValue" colspan="2">
                            <input id="technicalTitles" name="technicalTitles"
                                   type="text" class="form-control" style="width: 100px;" />
                        </td>
                        <th class="formTitle">完成日期</th>
                        <td class="formValue" colspan="2">
                            <input id="finishDate" name="finishDate" type="text"
							class="form-control input-wdatepicker" placeholder="开始时间"  style="width: 160px;"/>
                        </td>
                        <th class="formTitle">护士长签字</th>
                        <td class="formValue" colspan="2">
                            <input id="responsibleNursename" name="responsibleNursename"
                                   type="text" class="form-control" style="width: 100px;" />
                            <input id="responsibleNurseId" name="responsibleNurseId"
                                   type="hidden" />
                            <label id="responsible_nurse_name2" ></label>
                        </td>
                    </tr>
                    
                </table>
            </div>
        </form>
    </div>
</div>
<script>


	var inpatientId = "012345";
	
	//模板id
	var keyValue = $.request("keyValue");
	
	var templateId = $.request("templateId");
	
    //初始化加载
    $(function() {
    	loadTemplateSelect();
        
        loadTcmTemplateDict();
        initbutton();
        
    });

    function loadTcmTemplateDict(){
    	
        //通过模板和病人id查询字典表数据
        if (!!templateId) {
        	
        	$("#templateId").val(templateId);
            $.doGet({
                url : "/cn/tcm/nse/template/item/queryCnTcmNseTemplate",
                data : {
                    "keyValue" : templateId
                },
                dataType : "json",
                async : false,
                success : function(data) {
                    //动态显示页面元素
                    dictDataDisplay(data);
                    
                   	//获取用户填写数据 
        	        getUserEvaluatioData();
                }
            });
        }

    }
     
    
    //页面根据字典表显示
    function dictDataDisplay(data){
    	
        var html = "";
        
        var symptomsDiagnosisHtml = "";
        
        var obj = {i:1};
        
        //循环主要症候和评价项目
        $.each(data.dictList,function(index,element){

            if(element.dictGroup == 3000){
            	//症候诊断
            	 //symptomsDiagnosisHtml += addDictSymptomsDiagnosis(i,symptomsDiagnosisHtml,element);
            	symptomsDiagnosisHtml += addDictSymptomsDiagnosis(obj,element);
            //主要症状
            }else if(element.dictGroup == 3005){
            	addDictMainSymptom(element,html);
           	//护理依从性及满意度评价
            }else if( element.dictGroup == 3025 ){
                addDictTcmNtep(element,html);
            }
        });
        $("#symptoms_diagnosis").append(symptomsDiagnosisHtml);
        //加载其他
        tfootElement();
    }
    
  	//症候诊断
    function addDictSymptomsDiagnosis(obj,element){
  		
  		var symptomsDiagnosisHtml="";
  		
  		if("txt" == element.dictType){
  			symptomsDiagnosisHtml = "<div style = 'float: left; clear: left;'>"+
			  						"<div class = 'checkboxStyle'>"+element.dictValue+
			  						"</div>";
  			
  		}else if("text" == element.dictType){
  			
  			symptomsDiagnosisHtml = "<div class='elementInput'>" +
			  	        "<label>其他</label>"+
			  	        "<input type='text' id='symptomsDiagnosisOther'/>" +
		  	        "</div>"+
		  	        "</div>";
			  	       
  		}else{

  			symptomsDiagnosisHtml = "<div class='checkboxStyle' style='width:84px;'>"; 
  	        if(obj.i==1){ 
  	        	symptomsDiagnosisHtml += "<input type='checkbox' id='symptomsDiagnosis'" +
  	    		 		"name='symptomsDiagnosis' value = '"+element.dictKey+"' />" +
  	            	"<label for='symptomsDiagnosis'>"+element.dictValue+"</label>";
  	       	}else{
  	       	symptomsDiagnosisHtml += "<input type='checkbox' id='dict"+element.dictKey+"' " +
  	       		 		"name='symptomsDiagnosis' value = '"+element.dictKey+"' />" +
  	               	"<label for='dict"+element.dictKey+"'>"+element.dictValue+"</label>";
  	       	}
  	        symptomsDiagnosisHtml +="</div>";
  			
  	      	obj.i++;
  			
  		}
  		
  		return symptomsDiagnosisHtml;
  		// "</div>";
		       
		
    }
  	//根据中医护理记录模板字典显示主要症状
    function addDictMainSymptom(element,html){
  	   
  		
		html = "<tr>";
		//显示主要症状的内容;
		html += displayMainSymptomsByDict(element);
		//主要施护方法   	  
		html += addDictMainNsingMethods(element);
		//中医护理技术
		html += addDictdefiniteTechnique(element);
		//护理效果
		html += addDictNursingEfficacy(element);
        	
		html += "</tr>";
		$("#main_symptom").append(html);
    	
    	
    }
   
    
    //添加主要症状页面显现元素
    function displayMainSymptomsByDict(data){
    	
    	var html = "<td>";
    		
		//显示主要症状
		var symptomsKeyList = data.mianSymptomsKey.toString().split("88");
		var symptomsNameList = data.dictValue.toString().split("||");
		//如果为空则
		if(symptomsKeyList == null || symptomsNameList == null){
			return false;
		}
		for(var i=0;i<symptomsKeyList.length - 1;i++){
			html += "<div><input name='autoid' type='hidden'>"+
		           "<input type='checkbox' id='mainSymptom"+symptomsKeyList[i]+"'value='"+symptomsNameList[i]+"'  name='mainSymptom' />" +
		           "<label for='mainSymptom"+symptomsKeyList[i]+"'>"+symptomsNameList[i]+"</label></div>";
		}
		html += "</td>";
		return html;
	}
    
    //根据字典值添加  辩护施护方法元素
    function addDictMainNsingMethods(element){
    	
    	var obj = {"i":1};
    	
    	var html = "<td style='text-align: center;'>";
 	    
    	html += addDictDialecticalNursing(obj,element);
    	
 	    html += "<div style='width:100%;clear: both'>" +
 	  				"<input name='autoid' type='hidden'>"+
		            "<div class='elementInput'>" +
		                "<label>"+obj.i+".其他护理措施</label>" +
		                "<input type='text' id='nurseDefiniteItemOther"+element.dictKey+"'"+
		                " name='nurseDefiniteItem'  style='width: 42%;' />" +
		            "</div>"+
	            "</div>";   
	   	html += "</td>";
    	
		return html;
    	
    }
    
    //添加主要辩护施护方法元素
    function addDictDialecticalNursing(obj,element){
    	
    	var html = "";
  	 	//主要辩护施护方法
		$.each(element.tcmDictList,function(index,tcmDict){
  		    //剔除评分选项。
			if(tcmDict.dictGroup == 3010 && tcmDict.dictKey != 30100000 && tcmDict.dictType != "text"){
			
				html +=	"<div style='width:100%;clear: both'>" +
							"<input name='autoid' type='hidden'>"+
				           "<div class='checkboxStyle'>" +
				               "<label for='nurseDefiniteItem"+element.dictKey+tcmDict.dictKey+"'>"+obj.i+"."+tcmDict.dictValue+"</label>" +
				               "<input type='checkbox' id='nurseDefiniteItem"+element.dictKey+tcmDict.dictKey+"' name = 'nurseDefiniteItem' value='"+tcmDict.dictValue+"'/>" +
				           "</div>";
			           
			    		if(element.tcmDictList[index+1].dictKey == 30100000){
			    			html +="<div class = 'elementInput' style='width: 100px;'>" +
						               "<label>评分</label>" +		
						               "<input type='text' id ='nurseItemGtaded"+element.dictKey+tcmDict.dictKey+"' name='nurseItemGtaded'  />" +
						           "</div>";
				    		}
    					//需要添加类型判断  如果是text就在复选框后排列展示。
			    		var dictElement = element.tcmDictList[index+1];
			    		if(dictElement.dictKey != 30100000 && dictElement.dictType == "text" && dictElement.dictValue != "活动评分"){
	    					html += "<div class = 'elementInput' style='width: 68%;'>" +
						               "<input type='text' id ='nurseDefiniteItem"+dictElement.dictKey+tcmDict.dictKey+"' style='width:42%;' name='nurseDefiniteItem'  />" +
						               "<label>"+dictElement.dictValue+"</label>" +
						            "</div>";
			    		}else if(dictElement.dictValue == "活动评分"){
			    			html +=	"<div style='width:100%;clear: both;margin-top: 6px;'>" +
			    						"<input type='hidden' name = 'autoid' />"+
				    					"活动评分:<input type = 'text' id = 'activityScore' name ='activityScore' style='width:60px;'  >"+
			    					"</div>";
	    					html +=	"<div style='width:100%;clear: both;margin-top: 6px;'>" +
	    								"<input type='hidden' name = 'autoid' />"+
	    								"静息评分:<input type = 'text' id = 'restingScore' id = 'restingScore' style='width:60px;' >"+
			    					"</div>";
			    		}
				html += "</div>"; 
				obj.i++;
			 }
		});
  	 	return html;
  	 	
    }
    
    //根据字典添加中医护理技术
    function addDictdefiniteTechnique(element){
    	
     	var html = "<td>";
     	var obj = {"i":1};
		
        html += addDefiniteTechniqueHtml(obj,element);
        
		html += "<div style='width:100%;clear: both'>" +
			 		 "<input name='autoid' type='hidden'>"+
			        "<div class='elementInput' style = 'width: 120px;'>" +
			            "<label>"+obj.i+".其他</label>" +
			            "<input type='text' style='width: 51%;' id ='definiteTechniqueOther"+element.dictKey+"'  name='definiteTechnique' />" +
			        "</div>" +
			        "<div class = 'nursing_technology'>" +
			            "<label>应用次数</label>" +
			            "<input type='text' id='useNum"+element.dictKey+"' name='useNum'  />" +
			            "<label>次,应用时间</label>" +
			            "<input type='text' id='useDay"+element.dictKey+"' name='useDay'  />" +
			            "<label>天</label>" +
			        "</div>" +
			    "</div>";
  		html +="</td>";
  	
		return html;
    }
    
    //添加 中医护理技术元素
    function addDefiniteTechniqueHtml(obj,element){
    	
    	var html = "";
    	
    	$.each(element.tcmDictList,function(index,tcmDict){	                  
		    if(tcmDict.dictGroup == 3015){   
		        html += "<div style='width:100%;clear: both'>" +
		        			  "<input name='autoid' type='hidden'>"+
		                 "<div class='checkboxStyle'style='width:120px;'>" + 			                      		
		                     "<label for='definiteTechnique"+element.dictKey+tcmDict.dictKey+"'>"+obj.i+"."+tcmDict.dictValue+"</label>" +
		                     "<input type='checkbox' id='definiteTechnique"+element.dictKey+tcmDict.dictKey+"' name='definiteTechnique"+element.dictKey+tcmDict.dictKey+"' value = '"+tcmDict.dictValue+"' />" +
		                 "</div>" +
		                 "<div class = 'nursing_technology'>" +
		                     "<label>应用次数</label>" +
		                     "<input type='text'   id='useNum"+element.dictKey+tcmDict.dictKey+"' name='useNum'  />" +
		                     "<label>次,应用时间</label>" +
		                     "<input type='text'  id='useDay"+element.dictKey+tcmDict.dictKey+"' name='useDay'  />" +
		                     "<label>天</label>" +
		                 "</div>" +
		             "</div>";
		             obj.i++;
		     }
		});
    	return html;
    }
    
    // 添加护理效果
    function addDictNursingEfficacy(element){
    	var html = "<td>"  +
				        "<label for='good"+element.dictKey+"'>好</label>" +
				        "<input type='checkbox' id='good"+element.dictKey+"' name='nursingEfficacy"+element.dictKey+"' value='0' />" +
				        "<label for='preferably"+element.dictKey+"'>较好</label>" +
				        "<input type='checkbox' id='preferably"+element.dictKey+"' name='nursingEfficacy"+element.dictKey+"' value='1' />" +
				        "<label for='ordinary"+element.dictKey+"'>一般</label>" +
				        "<input type='checkbox' id='ordinary"+element.dictKey+"' name='nursingEfficacy"+element.dictKey+"' value='2' />" +
				        "<label for='bad"+element.dictKey+"'>差</label>" +
				        "<input type='checkbox' id='bad"+element.dictKey+"' name='nursingEfficacy"+element.dictKey+"' value='3' />" ;
		//护理效果中是否有疼痛评分
		$.each(element.tcmDictList,function(index,tcmDict){	                  
			if(tcmDict.dictGroup == 3020){   
			   html += "<div style = 'width:100%;margin-top: 6px;'>" +
			            "<label>"+tcmDict.dictValue+"</label>" +
			            "<input type='text' style = 'width: 40%;' id='painScore"+element.dictKey+tcmDict.dictKey+"'  />" +
			        "</div>";
			}
		});
		
		html +=  "</td>";
		return html;
    }
    
    
    //页面添加护理依从性及满意度评价 
    function addDictTcmNtep(element,html){
    	
        html = "<tr id = '"+element.dictKey+"'>" +
        			"<input name='autoid' type='hidden'>"+
                    "<td style='width: 16.5%;' >"+element.dictValue+"</td>" +
                    "<td>" +
                        "<input type='checkbox' id='compliance"+element.dictKey+"' name='compliance"+element.dictKey+"' value = '依从'  />"+
                    "</td>" +
                    "<td>" +
                        "<input type='checkbox' name='compliance"+element.dictKey+"' value = '部分依从' />" +
                    "</td>" +
                    "<td>" +
                        "<input type='checkbox' name='compliance"+element.dictKey+"' value = '不依从'  />" +
                    "</td>" +
                    "<td>" +
                        "<input type='checkbox' id='satisfaction"+element.dictKey+"' name='satisfaction"+element.dictKey+"' value = '满意' />" +
                    "</td>" +
                    "<td>" +
                        "<input type='checkbox' name='satisfaction"+element.dictKey+"' value = '一般' />" +
                    "</td>" +
                    "<td>" +
                        "<input type='checkbox' name='satisfaction"+element.dictKey+"'  value = '不满意' />" +
                    "</td>" +
                "</tr>";
        $("#tcm_ntep").append(html);
        

    }
		
    
    
    //提交保存方法
    function submitUserdata(){
    	
    	var formParam = $("#form1").formSerialize();
    	
    	
    	//用户主要症状数据集合
    	var userMainSymptomList = [];
    	//护理依从性及满意度评价
    	var userComplianceSatisfactionList = [];
    	
    	//赋值用户主要症状数据
    	setUserMainSymptom(userMainSymptomList,formParam);
    	
    	//赋值护理依从性及满意度评价
    	setComplianceSatisfaction(userComplianceSatisfactionList,formParam);
    	
    	//主要症状数据
    	formParam["userMainSymptomList"] = userMainSymptomList;
    	formParam["inpatientId"] = inpatientId;
    	
    	//得到模板名
    	formParam["templateName"] = $("#templateId").find("option:selected").text();
    	
    	//发送数据到后台保存
    	sendData(formParam);
		
    }
    
    //发送后台数据
    function sendData(formParam){
    	
    	$.ajax({
	  		type: "POST",  
		    url:  $.rootPath()+"/tcm/nse/effect/data/submitCnTcmNseEffectData",
		    data: JSON.stringify(formParam),//将对象序列化成JSON字符串  
		    dataType:"json",  
		    contentType : 'application/json;charset=utf-8', //设置请求头信息  
		    success: function (data) {
                if (data.state == "success") {
                	//成功后的id赋值给key
                	keyValue = data.data;
                	
                	//加载模板同时加载数据
                	//loadTcmTemplateDict();
                	backIndex();
 
 					//弹出信息
               		$.modalMsg(data.message, data.state);
                     //$.modalClose();
                } else {
                    $.modalAlert(data.message, data.state);
                }
                $.loading_layer(false);
            },
            error: function (data) {
                $.modalAlert(JSON.stringify(data), "error");
                $.loading_layer(false);
            }
		}); 
    	
    }
    
    
    //所有主要症状
    function setUserMainSymptom(userMainSymptomList,formParam){
    	
    	//循环主要症状
		$("input[name='mainSymptom']").each(function(){
			//用户主要症状
			var userMainSymptom = {};
			//主要辩护施护方法集合
			var  all_main_dialectical_nursing = [];
			//中医护理技术集合
			var all_tcm_nursing_technique = [];
			
			//得到主要症状的父元素
			var trElement = $(this).parent().parent().parent();
			//得到这一行的所有td元素
			var tdElement = trElement.children('td');
			//循环td元素  只会有4个td元素
			$.each(tdElement,function(index,tdData){
				//主要辩护施护方法的td
				if(index == 1){
					//主要辩护施护方法
					setMainDialectical(tdData,all_main_dialectical_nursing,formParam)
				}else if(index == 2){
					//中医护理技术
					setTcmNursingTechnology(tdData,all_tcm_nursing_technique,formParam);
				}
				
			});
			//判断这一行是否选中
			//var isChecked = $(this).prop('checked'); 
			//console.info(isChecked);
			
			//赋值主要症状和护理效果表
			setMainAndNursing($(this),userMainSymptom,all_tcm_nursing_technique,all_main_dialectical_nursing); 
			
			userMainSymptomList.push(userMainSymptom);
		});
    	
    }
    
    
    //主要辩证施护方法 
    function setMainDialectical(tdData,all_main_dialectical_nursing,formParam){
    	
		//得到子节点div   得到每一条数据
		$.each(tdData.childNodes,function(divIndex,divData){
			//一条主要辩证施护方法
			var main_dialectical_nursing ={};
			
			//找到div中的input元素
			var inputElement = divData.getElementsByTagName('input');
			
			//需要把当前表单的id添加到对象中
			$.each(inputElement,function(inputIndex,inputData){
				if(inputData.type == 'hidden' && inputData.name == 'autoid' && inputIndex == 0){
					main_dialectical_nursing["autoid"] = inputData.value;
				}
				if(inputIndex == 1){
					main_dialectical_nursing["nurseItemId"] = inputData.id;
				}
                // return setAtivityScore(inputData,all_main_dialectical_nursing);
                //
                // return setRestingScore(inputData,all_main_dialectical_nursing);

				//第二个表单元素是 这一列的数据主要信息数据
				if(inputData.checked || inputData.type == "text" && inputIndex == 1) {
					main_dialectical_nursing["nurseDefiniteItem"] = inputData.value;
				}else if(inputData.type == "text" && inputData.value != ""){
					main_dialectical_nursing[inputData.name] = inputData.value;
				}

				return setNurseDefiniteItemTwo(inputData,inputIndex,all_main_dialectical_nursing);
				delete formParam[inputData.id];
				main_dialectical_nursing["inpatientId"] = inpatientId;
			});
			if(!$.isEmptyObject(main_dialectical_nursing)){
				//添加到集合
				all_main_dialectical_nursing.push(main_dialectical_nursing)
			}
		});
    	
    }

    //主要症状
    function setNurseDefiniteItemTwo(inputData,inputIndex,all_main_dialectical_nursing){
        if(inputData.name == "nurseDefiniteItem" && inputIndex != 1 ){
            var nurseDefiniteItem = {};
            var autoidValue = $("#"+inputData.id).parent().find("input[name='autoid']").val();
            nurseDefiniteItem["autoid"] = autoidValue== undefined ? "": autoidValue;
            nurseDefiniteItem["inpatientId"] = inpatientId;
            nurseDefiniteItem["nurseItemId"] = inputData.id;
            nurseDefiniteItem["nurseDefiniteItem"] = inputData.value;
            all_main_dialectical_nursing.push(nurseDefiniteItem);
            return true;
        }
    }

    // //活动评分
    // function setAtivityScore(inputData,all_main_dialectical_nursing){
    //     if(inputData.id == "activityScore"){
    //         var activityScoreData = {};
    //         var autoidValue = $("#activityScoreId").val();
    //         activityScoreData["autoid"] = autoidValue== undefined ? "": autoidValue;
    //         activityScoreData["inpatientId"] = inpatientId;
    //         activityScoreData["nurseItemId"] = inputData.id;
    //         activityScoreData["nurseDefiniteItem"] = $("#activityScore").val();
    //         all_main_dialectical_nursing.push(activityScoreData);
    //         return true;//退出本次循环
    //     }
    // }
    //
    // //静息评分
    // function setRestingScore(inputData,all_main_dialectical_nursing){
    //     if(inputData.id == "restingScore"){
    //         var restingScoreData = {};
    //         var autoidValue = $("#restingScoreId").val();
    //         restingScoreData["autoid"] = autoidValue== undefined ? "": autoidValue;
    //         restingScoreData["inpatientId"] = inpatientId;
    //         restingScoreData["nurseItemId"] = inputData.id;
    //         restingScoreData["nurseDefiniteItem"] = $("#restingScore").val();
    //         all_main_dialectical_nursing.push(restingScoreData);
    //         return true;
    //     }
    // }
    //
    //赋值中医护理技术
    function setTcmNursingTechnology(tdData,all_tcm_nursing_technique,formParam){
    	
    	//得到子节点  得到每一条数据
		$.each(tdData.childNodes,function(divIndex,divData){
			
			//一条中医护理技术
			var tcm_nursing_technique ={};
			
			//找到div中的input元素
			var inputElement = divData.getElementsByTagName("input");
			$.each(inputElement,function(inputIndex,inputData){
				if(inputData.type == 'hidden'){
					tcm_nursing_technique["autoid"] = inputData.value;
				}
				if(inputIndex == 1){
					tcm_nursing_technique["nursingTechniqueId"] = inputData.id;
				}
				if(inputData.checked || inputData.type == "text" && inputIndex == 1){
					tcm_nursing_technique["definiteTechnique"] = inputData.value;
				}else if(inputData.type == "text" && inputData.value != ""){
					tcm_nursing_technique[inputData.name] = inputData.value;
				}
				delete formParam[inputData.id];
				
				tcm_nursing_technique["inpatientId"] = inpatientId;
				
			});
			if(!$.isEmptyObject(tcm_nursing_technique)){
				//添加到集合
				all_tcm_nursing_technique.push(tcm_nursing_technique)
			}
		});
    	
    	
    }
    
    //赋值主要症状和评价效果
    function setMainAndNursing(main_symptom,userMainSymptom,all_tcm_nursing_technique,all_main_dialectical_nursing){
    	
    	var  mainSymptomId= main_symptom.attr("id");
    	
    	var mainSymptom = main_symptom.val();
    	
    	//护理效果评价
    	var nursingEfficacy = "";
    	var painScore;
    	var activity_score;
    	var resting_score;
    	//对添加其他的情况进行区分
    	if(mainSymptomId != "mainSymptomOther"){
	    	var mainDict = mainSymptomId.substring(mainSymptomId.length-8,mainSymptomId.length);
	    	//效果
	    	$("input[name='nursingEfficacy"+mainDict+"']:checked").each(function(){
	    		nursingEfficacy = $(this).val();
	    	})
	    	
	    	//疼痛评分
	    	painScore = $("#painScore"+mainDict+"30200000").val();
	    	activity_score = $("#painScore"+mainDict+"30200002").val();
	    	resting_score = $("#painScore"+mainDict+"30200003").val();
	    	
    	}else{
    		//效果
	    	$("input[name='nursingEfficacyOther']:checked").each(function(){
	    		nursingEfficacy = $(this).val();
	    	});
    	}
    	userMainSymptom["autoid"] = main_symptom.parent().find("input[name='autoid']").val()
    	userMainSymptom["inpatientId"] = inpatientId;
    	userMainSymptom["mainSymptomIdentifier"] = mainSymptomId;
    	
    	var isChecked = main_symptom.prop('checked'); 
    	if(isChecked){
    		userMainSymptom["mainSymptom"] = mainSymptom;
    	}else{
            userMainSymptom["mainSymptom"] = "";
        }
    	if(main_symptom.type == 'hidden'){
    		userMainSymptom[autoid] = main_symptom.value;
		}
    	userMainSymptom["painScore"] = painScore;
    	userMainSymptom["activityScore"] = activity_score;
    	userMainSymptom["restingScore"] = resting_score;
    	userMainSymptom["nursingEfficacy"] = nursingEfficacy;
    	userMainSymptom["nursingTechniqueList"] = all_tcm_nursing_technique;
    	userMainSymptom["dialecticalNursingList"] = all_main_dialectical_nursing;
    	
    }
    //赋值满意度和依从评价
    function setComplianceSatisfaction(userComplianceSatisfactionList,formParam){
    	
    	var tcmNtepList = [];
    	
    	var tcm_ntep = $("#tcm_ntep");
    	//得到所有行
    	var trElement = tcm_ntep.find('tr');
    	$.each(trElement,function(trIndex,trData){
    		var tcmNtep = {};
    		
    		var evaluateId = trData.id;
    		//取出序列化的参数放入对象中
    		//divData.getElementsByTagName("input");(b == false) ? a="true" : a="false";
    		var autoidValue = trData.getElementsByTagName("input")[0].value;
    		tcmNtep["autoid"] = autoidValue == undefined ? "": autoidValue;
    		tcmNtep["nursingProjectId"] = evaluateId;
    		tcmNtep["patientCompliance"] = formParam["compliance"+evaluateId];
    		tcmNtep["satisfaction"] = formParam["satisfaction"+evaluateId];
    		tcmNtep["inpatientId"] = inpatientId;
    		
    		tcmNtepList.push(tcmNtep);
    		
    		delete formParam["compliance"+evaluateId];
    		delete formParam["satisfaction"+evaluateId];
    	});
    	
    	formParam["tcmNtepList"] = tcmNtepList;
    	
    	
    }
    
    
    //通过id查看数据。
    function getUserEvaluatioData(){
    	
    	if (!!keyValue) {
			$.doGet({
				url : "/tcm/nse/effect/data/queryCnTcmNseEffectData",
				data : {
					"autoid" : keyValue
				},
				dataType : "json",
				async : false,
				success : function(data) {
					if(data.autoid != null){
						//护理依从性及满意度评价 数据显示
						displaytcmNtep(data);
						//显示主要症状和护理效果
						displayMainSymptom(data)
						$("#form1").formSerialize(data);
					}
				}
			});
		}
    	
    }
  	//护理依从性及满意度评价 数据显示
    function displaytcmNtep(data){
    	$.each(data.tcmNtepList,function(index,tcmNtepData){
			var element = $("#"+tcmNtepData.nursingProjectId);
			
			var satisfactionList = tcmNtepData.satisfaction.split('|');
			var $satisfactionname = element.find("input[name='satisfaction"+tcmNtepData.nursingProjectId+"']");
			setCheckbox(satisfactionList,$satisfactionname);
			
			var complianceList = tcmNtepData.patientCompliance.split('|');
			var $name = element.find("input[name='compliance"+tcmNtepData.nursingProjectId+"']");
			setCheckbox(complianceList,$name);
			
			var autoidElement = element.find("input[name='autoid']");
			autoidElement.val(tcmNtepData.autoid);
			
		});
    }
  	
  	//显示主要症状和护理效果
  	function displayMainSymptom(data){
  		$.each(data.userMainSymptomList,function(index,mainSymptomData){
			//主要症状和评价的
			var mainSymptomIdentifier = $("#"+mainSymptomData.mainSymptomIdentifier);
			if(mainSymptomData.mainSymptom == mainSymptomIdentifier.val()){
				mainSymptomIdentifier.prop("checked", true);
			}
			//主要症状的id
			var mainSymptomid = mainSymptomIdentifier.attr("id");
			if(mainSymptomid == undefined ){
				return false;
			}
			//主要症状的字典值
			var mainSymptomdict = mainSymptomid.substring(mainSymptomid.length-8,mainSymptomid.length);
			//赋值评分
			$("#painScore"+mainSymptomdict+"30200000").val(mainSymptomData.painScore);
			$("#painScore"+mainSymptomdict+"30200002").val(mainSymptomData.activityScore);
			$("#painScore"+mainSymptomdict+"30200003").val(mainSymptomData.restingScore);
			//护理效果
			$("input[name='nursingEfficacy"+mainSymptomdict+"']").each(function(){
				var nursingEfficacy = $(this).val();
				if(nursingEfficacy == mainSymptomData.nursingEfficacy){
					$(this).prop("checked", true);						
				}							
			});
			//护理效果
			$("input[name='nursingEfficacyOther']").each(function(){
				var nursingEfficacy = $(this).val();
				if(nursingEfficacy == mainSymptomData.nursingEfficacy){
					$(this).prop("checked", true);						
				}							
			});
			
			//主要辩护施护方法
			dispalyDialecticalNursing(mainSymptomData);
			//显示中医护理技术数据
			displayNursingTechnique(mainSymptomData,mainSymptomdict);
			
			mainSymptomIdentifier.parent().find("input[name='autoid']").val(mainSymptomData.autoid);

		});
  	}
  	
  	//主要辩护施护方法
  	function dispalyDialecticalNursing(mainSymptomData){
  		
  		$.each(mainSymptomData.dialecticalNursingList,function(index,dialecticalNursing){
			//页面id值
			var dialectical = dialecticalNursing.nurseItemId;
			//拼接的主要症状字典和当前主要辩护施护方法的字典拼接
			var str; 
			
			var element = $("#"+dialectical);
			
			if(element.attr("type") == "checkbox"){
				if(element.val() == dialecticalNursing.nurseDefiniteItem){
					str = dialectical.substring(dialectical.length-16,dialectical.length);
					element.prop("checked", true);	
				}
				$("#nurseItemGtaded"+str).val(dialecticalNursing.nurseItemGtaded);
				
			}else{
				element.val(dialecticalNursing.nurseDefiniteItem);
			}

			var autoidValue = element.parent().parent().find("input[name='autoid']").val();
			//静息评分和活动评分
			if(autoidValue != "" && autoidValue != null){
				element.parent().find("input[name='autoid']").val(dialecticalNursing.autoid);
			}else{
				element.parent().parent().find("input[name='autoid']").val(dialecticalNursing.autoid);
			}
			
			
		});
  	}
    
  	//显示中医护理技术数据
  	function displayNursingTechnique(mainSymptomData,mainSymptomdict){
  		$.each(mainSymptomData.nursingTechniqueList,function(index,nursingTechnique){
			
			//页面id值
			var technique = nursingTechnique.nursingTechniqueId;
			//拼接的主要症状字典和当前主要辩护施护方法的字典拼接
			var str; 
			
			var element = $("#"+technique);
			if(element.attr("type") == "checkbox"){
				if(element.val() == nursingTechnique.definiteTechnique){
					str = technique.substring(technique.length-16,technique.length);
					element.prop("checked", true);	
				}
				$("#useNum"+str).val(nursingTechnique.useNum);
				$("#useDay"+str).val(nursingTechnique.useDay);
				
			}else{
				element.val(nursingTechnique.definiteTechnique);
				$("#useNum"+mainSymptomdict).val(nursingTechnique.useNum);
				$("#useDay"+mainSymptomdict).val(nursingTechnique.useDay);
				
				
				$("#useNumOther").val(nursingTechnique.useNum);
				$("#useDayOther").val(nursingTechnique.useDay);
			}
			//回显id
			element.parent().parent().find("input[name='autoid']").val(nursingTechnique.autoid);
		});
  	}
  	
  	
  	
    function setCheckbox(valueList,$name){
    	$.each($name,function(j,obj){
			$.each(valueList, function (i,val) {
				var valModel = val.split('&');
    			if ($(obj).val()==valModel[0]) {
					if (valModel[1]=="1") {
						$(obj).prop("checked", true);
					}else{
						$(obj).prop("checked", false);
            		}
				}

			});
		});
    }
    
	function loadTemplateSelect(){
		$("#templateId").bindSelect({
			url: "/cn/tcm/nse/template/item/queryTemplateSelectTree"
		});
	} 
   

	function windowRefresh(){
		 //需要获得下拉框选中的模板id
		 var templateId = $("#templateId").val();
		 window.location.href=$.rootPath()+"/tcm/nse/effect/data/form?templateId="+templateId; 
	}
	
	function tfootElement(){
	    var tfootHtml = "<tfoot>"+
						    "<tr>"+
							    "<td>"+
								    "<input name='autoid' type='hidden'>"+
								        "<input type='checkbox' id='mainSymptomOther' value='0'  name='mainSymptom' />"+
								        "<label for='mainSymptomOther'>其他</label>"+
						        "</td>"+
						        "<td style='text-align: center;'>"+
								     "<div style='width:100%;clear: both'>"+ 
								    	"<input name='autoid' type='hidden' >"+
									    "<div style='width:100%;margin-left: 12px;margin-top: 3px;text-align: justify;'>"+
										    "<label >1.其他</label>"+
										    "<input type='text' id='nurseDefiniteOther' style='width:50%'  name = 'nurseDefiniteItem' />"+
									    "</div>"+
								    "</div>"+ 
								    "<div style='width:100%;clear: both'>"+ 
								    	"<input name='autoid' type='hidden'>"+ 
									    "<div style='width:100%;margin-left: 12px;margin-top: 3px;text-align: justify;'>"+
									    	"<label >2.其他</label>"+
										    "<input type='text' id='nurseDefiniteOtherTwo' style='width:50%' name = 'nurseDefiniteItem' />"+
									    "</div>"+
								    "</div>"+ 
							    "</td>"+
							    "<td>"+
								    "<div style='width:100%;clear: both'>"+
									    "<input name='autoid' type='hidden'>"+
									    "<div class='elementInput' style = 'width: 120px;'>"+
										    "<label>1.其他</label>"+
										    "<input type='text' style='width: 51%;' id ='definiteTechniqueOther'  name='definiteTechnique' />"+
									    "</div>"+
									    "<div class = 'nursing_technology'>"+
										    "<label>应用次数</label>"+
										    "<input type='text' id='useNumOther' name='useNum'  />"+
										    "<label>次,应用时间</label>"+
										    "<input type='text' id='useDayOther' name='useDay'  />"+
										    "<label>天</label>"+
									    "</div>"+
								    "</div>"+
							    "</td>"+
							    "<td>"+
								    "<label for='goodOther'>好</label>"+
							        "<input type='checkbox' id='goodOther' name='nursingEfficacyOther' value='0'>"+
								    "<label for='preferablyOther'>较好</label>"+
							        "<input type='checkbox' id='preferablyOther' name='nursingEfficacyOther' value='1'>"+
								    "<label for='ordinaryOther'>一般</label>"+
							        "<input type='checkbox' id='ordinaryOther' name='nursingEfficacyOther' value='2'>"+
								    "<label for='badOther'>差</label>"+
							        "<input type='checkbox' id='badOther' name='nursingEfficacyOther' value='3'>"+
							    "</td>"+
						    "</tr>"+
						"</tfoot>";
    	$("#main_symptom").append(tfootHtml);				
		
	}
	
	
	function backIndex(){
		window.location.href = $.rootPath()+"/tcm/nse/effect/data/index";
	}
	
	
	//初始化获取系统当前时间
	function getTime(id) {
		var myDate = new Date();
		var date = $.formatDate(myDate, "yyyy-MM-dd hh:mm:ss");
		$("#"+id).val(date);
	}
	
	//初始化button
	function initbutton(){
		$("#btn_save").click(function() {
			submitUserdata()
		  });
		
		$("#finishDate").focus(function(e) {
			WdatePicker({
				dateFmt : 'yyyy-MM-dd HH:mm:ss'
			});
		});
		getTime("finishDate")
		$("#btn_back").click(function() {
			backIndex();
		  });
		
		
		$("#templateId").change(function() {
/* 			$("#symptoms_diagnosis").children().remove(); 
			$("#main_symptom tbody tr:gt(0)").remove();
			$("#tcm_ntep").children().remove(); 
			
			 $("#autoid").val("");
			 $("#form1").formSerialize("");
 */
 			windowRefresh();
	  	});
       	
		$(":checkbox").click(function(){
			var name = $(this).attr("name");
			var namelength = document.getElementsByName(name).length
			if(name != "symptomsDiagnosis" && namelength >1 && name != "mainSymptom"){
				//设置当前选中checkbox的状态为checked
			 	$(':checkbox[type="checkbox"][name='+name+']').prop("checked",false);
			   $(this).prop("checked",true);
			   	/* $(this).siblings().attr("checked",false); //设置当前选中的checkbox同级(兄弟级)其他checkbox状态为未选中 */
			}
		});
     }  


</script>