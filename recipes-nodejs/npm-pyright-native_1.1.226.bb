SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.226.tgz"
SRC_URI[md5sum] = "0ac972bfdb5d8fe113382cd69483d227"
SRC_URI[sha256sum] = "b2e1dfa344bcaa5d47ff1bd4582bcacece906775d8eff8842a2e70c4d6ee4c26"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
