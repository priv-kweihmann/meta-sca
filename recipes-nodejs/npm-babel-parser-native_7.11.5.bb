SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.11.5.tgz"
SRC_URI[md5sum] = "b2cc6bb320c2910e5901e72874c87900"
SRC_URI[sha256sum] = "f6f92dafd9ebbd7e56ad0babb73e669f7ccb2354118e7d7f3b5c126250ec1f72"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
