SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.14.7.tgz"
SRC_URI[md5sum] = "96fe7085485a5c8c1759b241668f73c0"
SRC_URI[sha256sum] = "9cea06854a7b9240bb00bb06e831c7034df690bd67b0d78e2082b50b732c9a71"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
