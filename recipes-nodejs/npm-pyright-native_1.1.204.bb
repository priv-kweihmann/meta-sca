SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.204.tgz"
SRC_URI[md5sum] = "3348d5de31d348cc657c7839f1ba4bd8"
SRC_URI[sha256sum] = "0b177206790a49e933abbc93aab8a5aa04b061dbbcebbda663949a7efb4cf83f"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
