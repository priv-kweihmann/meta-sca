SRC_URI += "https://proxy.golang.org/github.com/chavacava/garif/@v/v0.0.0-20220316182200-5cad0b5181d4.zip;srcoutput=github.com/chavacava/garif;srcinput=github.com/chavacava/garif@v0.0.0-20220316182200-5cad0b5181d4;downloadfilename=github-com-chavacava-garif-0.0.0-20220316182200-5cad0b5181d4.zip;name=github-com-chavacava-garif"
SRC_URI[github-com-chavacava-garif.sha256sum] = "d1600ff7a3a94e9feda5088300d3e5812f9d63112f8d8f00cede416ccc2b8ba9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/chavacava/garif/LICENSE;md5=b85b57c8a1fee230bd17e413a28a5b88 \
"

GOSRC_INCLUDEGUARD += "github.com-chavacava-garif-sources.inc"

