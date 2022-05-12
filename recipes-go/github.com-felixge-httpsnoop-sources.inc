SRC_URI += "https://proxy.golang.org/github.com/felixge/httpsnoop/@v/v1.0.3.zip;srcoutput=github.com/felixge/httpsnoop;srcinput=github.com/felixge/httpsnoop@v1.0.3;downloadfilename=github-com-felixge-httpsnoop-1.0.3.zip;name=github-com-felixge-httpsnoop"
SRC_URI[github-com-felixge-httpsnoop.sha256sum] = "e4b47cd34715551d36b72db0810a4bed78495a58360499c78de9e22b2c9db9e9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/felixge/httpsnoop/LICENSE.txt;md5=684da2bf3eed8fc8860e75ad84638225 \
"

GOSRC_INCLUDEGUARD += "github.com-felixge-httpsnoop-sources.inc"

