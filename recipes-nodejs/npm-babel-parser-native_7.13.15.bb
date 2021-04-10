SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.13.15.tgz"
SRC_URI[md5sum] = "bd8a88ddbb5aa7aa5cd5ae23a5d6041c"
SRC_URI[sha256sum] = "fb0f38991c96bb55e4de10f0883132f956dcd49a41038f18a36ce23c052b7886"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
