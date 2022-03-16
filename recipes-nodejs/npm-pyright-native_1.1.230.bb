SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.230.tgz"
SRC_URI[md5sum] = "25d4a4bec880743f12e0aff70f6b01e6"
SRC_URI[sha256sum] = "ac8640fc5beebdcd4f4d152eeb576019c836b39c5a7059de8fca9c2b90c052a9"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
