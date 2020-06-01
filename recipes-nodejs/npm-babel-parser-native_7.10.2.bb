SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.10.2.tgz"
SRC_URI[md5sum] = "f0b0030e88cfe39b0814d17a0e686089"
SRC_URI[sha256sum] = "e0cac2d571239053e2ad8bcdae385ec82bced42d59b1c0dcac5ce985b1573f30"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
