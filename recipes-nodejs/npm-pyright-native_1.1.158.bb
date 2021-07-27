SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.158.tgz"
SRC_URI[md5sum] = "2dee6f232b1374cebf126d7c0cbdf92f"
SRC_URI[sha256sum] = "9f5ffc52bb542ff21772f2a0b738c193984e39ff91b392bd4186f6ba7dc6d51c"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
