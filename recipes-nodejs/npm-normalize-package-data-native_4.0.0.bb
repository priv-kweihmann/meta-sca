SUMMARY = "NPM: normalize-package-data"
DESCRIPTION = "Normalizes data that can be found in package.json files."
HOMEPAGE = "https://github.com/npm/normalize-package-data#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d1bcfc4226560b085978f38c2581ce74"

DEPENDS = "npm-hosted-git-info-native \
           npm-is-core-module-native \
           npm-semver-native \
           npm-validate-npm-package-license-native"

SRC_URI = "https://registry.npmjs.org/normalize-package-data/-/normalize-package-data-4.0.0.tgz"
SRC_URI[md5sum] = "3907f6a5c0cfb92991c2637fa9711026"
SRC_URI[sha256sum] = "faff694e75add6d7134b67f285b7939454a94a60e8b705164beeb00e37f6bb58"

NPM_PKGNAME = "normalize-package-data"

inherit npmhelper
inherit native
