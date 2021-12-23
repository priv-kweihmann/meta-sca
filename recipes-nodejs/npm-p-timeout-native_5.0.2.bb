SUMMARY = "NPM: p-timeout"
DESCRIPTION = "Timeout a promise after a specified amount of time"
HOMEPAGE = "https://github.com/sindresorhus/p-timeout#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/p-timeout/-/p-timeout-5.0.2.tgz"
SRC_URI[md5sum] = "202adf6981cdd4604f6ac5ee83f2b528"
SRC_URI[sha256sum] = "de253d5811084baccf978776f79d10f35de7b0431c59d582036ed2f30104ef3e"

NPM_PKGNAME = "p-timeout"

inherit npmhelper
inherit native
