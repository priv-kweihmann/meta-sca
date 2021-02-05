SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.12.15.tgz"
SRC_URI[md5sum] = "b7e4f27adff667c8620b782d830ff67e"
SRC_URI[sha256sum] = "595352d36e4503d24006ed465d77601e206eaefe0e0ad1cbf5e015323f028890"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
