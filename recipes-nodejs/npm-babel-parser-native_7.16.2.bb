SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.16.2.tgz"
SRC_URI[md5sum] = "ac277dd6b5a6ddb5677a8d49b9cbef79"
SRC_URI[sha256sum] = "63d29b3865854255130558428cc12ac1a0b34e59c67a050d47b424804f13994f"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
