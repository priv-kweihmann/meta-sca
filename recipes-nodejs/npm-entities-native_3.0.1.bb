SUMMARY = "NPM: entities"
DESCRIPTION = "Encode & decode XML and HTML entities with ease"
HOMEPAGE = "https://github.com/fb55/entities#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/entities/-/entities-3.0.1.tgz"
SRC_URI[md5sum] = "ab97629e49bbd4ec14a2c3d163f3e701"
SRC_URI[sha256sum] = "bdddca0c11d55bab2e1192618b14efade94b2173070d67e9b096fbe6cfb63df6"

NPM_PKGNAME = "entities"

inherit npmhelper
inherit native
