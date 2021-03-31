SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/golang-lru/@v/v0.5.4.zip;srcoutput=github.com/hashicorp/golang-lru;srcinput=github.com/hashicorp/golang-lru@v0.5.4;downloadfilename=github-com-hashicorp-golang-lru-0.5.4.zip;name=github-com-hashicorp-golang-lru"
SRC_URI[github-com-hashicorp-golang-lru.sha256sum] = "7b2a8b1739c858727fca497a6415323edb801dc97b8aca04f7bac4ab9fb5c66b"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/golang-lru/LICENSE;md5=f27a50d2e878867827842f2c60e30bfc \
"
