SUMMARY = "NPM: misspellings"
DESCRIPTION = "List of common misspellings from Wikipedia"
HOMEPAGE = "https://github.com/io-monad/misspellings#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "https://registry.npmjs.org/misspellings/-/misspellings-1.1.0.tgz"
SRC_URI[md5sum] = "78718ca4d60ec6dab2f1ad30172a9b74"
SRC_URI[sha256sum] = "fb84319868e817498195d3785d032fa0af180d2e0f055f7f73efc13dfe056e43"

NPM_PKGNAME = "misspellings"

inherit npmhelper
inherit native
