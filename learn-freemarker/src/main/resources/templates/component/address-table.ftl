<#macro addressTable addressList>
    <table class="table table-hover table-striped table-bordered table-responsive"
           id="address-table" style="width:100%">
        <thead>
        <tr>
            <th>国家</th>
            <th>城市</th>
        </tr>
        </thead>
        <tbody>
            <#list addressList as address>
            <tr>
                <td>${address.country}</td>
                <td>${address.city}</td>
            </tr>
            </#list>
        </tbody>
    </table>
</#macro>
