SRC_URI_append = " https://proxy.golang.org/github.com/hashicorp/go-syslog/@v/v1.0.0.zip;srcoutput=github.com/hashicorp/go-syslog;srcinput=github.com/hashicorp/go-syslog@v1.0.0;downloadfilename=github-com-hashicorp-go-syslog-1.0.0.zip;name=github-com-hashicorp-go-syslog"
SRC_URI[github-com-hashicorp-go-syslog.sha256sum] = "a0ca8b61ea365e9ecdca513b94f200aef3ff68b4c95d9dabc88ca25fcb33bce6"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/hashicorp/go-syslog/LICENSE;md5=cb04212e101fbbd028f325e04ad45778 \
"
