SUMMARY = "NPM: is-unicode-supported"
DESCRIPTION = "Detect whether the terminal supports Unicode"
HOMEPAGE = "https://github.com/sindresorhus/is-unicode-supported#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-unicode-supported/-/is-unicode-supported-1.1.0.tgz"
SRC_URI[md5sum] = "dbf4e1f9c1458a2163b57d2efc37c5b2"
SRC_URI[sha256sum] = "e6028554fb7edaa0995e55078bad4d8321a3a45fbde6192d070ca7cd0ebd1c58"

NPM_PKGNAME = "is-unicode-supported"

inherit npmhelper
inherit native
