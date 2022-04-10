SUMMARY = "NPM: entities"
DESCRIPTION = "Encode & decode XML and HTML entities with ease & speed"
HOMEPAGE = "https://github.com/fb55/entities#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/entities/-/entities-4.2.0.tgz"
SRC_URI[md5sum] = "9ed77360cf94bf0ce65377326cd9ee53"
SRC_URI[sha256sum] = "82a920939aaf9210238c954fd9adf9cf36c942bb0a035c6cf710946af74b25b7"

NPM_PKGNAME = "entities"

inherit npmhelper
inherit native
