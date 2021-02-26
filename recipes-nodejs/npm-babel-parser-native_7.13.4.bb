SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.13.4.tgz"
SRC_URI[md5sum] = "087b260980551e7cd7ae82b35af2cc89"
SRC_URI[sha256sum] = "32e33337a22dc2623160cdd21c5384c1d4d683ef4663a41313ff93fddeaac323"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
