SUMMARY = "NPM: meow"
DESCRIPTION = "CLI app helper"
HOMEPAGE = "https://github.com/sindresorhus/meow#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-camelcase-keys-native \
           npm-decamelize-keys-native \
           npm-decamelize-native \
           npm-hard-rejection-native \
           npm-minimist-options-native \
           npm-normalize-package-data-native \
           npm-read-pkg-up-native \
           npm-redent-native \
           npm-trim-newlines-native \
           npm-type-fest-native \
           npm-types-minimist-native \
           npm-yargs-parser-native"

SRC_URI = "https://registry.npmjs.org/meow/-/meow-10.1.1.tgz"
SRC_URI[md5sum] = "464cdef27d01e434288ba5dc5e87acce"
SRC_URI[sha256sum] = "c420629b22afd56a2f5e966e32fe311434f35b5b64661e62d5240f08325df390"

NPM_PKGNAME = "meow"

inherit npmhelper
inherit native
