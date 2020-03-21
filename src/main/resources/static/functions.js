function OnDelete(id) {
    console.log(id);
    swal({
        title: "Are you sure?",
        text: "Once deleted, you will not be able to recover this record!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
        if (OK) {
            $.ajax({
                url:"/delete/"+id,
                success: function(res) {
                    console.log(res);
                },
            });
            swal("The record has been successfully deleted!", {
                icon: "success",
            }).then((ok)=>{
                if(ok){
                    location.href="/";
                }
            });
        }
    });
}