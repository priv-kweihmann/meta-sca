SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.39.tgz"
SRC_URI[md5sum] = "09d2f35e656cb76f331d843a167caa3e"
SRC_URI[sha256sum] = "0b6854d5215645e2a3c5c0afbc9907f4da9b6b694587191662c130fc46cd0404"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
