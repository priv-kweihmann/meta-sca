SRC_URI += "https://proxy.golang.org/github.com/chavacava/garif/@v/v0.0.0-20210405164556-e8a0a408d6af.zip;srcoutput=github.com/chavacava/garif;srcinput=github.com/chavacava/garif@v0.0.0-20210405164556-e8a0a408d6af;downloadfilename=github-com-chavacava-garif-0.0.0-20210405164556-e8a0a408d6af.zip;name=github-com-chavacava-garif"
SRC_URI[github-com-chavacava-garif.sha256sum] = "758dc4a8e5889f844d4bb54f4b09e8401a363a2e28b4d6497b79ba05c0cdb467"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/chavacava/garif/LICENSE;md5=b85b57c8a1fee230bd17e413a28a5b88 \
"

GOSRC_INCLUDEGUARD += "github.com-chavacava-garif-sources.inc"

