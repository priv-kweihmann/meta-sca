SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/go-multierror/@v/v1.1.1.zip;srcoutput=github.com/hashicorp/go-multierror;srcinput=github.com/hashicorp/go-multierror@v1.1.1;downloadfilename=github-com-hashicorp-go-multierror-1.1.1.zip;name=github-com-hashicorp-go-multierror"
SRC_URI[github-com-hashicorp-go-multierror.sha256sum] = "972cd841ee51fdeac69c5a301e57f8ea27aebf15fddd7f621d5c240f28c3000c"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/go-multierror/LICENSE;md5=d44fdeb607e2d2614db9464dbedd4094 \
"
