SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.156.tgz"
SRC_URI[md5sum] = "f695664db2db330787b778f1fd79366c"
SRC_URI[sha256sum] = "07e15e9247180ea66f746fb30610ef4b0eccf0167b0860e8df42f7dc034df948"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
