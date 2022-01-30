SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.216.tgz"
SRC_URI[md5sum] = "ef4fcb93f2d50bf70a828d97888fc96e"
SRC_URI[sha256sum] = "c8e01c228b8066557a5770d21ddab2a28397fcd2c0c6dca0153a6ee9b7c78b17"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
