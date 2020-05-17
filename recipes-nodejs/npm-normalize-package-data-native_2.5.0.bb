SUMMARY = "NPM: normalize-package-data"
DESCRIPTION = "Normalizes data that can be found in package.json files."
HOMEPAGE = "https://github.com/npm/normalize-package-data#readme"

DEPENDS = "npm-hosted-git-info-native npm-resolve-native npm-semver-native npm-validate-npm-package-license-native"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=745d0cb7803882ab26451fefb149878e"

SRC_URI = "https://registry.npmjs.org/normalize-package-data/-/normalize-package-data-2.5.0.tgz"
SRC_URI[md5sum] = "b46c083aa373a30b8d2421e9f269d543"
SRC_URI[sha256sum] = "ec9b59c56f2223aba94ab8b79af990a0bc7d80a7dd94e80bb7c6fc682c471e7b"

NPM_PKGNAME = "normalize-package-data"

inherit npmhelper
inherit native
