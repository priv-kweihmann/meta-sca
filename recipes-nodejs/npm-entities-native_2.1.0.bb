SUMMARY = "NPM: entities"
DESCRIPTION = "Encode & decode XML and HTML entities with ease"
HOMEPAGE = "https://github.com/fb55/entities#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/entities/-/entities-2.1.0.tgz"
SRC_URI[md5sum] = "6bc3363d71432b8a4c848827c5fe6c90"
SRC_URI[sha256sum] = "9f89eb2b7e2bec7e7c95c7bdcb46ac60f2e01aeddc80bc5f78a933acad3bfe1e"

NPM_PKGNAME = "entities"

inherit npmhelper
inherit native
