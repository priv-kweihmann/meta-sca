SUMMARY = "NPM: object-assign"
DESCRIPTION = "ES2015 `Object.assign()` ponyfill"
HOMEPAGE = "https://github.com/sindresorhus/object-assign#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/object-assign/-/object-assign-4.1.1.tgz"
SRC_URI[md5sum] = "4f52c397ba44c57bcf6ed38d7f2c3f8e"
SRC_URI[sha256sum] = "782d726a263ba7b26cced612af97b80035516df4b0cd788524e7b2cebc4e29ed"

NPM_PKGNAME = "object-assign"

inherit npmhelper
inherit native
