SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.164.tgz"
SRC_URI[md5sum] = "5a1712914f638dedf192c8b8a5cc3f34"
SRC_URI[sha256sum] = "eca2b6a0600461089ab49efd14af94ebdeb1b47e7b1e487b54fe7bc598f07163"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
