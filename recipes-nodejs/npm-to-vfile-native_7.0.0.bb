SUMMARY = "NPM: to-vfile"
DESCRIPTION = "vfile utility to create a vfile from a filepath"
HOMEPAGE = "https://github.com/vfile/to-vfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-is-buffer-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/to-vfile/-/to-vfile-7.0.0.tgz"
SRC_URI[md5sum] = "322f34170815b719cde9995ad63ca641"
SRC_URI[sha256sum] = "eaf045b8f9dd0a04f19d27165276a5874acc19fbba4f242eb724a20ed09bbcaf"

NPM_PKGNAME = "to-vfile"

inherit npmhelper
inherit native
