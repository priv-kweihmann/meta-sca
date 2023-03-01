SRC_URI += "https://proxy.golang.org/github.com/chavacava/garif/@v/v0.0.0-20230227094218-b8c73b2037b8.zip;srcoutput=github.com/chavacava/garif;srcinput=github.com/chavacava/garif@v0.0.0-20230227094218-b8c73b2037b8;downloadfilename=github-com-chavacava-garif-0.0.0-20230227094218-b8c73b2037b8.zip;name=github-com-chavacava-garif"
SRC_URI[github-com-chavacava-garif.sha256sum] = "2641509e43d7a1228858cdf491da10b3766855add1605dbd1dbb636e3da2a17d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/chavacava/garif/LICENSE;md5=b85b57c8a1fee230bd17e413a28a5b88 \
"

GOSRC_INCLUDEGUARD += "github.com-chavacava-garif-sources.inc"

