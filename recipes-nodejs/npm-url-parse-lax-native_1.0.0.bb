SUMMARY = "NPM: url-parse-lax"
DESCRIPTION = "url.parse() with support for protocol-less URLs & IPs"
HOMEPAGE = "https://github.com/sindresorhus/url-parse-lax#readme"

DEPENDS = "npm-prepend-http-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/url-parse-lax/-/url-parse-lax-1.0.0.tgz"
SRC_URI[md5sum] = "39ddf8dc940dbd987c3db8248ee5fe04"
SRC_URI[sha256sum] = "a06c5d27635b05299e4dbd7a164b5127d6f223200d584e19380b3da90f605ddb"

NPM_PKGNAME = "url-parse-lax"

inherit npmhelper
inherit native
