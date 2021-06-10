SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.14.5.tgz"
SRC_URI[md5sum] = "bde0b47ced3fd7e9b39ea4d5cb9908b7"
SRC_URI[sha256sum] = "6e9dfcf479d43782e5e7cbcb7f492cb383013dbcfa87260bf0b92c01ddab9bc3"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
