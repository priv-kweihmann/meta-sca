SUMMARY = "NPM: normalize-package-data"
DESCRIPTION = "Normalizes data that can be found in package.json files."
HOMEPAGE = "https://github.com/npm/normalize-package-data#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=745d0cb7803882ab26451fefb149878e"

DEPENDS = "npm-hosted-git-info-native \
           npm-resolve-native \
           npm-semver-native \
           npm-validate-npm-package-license-native"

SRC_URI = "https://registry.npmjs.org/normalize-package-data/-/normalize-package-data-3.0.1.tgz"
SRC_URI[md5sum] = "bb29a337a7dc7a1b07e2a942ba1c389d"
SRC_URI[sha256sum] = "e9c1c4fe564059b1d5d64a7dcbdc006a88f460a148f973ba2982fc88d7602b27"

NPM_PKGNAME = "normalize-package-data"

inherit npmhelper
inherit native
