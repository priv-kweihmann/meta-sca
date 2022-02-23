SUMMARY = "NPM: dot-prop"
DESCRIPTION = "Get, set, or delete a property from a nested object using a dot path"
HOMEPAGE = "https://github.com/sindresorhus/dot-prop#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/dot-prop/-/dot-prop-7.2.0.tgz"
SRC_URI[md5sum] = "24fe1f11a43cf95e89f7749216bdc8e6"
SRC_URI[sha256sum] = "8dd28eb5ea6157c6480f2fc91bc6bb67759911cb260dd3585a86f6801d5b484a"

NPM_PKGNAME = "dot-prop"

inherit npmhelper
inherit native
