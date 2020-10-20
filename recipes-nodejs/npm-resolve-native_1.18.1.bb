SUMMARY = "NPM: resolve"
DESCRIPTION = "resolve like require.resolve() on behalf of files asynchronously and synchronously"
HOMEPAGE = "https://github.com/browserify/resolve#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=baa47288b5bd3e657a01886ce3dd0cb6"

DEPENDS = "npm-is-core-module-native \
           npm-path-parse-native"

SRC_URI = "https://registry.npmjs.org/resolve/-/resolve-1.18.1.tgz"
SRC_URI[md5sum] = "e3a01726b7bc81929cd736ce390472a3"
SRC_URI[sha256sum] = "feccec368578b1eae72d7dccc03656ac65b84d781109810e4a1f3d2c0319a961"

NPM_PKGNAME = "resolve"

inherit npmhelper
inherit native
