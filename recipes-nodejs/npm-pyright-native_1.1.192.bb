SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.192.tgz"
SRC_URI[md5sum] = "9ea7d941b0f819ee878a790a7ce093ac"
SRC_URI[sha256sum] = "2a5263027007475e7ef4ccc39a100d712ba833a18b680ceb7c35d341907a3be3"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
