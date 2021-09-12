SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.15.6.tgz"
SRC_URI[md5sum] = "3f7a2962252850d334b3fa9e6fb80c57"
SRC_URI[sha256sum] = "0319ba8356f6443a43c0813259713fe2784761d7ed19c491231cf372973d335e"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
