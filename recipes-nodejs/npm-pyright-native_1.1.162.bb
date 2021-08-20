SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.162.tgz"
SRC_URI[md5sum] = "cb0e37da431d8e7c7fae736883b9af5e"
SRC_URI[sha256sum] = "626019b9857978f948b951b854e0e830c237ac88a6fa2136e594158f54b295e6"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
