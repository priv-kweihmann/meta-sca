SUMMARY = "NPM: bail"
DESCRIPTION = "Throw a given error"
HOMEPAGE = "https://github.com/wooorm/bail#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/bail/-/bail-2.0.2.tgz"
SRC_URI[md5sum] = "a67d907e02444c0376c419872bf4b9a9"
SRC_URI[sha256sum] = "11719f7e1f7a31432177dd0cd987e7c967a826426d281c39c0025b474056c88b"

NPM_PKGNAME = "bail"

inherit npmhelper
inherit native
