SUMMARY = "NPM: entities"
DESCRIPTION = "Encode & decode XML and HTML entities with ease"
HOMEPAGE = "https://github.com/fb55/entities#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/entities/-/entities-2.0.3.tgz"
SRC_URI[md5sum] = "97c4431be40fbe47c248a840eb23bb0c"
SRC_URI[sha256sum] = "5c5f9983358aac39891ba9be4149b1d12660d9a94321c9abcec9c5de7ce0c727"

NPM_PKGNAME = "entities"

inherit npmhelper
inherit native
