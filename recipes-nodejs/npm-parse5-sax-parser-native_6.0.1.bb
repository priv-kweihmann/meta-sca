SUMMARY = "NPM: parse5-sax-parser"
DESCRIPTION = "Streaming SAX-style HTML parser."
HOMEPAGE = "https://github.com/inikulin/parse5"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=179850e04995d6fceaf64f2dd2a851b0"

DEPENDS = "npm-parse5-native"

SRC_URI = "https://registry.npmjs.org/parse5-sax-parser/-/parse5-sax-parser-6.0.1.tgz"
SRC_URI[md5sum] = "bdfb8a2dfad0f8b0a0facb065be4d180"
SRC_URI[sha256sum] = "6d2bb9a1d2b51d39885e3c9b2ed3590213955ed214468068f371a31fd3bbc73b"

NPM_PKGNAME = "parse5-sax-parser"

inherit npmhelper
inherit native
