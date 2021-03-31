SRC_URI_append = " https://proxy.golang.org/github.com/oklog/oklog/@v/v0.3.2.zip;srcoutput=github.com/oklog/oklog;srcinput=github.com/oklog/oklog@v0.3.2;downloadfilename=github-com-oklog-oklog-0.3.2.zip;name=github-com-oklog-oklog"
SRC_URI[github-com-oklog-oklog.sha256sum] = "b37d032de5b0dd5e96063c06b77fcb29a692a07bd52a4d99a361f2fef68822ec"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/oklog/oklog/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"
