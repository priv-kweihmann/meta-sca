SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.14.0.tgz"
SRC_URI[md5sum] = "2e8a368cb39a98a251c3a680b128c60f"
SRC_URI[sha256sum] = "b5dc5970f2afa63a3fab20d5ef3100e7074088cddfa1b85eb92b5e667fb8814a"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
