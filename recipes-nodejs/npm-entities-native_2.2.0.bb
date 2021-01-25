SUMMARY = "NPM: entities"
DESCRIPTION = "Encode & decode XML and HTML entities with ease"
HOMEPAGE = "https://github.com/fb55/entities#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/entities/-/entities-2.2.0.tgz"
SRC_URI[md5sum] = "12fab1fe8855e7971f421ff059315ba3"
SRC_URI[sha256sum] = "d28c92e6a467a43dd8a9f5b2104acbf3968b0270979f5a25e69612fbe149dacd"

NPM_PKGNAME = "entities"

inherit npmhelper
inherit native
