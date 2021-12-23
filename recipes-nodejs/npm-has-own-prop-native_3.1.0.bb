SUMMARY = "NPM: has-own-prop"
DESCRIPTION = "A safer `.hasOwnProperty()`"
HOMEPAGE = "https://github.com/sindresorhus/has-own-prop#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/has-own-prop/-/has-own-prop-3.1.0.tgz"
SRC_URI[md5sum] = "aef4d675b10153421a33d25ae3c1e79b"
SRC_URI[sha256sum] = "56cadb232f341d80808b0505a646488aeaeb2aa6e6636eed1dea53cae83f4e0d"

NPM_PKGNAME = "has-own-prop"

inherit npmhelper
inherit native
