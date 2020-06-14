SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.42.tgz"
SRC_URI[md5sum] = "ef5a1e58bdf5314299d57f71d9876341"
SRC_URI[sha256sum] = "3afa1e18348f06b07e03a258e0dd94a9f3a566523f4c48f38414187537d7840a"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
