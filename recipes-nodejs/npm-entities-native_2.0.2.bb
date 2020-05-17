SUMMARY = "NPM: entities"
DESCRIPTION = "Encode & decode XML and HTML entities with ease"
HOMEPAGE = "https://github.com/fb55/entities#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

SRC_URI = "https://registry.npmjs.org/entities/-/entities-2.0.2.tgz"
SRC_URI[md5sum] = "eae208fb435917d59b6672e2d9e2132c"
SRC_URI[sha256sum] = "4a035d5b5c848f203d78fb14d6ea1413d65e839533d2f8e84334fa854c34420c"

S = "${WORKDIR}/package"

NPM_PKGNAME = "entities"

inherit npmhelper
inherit native
