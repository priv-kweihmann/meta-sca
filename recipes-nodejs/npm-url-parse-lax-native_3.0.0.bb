SUMMARY = "NPM: url-parse-lax"
DESCRIPTION = "Lax url.parse() with support for protocol-less URLs & IPs"
HOMEPAGE = "https://github.com/sindresorhus/url-parse-lax#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-prepend-http-native"

SRC_URI = "https://registry.npmjs.org/url-parse-lax/-/url-parse-lax-3.0.0.tgz"
SRC_URI[md5sum] = "692226d7abdad5d7aa32d742681b6130"
SRC_URI[sha256sum] = "e59b313947ab1b454ad179543f1eac83ebc9b7bc91c386e5e705bc7a00428135"

NPM_PKGNAME = "url-parse-lax"

inherit npmhelper
inherit native
