SRC_URI += "https://proxy.golang.org/github.com/chavacava/garif/@v/v0.0.0-20220630083739-93517212f375.zip;srcoutput=github.com/chavacava/garif;srcinput=github.com/chavacava/garif@v0.0.0-20220630083739-93517212f375;downloadfilename=github-com-chavacava-garif-0.0.0-20220630083739-93517212f375.zip;name=github-com-chavacava-garif"
SRC_URI[github-com-chavacava-garif.sha256sum] = "7b7668b4a486c46273354e8b89e17758b5b7ced3513d564720fb940e384beca8"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/chavacava/garif/LICENSE;md5=b85b57c8a1fee230bd17e413a28a5b88 \
"

GOSRC_INCLUDEGUARD += "github.com-chavacava-garif-sources.inc"

