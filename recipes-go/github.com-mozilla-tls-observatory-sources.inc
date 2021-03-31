SRC_URI_append = " https://proxy.golang.org/github.com/mozilla/tls-observatory/@v/v0.0.0-20210209181001-cf43108d6880.zip;srcoutput=github.com/mozilla/tls-observatory;srcinput=github.com/mozilla/tls-observatory@v0.0.0-20210209181001-cf43108d6880;downloadfilename=github-com-mozilla-tls-observatory-0.0.0-20210209181001-cf43108d6880.zip;name=github-com-mozilla-tls-observatory"
SRC_URI[github-com-mozilla-tls-observatory.sha256sum] = "a3603a2de01eb79ff602ff464be418f224ff6b744bce64b3dfa8673cbf2287d2"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/mozilla/tls-observatory/LICENSE;md5=f27a50d2e878867827842f2c60e30bfc \
"
