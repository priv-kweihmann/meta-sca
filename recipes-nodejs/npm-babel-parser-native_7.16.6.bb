SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.16.6.tgz"
SRC_URI[md5sum] = "6455bb07d0a1d05017bd08b6093cbb69"
SRC_URI[sha256sum] = "abf98b153ea245b3450640ca6726c5be0cc0888d67ad5425adbd290ff54cdc38"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
