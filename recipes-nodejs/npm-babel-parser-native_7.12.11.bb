SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.12.11.tgz"
SRC_URI[md5sum] = "027c231c7c408b673c369c1fff99ae94"
SRC_URI[sha256sum] = "c9af61bf4d6907e9d2c31041374ae448c922e08ac0acdbe50a179cc484bac6d6"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
