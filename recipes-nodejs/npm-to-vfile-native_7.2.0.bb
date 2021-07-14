SUMMARY = "NPM: to-vfile"
DESCRIPTION = "vfile utility to create a vfile from a filepath"
HOMEPAGE = "https://github.com/vfile/to-vfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-is-buffer-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/to-vfile/-/to-vfile-7.2.0.tgz"
SRC_URI[md5sum] = "1f07a3427033041eec1fc3484c87a53d"
SRC_URI[sha256sum] = "50a8b8146058121e268af48cf9b8825e8f0cf8957449cd919c638a37bde1227a"

NPM_PKGNAME = "to-vfile"

inherit npmhelper
inherit native
