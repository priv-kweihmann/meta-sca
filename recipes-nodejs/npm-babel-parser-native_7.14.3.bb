SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.14.3.tgz"
SRC_URI[md5sum] = "6b1ef3ee88a941e419bc771e379f79e9"
SRC_URI[sha256sum] = "d11882a600fbbc8faba72da4a7c608d97556526b49089c051fbc58420ba118e1"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
