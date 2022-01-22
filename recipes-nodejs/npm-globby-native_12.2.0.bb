SUMMARY = "NPM: globby"
DESCRIPTION = "User-friendly glob matching"
HOMEPAGE = "https://github.com/sindresorhus/globby#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-array-union-native \
           npm-dir-glob-native \
           npm-fast-glob-native \
           npm-ignore-native \
           npm-merge2-native \
           npm-slash-native"

SRC_URI = "https://registry.npmjs.org/globby/-/globby-12.2.0.tgz"
SRC_URI[md5sum] = "d809fcea98bb660a94632c2cb4266c1d"
SRC_URI[sha256sum] = "bf30820e3a65862557e53855b14d6c5f49fea1bc1876b2a796ca6a60abfbb16f"

NPM_PKGNAME = "globby"

inherit npmhelper
inherit native
