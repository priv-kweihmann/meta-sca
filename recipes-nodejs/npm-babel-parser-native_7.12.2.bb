SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.12.2.tgz"
SRC_URI[md5sum] = "6e8288fb4604dd8b3f50b34e6d4990d4"
SRC_URI[sha256sum] = "e31a2a9a381bf35eca288dfa7663b63911c92c0788ad76436eaf829cf576cc55"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
