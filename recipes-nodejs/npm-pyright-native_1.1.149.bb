SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.149.tgz"
SRC_URI[md5sum] = "0d7dacfbeeb8bbef8396e4708a46cefe"
SRC_URI[sha256sum] = "95a237be43577b2a9fdd2be8af6e819a50f1c726a506fdc20e23c1e0362ea5dd"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
