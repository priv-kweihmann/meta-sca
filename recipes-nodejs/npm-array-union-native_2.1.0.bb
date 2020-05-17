SUMMARY = "NPM: array-union"
DESCRIPTION = "Create an array of unique values, in order, from the input arrays"
HOMEPAGE = "https://github.com/sindresorhus/array-union#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/array-union/-/array-union-2.1.0.tgz"
SRC_URI[md5sum] = "3166e53668c44bc205d39c5a14046557"
SRC_URI[sha256sum] = "a8d749e05f93e4b78a121a117337926d270413caa876514c38d48045625908c6"

NPM_PKGNAME = "array-union"

inherit npmhelper
inherit native
