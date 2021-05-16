SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.14.2.tgz"
SRC_URI[md5sum] = "eb3cb82db737d9ed0e73351c274d5792"
SRC_URI[sha256sum] = "416610f1d610daa97aff1a6c5471087087b935f0981ff73dd95ee69f6370e0dc"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
