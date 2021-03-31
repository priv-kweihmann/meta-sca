SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/errwrap/@v/v1.1.0.zip;srcoutput=github.com/hashicorp/errwrap;srcinput=github.com/hashicorp/errwrap@v1.1.0;downloadfilename=github-com-hashicorp-errwrap-1.1.0.zip;name=github-com-hashicorp-errwrap"
SRC_URI[github-com-hashicorp-errwrap.sha256sum] = "209ae99bc039443e28e4d6bb66517d1756d9468b7578d31f1b63a28103d8e18c"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/errwrap/LICENSE;md5=b278a92d2c1509760384428817710378 \
"
