SUMMARY = "NPM: package-json"
DESCRIPTION = "Get metadata of a package from the npm registry"
HOMEPAGE = "https://github.com/sindresorhus/package-json#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-got-native \
           npm-registry-auth-token-native \
           npm-registry-url-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/package-json/-/package-json-7.0.0.tgz"
SRC_URI[md5sum] = "b428771a654b1c61c82d69d94788b25e"
SRC_URI[sha256sum] = "4ac15d4ee826ba5f8e312c5c462ff4b3f3afee5a4b33cb784caca98c18a6a20a"

NPM_PKGNAME = "package-json"

inherit npmhelper
inherit native
