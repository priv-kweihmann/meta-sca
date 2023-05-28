SRC_URI += "git://github.com/JohnCGriffin/overflow;nobranch=1;protocol=https;srcinput=github.com/JohnCGriffin/overflow;srcoutput=github.com/JohnCGriffin/overflow;destsuffix=github.com/JohnCGriffin/overflow;name=github-com-johncgriffin-overflow"
SRCREV_github-com-johncgriffin-overflow = "46fa312c352cdb9517817d04f2067d49f418e332"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/JohnCGriffin/overflow/README.md;md5=09fca7b6490a30b237b1381424f65678 \
"

GOSRC_INCLUDEGUARD += "github.com-johncgriffin-overflow-sources.inc"

