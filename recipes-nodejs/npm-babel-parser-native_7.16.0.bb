SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.16.0.tgz"
SRC_URI[md5sum] = "12266e6c20733fece29c50cc3c304532"
SRC_URI[sha256sum] = "ec10062be52524038377882a4c03953ebcaaa3b220ab06f6ee4447c920a96e9c"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
