SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.178.tgz"
SRC_URI[md5sum] = "4ad6a0dfb9bcb64a2e742cbe15fbd8cc"
SRC_URI[sha256sum] = "3b3d7a7afc5b6c9de54f6c1ef9d9c8cdf20f9c85561e0766fc9a67a1af320d6c"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
