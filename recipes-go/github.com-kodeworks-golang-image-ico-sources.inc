SRC_URI += "git://github.com/Kodeworks/golang-image-ico;branch=master;protocol=https;srcinput=github.com/Kodeworks/golang-image-ico;srcoutput=github.com/Kodeworks/golang-image-ico;destsuffix=github.com/Kodeworks/golang-image-ico;name=github-com-kodeworks-golang-image-ico"
SRCREV_github-com-kodeworks-golang-image-ico = "73f0f4cfade9008b7c0938a8224ececaa7733883"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Kodeworks/golang-image-ico/LICENSE;md5=591778525c869cdde0ab5a1bf283cd81 \
"

GOSRC_INCLUDEGUARD += "github.com-kodeworks-golang-image-ico-sources.inc"

