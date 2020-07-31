SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.11.0.tgz"
SRC_URI[md5sum] = "6d8284b10d92937f4f38b70c74710a94"
SRC_URI[sha256sum] = "2eeddc436edbc197cfe862386b12c6f377fe8b4049ea1abab91d67357026c677"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
