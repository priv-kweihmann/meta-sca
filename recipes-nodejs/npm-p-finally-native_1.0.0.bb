SUMMARY = "NPM: p-finally"
DESCRIPTION = "`Promise#finally()` ponyfill - Invoked when the promise is settled regardless of outcome"
HOMEPAGE = "https://github.com/sindresorhus/p-finally#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/p-finally/-/p-finally-1.0.0.tgz"
SRC_URI[md5sum] = "e3f133a5aa70154ce5198c3a262fccfc"
SRC_URI[sha256sum] = "effd84e09e1330542a84a243f1f4da21a700d459b83761eaca16070eb1fb8841"

NPM_PKGNAME = "p-finally"

inherit npmhelper
inherit native
