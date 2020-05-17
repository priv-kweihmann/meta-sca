SUMMARY = "NPM: escape-string-regexp"
DESCRIPTION = "Escape RegExp special characters"
HOMEPAGE = "https://github.com/sindresorhus/escape-string-regexp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/escape-string-regexp/-/escape-string-regexp-1.0.5.tgz"
SRC_URI[md5sum] = "02440084832abe665260d5db1da1dd9e"
SRC_URI[sha256sum] = "e50c792e76763d0c74506297add779755967ca9bbd288e2677966a6b7394c347"

S = "${WORKDIR}/package"

NPM_PKGNAME = "escape-string-regexp"

inherit npmhelper
inherit native
