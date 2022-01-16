SRC_URI += "https://proxy.golang.org/github.com/cncf/udpa/go/@v/v0.0.0-20220112060539-c52dc94e7fbe.zip;srcoutput=github.com/cncf/udpa/go;srcinput=github.com/cncf/udpa/go@v0.0.0-20220112060539-c52dc94e7fbe;downloadfilename=github-com-cncf-udpa-go-0.0.0-20220112060539-c52dc94e7fbe.zip;name=github-com-cncf-udpa-go"
SRC_URI[github-com-cncf-udpa-go.sha256sum] = "8fe1585f25d40a5e3cd4243a92143d71ae4ee92e915e7192e72387047539438e"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cncf/udpa/go/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-cncf-udpa-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cncf-xds-go-sources.inc', '', 'github.com-cncf-xds-go-sources.inc', d)}
