SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.10.1.tgz"
SRC_URI[md5sum] = "a8eb1ded35a57a6c78559de08465e7bf"
SRC_URI[sha256sum] = "6635ce7cbddf4e3a0c00d74dface19ee6f394ced5149de8b930de52c2faa2acc"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
