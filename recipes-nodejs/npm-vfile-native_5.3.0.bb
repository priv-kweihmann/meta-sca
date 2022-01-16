SUMMARY = "NPM: vfile"
DESCRIPTION = "Virtual file format for text processing"
HOMEPAGE = "https://github.com/vfile/vfile#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-is-buffer-native \
           npm-types-unist-native \
           npm-unist-util-stringify-position-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/vfile/-/vfile-5.3.0.tgz"
SRC_URI[md5sum] = "5ffa07b665931d821c05bbc32a0671c7"
SRC_URI[sha256sum] = "761721f75700a66461bdb17009e80a7154dc68b1665c570f35d4b8b8dc160232"

NPM_PKGNAME = "vfile"

inherit npmhelper
inherit native
