SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.14.9.tgz"
SRC_URI[md5sum] = "b44bf5bef4fbd7d78ac3cfb025e4b559"
SRC_URI[sha256sum] = "3199ac59eb494ec15218d96d05fdbada2d557c48e788603260e93e46227fd6ee"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
