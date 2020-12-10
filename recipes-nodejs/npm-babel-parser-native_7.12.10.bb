SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.12.10.tgz"
SRC_URI[md5sum] = "a724e919e23f690263e9aaeb030bf23a"
SRC_URI[sha256sum] = "2a3c121b1674961d8a9bb5327ce32a73730490e42f2c65ce0b3b78913beb03f7"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
