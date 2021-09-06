SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.15.5.tgz"
SRC_URI[md5sum] = "79f84701f598bcb2b817b0be22435077"
SRC_URI[sha256sum] = "a19cc7a13dce2a64ef5f7f23b464585bf6eb586b274d39243fdf27314f16063a"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
