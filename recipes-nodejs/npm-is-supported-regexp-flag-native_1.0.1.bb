SUMMARY = "NPM: is-supported-regexp-flag"
DESCRIPTION = "Check whether a RegExp flag is supported. Mostly useful for `y` and `u`."
HOMEPAGE = "https://github.com/sindresorhus/is-supported-regexp-flag#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/is-supported-regexp-flag/-/is-supported-regexp-flag-1.0.1.tgz"
SRC_URI[md5sum] = "cda0e2108531a36433710ee5d1e2f03a"
SRC_URI[sha256sum] = "20f9681ee76f5f036cec8a71dedcd8deb0ffae3ef6a43d198ffe75fdc0105d08"

NPM_PKGNAME = "is-supported-regexp-flag"

inherit npmhelper
inherit native
