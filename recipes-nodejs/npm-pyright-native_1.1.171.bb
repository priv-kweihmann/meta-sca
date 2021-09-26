SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.171.tgz"
SRC_URI[md5sum] = "7fce8df5cc8f6441a3f551caca9e20b3"
SRC_URI[sha256sum] = "9136e2d5f9139c5eb705e38fce7c74cb7366b5bf3d8792dcaeec63dc6ff5c62a"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
