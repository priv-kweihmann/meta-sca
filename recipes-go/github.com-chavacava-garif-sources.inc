SRC_URI += "https://proxy.golang.org/github.com/chavacava/garif/@v/v0.0.0-20230608123814-4bd63c2919ab.zip;srcoutput=github.com/chavacava/garif;srcinput=github.com/chavacava/garif@v0.0.0-20230608123814-4bd63c2919ab;downloadfilename=github-com-chavacava-garif-0.0.0-20230608123814-4bd63c2919ab.zip;name=github-com-chavacava-garif"
SRC_URI[github-com-chavacava-garif.sha256sum] = "3be9bb32fb9e1e43c94b3887924097b551b37ff13d07948e8ca716a375bddbc5"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/chavacava/garif/LICENSE;md5=b85b57c8a1fee230bd17e413a28a5b88 \
"

GOSRC_INCLUDEGUARD += "github.com-chavacava-garif-sources.inc"

