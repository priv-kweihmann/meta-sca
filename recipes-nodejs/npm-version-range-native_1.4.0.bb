SUMMARY = "NPM: version-range"
DESCRIPTION = "Check version ranges like `>=N` and `X || Y || Z` with support for Node.js, Web Browsers, Deno, and TypeScript."
HOMEPAGE = "https://github.com/bevry/version-range"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c39fac9d20b79ade99d052803b1960ad"

DEPENDS = "npm-version-compare-native"

SRC_URI = "https://registry.npmjs.org/version-range/-/version-range-1.4.0.tgz"
SRC_URI[md5sum] = "85d9a2604987324fad8508c26e3d6317"
SRC_URI[sha256sum] = "781f3dec6ebf438a9bccc3f7898f5fb51c3f0fc104d2d50515731511a0e3f0ae"

NPM_PKGNAME = "version-range"

inherit npmhelper
inherit native
