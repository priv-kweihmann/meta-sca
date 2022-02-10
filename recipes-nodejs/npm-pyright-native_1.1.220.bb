SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.220.tgz"
SRC_URI[md5sum] = "d78fa2c799fd289d7b05fa76e6d12d6a"
SRC_URI[sha256sum] = "26d1ccbffd729d1c13fe3cb58193a9f5569b0e624e9feca1b4f872f601c3caef"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
