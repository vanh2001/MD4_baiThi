function showListCity() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/city",
        success: function (cities) {
            let content = `<tr>
            <th scope="col">#</th>
            <th scope="col">Thành phố</th>
            <th scope="col">Quốc gia</th>
            <th scope="col" rowspan="2"></th>
        </tr>`
            for (let i = 0; i < cities.length; i++) {
                content += `<tr>
            <th scope="row">${cities[i].id}</th>
            <td>${cities[i].nameCity}</td>
            <td>${cities[i].id.name}</td>
            <td>Chỉnh sửa</td>
            <td>Xóa</td>
        </tr>`;
            }
            $("#showListCity").html(content);
        }
    })
}
showListCity();