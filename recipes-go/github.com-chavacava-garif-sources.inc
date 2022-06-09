SRC_URI += "https://proxy.golang.org/github.com/chavacava/garif/@v/v0.0.0-20220608063557-908ad76c2c48.zip;srcoutput=github.com/chavacava/garif;srcinput=github.com/chavacava/garif@v0.0.0-20220608063557-908ad76c2c48;downloadfilename=github-com-chavacava-garif-0.0.0-20220608063557-908ad76c2c48.zip;name=github-com-chavacava-garif"
SRC_URI[github-com-chavacava-garif.sha256sum] = "0e8028e781af2e944a2f7b59401b24c8389463a9eb5ba36c6c4c6b235c790a53"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/chavacava/garif/LICENSE;md5=b85b57c8a1fee230bd17e413a28a5b88 \
"

GOSRC_INCLUDEGUARD += "github.com-chavacava-garif-sources.inc"

