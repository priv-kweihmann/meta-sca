SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.13.11.tgz"
SRC_URI[md5sum] = "9e1075ab6637bef8086b24cdfde03236"
SRC_URI[sha256sum] = "253a861e1b74eb724355b8b229e738af884c4d836b2d43e9d00143175706bb1d"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
