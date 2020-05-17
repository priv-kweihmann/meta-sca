SUMMARY = "NPM: ccount"
DESCRIPTION = "Count characters"
HOMEPAGE = "https://github.com/wooorm/ccount#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/ccount/-/ccount-1.0.5.tgz"
SRC_URI[md5sum] = "2fada0c01fb810a54fff1edfc6800241"
SRC_URI[sha256sum] = "8a513cde43c17daa7182bc27d44f32188d97eb464874742a9be3a3df824e960b"

NPM_PKGNAME = "ccount"

inherit npmhelper
inherit native
