SUMMARY = "NPM: version-range"
DESCRIPTION = "Check version ranges like `>=N` and `X || Y || Z` with support for Node.js, Web Browsers, Deno, and TypeScript."
HOMEPAGE = "https://github.com/bevry/version-range"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c39fac9d20b79ade99d052803b1960ad"

DEPENDS = "npm-version-compare-native"

SRC_URI = "https://registry.npmjs.org/version-range/-/version-range-1.2.0.tgz"
SRC_URI[md5sum] = "9597e2bdb9a5d0409615df2c6f03abe2"
SRC_URI[sha256sum] = "62e50c44ef375dfdae49635b8a7531593f02cf1371c8cc0ed44efdd716ad795e"

NPM_PKGNAME = "version-range"

inherit npmhelper
inherit native
