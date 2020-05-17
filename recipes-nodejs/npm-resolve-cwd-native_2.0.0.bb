SUMMARY = "NPM: resolve-cwd"
DESCRIPTION = "Resolve the path of a module like `require.resolve()` but from the current working directory"
HOMEPAGE = "https://github.com/sindresorhus/resolve-cwd#readme"

DEPENDS = "npm-resolve-from-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/resolve-cwd/-/resolve-cwd-2.0.0.tgz"
SRC_URI[md5sum] = "1a0f8832504dfbef8d3f579f98c448d3"
SRC_URI[sha256sum] = "44764c81c47acdca00caaf493c1429c5055624e901c5e9fb56e9b5c481ecbee2"

NPM_PKGNAME = "resolve-cwd"

inherit npmhelper
inherit native
