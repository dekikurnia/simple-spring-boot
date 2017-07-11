/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready (function() {
var table = $('#productsTable').DataTable({
                        buttons: ['excel', 'pdf'],
			"sAjaxSource": "/api/products",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"columns": [
			        { "mData": "id"},
                                { "mData": "name" },
				{ "mData": "price" },
				{ "mData": "productId" },
				{ "mData": "version" },
                                {"mRender": function (data) {
                                return '<a class="btn btn-primary">Edit</a> | \n\
                                <a class="btn btn-danger" onclick="javascript:return confirm(\'Anda yakin?\');">Delete</a>';
                                    }
                                }
			]
	 })
});

