SUMMARY = "NPM: vfile"
DESCRIPTION = "Virtual file format for text processing"
HOMEPAGE = "https://github.com/vfile/vfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-is-buffer-native \
           npm-types-unist-native \
           npm-unist-util-stringify-position-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/vfile/-/vfile-5.1.0.tgz"
SRC_URI[md5sum] = "bfc7ea23abfd5640560fc4284fa2eeca"
SRC_URI[sha256sum] = "2111a4507e4bacc11f858391958a797ba865e882ec73f3c978200dccf4f37e23"

NPM_PKGNAME = "vfile"

inherit npmhelper
inherit native
