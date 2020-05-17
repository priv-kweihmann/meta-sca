SUMMARY = "NPM: p-try"
DESCRIPTION = "`Promise#try()` ponyfill - Starts a promise chain"
HOMEPAGE = "https://github.com/sindresorhus/p-try#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/p-try/-/p-try-1.0.0.tgz"
SRC_URI[md5sum] = "b99fc1bdf12d00fd26921f3662fc3a3a"
SRC_URI[sha256sum] = "99fed4a8c1a77b52c3ca3fed495182ec87b98f82125161ee56bfe359c40254de"

NPM_PKGNAME = "p-try"

inherit npmhelper
inherit native
