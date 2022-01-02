SRC_URI += "git://github.com/pierrec/lz4;nobranch=1;protocol=https;srcinput=github.com/pierrec/lz4;srcoutput=github.com/pierrec/lz4;destsuffix=github.com/pierrec/lz4;name=github-com-pierrec-lz4"
SRCREV_github-com-pierrec-lz4 = "a134e63e138e8dcef0be0a90bb586bccf4e99651"
GOSRC_REMOVEDIRS += "github.com/pierrec/lz4/cmd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pierrec/lz4/LICENSE;md5=09ece85f3c312a63b522bfc6ebd44943 \
"

GOSRC_INCLUDEGUARD += "github.com-pierrec-lz4-sources.inc"

