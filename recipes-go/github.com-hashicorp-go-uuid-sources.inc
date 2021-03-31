SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/go-uuid/@v/v1.0.2.zip;srcoutput=github.com/hashicorp/go-uuid;srcinput=github.com/hashicorp/go-uuid@v1.0.2;downloadfilename=github-com-hashicorp-go-uuid-1.0.2.zip;name=github-com-hashicorp-go-uuid"
SRC_URI[github-com-hashicorp-go-uuid.sha256sum] = "30e419ebb4658e789be8ef1f5629faccc15d6571c6914a51afdcbaf74a5862b8"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/go-uuid/LICENSE;md5=65d26fcc2f35ea6a181ac777e42db1ea \
"
