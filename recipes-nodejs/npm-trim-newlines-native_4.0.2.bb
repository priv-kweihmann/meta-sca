SUMMARY = "NPM: trim-newlines"
DESCRIPTION = "Trim newlines from the start and/or end of a string"
HOMEPAGE = "https://github.com/sindresorhus/trim-newlines#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/trim-newlines/-/trim-newlines-4.0.2.tgz"
SRC_URI[md5sum] = "29f61b2f0a6fae44858a4b2272e1f669"
SRC_URI[sha256sum] = "2fb99e44d32c1d9065aa22b77f236a8faf18955d71ffdf53dd9f7dde6079739e"

NPM_PKGNAME = "trim-newlines"

inherit npmhelper
inherit native
