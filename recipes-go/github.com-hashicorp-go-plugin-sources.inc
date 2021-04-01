SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/go-plugin/@v/v1.4.0.zip;srcoutput=github.com/hashicorp/go-plugin;srcinput=github.com/hashicorp/go-plugin@v1.4.0;downloadfilename=github-com-hashicorp-go-plugin-1.4.0.zip;name=github-com-hashicorp-go-plugin"
SRC_URI[github-com-hashicorp-go-plugin.sha256sum] = "6006881b0591215e15b4484256075536418d0477ce67911c5fc31090de302bf5"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/go-plugin/LICENSE;md5=d44fdeb607e2d2614db9464dbedd4094 \
"
