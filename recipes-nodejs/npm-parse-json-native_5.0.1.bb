SUMMARY = "NPM: parse-json"
DESCRIPTION = "Parse JSON with more helpful errors"
HOMEPAGE = "https://github.com/sindresorhus/parse-json#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-babel-code-frame-native \
           npm-error-ex-native \
           npm-json-parse-better-errors-native \
           npm-lines-and-columns-native"

SRC_URI = "https://registry.npmjs.org/parse-json/-/parse-json-5.0.1.tgz"
SRC_URI[md5sum] = "a5a9b4c6b99ac00f488217cde58d3b1a"
SRC_URI[sha256sum] = "34c5f037f99c391a9f8a2e41d4f2b0d6c2c13ee69d4663c01cfd96b2e123cac7"

NPM_PKGNAME = "parse-json"

inherit npmhelper
inherit native
