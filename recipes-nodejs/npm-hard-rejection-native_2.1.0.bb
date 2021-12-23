SUMMARY = "NPM: hard-rejection"
DESCRIPTION = "Make unhandled promise rejections fail hard right away instead of the default silent fail"
HOMEPAGE = "https://github.com/sindresorhus/hard-rejection#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/hard-rejection/-/hard-rejection-2.1.0.tgz"
SRC_URI[md5sum] = "abcd93501199c5da42b812dc36d7fb55"
SRC_URI[sha256sum] = "a6bceb808c8e6d8863350d08c005ab3f6dba03af4cc9c85b0d3c4208d8e45c54"

NPM_PKGNAME = "hard-rejection"

inherit npmhelper
inherit native
