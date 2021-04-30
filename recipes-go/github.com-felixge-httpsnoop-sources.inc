SRC_URI += "https://proxy.golang.org/github.com/felixge/httpsnoop/@v/v1.0.2.zip;srcoutput=github.com/felixge/httpsnoop;srcinput=github.com/felixge/httpsnoop@v1.0.2;downloadfilename=github-com-felixge-httpsnoop-1.0.2.zip;name=github-com-felixge-httpsnoop"
SRC_URI[github-com-felixge-httpsnoop.sha256sum] = "b345e22aa5ff8c496e6c5b8aed355ac47eb3ce631361782065e0cfdcab1b54ac"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/felixge/httpsnoop/LICENSE.txt;md5=684da2bf3eed8fc8860e75ad84638225 \
"

GOSRC_INCLUDEGUARD += "github.com-felixge-httpsnoop-sources.inc"

