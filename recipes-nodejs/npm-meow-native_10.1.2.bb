SUMMARY = "NPM: meow"
DESCRIPTION = "CLI app helper"
HOMEPAGE = "https://github.com/sindresorhus/meow#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI = "https://registry.npmjs.org/meow/-/meow-10.1.2.tgz"
SRC_URI[md5sum] = "d26ab341617be68f561f6d1c27179153"
SRC_URI[sha256sum] = "12e97542c7b4b6c14462ecbf301955c64213a210c4f946e8b6c70b3ff0b7d212"

NPM_PKGNAME = "meow"

inherit npmhelper
inherit native
