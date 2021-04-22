SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.13.16.tgz"
SRC_URI[md5sum] = "25ea9013612fac0c6abcb1e97f9608bd"
SRC_URI[sha256sum] = "33df5f7ac0818aa85ed744ef97acf14a2e91b5e3fa0e8f5021110af00aba16fc"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
