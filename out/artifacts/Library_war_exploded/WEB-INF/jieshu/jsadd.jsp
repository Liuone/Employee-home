<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2020/12/29
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>
    <link rel="stylesheet" href="../../css/pintuer.css">
    <link rel="stylesheet" href="../../css/admin.css">
    <script src="../../js/jquery.js"></script>
    <script src="../../js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加内容</strong></div>
    <div class="body-content">
        <form  class="form-x" action="addBorrow1.action">
            <div class="form-group">
                <div class="label">
                    <label>读者ID：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" value="borrowerId" name="borrowerId"data-validate="required:请输入ID" />
                    <div class="tips"></div>
                </div>
            </div>
            <if condition="$iscid eq 1"> </if>
            <div class="clear"></div>
            <div class="form-group">
                <div class="label">
                    <label>书号：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="bookNumber"   data-validate="number:书号必须为数字" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>借阅书名：</label>
                </div>
                <div class="field">
                    <script src="js/laydate/laydate.js"></script>
                    <input type="text" class="input w50" name="bookName" value=""  />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>借阅人：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="borrowerName" value=""   />
                    <div class="tips"></div>
                </div>
            </div>


            <div class="form-group">

                <div class="label">
                    <label>借书时间：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="borrowedDate"  value="" data-validate="member:只能为数字" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>状态：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="status"  value=""  />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                </div>
            </div>
        </form>
    </div>
</div>

</body></html>
