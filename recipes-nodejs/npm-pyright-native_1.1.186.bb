SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.186.tgz"
SRC_URI[md5sum] = "ac4c6f7e2d22021faeeab0c4693aa55f"
SRC_URI[sha256sum] = "4a954369f2e3b7bd5bee6edeeb5b9d52b727ac9f0bece07b921e9ff182264c84"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
