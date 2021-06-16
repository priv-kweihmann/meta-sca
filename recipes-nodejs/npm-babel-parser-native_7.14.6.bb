SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.14.6.tgz"
SRC_URI[md5sum] = "c17f39d2e3a2d11c4ff1467cc959fd7d"
SRC_URI[sha256sum] = "94cfdc2d5718eadad662bedb96dc600313c32b18f39eadfbe75a7d38d84ef065"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
