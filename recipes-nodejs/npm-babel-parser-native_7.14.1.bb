SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.14.1.tgz"
SRC_URI[md5sum] = "b30d2b0289191f3edaa9f7dd3bae061d"
SRC_URI[sha256sum] = "ebe92220430d35e5d3deea1a219b5f1b544e50dee09c4449b6737bdc6d4d3183"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
