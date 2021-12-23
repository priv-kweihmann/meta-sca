SUMMARY = "NPM: parse-json"
DESCRIPTION = "Parse JSON with more helpful errors"
HOMEPAGE = "https://github.com/sindresorhus/parse-json#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-babel-code-frame-native \
           npm-error-ex-native \
           npm-json-parse-even-better-errors-native \
           npm-lines-and-columns-native"

SRC_URI = "https://registry.npmjs.org/parse-json/-/parse-json-6.0.2.tgz"
SRC_URI[md5sum] = "060a55b0b312d50ad708cdd385f96688"
SRC_URI[sha256sum] = "eb35aa916ad9a84ca132b0271c32d88d45add5aa50dccd01f7b19bab21f03b8e"

NPM_PKGNAME = "parse-json"

inherit npmhelper
inherit native
