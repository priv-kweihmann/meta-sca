SRC_URI += "https://proxy.golang.org/github.com/fatih/camelcase/@v/v1.0.0.zip;srcoutput=github.com/fatih/camelcase;srcinput=github.com/fatih/camelcase@v1.0.0;downloadfilename=github-com-fatih-camelcase-1.0.0.zip;name=github-com-fatih-camelcase"
SRC_URI[github-com-fatih-camelcase.sha256sum] = "54664f64f1f24097b80c64b9f606cbe8d8bc410a755ce6cda4f45e46f1141984"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fatih/camelcase/LICENSE.md;md5=4c59b216ce25dc182cdb837e07ba07c0 \
"

GOSRC_INCLUDEGUARD += "github.com-fatih-camelcase-sources.inc"

