SRC_URI += "git://github.com/VividCortex/gohistogram;nobranch=1;protocol=https;srcinput=github.com/VividCortex/gohistogram;srcoutput=github.com/VividCortex/gohistogram;destsuffix=github.com/VividCortex/gohistogram;name=github-com-vividcortex-gohistogram"
SRCREV_github-com-vividcortex-gohistogram = "51564d9861991fb0ad0f531c99ef602d0f9866e6"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/VividCortex/gohistogram/LICENSE;md5=13880cf5821e7668762c89bb8a6045d3 \
"

GOSRC_INCLUDEGUARD += "github.com-vividcortex-gohistogram-sources.inc"

