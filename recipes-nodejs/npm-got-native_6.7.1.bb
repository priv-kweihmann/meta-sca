SUMMARY = "NPM: got"
DESCRIPTION = "Simplified HTTP requests"
HOMEPAGE = "https://github.com/sindresorhus/got#readme"

DEPENDS = "npm-create-error-class-native npm-duplexer3-native npm-get-stream-native npm-is-redirect-native npm-is-retry-allowed-native npm-is-stream-native npm-lowercase-keys-native npm-safe-buffer-native npm-timed-out-native npm-unzip-response-native npm-url-parse-lax-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/got/-/got-6.7.1.tgz"
SRC_URI[md5sum] = "752377dccb9bda4487cb98869613af15"
SRC_URI[sha256sum] = "8cd3c269c8eabd7dff515d52f52b50527c8b77d90368d0e5e9cb2e4cfe5589c9"

NPM_PKGNAME = "got"

inherit npmhelper
inherit native
