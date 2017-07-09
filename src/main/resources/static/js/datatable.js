/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready (function() {
var table = $('#productsTable').DataTable({
			"sAjaxSource": "/products",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			        { "mData": "id"},
                                { "mData": "name" },
				{ "mData": "price" },
				{ "mData": "productId" },
				{ "mData": "version" }
			]
	 })
});

