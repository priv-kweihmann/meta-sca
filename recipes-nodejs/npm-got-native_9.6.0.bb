SUMMARY = "NPM: got"
DESCRIPTION = "Simplified HTTP requests"
HOMEPAGE = "https://github.com/sindresorhus/got#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-cacheable-request-native \
           npm-decompress-response-native \
           npm-duplexer3-native \
           npm-get-stream-native \
           npm-lowercase-keys-native \
           npm-mimic-response-native \
           npm-p-cancelable-native \
           npm-sindresorhus-is-native \
           npm-szmarczak-http-timer-native \
           npm-to-readable-stream-native \
           npm-url-parse-lax-native"

SRC_URI = "https://registry.npmjs.org/got/-/got-9.6.0.tgz"
SRC_URI[md5sum] = "880ac4eb8ef0ad02542f1e36f027c212"
SRC_URI[sha256sum] = "fa7f7de3f3a7adeb6b7d0533a5fe10521c891bcdafc03dd9e57259568914b4df"

NPM_PKGNAME = "got"

inherit npmhelper
inherit native
