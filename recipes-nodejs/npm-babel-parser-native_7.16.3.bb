SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.16.3.tgz"
SRC_URI[md5sum] = "fdf3b430e9e877f1496ce3697f6ad2f2"
SRC_URI[sha256sum] = "3f204fcda98927c4f79d4228f6073e18dfab3184f26370e0629120ceea64a5b9"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
