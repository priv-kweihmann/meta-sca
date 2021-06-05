SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.147.tgz"
SRC_URI[md5sum] = "aa4b0993fb80875bf97b5816079ff84d"
SRC_URI[sha256sum] = "e9002f855b2e32f3fec58dab6ffebbe37b443ccffd2ee4769b6196af7772b73e"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
