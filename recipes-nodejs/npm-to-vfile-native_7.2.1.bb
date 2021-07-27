SUMMARY = "NPM: to-vfile"
DESCRIPTION = "vfile utility to create a vfile from a filepath"
HOMEPAGE = "https://github.com/vfile/to-vfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-is-buffer-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/to-vfile/-/to-vfile-7.2.1.tgz"
SRC_URI[md5sum] = "5b37e81a4d4b26f874ead9ff9657d22e"
SRC_URI[sha256sum] = "76b3adad5f732f22839f3a3f4589baa9d8dabb5b08d55e16b67307c69e97d801"

NPM_PKGNAME = "to-vfile"

inherit npmhelper
inherit native
