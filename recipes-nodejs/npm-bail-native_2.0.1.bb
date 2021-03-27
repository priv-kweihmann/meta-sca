SUMMARY = "NPM: bail"
DESCRIPTION = "Throw a given error"
HOMEPAGE = "https://github.com/wooorm/bail#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/bail/-/bail-2.0.1.tgz"
SRC_URI[md5sum] = "0f783b3e481711db5f8a654e1343d453"
SRC_URI[sha256sum] = "483d9e8376a7b9832f55105d2ad4af88fbb195598397de700a76c67dd4924d19"

NPM_PKGNAME = "bail"

inherit npmhelper
inherit native
