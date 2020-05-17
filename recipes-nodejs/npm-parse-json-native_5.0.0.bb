SUMMARY = "NPM: parse-json"
DESCRIPTION = "Parse JSON with more helpful errors"
HOMEPAGE = "https://github.com/sindresorhus/parse-json#readme"

DEPENDS = "npm-babel-code-frame-native npm-error-ex-native npm-json-parse-better-errors-native npm-lines-and-columns-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/parse-json/-/parse-json-5.0.0.tgz"
SRC_URI[md5sum] = "a82d6ad0a774b4ae2c166c65314ad79a"
SRC_URI[sha256sum] = "8d960a380151a532b8e2eef7629371edb667de55bd5a3c1eb5820cf83cc13920"

NPM_PKGNAME = "parse-json"

inherit npmhelper
inherit native
