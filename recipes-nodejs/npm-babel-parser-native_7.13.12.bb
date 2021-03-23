SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.13.12.tgz"
SRC_URI[md5sum] = "6c055dc0c4ffe901fb6ae219c76f48e5"
SRC_URI[sha256sum] = "4ca701f9f26672eecf340294bb8f2dbe7bb34445951225537ca0c7030d39eb36"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
