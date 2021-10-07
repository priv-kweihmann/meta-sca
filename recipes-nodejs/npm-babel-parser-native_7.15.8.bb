SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.15.8.tgz"
SRC_URI[md5sum] = "47237005eefc6ec9919a4d0b13440f33"
SRC_URI[sha256sum] = "6bf1683c2ad918952ef058cb4e455255ea801c1f081a2a7d2a9c6b70c6c7d119"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
