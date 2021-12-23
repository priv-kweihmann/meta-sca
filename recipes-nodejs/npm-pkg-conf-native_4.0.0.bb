SUMMARY = "NPM: pkg-conf"
DESCRIPTION = "Get namespaced config from the closest package.json"
HOMEPAGE = "https://github.com/sindresorhus/pkg-conf#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-find-up-native \
           npm-load-json-file-native"

SRC_URI = "https://registry.npmjs.org/pkg-conf/-/pkg-conf-4.0.0.tgz"
SRC_URI[md5sum] = "03b1d058d57ddf22255ef8b0185a4fec"
SRC_URI[sha256sum] = "0ee6d5ae51e497068d6e06440b6a5680e9549ee319dbd13ecc79e01a155c833d"

NPM_PKGNAME = "pkg-conf"

inherit npmhelper
inherit native
