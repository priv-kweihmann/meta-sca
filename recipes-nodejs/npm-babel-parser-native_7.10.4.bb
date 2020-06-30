SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.10.4.tgz"
SRC_URI[md5sum] = "38db5a09917b118a7c1b34dc3ff9e1c3"
SRC_URI[sha256sum] = "6c06ca2174f3e25004887e492c43eb3c805dcadf5b4fb998a60eed3d09b215a9"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
