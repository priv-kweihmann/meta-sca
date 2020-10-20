SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.12.3.tgz"
SRC_URI[md5sum] = "4552a87997b2efec73853ffe92f3def1"
SRC_URI[sha256sum] = "6f96391798705b7c71d080669ff5be8daecd414971e5936ebe3311775b2a938e"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
