function showListCity() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/city",
        success: function (cities) {
            let content = ``
            for (let i = 0; i < cities.length; i++) {
                content += `<tr>
            <th scope="row">${cities[i].id}</th>
            <td>${cities[i].nameCity}</td>
            <td><a href="#">${cities[i].national.name}</a></td>
            <td><a href="#">Chỉnh sửa</a>|<a href="#">Xóa</a></td>
        </tr>`;
            }
            $("#showListCity").html(content);
        }
    })
}

function getNational() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/national",
        success: function (nationals) {
            let content = `<option selected disabled>Choose national...</option>`
            for (let i = 0; i < nationals.length; i++) {
                content += `<option value="${nationals[i].id}">${nationals[i].name}</option>`;
            }
            $("#getNational").html(content);
        }
    })
}
showListCity()
getNational();

