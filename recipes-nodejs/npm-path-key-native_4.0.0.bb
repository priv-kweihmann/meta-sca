SUMMARY = "NPM: path-key"
DESCRIPTION = "Get the PATH environment variable key cross-platform"
HOMEPAGE = "https://github.com/sindresorhus/path-key#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/path-key/-/path-key-4.0.0.tgz"
SRC_URI[md5sum] = "ef7fc07403a31e92bda447ed52dae278"
SRC_URI[sha256sum] = "aea29a2c9a0986a2eadb6d872c4e5537995612ea9babcbd8da3c2d74b3f049a7"

NPM_PKGNAME = "path-key"

inherit npmhelper
inherit native
