SRC_URI += "https://proxy.golang.org/github.com/cncf/udpa/go/@v/v0.0.0-20210930031921-04548b0d99d4.zip;srcoutput=github.com/cncf/udpa/go;srcinput=github.com/cncf/udpa/go@v0.0.0-20210930031921-04548b0d99d4;downloadfilename=github-com-cncf-udpa-go-0.0.0-20210930031921-04548b0d99d4.zip;name=github-com-cncf-udpa-go"
SRC_URI[github-com-cncf-udpa-go.sha256sum] = "a449fa94e58117a79c17577e39f72f695c4876f74cbd9142d512278192ca90aa"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cncf/udpa/go/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-cncf-udpa-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cncf-xds-go-sources.inc', '', 'github.com-cncf-xds-go-sources.inc', d)}
