SUMMARY = "NPM: parse5-sax-parser"
DESCRIPTION = "Streaming SAX-style HTML parser."
HOMEPAGE = "https://github.com/inikulin/parse5"

DEPENDS = "npm-parse5-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=179850e04995d6fceaf64f2dd2a851b0"

SRC_URI = "https://registry.npmjs.org/parse5-sax-parser/-/parse5-sax-parser-5.1.1.tgz"
SRC_URI[md5sum] = "fb4b8575f3f0ae83c927a04dbc769873"
SRC_URI[sha256sum] = "983ce379022b10f617605dca5389f3ce062ad6c607f6e2d9e70847350e27ec50"

NPM_PKGNAME = "parse5-sax-parser"

inherit npmhelper
inherit native
