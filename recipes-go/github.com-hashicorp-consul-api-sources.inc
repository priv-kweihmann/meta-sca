SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/consul/api/@v/v1.8.1.zip;srcoutput=github.com/hashicorp/consul/api;srcinput=github.com/hashicorp/consul/api@v1.8.1;downloadfilename=github-com-hashicorp-consul-api-1.8.1.zip;name=github-com-hashicorp-consul-api"
SRC_URI[github-com-hashicorp-consul-api.sha256sum] = "ab5c9310e7acaeddfd87f5e770a4f2760183fa0400f370a390d0880a8e22adeb"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/consul/api/LICENSE;md5=b278a92d2c1509760384428817710378 \
"
