SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.166.tgz"
SRC_URI[md5sum] = "0cf3ff0e1c4fd994116b5445a1695a82"
SRC_URI[sha256sum] = "bf123d4e144dd5e9925fc8e6dade2be0c8c4f0ea4b247f5257ef058cef3a0ca4"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
