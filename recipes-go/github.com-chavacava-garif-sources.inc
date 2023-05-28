SRC_URI += "https://proxy.golang.org/github.com/chavacava/garif/@v/v0.0.0-20230519080132-4752330f72df.zip;srcoutput=github.com/chavacava/garif;srcinput=github.com/chavacava/garif@v0.0.0-20230519080132-4752330f72df;downloadfilename=github-com-chavacava-garif-0.0.0-20230519080132-4752330f72df.zip;name=github-com-chavacava-garif"
SRC_URI[github-com-chavacava-garif.sha256sum] = "3fd289252a687a412e11f3b99670cb877740ecefa6555bc56c985a907fed58d3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/chavacava/garif/LICENSE;md5=b85b57c8a1fee230bd17e413a28a5b88 \
"

GOSRC_INCLUDEGUARD += "github.com-chavacava-garif-sources.inc"

