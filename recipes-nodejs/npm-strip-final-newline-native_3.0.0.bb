SUMMARY = "NPM: strip-final-newline"
DESCRIPTION = "Strip the final newline character from a string/buffer"
HOMEPAGE = "https://github.com/sindresorhus/strip-final-newline#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/strip-final-newline/-/strip-final-newline-3.0.0.tgz"
SRC_URI[md5sum] = "da47d71f91501c220513a912bc7499c2"
SRC_URI[sha256sum] = "c357292b706e0add89e45f1ccab42892665ee68154a51d57532a2a0ea8a8a585"

NPM_PKGNAME = "strip-final-newline"

inherit npmhelper
inherit native
