SRC_URI += "https://proxy.golang.org/github.com/chavacava/garif/@v/v0.0.0-20220624065725-d6fd61e6a499.zip;srcoutput=github.com/chavacava/garif;srcinput=github.com/chavacava/garif@v0.0.0-20220624065725-d6fd61e6a499;downloadfilename=github-com-chavacava-garif-0.0.0-20220624065725-d6fd61e6a499.zip;name=github-com-chavacava-garif"
SRC_URI[github-com-chavacava-garif.sha256sum] = "0f1a4de1cbebd263938138d3f012b405d5d429d9da02d76ff325c54809169c6b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/chavacava/garif/LICENSE;md5=b85b57c8a1fee230bd17e413a28a5b88 \
"

GOSRC_INCLUDEGUARD += "github.com-chavacava-garif-sources.inc"

