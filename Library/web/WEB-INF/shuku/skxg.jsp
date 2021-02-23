<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2020/12/29
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<html lang="zh-cn">
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
    <script type="text/javascript" src="../../js/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="../../js/jquery-migrate-1.2.1.js"></script>

    <script>


        function ok() {
            var bookNumber = $("#bookNumber");
            var bookName = $("#bookName");
            var author = $("#author");
            var publisher = $("#publisher");
            var bookType = $("#bookType");

                location.href="updateBook.action?bookNumber="+bookNumber.val()+"&bookName"+bookName.val()+"&author"+author.val()+"&publisher"+publisher.val()+"&bookType"+bookType.val();

        }
    </script>
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>修改内容</strong></div>
    <div class="body-content">
        <form method="get" class="form-x" action="updateBook.action">
            <div class="form-group">
                <div class="label">
                    <label>书号</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" value="${book.bookNumber}" name="bookNumber" id="bookNumber" data-validate="required:请输入ID" />
                    <div class="tips"></div>
                </div>
            </div>

            <div class="clear"></div>

            <div class="form-group">
                <div class="label">
                    <label>图书名称：</label>
                </div>
                <div class="field">
                    <script src="js/laydate/laydate.js"></script>
                    <input type="text" class="input w50" name="bookName"id="bookName" value="${book.bookName}"  />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>作者：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="author" id="author"value="${book.author}"  />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>出版社：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="publisher"id="publisher" value="${book.publisher}" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>图书分类：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="bookType"id="bookType" value="${book.bookType}" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <input type="submit"  value="修改 ">
                    <button class="button bg-main icon-check-square-o" onclick="ok()" type="submit"> 提交</button>

                </div>
            </div>
        </form>
    </div>
</div>

</body></html>
