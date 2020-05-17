SUMMARY = "NPM: resolve"
DESCRIPTION = "resolve like require.resolve() on behalf of files asynchronously and synchronously"
HOMEPAGE = "https://github.com/browserify/resolve#readme"

DEPENDS = "npm-path-parse-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=baa47288b5bd3e657a01886ce3dd0cb6"

SRC_URI = "https://registry.npmjs.org/resolve/-/resolve-1.17.0.tgz"
SRC_URI[md5sum] = "809c896a21a308f9477e0fc6f6a907fb"
SRC_URI[sha256sum] = "1828d0afd3dc7d3cfa1a571c566ff705439497acd39ec0e1e31f44aedfd077eb"

NPM_PKGNAME = "resolve"

inherit npmhelper
inherit native
