SUMMARY = "NPM: version-range"
DESCRIPTION = "Check version ranges like `>=N` and `X || Y || Z` with support for Node.js, Web Browsers, Deno, and TypeScript."
HOMEPAGE = "https://github.com/bevry/version-range"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=44539d46b91a76ee624d026c1869d233"

DEPENDS = "npm-version-compare-native"

SRC_URI = "https://registry.npmjs.org/version-range/-/version-range-1.1.0.tgz"
SRC_URI[md5sum] = "8baad0b291637c4aea7e3be00b8a92f3"
SRC_URI[sha256sum] = "cde06294cb6cc7e7d06ff1dca0fb352224fb63ad6f9898fd740bf478e7b56048"

NPM_PKGNAME = "version-range"

inherit npmhelper
inherit native
