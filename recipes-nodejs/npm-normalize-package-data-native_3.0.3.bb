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

SRC_URI = "https://registry.npmjs.org/normalize-package-data/-/normalize-package-data-3.0.3.tgz"
SRC_URI[md5sum] = "90437fce3405abee9d7892dcc53bdd98"
SRC_URI[sha256sum] = "1e6cbcb11782f7f37e51ed1cf5a04c6eca1a88c56ba0923ac6077a3a0f1c5492"

NPM_PKGNAME = "normalize-package-data"

inherit npmhelper
inherit native
