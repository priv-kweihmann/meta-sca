SUMMARY = "NPM: parse-json"
DESCRIPTION = "Parse JSON with more helpful errors"
HOMEPAGE = "https://github.com/sindresorhus/parse-json#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-babel-code-frame-native \
           npm-error-ex-native \
           npm-json-parse-even-better-errors-native \
           npm-lines-and-columns-native"

SRC_URI = "https://registry.npmjs.org/parse-json/-/parse-json-6.0.0.tgz"
SRC_URI[md5sum] = "0c42f61f383ee2f9b37f1049d9b14c2b"
SRC_URI[sha256sum] = "eee9f8353e66facf27226b92af387c16ca9f267516ec68a4c43f0c99fe62cf10"

NPM_PKGNAME = "parse-json"

inherit npmhelper
inherit native
