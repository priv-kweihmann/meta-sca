SUMMARY = "NPM: import-fresh"
DESCRIPTION = "Import a module while bypassing the cache"
HOMEPAGE = "https://github.com/sindresorhus/import-fresh#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-parent-module-native \
           npm-resolve-from-native"

SRC_URI = "https://registry.npmjs.org/import-fresh/-/import-fresh-3.3.0.tgz"
SRC_URI[md5sum] = "38818252b29213b1f8e9c0bdfbf8238b"
SRC_URI[sha256sum] = "85a4db3371322d51539171bd66bd64c9f80da9e55e1c60976879da5b230613b2"

NPM_PKGNAME = "import-fresh"

inherit npmhelper
inherit native
