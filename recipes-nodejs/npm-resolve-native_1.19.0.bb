SUMMARY = "NPM: resolve"
DESCRIPTION = "resolve like require.resolve() on behalf of files asynchronously and synchronously"
HOMEPAGE = "https://github.com/browserify/resolve#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=baa47288b5bd3e657a01886ce3dd0cb6"

DEPENDS = "npm-is-core-module-native \
           npm-path-parse-native"

SRC_URI = "https://registry.npmjs.org/resolve/-/resolve-1.19.0.tgz"
SRC_URI[md5sum] = "cd0bf8256db5064839da4ff19c1a175b"
SRC_URI[sha256sum] = "8cc99b22c9bb455096d1cd002ee6d76bf5ad0fa693d979dfb489f197a813eb66"

NPM_PKGNAME = "resolve"

inherit npmhelper
inherit native
