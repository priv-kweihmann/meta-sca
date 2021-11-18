SUMMARY = "NPM: parse-json"
DESCRIPTION = "Parse JSON with more helpful errors"
HOMEPAGE = "https://github.com/sindresorhus/parse-json#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-babel-code-frame-native \
           npm-error-ex-native \
           npm-json-parse-even-better-errors-native \
           npm-lines-and-columns-native"

SRC_URI = "https://registry.npmjs.org/parse-json/-/parse-json-6.0.1.tgz"
SRC_URI[md5sum] = "88d821171aa6d35219d1621dcc224e79"
SRC_URI[sha256sum] = "852d33f98aa46106656b9884c2250c8c645bd748e7046c512bf79fae759b10b4"

NPM_PKGNAME = "parse-json"

inherit npmhelper
inherit native
