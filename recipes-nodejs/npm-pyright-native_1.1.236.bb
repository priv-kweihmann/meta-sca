SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.236.tgz"
SRC_URI[md5sum] = "1269232ec51d90ab451865b979c8e527"
SRC_URI[sha256sum] = "9aa6d07d54874e6d0ff005dd56307cfc88fc53440e2339c1560d7ec126118d2b"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
