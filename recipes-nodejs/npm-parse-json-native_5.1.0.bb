SUMMARY = "NPM: parse-json"
DESCRIPTION = "Parse JSON with more helpful errors"
HOMEPAGE = "https://github.com/sindresorhus/parse-json#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-babel-code-frame-native \
           npm-error-ex-native \
           npm-json-parse-even-better-errors-native \
           npm-lines-and-columns-native"

SRC_URI = "https://registry.npmjs.org/parse-json/-/parse-json-5.1.0.tgz"
SRC_URI[md5sum] = "03a5cb99eecca3a03a089fbf60390565"
SRC_URI[sha256sum] = "5e2c7480d4f16884188cbacc456a818af0234106b87bcae96666eb7dd575df06"

NPM_PKGNAME = "parse-json"

inherit npmhelper
inherit native
