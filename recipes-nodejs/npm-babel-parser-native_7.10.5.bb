SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.10.5.tgz"
SRC_URI[md5sum] = "be3eb8a504f5b70ab0dc65a96506354c"
SRC_URI[sha256sum] = "2d84996c268806258b72e330d60067fcf5550fde3a5eb42b27141073c1d83354"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
