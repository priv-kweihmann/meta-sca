SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/go-hclog/@v/v0.15.0.zip;srcoutput=github.com/hashicorp/go-hclog;srcinput=github.com/hashicorp/go-hclog@v0.15.0;downloadfilename=github-com-hashicorp-go-hclog-0.15.0.zip;name=github-com-hashicorp-go-hclog"
SRC_URI[github-com-hashicorp-go-hclog.sha256sum] = "f00cde8e35434e1dbcb06d2d2a4d08406ea89c1c30ef35ee02f4e1e15250d1ad"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/go-hclog/LICENSE;md5=ec7f605b74b9ad03347d0a93a5cc7eb8 \
"
