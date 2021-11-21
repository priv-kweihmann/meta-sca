SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.16.4.tgz"
SRC_URI[md5sum] = "63c2d4f193734afa426b854455674f80"
SRC_URI[sha256sum] = "2621c37c23c6af2c7f480f8a2f8d522e8e6eed9988c9e831019ee38c8a166fbf"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
