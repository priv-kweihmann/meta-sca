SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.13.13.tgz"
SRC_URI[md5sum] = "e99bd7e67a526479307ff2f9cd60dfe5"
SRC_URI[sha256sum] = "65d547625953153344a7638d488797a21b99b0b27906233f742063d46dde8f2b"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
