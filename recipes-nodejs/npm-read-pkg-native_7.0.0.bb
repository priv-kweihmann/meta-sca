SUMMARY = "NPM: read-pkg"
DESCRIPTION = "Read a package.json file"
HOMEPAGE = "https://github.com/sindresorhus/read-pkg#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-normalize-package-data-native \
           npm-parse-json-native \
           npm-type-fest-native \
           npm-types-normalize-package-data-native"

SRC_URI = "https://registry.npmjs.org/read-pkg/-/read-pkg-7.0.0.tgz"
SRC_URI[md5sum] = "b6453757e41b2a1e9f5a29db3d8f0f29"
SRC_URI[sha256sum] = "2ce133a97cef495c295e6a696130f1a6801a685aaaaba6fe03d1a3820f85cf57"

NPM_PKGNAME = "read-pkg"

inherit npmhelper
inherit native
