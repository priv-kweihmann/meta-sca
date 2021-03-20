SUMMARY = "NPM: normalize-package-data"
DESCRIPTION = "Normalizes data that can be found in package.json files."
HOMEPAGE = "https://github.com/npm/normalize-package-data#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=745d0cb7803882ab26451fefb149878e"

DEPENDS = "npm-hosted-git-info-native \
           npm-resolve-native \
           npm-semver-native \
           npm-validate-npm-package-license-native"

SRC_URI = "https://registry.npmjs.org/normalize-package-data/-/normalize-package-data-3.0.2.tgz"
SRC_URI[md5sum] = "b793cd95dd4b565abc0c991ff8b2d639"
SRC_URI[sha256sum] = "aa362281d6a31e49800c8864c5f91e130e9e5f5aef54db172104b35b68552b93"

NPM_PKGNAME = "normalize-package-data"

inherit npmhelper
inherit native
