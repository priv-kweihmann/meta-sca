SUMMARY = "NPM: npm-run-path"
DESCRIPTION = "Get your PATH prepended with locally installed binaries"
HOMEPAGE = "https://github.com/sindresorhus/npm-run-path#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-path-key-native"

SRC_URI = "https://registry.npmjs.org/npm-run-path/-/npm-run-path-5.1.0.tgz"
SRC_URI[md5sum] = "c17788d010485d141391337e26a9fd9e"
SRC_URI[sha256sum] = "5a968867feec0c6681f9d0a020c72e34bff118afb945ec519f0e54cfd679f950"

NPM_PKGNAME = "npm-run-path"

inherit npmhelper
inherit native
