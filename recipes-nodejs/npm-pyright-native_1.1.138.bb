SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.138.tgz"
SRC_URI[md5sum] = "d7703f300f098dc7cd028b1601bf98e6"
SRC_URI[sha256sum] = "787b71e721fedd5c928f9933021acaf50532246f555b462ffa116b66ea6a0832"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
