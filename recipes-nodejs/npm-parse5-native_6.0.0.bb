SUMMARY = "NPM: parse5"
DESCRIPTION = "HTML parser and serializer."
HOMEPAGE = "https://github.com/inikulin/parse5"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=179850e04995d6fceaf64f2dd2a851b0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/parse5/-/parse5-6.0.0.tgz"
SRC_URI[md5sum] = "795eb161150c419f554693150fb71a19"
SRC_URI[sha256sum] = "30e170a586b0abbcb558199d239b80e8c21320175848d5538978ed47bbb6e377"

NPM_PKGNAME = "parse5"

inherit npmhelper
inherit native
