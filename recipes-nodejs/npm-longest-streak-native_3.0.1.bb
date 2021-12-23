SUMMARY = "NPM: longest-streak"
DESCRIPTION = "Count the longest repeating streak of a character"
HOMEPAGE = "https://github.com/wooorm/longest-streak#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/longest-streak/-/longest-streak-3.0.1.tgz"
SRC_URI[md5sum] = "1e57fc901c9b53ab162dbff1a9213cf1"
SRC_URI[sha256sum] = "180bf171d7f1915d3b97833dbd42cdd63a1eab25a692be60196ae95077cf2980"

NPM_PKGNAME = "longest-streak"

inherit npmhelper
inherit native
