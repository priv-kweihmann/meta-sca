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

SRC_URI = "https://registry.npmjs.org/vfile/-/vfile-5.2.1.tgz"
SRC_URI[md5sum] = "84702ff2567829b170add6e8e47285a3"
SRC_URI[sha256sum] = "5541fbe699dd773f1ec18ce4f33f7effb178bebb3407eff71eaa0a44c065d24d"

NPM_PKGNAME = "vfile"

inherit npmhelper
inherit native
