<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add voucher</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" Type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div class="container">
    <legend>Add voucher</legend>
    <form name="voucher" action="" method="POST">
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Name:</span>
            </div>
            <@spring.formInput "voucherForm.fullName" "class='form-control'" "text"/>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Phone:</span>
            </div>
            <@spring.formInput "voucherForm.cellPhone" "class='form-control'" "text"/>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Town:</span>
            </div>
            <@spring.formInput "voucherForm.town" "class='form-control'" "text"/>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Address:</span>
            </div>
            <@spring.formInput "voucherForm.address" "class='form-control'" "text"/>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Gender:</span>
            </div>
            <@spring.formSingleSelect "voucherForm.gender", Gender, "class='form-control'"/>
        </div>

        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Birthday:</span>
            </div>
            <@spring.formInput "voucherForm.dateOfBirth" "class='form-control' readonly  width='276'" "text"/>
            <script>
                $('#dateOfBirth').datepicker({uiLibrary: 'bootstrap4'});
            </script>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Desc:</span>
            </div>
            <@spring.formInput "voucherForm.desc" "class='form-control'" "text"/>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Agency:</span>
            </div>
            <@spring.formInput "voucherForm.agency" "class='form-control'" "text"/>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">From:</span>
            </div>
            <@spring.formInput "voucherForm.from" "class='form-control' readonly  width='276'" "text"/>
            <script>
                $('#from').datepicker({uiLibrary: 'bootstrap4'});
            </script>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">To:</span>
            </div>
            <@spring.formInput "voucherForm.to" "class='form-control' readonly  width='276'" "text"/>
            <script>
                $('#to').datepicker({uiLibrary: 'bootstrap4'});
            </script>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Процедури:</span>
            </div>
            <@spring.formSingleSelect "voucherForm.procedures", Procedures, "class='form-control'"/>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Hotel:</span>
            </div>
            <@spring.formSingleSelect "voucherForm.hotel", Hotel, "class='form-control'"/>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Харчування:</span>
            </div>
            <@spring.formSingleSelect "voucherForm.food", Food, "class='form-control'"/>
        </div>

        <a href="/web/voucher/get/list" type="button" class="btn btn-secondary">
            <i class="fa fa-chevron-circle-left"></i>До таблиці
        </a>
        <button type="submit" class="btn btn-primary float-right">Вiдправити</button>
    </form>

</div>
</body>
</html>
