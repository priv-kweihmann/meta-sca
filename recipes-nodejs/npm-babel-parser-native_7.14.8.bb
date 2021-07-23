SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.14.8.tgz"
SRC_URI[md5sum] = "a204f95f85381132c79ec95fadcb970f"
SRC_URI[sha256sum] = "65b8f14ce2c9fa2a04298a68d79315f8ae9c1f6ef78fb4405db77aef45bfb8e4"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
