<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add voucher</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.css'/>"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
    <div class="container col-sm-6">
        <h3>Add voucher</h3>
        <form name="voucher" action="" method="POST">
        
            <div class="form-group">
                <label>Name</label><@spring.formInput "voucherForm.fullName" "class='form-control'" "text"/>
            </div>
            <div class="form-group">
                <label>Phone</label><@spring.formInput "voucherForm.cellPhone" "class='form-control'" "text"/>
            </div>
            <div class="form-group">
                <label>Town</label><@spring.formInput "voucherForm.town" "class='form-control'" "text"/>
            </div>
            <div class="form-group">
                <label>Address</label><@spring.formInput "voucherForm.address" "class='form-control'" "text"/>
            </div>
            <div class="form-group">
                <label>Gender</label><@spring.formInput "voucherForm.gender" "class='form-control'" "text"/>
            </div>
            <div class="form-group">
                <label>Birthday</label><@spring.formInput "voucherForm.dateOfBirth" "class='form-control'" "text"/>
            </div>
            <div class="form-group">
                <label>Desc</label><@spring.formInput "voucherForm.desc" "class='form-control'" "text"/>
            </div>
            <div class="form-group">
                <label>Agency</label><@spring.formInput "voucherForm.agency" "class='form-control'" "text"/>
            </div>
            <div class="form-group">
                <label>From</label><@spring.formInput "voucherForm.from" "class='form-control'" "text"/>
            </div>
            <div class="form-group">
                <label>To</label><@spring.formInput "voucherForm.to" "class='form-control'" "text"/>
            </div>
            <div class="form-group">
                <label>Процедури</label><@spring.formInput "voucherForm.procedures" "class='form-control'" "text"/>
            </div>
            <div class="form-group">
                <label>Харчування</label><@spring.formInput "voucherForm.food" "class='form-control'" "text"/>
            </div>
            
            <a href="/web/voucher/get/list" type="button" class="btn btn-secondary">
                <i class="fa fa-chevron-circle-left"></i>До таблиці
            </a>
            <button type="submit" class="btn btn-primary float-right">Вiдправити</button>
        </form>
        
    </div>
</body>
</html>
