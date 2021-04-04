SRC_URI += "https://proxy.golang.org/github.com/felixge/httpsnoop/@v/v1.0.1.zip;srcoutput=github.com/felixge/httpsnoop;srcinput=github.com/felixge/httpsnoop@v1.0.1;downloadfilename=github-com-felixge-httpsnoop-1.0.1.zip;name=github-com-felixge-httpsnoop"
SRC_URI[github-com-felixge-httpsnoop.sha256sum] = "dc0c57cc57f116de113c320cffcbc61fa437d19a729deec373cce786dd89a029"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/felixge/httpsnoop/LICENSE.txt;md5=684da2bf3eed8fc8860e75ad84638225 \
"

GOSRC_INCLUDEGUARD += "github.com-felixge-httpsnoop-sources.inc"

