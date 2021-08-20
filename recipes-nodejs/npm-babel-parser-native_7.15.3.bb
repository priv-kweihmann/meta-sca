SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.15.3.tgz"
SRC_URI[md5sum] = "9f7728e4fe346b70a20527ad6405dde3"
SRC_URI[sha256sum] = "c9c8dd7a692c67ee0066d9f7501d77f705572012e684ab240010e445f51d0eb3"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
