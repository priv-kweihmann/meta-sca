SUMMARY = "NPM: decamelize"
DESCRIPTION = "Convert a camelized string into a lowercased one with a custom separator: unicornRainbow → unicorn_rainbow"
HOMEPAGE = "https://github.com/sindresorhus/decamelize#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/decamelize/-/decamelize-1.2.0.tgz"
SRC_URI[md5sum] = "330932e4de0e60c36114facb6d3dfafa"
SRC_URI[sha256sum] = "b4adeff510e38c3a02703bcba72ffbe3c65b591f13c78c6a459b5e801a3e2864"

NPM_PKGNAME = "decamelize"

inherit npmhelper
inherit native
