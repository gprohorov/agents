<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>People List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="container-fluid">
    <br>
    <h3>Agencies</h3>

    <br>

    <a href="/" type="button" class="btn btn-light" style="float:left; margin-top:5px;"><i class="fa fa-chevron-circle-left"></i>На головну</a>

    <a href="" type="button" class="btn btn-light" style="float:right; margin-top:5px;"><i class="fa fa-plus-square-o"></i>Створити нову</a>

    <br>

    <div>
        <table class="table table-sm table-striped table-bordered">
            <tr class="thead-dark">

                <th scope="col">Назва</th>
                <th scope="col">Адреса</th>
                <th scope="col">Телефон</th>
                <th scope="col">Контактна особа</th>
                <th scope="col">Статус</th>
                <th scope="col">Видалити</th>
                <th scope="col">Редагувати</th>
                <th scope="col">Баланс</th>
            </tr>
            <#list agencies as agency>
                <tr>

                    <td>${agency.name}</td>
                    <td>${agency.address}</td>
                    <td>${agency.telephone}</td>
                    <td>${agency.contactPerson}</td>
                    <td>${agency.status}</td>
                    <td><a href="" type="button" class="btn btn-outline-danger" onclick="return confirm('Are you sure you want to delete ?');"><i class="fa fa-trash"></i></a></td>
                    <td><a href="" type="button" class="btn btn-light" ><i class="fa fa-edit"></i>Edit</a></td>
                    <td><a href="" type="button" class="btn btn-light" ><i class="fa fa-edit"></i>Баланс</a></td>
                </tr>
            </#list>

        </table>
    </div>

</div>
</body>
</html>
