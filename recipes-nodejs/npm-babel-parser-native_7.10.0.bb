SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.10.0.tgz"
SRC_URI[md5sum] = "d841b0f471b8eeb1757332f450cbcbdb"
SRC_URI[sha256sum] = "edeb43718a0207bd680226272e138036b367d5e211591f0b49e03b19c4356588"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
