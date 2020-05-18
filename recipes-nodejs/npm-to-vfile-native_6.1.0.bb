SUMMARY = "NPM: to-vfile"
DESCRIPTION = "vfile utility to create a vfile from a filepath"
HOMEPAGE = "https://github.com/vfile/to-vfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-is-buffer-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/to-vfile/-/to-vfile-6.1.0.tgz"
SRC_URI[md5sum] = "35a8be2de97d6ac05377ce7fa680f1a5"
SRC_URI[sha256sum] = "845f7fda0b720b2b490319e7f6013abd047dacde190febe050ff0597bafa7806"

NPM_PKGNAME = "to-vfile"

inherit npmhelper
inherit native
