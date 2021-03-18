SUMMARY = "NPM: bail"
DESCRIPTION = "Throw a given error"
HOMEPAGE = "https://github.com/wooorm/bail#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/bail/-/bail-2.0.0.tgz"
SRC_URI[md5sum] = "38127d23c1f853a0e63962f1ba23b059"
SRC_URI[sha256sum] = "2a5ce5885ebe6359c3561b1a05e200b958f8ebf4e4d52174c955a33072dbc472"

NPM_PKGNAME = "bail"

inherit npmhelper
inherit native
