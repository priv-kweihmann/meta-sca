SUMMARY = "NPM: entities"
DESCRIPTION = "Encode & decode XML and HTML entities with ease & speed"
HOMEPAGE = "https://github.com/fb55/entities#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/entities/-/entities-4.1.1.tgz"
SRC_URI[md5sum] = "1b80f136c48ec9e16f94777b47aacbdc"
SRC_URI[sha256sum] = "d4ae573a106dfe65e5c9fe60f2f9462a4e08d35f101d135c42525e5403b20602"

NPM_PKGNAME = "entities"

inherit npmhelper
inherit native
