SUMMARY = "NPM: normalize-package-data"
DESCRIPTION = "Normalizes data that can be found in package.json files."
HOMEPAGE = "https://github.com/npm/normalize-package-data#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=745d0cb7803882ab26451fefb149878e"

DEPENDS = "npm-hosted-git-info-native \
           npm-resolve-native \
           npm-semver-native \
           npm-validate-npm-package-license-native"

SRC_URI = "https://registry.npmjs.org/normalize-package-data/-/normalize-package-data-3.0.0.tgz"
SRC_URI[md5sum] = "16a793c625a9f7777002e070c8e4827a"
SRC_URI[sha256sum] = "c962c258c5b8b2a93461d8ab3cdd2fdcf1c6e80da23a8dd68515e7640c6914c7"

NPM_PKGNAME = "normalize-package-data"

inherit npmhelper
inherit native
