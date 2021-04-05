SUMMARY = "NPM: read-pkg"
DESCRIPTION = "Read a package.json file"
HOMEPAGE = "https://github.com/sindresorhus/read-pkg#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-normalize-package-data-native \
           npm-parse-json-native \
           npm-type-fest-native \
           npm-types-normalize-package-data-native"

SRC_URI = "https://registry.npmjs.org/read-pkg/-/read-pkg-6.0.0.tgz"
SRC_URI[md5sum] = "64c717250ec597397a2a9409120ee222"
SRC_URI[sha256sum] = "ff58eedde464f5f94d7c6405676cbc50ece1d6d7f14e6f8b14171a7cbc2f59c1"

NPM_PKGNAME = "read-pkg"

inherit npmhelper
inherit native
