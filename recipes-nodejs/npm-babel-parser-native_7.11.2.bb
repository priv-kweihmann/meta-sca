SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.11.2.tgz"
SRC_URI[md5sum] = "b4ad229c6efdb8b969e5bea999d31b4e"
SRC_URI[sha256sum] = "f48de2e26e231b89b3178fa702bb41c1155a03656d004025fe623d9b32dc350c"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
