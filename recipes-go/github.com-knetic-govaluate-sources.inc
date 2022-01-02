SRC_URI += "git://github.com/Knetic/govaluate;nobranch=1;protocol=https;srcinput=github.com/Knetic/govaluate;srcoutput=github.com/Knetic/govaluate;destsuffix=github.com/Knetic/govaluate;name=github-com-knetic-govaluate"
SRCREV_github-com-knetic-govaluate = "d216395917cc49052c7c7094cf57f09657ca08a8"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Knetic/govaluate/LICENSE;md5=bf6ae48cca7d6fb204c6aa2c46743baa \
"

GOSRC_INCLUDEGUARD += "github.com-knetic-govaluate-sources.inc"

