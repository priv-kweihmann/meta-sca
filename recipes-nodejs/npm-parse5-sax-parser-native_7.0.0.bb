SUMMARY = "NPM: parse5-sax-parser"
DESCRIPTION = "Streaming SAX-style HTML parser."
HOMEPAGE = "https://github.com/inikulin/parse5"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=179850e04995d6fceaf64f2dd2a851b0"

DEPENDS = "npm-parse5-native"

SRC_URI = "https://registry.npmjs.org/parse5-sax-parser/-/parse5-sax-parser-7.0.0.tgz"
SRC_URI[md5sum] = "34b56e2ffb67f7a2a21a950e529b0cab"
SRC_URI[sha256sum] = "72714fc9c1ceda8fdc36bbc572254a7a2f982ec456d36b4d4cf0c67d30556d51"

NPM_PKGNAME = "parse5-sax-parser"

inherit npmhelper
inherit native
