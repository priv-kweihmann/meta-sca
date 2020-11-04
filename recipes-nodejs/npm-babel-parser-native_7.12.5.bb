SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.12.5.tgz"
SRC_URI[md5sum] = "212080b3e927fa8e77b6b657c13fa8a1"
SRC_URI[sha256sum] = "35c38c5c40ad10f759c4675d1331fd6866916cacabb54bd1919bd35cbcc80cf2"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
