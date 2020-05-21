SUMMARY = "NPM: parse5-sax-parser"
DESCRIPTION = "Streaming SAX-style HTML parser."
HOMEPAGE = "https://github.com/inikulin/parse5"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=179850e04995d6fceaf64f2dd2a851b0"

DEPENDS = "npm-parse5-native"

SRC_URI = "https://registry.npmjs.org/parse5-sax-parser/-/parse5-sax-parser-6.0.0.tgz"
SRC_URI[md5sum] = "483142c7386a309297947aa12938aa44"
SRC_URI[sha256sum] = "0d1b7c098e86ca6532c605e30af6320403e9cb15a1715924cd0b06ac8f3817fd"

NPM_PKGNAME = "parse5-sax-parser"

inherit npmhelper
inherit native
