SUMMARY = "NPM: fast-deep-equal"
DESCRIPTION = "Fast deep equal"
HOMEPAGE = "https://github.com/epoberezkin/fast-deep-equal#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/fast-deep-equal/-/fast-deep-equal-3.1.3.tgz"
SRC_URI[md5sum] = "3eb7d86abccbf3ebe982f49c602d3a3b"
SRC_URI[sha256sum] = "b019a0980f27638dc3f85836b0e478f188e00d7a6e5852c0819fa86f56e47b8f"

NPM_PKGNAME = "fast-deep-equal"

inherit npmhelper
inherit native
