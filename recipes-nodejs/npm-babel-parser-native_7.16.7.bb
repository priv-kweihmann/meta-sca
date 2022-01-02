SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.16.7.tgz"
SRC_URI[md5sum] = "a5f58a2f7b070c57ee322223280b3743"
SRC_URI[sha256sum] = "9ded7d0e58f217b325c6bc9269cd84b870981dea19c796562e9d92a014ddf1f3"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
