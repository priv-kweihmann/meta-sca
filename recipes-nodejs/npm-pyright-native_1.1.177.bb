SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.177.tgz"
SRC_URI[md5sum] = "f0180060679ca89e4122c4b7bafe5ebd"
SRC_URI[sha256sum] = "99586f2dbcef8beed497cd80ecbea5846da6d713c774c7acd0ae4c4d9450cdd4"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
