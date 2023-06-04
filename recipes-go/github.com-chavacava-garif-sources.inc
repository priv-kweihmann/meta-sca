SRC_URI += "https://proxy.golang.org/github.com/chavacava/garif/@v/v0.0.0-20230531072157-8144c224b063.zip;srcoutput=github.com/chavacava/garif;srcinput=github.com/chavacava/garif@v0.0.0-20230531072157-8144c224b063;downloadfilename=github-com-chavacava-garif-0.0.0-20230531072157-8144c224b063.zip;name=github-com-chavacava-garif"
SRC_URI[github-com-chavacava-garif.sha256sum] = "ae344644dfe4f3a47bb87d0e8331e8bc76aec45497cbe8d422db173c79da8219"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/chavacava/garif/LICENSE;md5=b85b57c8a1fee230bd17e413a28a5b88 \
"

GOSRC_INCLUDEGUARD += "github.com-chavacava-garif-sources.inc"

